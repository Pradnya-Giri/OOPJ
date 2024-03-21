import java.util.*;
class Program101{
    public static Scanner sc = new Scanner(System.in);  
    static int len;
    public static void main(String[] args) {
        System.out.println("Enter length : ");
        len = sc.nextInt();
        int[] arrayInput = new int[len];
        Boolean ascend = true;
        Boolean descend = true;

        for (int i = 0; i < len; i++) {
            System.out.println("Enter element : " + (i+1));
            arrayInput[i]=sc.nextInt();
            }

        for (int i = 1; i < len; i++) {
            if (arrayInput[i]>arrayInput[i-1]) {
                    descend = false;
                    break;
                }
        }
        
        for (int i = 1; i < len; i++) {
            if (arrayInput[i]<arrayInput[i-1]) {
                    ascend = false;
                    break;
                }
        }
        if(ascend)
        System.out.println("Ascending");
        else if(descend)
        System.out.println("Descending");
        else
        System.out.println("Random");    

        
    }
}