// $ javac Tree.java && java Tree

interface Vessel { }
interface Toy { }
class Boat implements Vessel { }
class Speedboat extends Boat implements Toy { }
public class Tree {
	public static void main(String[] args) {
		String s = "0";
		Boat b = new Boat();
		Boat b2 = new Speedboat();
		Speedboat s2 = new Speedboat();
		if((b instanceof Vessel) && (b2 instanceof Toy))	s += "1";
		if((s2 instanceof Vessel) && (s2 instanceof Toy))	s += "2";
		System.out.println(s);
	}
}

/**
* 4.10
* Chapter 4
* Question 10
* What is the result?
* A. 0
* B. 01
* C. 02
* D. 012
* E. Compilation fails
* F. An exception is thrown at runtime
**/

/** 
* Answer: D
* First, remember that instanceof
* can look up through multiple levels of an inheritance tree.
* Also remember that instanceof is commonly used before attempting a downcast,
* so in this case, after line 15, it would be possible to
* say Speedboat s3 = (Speedboat)b2;
**/