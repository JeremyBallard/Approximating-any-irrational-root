Author: Jeremy Ballard

Description: Root is a class meant to implement an algorithm that helps approximate any root you give it, given that the root is irrational. This means that if the user wants to find the root of 4, the program says the root is not irrational and returns the correct root, in double. The program, when run through console, is a simple interface that allows the user to plug in positive values. Unfortunately, I haven't programmed to throw negative x, y, or root approx values yet, but those should be coming very shortly. 

For more information on the algorithm itself, I used a variation of Theon of Smyr's approximation for root 2. The approximation is a recursive function that very quickly approximates root 2. I have generalized the approximation for all roots. The only issue is with finding roots past 100, the x and y values, in general, almost always tend towards infinity too quickly. Having x and y values inputted as very small (x, y < 5) is ideal for finding any root above 50. 

Also an unfortunate side effect is that there are still changes to the number, albeit in the 10^-9 and greater places (but still changes), when the counter hits its 300 max. This 300 iteration max was chosen as a compromise between x and y values still being computable and enough iterations to get nearly even digit shown (in the console version) consistent with what has been computed so far in general mathematics.

!!!! WARNING !!!!
This algorithm is HIGHLY UNSTABLE with roots above 100, where x and y are also over 5. Anticipate Infinity over Infinity very frequently.