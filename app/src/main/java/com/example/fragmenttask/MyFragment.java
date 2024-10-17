package com.example.fragmenttask;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyFragment extends Fragment {

    private TextView messageTextView;

    public MyFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my, container, false);
        messageTextView = view.findViewById(R.id.message_text_view);
        Button changeMessageButton = view.findViewById(R.id.change_message_button);
        Button backButton = view.findViewById(R.id.back_button);

        changeMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageTextView.setText("Button Clicked!");
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageTextView.setText("Welcome to Fragments");
            }
        });

        return view;
    }
}
