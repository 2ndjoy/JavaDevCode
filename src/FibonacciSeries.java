import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Input max sequence number: ");

        int num= sc.nextInt();

        int fibPrev=0,fibonacci=1,sum=0;

        for (int i=1;i<=num;i++){
            System.out.println(fibPrev+ " ");
            sum=fibPrev+fibonacci;
            fibPrev=fibonacci;
            fibonacci=sum;
        }


    }

}
