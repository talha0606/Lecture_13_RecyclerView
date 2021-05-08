package com.example.recyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.citiesViewHolder>{

    private List<Cities> citiesList;
    Activity mAct;

    public RecyclerViewAdapter(List<Cities> citiesList, Activity mAct) {
        this.citiesList = citiesList;
        this.mAct = mAct;
    }

    @NonNull
    @Override
    public citiesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cities,parent,false);
        return new citiesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull citiesViewHolder holder, int position) {

        holder.data = citiesList.get(position);
        holder.cityName.setText(holder.data.city);
        holder.country.setText(holder.data.country);
    }

    @Override
    public int getItemCount() {
        return citiesList.size();
    }

    public class citiesViewHolder extends RecyclerView.ViewHolder {
        Cities data;
        ImageView cityIcon;
        TextView cityName;
        TextView country;
        public citiesViewHolder(@NonNull View itemView) {
            super(itemView);
            cityIcon = itemView.findViewById(R.id.cityIcon);
            cityName = itemView.findViewById(R.id.cityName);
            country = itemView.findViewById(R.id.country);
        }
    }
}
