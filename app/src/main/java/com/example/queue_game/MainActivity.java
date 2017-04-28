package com.example.queue_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private Queue<Character> queue = new LinkedList<>();
    private Random rand = new Random();
    private Character boxLetter; // the letter that will show up in the center of the screen
    private int score;
    Button en = (Button) findViewById(R.id.enqueue);
    Button de = (Button) findViewById(R.id.dequeue);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    protected void onStart(View) {

        long secondCounter = System.currentTimeMillis() * 1000; //returns the current millseconds
        while (secondCounter < (secondCounter * 5000)) { //to be less then 5 seconds
            this.letterCreator();
            TextView textView = (TextView) findViewById(R.id.main);
            textView.setText(boxLetter);
            //pressing enqueue goes into the queue
            if () {

            } else if () {
                //pressing dequeque removes and shift
            }

            

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



    public void enqueue() {
        if (this.queue.size() == 5){
            break;
        } else if (size == 0){
            queue.add(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q1);
            textView.setText(boxLetter);
        } else if (size == 1){
            queue.add(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q2);
            textView.setText(boxLetter);
        } else if (size == 2){
            queue.add(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q3);
            textView.setText(boxLetter);
        } else if (size == 3){
            queue.add(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q4);
            textView.setText(boxLetter);
        } else if (size == 4){
            queue.add(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q5);
            textView.setText(boxLetter);
        }

    }
    public void dequeue() {
        if (this.queue.size()==1){
            //remove elemnt
        } else {
            //remove element and shift
        }
    }


}
