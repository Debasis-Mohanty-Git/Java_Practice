import java.util.Scanner;

public class Find_Ascii_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);

        int ascii=(int) ch;
        System.out.println("The ASCII value of the character "+ch+" is "+ascii);
    }
}
