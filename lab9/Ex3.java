package lab9;

import java.util.function.BiPredicate;

public class Ex3 {

	public static void main(String[] args) {
		
		BiPredicate <String,String> userValidate=(x,y)->{
			
			return (x.isEmpty() && y.isEmpty());
		};
		
		boolean result=userValidate.test( " ", "123456");
		System.out.println(result);

	}

}
