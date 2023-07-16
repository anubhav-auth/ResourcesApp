package com.example.resourcesapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.resourcesapp.R;
public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;


    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        // TODO: Use the ViewModel
    }

//    public void startFragment(View view) {
//        ib = (ImageButton) view;
//        String a = ib.getTag().toString();
//
//        switch (a) {
//            case "0" -> {
//                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_gitRepos);
//            }
//            case "1" -> {
//                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_coding);
//            }
//            case "2" -> {
//                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_nav_earn);
//            }
//        }
//    }
}