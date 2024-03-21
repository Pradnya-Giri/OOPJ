import java.util.Scanner;

class Program3{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of array elements : ");
    int a =sc.nextInt();
    int[] arr1 = new int[a];
    System.out.print("Enter the numbers: ");
    for(int i=0; i<5; i++){
        arr1[i] = sc.nextInt();
    }

    System.out.print("Compare array elements with : ");
    int number = sc.nextInt();

    for(int j=0; j<5; j++){
        for(int k=0; k<5; k++){
            int result = arr1[j] + arr1[k];
            if(number==result){
                System.out.println(j +" and "+k+" element's addition is : "+ number+" : "+arr1[j]);
            }
        }
    }
}
}