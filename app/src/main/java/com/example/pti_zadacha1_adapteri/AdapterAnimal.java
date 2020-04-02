package com.example.pti_zadacha1_adapteri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterAnimal extends ArrayAdapter<Animal> {
    private List<Animal> animals;

    AdapterAnimal(Context context, List<Animal> resources){
        super(context,0,resources);
        animals = resources;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout2,parent,false);
        Animal animal = animals.get(position);

        ImageView animalPic = convertView.findViewById(R.id.imageView);
        TextView animalName = convertView.findViewById(R.id.textView);

        animalName.setText(animal.getName());
        animalPic.setImageResource(animal.getPictureID());

        return convertView;
    }

}