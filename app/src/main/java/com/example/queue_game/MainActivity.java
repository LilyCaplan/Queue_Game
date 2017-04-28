package com.example.queue_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private Queue<Character> queue = new LinkedList<>();
    private Random rand = new Random();
    charachter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    protected void onStart(View){
        //for the length of three seconds
        // chachter pops up in text view
        // press enqueue to enqueue that letter  into the queue text box
        // or press dequeue to dequeue letter from begining of queue
        //if user has dequeued shift the visuals for the queue elemnts over


    }
    public void letterCreator(){
            int letterPicker= rand.nextInt(4)+1;
            switch (letterPicker){
                case 1 :
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Didn't work");
            }


        }

    }
}
