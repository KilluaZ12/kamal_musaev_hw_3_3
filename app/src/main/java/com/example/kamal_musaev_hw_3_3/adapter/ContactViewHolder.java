package com.example.kamal_musaev_hw_3_3.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kamal_musaev_hw_3_3.R;

import java.lang.reflect.Array;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView textViewName, textViewLastname, textViewAge;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String text){
        textViewName = itemView.findViewById(R.id.text_view_name);
        textViewLastname = itemView.findViewById(R.id.text_view_lastname);
        textViewAge = itemView.findViewById(R.id.text_view_age);

        String[] items = text.split(",");
        String name = items[0];
        String lastname = items[1];
        String age = items[2];

        textViewName.setText(name);
        textViewLastname.setText(lastname);
        textViewAge.setText(age);
    }
}
