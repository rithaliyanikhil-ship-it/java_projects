import java.util.Scanner;
public class typeconversion {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.print("enter the number in decimal foam :");
    float num=input.nextFloat();
    int b=(int) num;
    System.out.println("the result is in decimal :" +num);
    System.out.print("the number you wrote in non decimal foam is : " +b);
    input.close();
    }
    
}
