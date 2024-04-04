import java.util.Scanner;

public class Colortest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a color: ");
        String inputColor=sc.next();
        try {
            Color color=Color.valueOf(inputColor.toUpperCase());


         switch (color){
             case RED :
                 System.out.println("red");
                 break;
             case YELLOW :
                 System.out.println("YELLOW");
                 break;
             case GREEN :
                 System.out.println("GREEN");
                 break;
         }
     }
    catch (Exception e){
        System.out.println(e.getMessage());
    }

    }

}