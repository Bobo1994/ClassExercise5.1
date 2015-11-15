import java.util.Scanner;

public class Function2 {

	public static void main(String[] args) {
		System.out.println("First result: "+h(read()));
		System.out.println("Second result: "+f(read(),read()));
		System.out.println("Third result: "+g(read(),read(),read()));
		
	}
	public static double h(double x){
		double result =1;
		for (int i=0;i<10;i++){
			result*=x;
		}
		return result;
	}
	public static double f(double x,double y){
		return (x+y);
	}
	public static double g(double x,double y,double z){
		double c=0;
		c=sqrt(x)+getAbs(y)+getPow(z,y);
		return c;
		

	}
	public static double sqrt(double number){
		double t; 
 		double root = number / 2; 
		do { 
		t = root; 
 		root = (t + (number / t)) / 2; 
		} while ((t - root) != 0); 
	  
		return root; 
	}
	public static double getAbs(double number){
		double result=0;
		if(number <0){
			result=-number;
		}else {result=number;}
		return result;
	}
	public static double getPow(double number,double number2){
		double result = 1;
		if(number!=0){
			if(number2>0){for (int i=0;i<number2;i++){
			result*=number;}
			}	
			else if(number2==0)
			{result=1;}
			else{
				for (int i=0;i<(-number2);i++){
				result*=number;
				result=1/result;}
				}
		}else
		{result=0;}
		return result;
	}
	public static int read(){
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		return number;
	}
}
