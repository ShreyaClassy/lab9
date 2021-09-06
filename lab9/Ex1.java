package lab9;

import java.util.function.BiFunction;

public class Ex1 {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Double> bi=(a,b)->Math.pow(a,b);
		double d=bi.apply(3,2);
		System.out.println(d);

	}

}
