package com.jonnyc.proxypattern;

public class Demo {

    public static void main(String[] args) {

        Image image = new ProxyImage("bemused_dog_47368.jpg");
        image.display();
        image.display();
    }
}
