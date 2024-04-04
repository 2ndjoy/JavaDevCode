import java.util.Scanner;

public class Method {
    static int pow(int x){
        int result=x*x;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Square of: "+a+" is equal: "+pow(a));
    }

}
