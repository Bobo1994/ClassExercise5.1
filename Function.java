import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		System.out.println(h(read()));
		System.out.println(f(read(),read()));
		System.out.println(g(read(),read(),read()));
	}
	public static double h(double x){
		return Math.pow(x,10);
	}
	public static double f(double x,double y){
		return (x+y);
	}
	public static double g(double x,double y,double z){
		double c=0;
		c=Math.sqrt(x)+Math.abs(y)+Math.pow(z, y);
		return c;
	}
	public static int read(){
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		return number;
	}
}
