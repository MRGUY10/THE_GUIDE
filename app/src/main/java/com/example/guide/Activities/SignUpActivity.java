package com.example.guide.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.guide.R;
import com.example.guide.databinding.ActivitySignInBinding;
import com.example.guide.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners(){
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}