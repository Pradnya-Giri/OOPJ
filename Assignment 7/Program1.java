import java.util.Scanner;

class Program1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements:");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements: ");
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }


        /*int arr[] = {10, 12, 35, 511, 24, 38};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }*/
    }

}