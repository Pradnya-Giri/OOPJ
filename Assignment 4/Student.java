import java.util.Scanner;

class Student1{
	private String StudentName;
	int rollNum;
	float percentage;

	public void acceptRecord(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Student Name : ");
		this.StudentName = sc.nextLine();
		System.out.print("Roll Number : ");
		this.rollNum = sc.nextInt();
		System.out.print("Percentage : ");
		this.percentage = sc.nextFloat();
	}

	public void printRecord(){
		System.out.println(this.StudentName +" "+ this.rollNum +" "+ this.percentage);
	}

}

class Program1{
public static void main(String[] args){
	Student1 student = new Student1();
	student.acceptRecord();
	student.printRecord();

	Student1 student1 = new Student1();
	student1.acceptRecord();
	student1.printRecord();

	Student1 student2 = new Student1();
	student2.acceptRecord();
	student2.printRecord();

	Student1 student3 = new Student1();
	student3.acceptRecord();
	student3.printRecord();

}
}

//output:
/*Student Name : pray
Roll Number : 11
Percentage : 65.25
pray 11 65.25
Student Name : rohn
Roll Number : 12
Percentage : 78.29   
rohn 12 78.29
Student Name : john
Roll Number : 13
Percentage : 81.26
john 13 81.26
Student Name : dan
Roll Number : 14
Percentage : 92.5
dan 14 92.5*/