/*
"Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"."

Concept: make a Fizz class and a Buzz class
*/
//package fizzbuzz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FizzBuzz{

    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("FizzBuzz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(600, 500));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
    
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        long beforeUsedMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long startTime = System.nanoTime();
        
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

        for(int i = 1; i <= 100; i++){
            if((fizz.testFizz(i) && buzz.testBuzz(i))){
                fizz.printFizz();
                buzz.printBuzz();
                System.out.println();
            }else if( fizz.testFizz(i)){
                fizz.printFizz();
                System.out.println();
            }else if( buzz.testBuzz(i)){
                buzz.printBuzz();
                System.out.println();
            }else{
                System.out.print(i);
                System.out.println();
            }
        }
        System.out.println("Elapsed Time: " + (System.nanoTime() - startTime));
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory(); 
        long actualMemUsed = afterUsedMem-beforeUsedMem;
        System.out.println("Memory used: " + actualMemUsed);
    }

    
}



class Fizz{

    public boolean isFizz = false;

    public Fizz(){

         isFizz = false;
    }

    public void printFizz(){
        System.out.print("Fizz");
    }
    
    public boolean testFizz(int i){
        isFizz = (i % 3 == 0);
        return isFizz;
    }

}


class Buzz{

    public boolean isBuzz = false;

    public Buzz(){

         isBuzz = false;
    }

    public void printBuzz(){
        System.out.print("Buzz");
    }
    
    public boolean testBuzz(int i){
        isBuzz = (i % 5 == 0);
        return isBuzz;
    }

}