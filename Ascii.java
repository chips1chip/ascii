import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any character:");
        Character ch=sc.next().charAt(0);
        sc.close();
        System.out.println((int)(ch));
    }
}