import java.util.Scanner;

class Grades{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int percent= sc.nextInt();
if(100>=percent && percent>= 65){
	System.out.println("A");
}else if(65>percent && percent>=50){
	System.out.println("B");
}else if(50>percent && percent>=40){
	System.out.println("C");
}else if(percent>100){
	System.out.println("Invalid Marks.");
}else{
	System.out.println("D");
}


}
}