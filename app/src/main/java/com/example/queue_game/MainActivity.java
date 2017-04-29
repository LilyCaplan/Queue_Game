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
    @Override
    protected void onStart() {
        long secondCounter = System.currentTimeMillis() * 1000; //returns the current millseconds
            letterCreator();
            TextView textView = (TextView) findViewById(R.id.randomLetter);
            textView.setText(boxLetter.toString());
        super.onStart();
    }

    public void letterCreator() {
        int letterPicker = rand.nextInt(4) + 1;
        switch (letterPicker) {
            case 1:
                boxLetter = 'A';
                break;
            case 2:
                boxLetter = 'B';
                break;
            case 3:
                boxLetter = 'C';
                break;
            case 4:
                boxLetter = 'D';
                break;
            default:
                System.out.println("Didn't work");
        }
    }


    public void enqueue(View v) {
        if (this.queue.size() == 0) {
            queue.add(boxLetter);
            System.out.println(boxLetter);
        } else if (this.queue.size() == 1) {
            queue.add(boxLetter);
            System.out.println(boxLetter);

        } else if (this.queue.size() == 2) {
            queue.add(boxLetter);
            System.out.println(boxLetter);

        } else if (this.queue.size() == 3) {
            queue.add(boxLetter);
            System.out.println(boxLetter);

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


    public void setScore() {
        if (boxLetter == 'A'){
            amountA++;
            if (amountA == 3) {
                score = score * 2;
            } else if (amountA > 3) {
                score = 0;
            } else {
                score++;
            }
        } else if(boxLetter == 'B') {
                amountB++;
                if (amountB == 3) {
                    score = score * 2;
                } else if (amountB > 3) {
                    score = 0;
                } else {
                    score++;
                }
        } else if (boxLetter == 'C') {
            amountC++;
            if (amountC == 3) {
                score = score * 2;
            } else if (amountC > 3) {
                score = 0;
            } else {
                score++;
            }
        } else if (boxLetter == 'D'){
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