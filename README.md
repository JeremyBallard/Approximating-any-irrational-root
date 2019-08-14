Author: Jeremy Ballard

Version 1.1: Root is a class meant to implement an algorithm that helps approximate any root you give it, given that the root is irrational. This means that if the user wants to find the root of 4, the program says the root is not irrational and returns the correct root, in BigDecimal. The program, when run through console, is a simple interface that allows the user to plug in positive values. Unfortunately, still haven't programmed to throw negative x, y, or root approx values yet, but those should be coming whenever I get around to it. 

For more information on the algorithm itself, I used a variation of Theon of Smyr's approximation for root 2. The approximation is a recursive function that very quickly approximates root 2. I have generalized the approximation for all roots.

Users can also set the iteration count now. It's reccomended to set the iteration limit to be one or 2 orders of magnitude lower than the irrational root you want to approximate. The currently accurate and tested order of magnitude is 10^5. When chosen root is 10^6, even at 2500 iterations, it is still fairly inaccurate (4th decimal place wrong).

BigDecimal also has the issue of outputting very large numbers into console. This can make output into console confusing and ugly to look at. The approx output is still long but not nearly as bad or incomprehensible as the x and y outputs. 

Changes from previous version:
-Converted everything double to BigDecimal
-Added in an user chosen iteration cap
-Removed recursive function to prefer loop function. Might return back to recursive, but attempted to fix something else and needed loop structure.
-Added more outputs for the count
-Finally added the close for scanner
-Fixed a spelling error for output