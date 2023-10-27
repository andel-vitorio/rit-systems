package com.example.ritsystems;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ritsystems.adapters.MenuRecycleViewAdapter;
import com.example.ritsystems.databinding.HomeFragmentBinding;

import java.util.Objects;

public class HomeFragment extends Fragment {
    private HomeFragmentBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = HomeFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MenuRecycleViewAdapter.MenuDataset[] dataset = new MenuRecycleViewAdapter.MenuDataset[4];

        dataset[0] = new MenuRecycleViewAdapter.MenuDataset("Disciplinas", R.drawable.subject_icon);
        dataset[1] = new MenuRecycleViewAdapter.MenuDataset("Estudantes", R.drawable.student_icon);
        dataset[2] = new MenuRecycleViewAdapter.MenuDataset("Atividades da Coordenação", R.drawable.activity_icon);
        dataset[3] = new MenuRecycleViewAdapter.MenuDataset("Artigos Publicados", R.drawable.paper_icon);

        RecyclerView recyclerView = view.findViewById(R.id.menuRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MenuRecycleViewAdapter(dataset));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
