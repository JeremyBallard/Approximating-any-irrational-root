import java.util.*;
import java.lang.Math;

public class Root {
	//meant to remove dividing by 0, also useless to use algorithm to check for perfect squares
	public static double approxRoot(double x, double y, int rootFactor){
		if (y == 0.0){
			System.out.println("Error - Cannot divide by 0");
			return -1;
		}
		//assumed to round down irrational roots such that when multiplied by itself it will not equal rootFactor
		if ((int)Math.sqrt(rootFactor) * (int)Math.sqrt(rootFactor) == rootFactor){
			System.out.println("Has to be an irrational root for this to work");
			return Math.sqrt(rootFactor);
		}
		return approxRoot(x, y, 0, 0.0, rootFactor);
	}
	private static double approxRoot(double x, double y, int count, double approx, int rootFactor){
		//breaks out of the recusive algorithm, especially since the changes are miniscule at this count
		//attempting to limit count flexibly
		if (count == 2*rootFactor){
			System.out.println("Count @ " + count);
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			return approx;
		}
		approx = x/y;
		//meant to show user changes through the algorithm
		switch(count){
			case 1:
			case 2:
			case 5:
			case 8:
			case 10:
			case 15:
			case 25:
			case 50:
			case 100:
			case 250:
			case 500:
			case 1000:
			case 2500:
			case 5000:
				System.out.println("Count @ " + count);
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("approx = " + approx);
				break;
			default:
				break;
		}

		return approxRoot(x+rootFactor*y, x+y, count+1, approx, rootFactor);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Root approx = new Root();
		double root;
		System.out.println("This system will approximate any irrational positive root through any x and y");
		System.out.println("Pick your irrational root");
		int rootFactor = in.nextInt();
		System.out.println("Type in an x value");
		double x = in.nextDouble();
		System.out.println("Type in a y value");
		double y = in.nextDouble();
		root = Root.approxRoot(x, y, rootFactor);
		System.out.println("root "+ rootFactor +" is a approx = " + root);
	}
}