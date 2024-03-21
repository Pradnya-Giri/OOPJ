import java.util.Scanner;

class Program4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements : ");
    int N = sc.nextInt();
    System.out.println("Enter array elements : ");
    int[] arr = new int[N];
    for(int i = 0; i<arr.length; i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Array : ");
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }

    System.out.println("\nReverse array : ");
    int[] arr1 = new int[N];
    for(int j=arr.length-1, k=0; j>=0 && k<N; j--, k++){    
        arr1[k]=arr[j];  
    }
    for(int m=0; m<arr1.length; m++){
        System.out.print(arr1[m] + " "); 
    }

}

}