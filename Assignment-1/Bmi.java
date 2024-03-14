import java.util.Scanner;

class Bmi{
public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter your Weight: ");
    double weight = s1.nextDouble();
    System.out.println("Enter your Height: ");
    double height = s1.nextDouble();
    double bmi = (weight/(height*height))*10000;
    System.out.println("BMI: " +bmi);
    if(bmi<=18.5){
        System.out.println("Underweight");
    }else if(18.5<bmi && bmi<=25){
        System.out.println("Normal");
    }else if(25<bmi && bmi<30){
        System.out.println("Overweight");
    }else{
        System.out.println("Obese");
    }

    s1.close();
}
}
