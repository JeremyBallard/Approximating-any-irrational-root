import java.util.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Root {
	//meant to remove dividing by 0, also useless to use algorithm to check for perfect squares
	public static BigDecimal approxRoot(BigDecimal x, BigDecimal y, int rootFactor, int userCount){
		if (y == BigDecimal.valueOf(0.0)){
			System.out.println("Error - Cannot divide by 0");
			return BigDecimal.valueOf(-1.0);
		}
		//assumed to round down irrational roots such that when multiplied by itself it will not equal rootFactor
		if ((int)Math.sqrt(rootFactor) * (int)Math.sqrt(rootFactor) == rootFactor){
			System.out.println("Has to be an irrational root for this to work");
			return BigDecimal.valueOf(Math.sqrt(rootFactor));
		}
		return approxRoot(x, y, 0, BigDecimal.valueOf(0.0), rootFactor, userCount);
	}
	private static BigDecimal approxRoot(BigDecimal x, BigDecimal y, int count, BigDecimal approx, int rootFactor, int userCount){
		for(int i = 0; i < userCount; i++){
			//meant to store x and y for new iteration
			BigDecimal oldX = x;
			BigDecimal oldY = y;
			oldX.setScale(100, RoundingMode.HALF_UP);
			oldY.setScale(100, RoundingMode.HALF_UP);
			approx = oldX.divide(oldY, 100, RoundingMode.HALF_UP);
			x = oldX.add(oldY.multiply(BigDecimal.valueOf(rootFactor)));
			y = oldY.add(oldX);
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
				case 1500:
				case 2000:
				case 2500:
				case 5000:
				case 10000:
					System.out.println("Count @ " + count);
					System.out.println("x = " + x);
					System.out.println("y = " + y);
					System.out.println("approx = " + approx);
			}
			count++;
		}
		System.out.println("Count @ " + count);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		return approx;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Root approx = new Root();
		BigDecimal root = new BigDecimal(0);
		root.setScale(100, RoundingMode.HALF_UP);
		System.out.println("This system will approximate any irrational positive root through any x and y");
		System.out.println("Pick your irrational root");
		int rootFactor = in.nextInt();
		System.out.println("Type in how many times you want to iterate this algorithm");
		int userCount = in.nextInt();
		System.out.println("Type in an x value");
		BigDecimal x = new BigDecimal(0);
		x = BigDecimal.valueOf(in.nextDouble());
		x.setScale(100, RoundingMode.HALF_UP);
		System.out.println("Type in a y value");
		BigDecimal y = new BigDecimal(0);
		y = BigDecimal.valueOf(in.nextDouble());
		y.setScale(100, RoundingMode.HALF_UP);
		root = Root.approxRoot(x, y, rootFactor, userCount);
		root.setScale(10, RoundingMode.HALF_UP);
		System.out.println("sqrt "+ rootFactor +" is approx = " + root);
		//closes the scanner
		in.close();
	}
}