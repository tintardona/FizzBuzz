#FizzBuzz

"Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"."

1. Purpose
The purpose of this project is to build FizzBuzz applications utilizing multiple languages. Each sub-app will showcase some unique feature of the language being used. For example, the Java version should use classes and run in an applet, the javascript version would use async/await/Promises and run in a browser etc. This project may also be used to explore design patterns and data structures. Testing frameworks may also be developed and used to optimize the app. Also will be a fun and focused way to learn new things.


2. Algorithm

    Input: A list of numbers from 1 to 100. This list could be generated or hard coded. The range can be made variable. It could also be read from a file or        retrieved over a network.

    Output: A processed list where each number divisible by 3 is replaced with the string "Fizz", each number divisible by 5 is replaced with "Buzz" and numbers divisible by 3 and 5 are replaced with "FizzBuzz". This output can go to a console, a file, another object or sent over the network.

    Processing: 
    
    Version 1: This version checks each condition discretely. The test for i % 15 = 0 must come first since each print statement prints a unique string. This version repeats the print statements multiple times. The condition tested is remainder division.

    1. Get number from the list.
    2. Is it divisible by 15? Yes: print "FizzBuzz". No: Go to step 3.
    3. Is it divisible by 3? Yes: print "Fizz". No: Go to step 4.
    4. Is it divisible by 5? Yes: print "Buzz". No: Go to step 5.
    5. Print the number.
    6. Return to 1.

    Version 2: We note that the previous algorithm repeats very similar statements and that "FizzBuzz" is a concatenation of "Fizz" and "Buzz". It would be better to have only 1 print statement per iteration. This version uses logical operators to build the string allowing for a single print statement. It also does some fancy type conversion as well. A string will be AND'ed with a Boolean to create the output. Not sure if all languages will allow this. This works on Python so far. Could possibly encode these states with some kind of binary code: 00 = i, 01 = Buzz, 10 = Fizz, 11 =  FizzBuzz.

    1. Let i = get number
    2. Let a = (i % 3 == 0)
    3. Let b = (i % 5 == 0)
    4. Print("Fizz" * a + "Buzz" * b) or print(i)
    5. Return to 1. 