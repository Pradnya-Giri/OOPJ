import java.util.Scanner;

class Program6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of index: ");
        int N = sc.nextInt();
         int[] arr = new int[N];

         System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
             arr[i]= sc.nextInt();
        }

        int max = arr[0];
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int a=0; a<arr.length; a++){
                if(arr[a] > max){
                 third = max;
                 sec = third;
                 max = arr[a];
                }
                if(arr[a]<max && sec<arr[a]){
                    third = sec;
                    sec = arr[a];
                }
               if(arr[a]<sec && third<arr[a]){
                    third=arr[a];
                 }
        }
        System.out.println("\nMaximum no: " + max);
        System.out.printf("Second lagest value is: %d", sec);
        System.out.printf("\nThird lagest value is: %d", third);
    }
}