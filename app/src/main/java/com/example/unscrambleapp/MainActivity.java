package com.example.unscrambleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import com.example.unscrambleapp.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewMod(viewModel);
        binding.button.setOnClickListener((v) -> {
            viewModel.check(String.valueOf(binding.editTextTextPersonName.getText()));
        });
        binding.setLifecycleOwner(this);
        viewModel.shuf();

    }
}