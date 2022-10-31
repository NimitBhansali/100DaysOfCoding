<h3>Explanation</h3>
<br>1. Class Arithmetic(SuperClass) has a int type method namely add with 2 parameters which returns sum of 2 numbers
<br>2. Then a class Adder is created without any method but is derived from Arithmetic class using extends keyword.
<br>3. In main function of public class, We have an object created of Adder Class 'a'.
<br>4. To get super class name we used .getClass().getSuperclass().getName() to get name of class of object 'a' then its superclass name.
<br>5. Now at last we used 'a' object of adder class and used the method(add) of super class (arithmetic) and passed value to it ,also printing it.
