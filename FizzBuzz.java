/*
"Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"."

Concept: make a Fizz class and a Buzz class
*/
//package fizzbuzz;


public class FizzBuzz{
    public static void main(String[] args){
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();

        for(int i = 1; i <= 100; i++){
            if( i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if( fizz.testFizz(i)){
                fizz.printFizz();
            }else if( buzz.testBuzz(i)){
                buzz.printBuzz();
            }else{
                System.out.println(i);
            }
        } 
    }
}



class Fizz{

    private boolean isFizz = false;

    public Fizz(){

         isFizz = false;
    }

    public void printFizz(){
        System.out.println("Fizz");
    }
    
    public boolean testFizz(int i){
        return (i % 3 == 0);
    }

}


class Buzz{

    private boolean isBuzz = false;

    public Buzz(){

         isBuzz = false;
    }

    public void printBuzz(){
        System.out.println("Buzz");
    }
    
    public boolean testBuzz(int i){
        return (i % 5 == 0);
    }

}


