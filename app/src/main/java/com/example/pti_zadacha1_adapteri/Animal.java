package com.example.pti_zadacha1_adapteri;

public class Animal {
    private String name;
    private int pictureID;

    public Animal(String name,int pictureID){
        this.name = name;
        this.pictureID = pictureID;
    }

    public String getName(){
        return name;
    }

    public int getPictureID(){
        return pictureID;
    }
}