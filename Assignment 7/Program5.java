import java.util.Scanner;

class Program5{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of index: ");
    int N = sc.nextInt();
    int[] arr = new int[N];

    System.out.println("Enter array elements: ");
    for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("Array elements: ");
    for(int j=0; j<arr.length; j++){
        System.out.print(arr[j] + " ");
    }

    int max = arr[0];
    int min = arr[0];
    for(int a=0; a<arr.length; a++){
        if(max<arr[a]){
            max=arr[a];
        }
    }
    System.out.println("\nMaximum no: " + max);
    for(int a=0; a<arr.length; a++){
        if(min>arr[a]){
            max=arr[a];
        }
    }
    System.out.println("Minimum no: " + min);

    
}

}