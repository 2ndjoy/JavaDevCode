import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=0;

        int b=0;

        try {
             a=sc.nextInt();
             b=sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        System.out.println("Enter operator(+,-,*,/,%) ");

        char operator=sc.next().charAt(0);

        double result=0.0;

        if ((operator=='+')||(operator=='-')||(operator=='*')||(operator=='/')||(operator=='%')){

            switch (operator){
                case '+':
                    result=a+b;
                    break;
                case '-':
                    result=a-b;
                    break;
                case '*':
                    result=a*b;
                    break;
                case '/':
                    result=a/b;
                    break;
                case '%':
                    result=a%b;
                    break;
            }

            System.out.println(result);
        }
        else {
            System.out.println("Please enter correct operator");
        }


    }

}