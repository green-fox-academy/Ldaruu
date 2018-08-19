package com.greenfoxacademy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sharpie orange = new Sharpie("Orange", 33);
        Sharpie blue = new Sharpie("Blue",9 );
        Sharpie green = new Sharpie("green", 0.33f);
        SharpieSet box =new SharpieSet();
        box.addSharpie(green);
        box.addSharpie(orange);
        box.addSharpie(blue);
        box.printSharies();

	// write your code here
    }
}
