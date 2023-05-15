package com.example.kamal_musaev_hw_3_3.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kamal_musaev_hw_3_3.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    ArrayList<String> newArraylist;

    public ContactAdapter(ArrayList<String> arrayList){
        newArraylist = arrayList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.onBind(newArraylist.get(position));
    }

    @Override
    public int getItemCount() {
        return newArraylist.size();
    }
}
