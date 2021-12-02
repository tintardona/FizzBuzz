/*
"Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"."

Concept: make a Fizz class and a Buzz class
*/
//package fizzbuzz;


public class FizzBuzz{
    public static void main(String[] args){
        long startTime = System.nanoTime();
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();

        

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


