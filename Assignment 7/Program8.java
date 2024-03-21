import java.util.Scanner;

class Program9{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements: ");
    int n = sc.nextInt();
    int[] arr =new int[n];
    System.out.println("Enter elements of array: ");
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }

    
    int i=0, j=0, k=1;
    System.out.println("Results are: ");
    while(i<n){
        k= arr[i]+arr[i+1]+arr[i+2];
        j= k/3;
        System.out.print(j+ " ");
        i+=3;
    }
  }  

}