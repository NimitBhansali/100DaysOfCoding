//Program- To implement vector class and to change the elements in vector class.

import java.util.*;

public class VectorClass {
	public static void main(String args[])
	{
		// Creating an empty Vector without size
		Vector<Integer> vec_tor = new Vector<Integer>();

		// Use add() method to add elements in the vector
		vec_tor.add(12);
		vec_tor.add(23);
		vec_tor.add(22);
		vec_tor.add(10);
		vec_tor.add(20);
        vec_tor.add(40);
		// Displaying the Vector
		System.out.println("Vector: " + vec_tor);

		// Using set() method to replace elements
		System.out.println("The Object that is replaced is: "+ vec_tor.set(0, 21));

		// Using set() method to replace elements
		System.out.println("The Object that is replaced is: "+ vec_tor.set(4, 50));

		// Displaying the updated vector
		System.out.println("The new Vector is:" + vec_tor);
	}
}
//OUTPUT-
// Vector: [12, 23, 22, 10, 20, 40]
// The Object that is replaced is: 12
// The Object that is replaced is: 20
// The new Vector is:[21, 23, 22, 10, 50, 40]
