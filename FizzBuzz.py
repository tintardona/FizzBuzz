# Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number 
# and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
import time
startTime = time.time_ns()
for i in range(1, 101):
    if i % 15 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
       print("Buzz")
    else:
       print(i)
print("Elapsed time: ", time.time_ns() - startTime )

startTime = time.time_ns()
 
[print(("Fizz" * (x % 3==0) + "Buzz" * (x % 5==0)) or x) for x in range(1,101)]

print("Elapsed time: ", time.time_ns() - startTime)