package com.example.Classe;

import com.example.Interface.Image;

public class RealImg implements Image {
    private String fileName;

    public RealImg(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
