package com.example.pind;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class PindbodyActivity extends Fragment{
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pind_body, container, false);

        //Economic
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button) getActivity().findViewById(R.id.button)).setText("Read more");
                Intent intent = new Intent(getActivity(), PindProgressActivity.class);
                startActivity(intent);
            }
        });

        //peace
        Button button2 = (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button) getActivity().findViewById(R.id.button2)).setText("Read more");
                Intent intent = new Intent(getActivity(), Pindprogress2Activity.class);
                startActivity(intent);
            }
        });

        //Analysis
        Button button3 = (Button) view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button) getActivity().findViewById(R.id.button3)).setText("Read more");
                Intent intent = new Intent(getActivity(), PindProgressActivity.class);
                startActivity(intent);
            }
        });

        //Capacity
        Button button4 = (Button) view.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button) getActivity().findViewById(R.id.button4)).setText("Read more");
                Intent intent = new Intent(getActivity(), PindProgressActivity.class);
                startActivity(intent);
            }
        });

        return view;

    }

}






