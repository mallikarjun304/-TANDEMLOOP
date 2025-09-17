package ten_k_coders;
import java.util.*;
public class Program1 {
	public double addition(double a,double b) {
		return a+b;
	}
	public double subtraction(double a,double b) {
		return a-b;
	}
	public double multiplication(double a,double b) {
		return a*b;
	}
	public double division(double a,double b) {
		return a/b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome! which operation do you want...Ex:+, -, *, /");
		String TypeofOperation=sc.nextLine();
		System.out.println("Enter a and b values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		Program1 p=new Program1();
		if(TypeofOperation.equals("+")) {
			System.out.println(p.addition(a,b));
		}else if(TypeofOperation.equals("-")) {
			System.out.println(p.subtraction(a,b));
		}else if(TypeofOperation.equals("*")) {
			System.out.println(p.multiplication(a,b));
		}else if(TypeofOperation.equals("/")) {
			System.out.println(p.division(a,b));
		}else {
			System.out.println("Invalid Input...Please Try Again");
		}
	}

}
