package com.example.queue_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private Queue<Character> queue = new LinkedList<>();
    private Random rand = new Random();
    private Character boxLetter; // the letter that will show up in the center of the screen
    private int score;
    int amountA = 0;
    int amountB = 0;
    int amountC = 0;
    int amountD = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void onStart(View view) {

        long secondCounter = System.currentTimeMillis() * 1000; //returns the current millseconds
        while (secondCounter < (secondCounter * 5000)) { //to be less then 5 seconds
            this.letterCreator();
            TextView textView = (TextView) findViewById(R.id.randomLetter);
            textView.setText(boxLetter);
        }

    }

    public Character letterCreator() {
        int letterPicker = rand.nextInt(4) + 1;
        switch (letterPicker) {
            case 1:
                boxLetter = (char) R.string.A;
                break;
            case 2:
                boxLetter = (char) R.string.B;
                break;
            case 3:
                boxLetter = (char) R.string.C;
                break;
            case 4:
                boxLetter = (char) R.string.D;
                break;
            default:
                System.out.println("Didn't work");
        }
        return boxLetter;
    }


    public void enqueue() {
        if (this.queue.size() == 5) {
            System.out.println("size is 5");
        } else if (this.queue.size() == 0) {
            queue.add(boxLetter);
            this.setScore(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q1);
            textView.setText(boxLetter);
        } else if (this.queue.size() == 1) {
            queue.add(boxLetter);
            this.setScore(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q2);
            textView.setText(boxLetter);
        } else if (this.queue.size() == 2) {
            queue.add(boxLetter);
            this.setScore(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q3);
            textView.setText(boxLetter);
        } else if (this.queue.size() == 3) {
            queue.add(boxLetter);
            this.setScore(boxLetter);
            TextView textView = (TextView) findViewById(R.id.q4);
            textView.setText(boxLetter);
        }

    }

    public void dequeue() {
        if (this.queue.size() == 1) {
            //remove elemnt
        } else if (this.queue.size() == 2) {
            this.queue.remove();
            TextView textView = (TextView) findViewById(R.id.q1);
            textView.setText("");
            textView.setText(queue.peek());
            TextView nextView = (TextView) findViewById(R.id.q2);
            nextView.setText("");
        } else if (this.queue.size() == 3) {
            this.queue.remove();
            TextView textView = (TextView) findViewById(R.id.q1);
            textView.setText("");
            textView.setText(queue.peek());
            TextView secondView = (TextView) findViewById(R.id.q2);
            TextView thirdView = (TextView) findViewById(R.id.q3);
            secondView.setText(thirdView.getText());
            thirdView.setText("");
        } else if (this.queue.size() == 4) {
            this.queue.remove();
            TextView textView = (TextView) findViewById(R.id.q1);
            textView.setText("");
            textView.setText(queue.peek());
            TextView secondView = (TextView) findViewById(R.id.q2);
            TextView thirdView = (TextView) findViewById(R.id.q3);
            secondView.setText(thirdView.getText());
            TextView fourthView = (TextView) findViewById(R.id.q4);
            thirdView.setText(fourthView.getText());
            fourthView.setText("");
        }
    }


    public void setScore(Character fromBox) {
        if (fromBox == (char) R.string.A){
            amountA++;
            if (amountA == 3) {
                score = score * 2;
            } else if (amountA > 3) {
                score = 0;
            } else {
                score++;
            }
        } else if(boxLetter == (char) R.string.B) {
                amountB++;
                if (amountB == 3) {
                    score = score * 2;
                } else if (amountB > 3) {
                    score = 0;
                } else {
                    score++;
                }
            } else if (boxLetter == (char) R.string.C) {
            amountC++;
            if (amountC == 3) {
                score = score * 2;
            } else if (amountC > 3) {
                score = 0;
            } else {
                score++;
            }
        } else if (boxLetter == (char) R.string.D){
            amountD++;
            if (amountD == 3) {
                score = score * 2;
            } else if (amountD > 3) {
                score = 0;
            } else {
                score++;
            }
        }
    }

}