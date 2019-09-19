package com.example.pimontecarloapp;

import java.util.Random;

public class BerechnePi {
    double x, y, r = 1;
    int numbers;


    public BerechnePi(int numbers){
        this.numbers = numbers;
    }

    public double berechne_Pi(){
        int numbers_in_circle = 0;
        double pi;

        Random rand = new Random();

        for(int i = 0; i < numbers ; i++)
        {
            x = rand.nextDouble();
            y = rand.nextDouble();

            if(y <= Math.sqrt( (r*r) - (x*x) )){
                numbers_in_circle++;
            }
        }

        pi = (4 * numbers_in_circle) / (double) numbers;


        return pi;
    }

}
