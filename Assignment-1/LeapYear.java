import java.util.Scanner;

class LeapYear{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int year= sc.nextInt();
	//boolean isLeapYear= true;
	
	String result;
	result = ((year%4 == 0 && year %100 != 0)? "is a leap year." : (year%400 == 0) ? "is a leap year." : "is not a leap year.");

	System.out.println(year + " " + result);
	sc.close();

	/* if(year%4==0){
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
*/
	if(isLeapYear){System.out.println("Leap year!!");}
	else{System.out.println("Not a Leap year.");}

}
}
