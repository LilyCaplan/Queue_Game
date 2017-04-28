package com.example.queue_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private Queue<Character> queue = new LinkedList<>();
    private Random rand = new Random();
    private Character boxLetter; // the letter that will show up in the center of the screen
    private int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    protected void onStart(View){

        long secondCounter = System.currentTimeMillis() * 1000; //returns the current millseconds
        while (secondCounter <(secondCounter*5000)){ //to be less then 5 seconds

        }


        // chachter pops up in text view
        // press enqueue to enqueue that letter  into the queue text box
        // or press dequeue to dequeue letter from begining of queue
        //if user has dequeued shift the visuals for the queue elemnts over


    }
    public void letterCreator(){
            int letterPicker= rand.nextInt(4)+1;
            switch (letterPicker){
                case 1 :
                    boxLetter = 'a';
                    break;
                case 2 :
                    boxLetter = 'b';
                    break;
                case 3 :
                    boxLetter = 'c';
                    break;
                case 4 :
                    boxLetter = 'd';
                    break;
                default:
                    System.out.println("Didn't work");
            }


        }

    }
}
