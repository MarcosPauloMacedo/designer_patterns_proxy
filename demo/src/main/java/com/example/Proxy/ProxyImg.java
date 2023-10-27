package com.example.Proxy;

import com.example.Classe.RealImg;
import com.example.Interface.Image;

public class ProxyImg implements Image {
    private RealImg realImg;
    private String fileName;

    public ProxyImg(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImg == null)
            realImg = new RealImg(fileName);
        realImg.display();
    }
}
