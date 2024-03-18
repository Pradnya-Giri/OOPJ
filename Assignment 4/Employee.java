class Employee{
    String name;
    int empId;
    double salary;

void Info( String name, int empId, double salary){
    System.out.println("Name: " + name);
    System.out.println("EmpID: " + empId);
    System.out.println("Salary: " + salary);

}
void Info(int a, String b, double c ){
    this.empId=a;
    this.name=b;
    this.salary=c;
    System.out.println("Name: "+ this.name+" EmpId: "+this.empId+" Salary: "+this.salary);
}
void Info( double salary, int empId, String name){
    System.out.println("Name: " + name);
    System.out.println("EmpID: " + empId);
    System.out.println("Salary: " + salary);
} 
public static void main(String[] args){
    Employee emp = new Employee();
    emp.Info("Abcd", 1235, 25000.59);
    emp.Info(523, "Adam", 632.25 );
    emp.Info( 5682.25,3658, "Pqrs");
}
}