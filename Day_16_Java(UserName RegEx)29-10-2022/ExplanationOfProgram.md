<h3>Explanation</h3>
 <br>1. In public class, main function we have input scanner n for number of inputs to be taken from user for username string .
 <br>2. The string taken is matched with regularExpression of UsernameValidator class.
 <br>3. matching goes like...
 <br>3.1. [a-zA-Z]{1} means any character(a-z) or(A-Z) can appear at first but only 1 time as specified in range braces.
 <br>3.2. [0-9_a-zA-Z]{7-29} means any character between a to z or A to Z or _ or 0-9 can appear atleast 7 times and atmost 29 times which result in total of 8 to 30 characters in string.
 <br>4. if the string taken as input matches the regularExpression then it prints Valid otherwise Invalid.
