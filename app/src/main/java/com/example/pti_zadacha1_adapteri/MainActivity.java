package com.example.pti_zadacha1_adapteri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animal dogAnimal = new Animal("Dog",R.drawable.rottweiler);
        Animal catAnimal = new Animal ("Cat", R.drawable.cat1);
        Animal papagalAnimal = new Animal("Papagal", R.drawable.papagal);
        Animal cowAnimal = new Animal("Cow", R.drawable.cow);
        Animal lionAnimal = new Animal("Lion",R.drawable.lion);
        Animal pantherAnimal = new Animal("Panther", R.drawable.panther);

        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(dogAnimal);
        animalList.add(catAnimal);
        animalList.add(papagalAnimal);
        animalList.add(cowAnimal);
        animalList.add(lionAnimal);
        animalList.add(pantherAnimal);

        ArrayAdapter<Animal> adapter = new AdapterAnimal(this,animalList);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
