<h3>Explanation-</h3>
<br>1. MyCalculator class is declared with a method power of long type because it either returns a long calculation or it returns an exception
<br>2. Varibale res is declared long because it will store power calculations which is long sometimes.
<br>3. First if statement checks the any of n or p is negative or not, if it is negative it throws exception.
<br>4. Second if statement checks the any of n and p is 0 or not, if it is 0 it throws exception.
<br>5. if there is no errors mentioned in if statement then it returns res value.
<br>6. In public class we have created a object(my_calculator) and Scanner object(sc) with final keyword so that its value is fixed no one can change or use it with again by declaring.
<br>7. In main method we have while loop working till input is given by user with hasNextInt() functions, input is taken by n and p.
<br>8. try block has printing is somevalues through calling method power of class MyCalculator.
<br>9. if the error in printing is occured that means there an exception is throwed by method power which has to be catched and printed using variable e.
