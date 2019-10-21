package com.zenai.tiketonline.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zenai.tiketonline.R;
import com.zenai.tiketonline.fragments.ProfileFragment;
import com.zenai.tiketonline.utils.Profile;

public class GetStartedAct extends AppCompatActivity {
    EditText nameInput;
    EditText cityInput;
    EditText ageInput;
    EditText bioInput;

    Button btnGetStart;

    public static final String PROFILE_KEY = "profile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btnGetStart = findViewById(R.id.btnGet);

        nameInput = findViewById(R.id.input_name);
        cityInput = findViewById(R.id.input_city);
        ageInput = findViewById(R.id.input_age);
        bioInput = findViewById(R.id.input_bio);

        btnGetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameInput.getText().toString();
                String city = cityInput.getText().toString();
                int age = Integer.parseInt(ageInput.getText().toString());
                String bio = bioInput.getText().toString();
                Profile profile = new Profile(name,city,age,bio);
                Bundle bundle = new Bundle();
                bundle.putParcelable("PROFILE_KEY",profile);
                Fragment result = new ProfileFragment();
                result.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,new ProfileFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }
}
