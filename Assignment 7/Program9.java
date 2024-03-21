import java.util.Scanner;

class Program9{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements: ");
    int n = sc.nextInt();
    //System.out.println("Enter elements of array: ");
    int[] arr =new int[n];
    int i=0, j=0, k=1;
    
    while(i<n){
        if(k%2==0)
        arr[i]=k*k;
        else
        arr[i]=k*k*k;
        k++;
        i++;
    }
    for(int m=0; m<n; m++){
        System.out.print(arr[m] + " ");
    }

   /* for(i=0; i<n; i+=2){
        arr[i] = k*k;
        k+=2;
    }
    int l=2;
    for(j=1; j<n; j+=2){
        arr[j] = l*l*l;
        l+=2;
    }
    for(int m=0; m<n; m++){
        System.out.print(arr[m] + " ");
    }*/

  }  

}