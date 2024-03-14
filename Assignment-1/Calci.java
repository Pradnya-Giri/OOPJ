import java.util.Scanner;

class Calci{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any two values : ");
	float A = sc.nextFloat();
	float B = sc.nextFloat();
	System.out.println("Enter operating sign (+ - * /) : ");
	char ch = sc.next().charAt(0);

	switch(ch){
		case '+': System.out.println( A+B ); break;
		case '-': System.out.println( A-B ); break;
		case '*': System.out.println( A*B ); break;
		case '/': System.out.println( A/B ); break;
	}

}}