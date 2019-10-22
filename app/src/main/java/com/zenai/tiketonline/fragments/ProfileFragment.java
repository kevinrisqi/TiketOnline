package com.zenai.tiketonline.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zenai.tiketonline.R;
import com.zenai.tiketonline.utils.Profile;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        TextView nameText = view.findViewById(R.id.text_name);
        Bundle data = this.getArguments();

        Profile profile = data.getParcelable("profile");
        String nama = profile.getName();
        nameText.setText(nama);
        return view;
    }
}
