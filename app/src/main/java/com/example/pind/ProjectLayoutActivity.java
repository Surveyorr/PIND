package com.example.pind;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

public class ProjectLayoutActivity extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.project_layout,container,false);

        return view;
    }



}
