import java.util.Scanner;
public class Exercise{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int num1 = in.nextInt();
  int num2 = in.nextInt();
  int num3 = in.nextInt();
  if(num1>num2 && num1>num3){
      System.out.println(num1);
  }
  else if(num2>num1 && num2>num3){
      System.out.println(num2);
  }
  else{
      System.out.println(num3);
  }
 }
}
//----------------------------------------------

/*import java.util.Scanner;
public class Exercise{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
    	for(int i=1;i<=num;i++)
    	{      
    		System.out.println(i);
    	}
    }
}*/

/*import java.util.Scanner;
public class Exercise{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.next().toLowerCase();
        char ch = input.charAt(0);
        switch(ch){
            case 'a' : System.out.println("Vowel"); break;
            case 'e' : System.out.println("Vowel"); break;
            case 'i' : System.out.println("Vowel"); break;
            case 'o' : System.out.println("Vowel"); break;
            case 'u' : System.out.println("Vowel"); break;
            default : System.out.println("Not Vowel"); 
        }
    }
}*/

/*import java.util.Scanner;
public class Exercise{
  public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";
        int month = input.nextInt();
        switch(month){
            case 1: System.out.println("January 31Days");
            case 2: System.out.println("February 28Days");
            case 3: System.out.println("March 31Days");
            case 4: System.out.println("April 30Days");
            case 5: System.out.println("May 31Days");
            case 6: System.out.println("June 30Days");
            case 7: System.out.println("July 31Days");
            case 8: System.out.println("August 31Days");
            case 9: System.out.println("September 30Days");
            case 10: System.out.println("October 31Days");
            case 11: System.out.println("November 30Days");
            case 12: System.out.println("December 31Days");
        }
  }
}*/

/*import java.util.Scanner;
public class Exercise{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if(x==y){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}*/