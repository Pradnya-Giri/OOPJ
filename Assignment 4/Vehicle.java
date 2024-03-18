import java.util.*;

class Vehicle{

public void Sports(String name){
	System.out.println("Name: " + name);
}

public void Sports(String name, int vehNum, float price){
	System.out.println("Name: " + name);
	System.out.println("Vehicle Number: " + vehNum);
	System.out.println("Price: " + price);
}

public void Sports(int vehNum,String name){
	System.out.println("Name: " + name);
	System.out.println("Vehicle Number: " + vehNum);
}


public static void main(String[] args){
	Vehicle veh = new Vehicle();

	veh.Sports(65, "Lamborghini");
	veh.Sports("Ferrari");
	veh.Sports("Porcsche 911", 364, 95.56f);
       

}
}

/* Name: Lamborghini
Vehicle Number: 65
Name: Ferrari
Name: Porcsche 911
Vehicle Number: 364
Price: 95.56 */