package com.example.android.recycylerview2020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentViewHolder> {
    private List<President> presidents;
    private Context context;

    public PresidentAdapter(List<President> presidents, Context context) {
        this.presidents = presidents;
        this.context = context;
    }

    @Override
    public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_president, parent, false);
        return new PresidentViewHolder(view, context);
    }


    @Override
    public void onBindViewHolder(PresidentViewHolder holder, int position) {
        President president = presidents.get(position);
        holder.getPresidentNameView().setText(president.getName());
        holder.getPresidentInfoView().setText(president.getInfo());
        holder.getPresidentPhotoView().setImageResource(president.getPhotoId());
    }

    @Override
    public int getItemCount() {
        return presidents.size();
    }

}

