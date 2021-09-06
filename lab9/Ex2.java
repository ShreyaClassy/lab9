package lab9;

import java.util.function.UnaryOperator;

public class Ex2 {

	public static void main(String[] args) {
		
		UnaryOperator<String>u1=s->{
			StringBuilder res=new StringBuilder();
			for(int i=0;i<s.length();i++) {
				if(i>0) {
					res.append(" ");
				}
				
				res.append(s.charAt(i));
			}
			
			return (res.toString());
		};
		
		String str=u1.apply("CG");
		System.out.println(str);
	}
}
		
