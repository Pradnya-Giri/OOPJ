import java.util.Scanner;

class Vowel{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().toLowerCase().charAt(0);
    if(ch == 'a' ||ch == 'e'||ch == 'i'||ch == 'o'|| ch == 'u' ){
        System.out.println("Vowel");
    }
    else{
        System.out.println("Consonent");
    }

    sc.close();
   /* switch(ch){
        case 'a' : 
        case 'e' :
        case 'i' :
        case 'o' :
        case 'u' :
        System.out.println("Vowel"); break;
        default: System.out.println("Not Vowel");
    }*/
}
}
