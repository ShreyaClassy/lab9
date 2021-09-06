package lab9;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CompanyJobRepository {
	
	private int age;
	private String highestQualification;

	public CompanyJobRepository() {
		super();
		}

	public CompanyJobRepository(int age, String highestQualification) {
		super();
		this.age = age;
		this.highestQualification = highestQualification;
	}





	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	

	static String getJobPrediction(int age, String highestQualification){
	
	CompanyJobRepository c1=new CompanyJobRepository();

	 try{
	 	if(c1.getAge()<19) {
			  NotEligibleException e=new NotEligibleException("You are underage for any job");
		 	throw e;
	 }
		else if(c1.getAge()>=21 && c1.getHighestQualification().matches("B.E")) {
			return "We have openings for junior developer";
		}

		else if(c1.getAge()>=26 && (c1.getHighestQualification().matches("M.S")|| c1.getHighestQualification().matches("PhD"))){
			return "We have openings for senior developer";
		}
		else if(c1.getAge()>=19 && (!c1.getHighestQualification().matches("B.E") || c1.getHighestQualification().matches("M.S")|| c1.getHighestQualification().matches("PhD"))){
			 NotEligibleException e=new NotEligibleException("We do not have any job that matches your qualifications");
		 	throw e;

		}
		else{
			return "Sorry we have no openings for now";
		}
	 }

	 catch(NotEligibleException ne){
		 
	 }
	
	
	


 
return null;	

}
}

public class DoSelectExceptionHandling {
	
	
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		String highestQualification=sc.next();
	}

		String searchForJob(int age,String highestQualification) {
			
			
		
			 try{
				 	if(age>=200 || age<=0){
						NotEligibleException ae=new NotEligibleException("The age entered is not typical for a human being");
						throw ae;

			 	 	 }

					else {
						CompanyJobRepository cr=new CompanyJobRepository();
						int age1=cr.getAge();
						String highestQualification1=cr.getHighestQualification();
						String prediction=CompanyJobRepository.getJobPrediction(age1,highestQualification1);
						return prediction;
						
						
						
					}
			 }
			 catch(NotEligibleException e){
				return "The age entered is not typical for a human being";
			 }
			 

			 }

		 
	}

class NotEligibleException extends Exception {

	NotEligibleException(String message){
		super(message);
	}
}