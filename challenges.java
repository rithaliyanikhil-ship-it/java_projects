import java.util.Scanner;
public class challenges {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your age : ");
        int a=input.nextInt();
        input.nextLine();
        System.out.print("enter your gender:");
        String b=input.nextLine();
        if(a<18 && b.equals("male")){
            System.out.println("tu abhi chhota baccha hai...");

        }
        else if(a<18 && b.equals("female")){
            System.out.println("tu abhi chooti bacchi hai...");
        }
        else if(a>=18 && a<60 && b.equals("male")){
            System.out.println("jaaa londia baaaji kar,....");
        }
        else if(a>=18 && a<60 && b.equals("female")){
            System.out.println("jaaa londia baaaji kar,....");
        }
        else if(a>=60 && b.equals("male")){
            System.out.println("bhudhaiu tere maaki aaakh....");
        }
        else if(a>=60 && b.equals("female")){
            System.out.println("bhudhi tere maaki aaakh....");
        }
        else{
            System.out.println("invalid age and gender....");
        }
        
        input.close();

        

    }
}