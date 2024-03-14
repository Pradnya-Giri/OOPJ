import java.util.Scanner;

class LeapYear{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int year= sc.nextInt();
	boolean isLeapYear= true;

	if(year%4==0){
		isLeapYear= true;
		if(year%100==0){
		if(year%400==0){
			isLeapYear= true;
		}else{isLeapYear= false;}
		}
		
	}
	else{
		isLeapYear= false;
	}

	if(isLeapYear){System.out.println("Leap year!!");}
	else{System.out.println("Not a Leap year.");}

}
}