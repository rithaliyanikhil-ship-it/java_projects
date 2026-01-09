import java.util.Scanner;
public class pos {
     public static void main(String[] args) {
      //multiplication();
      //factorial();
       //prime();
       //add();
       //lcm();
       fibonacci();
     }
    public static void multiplication(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number you want to print table : ");
        int a=input.nextInt();
        for(int i=1;i<=10;i++){
            int c=a*i;
            System.out.println(a+ "*" +i+ "=" +c);
        }
        input.close();
    } 
    public static void factorial(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number you want to find factorial : ");
        int a=input.nextInt();
        int num=1;
        for(int i=1;i<=a;i++){
            num=num*i;
        }
        System.out.println(num);
        input.close();
    } 
    public static void prime() {
      Scanner input=new Scanner(System.in);
      System.out.println("enter the number : ");
      int a= input.nextInt();
      if(a%a==0 && a%2!=0 && a%3!=0){
        System.out.print("it is a prime number :" +a);
      }
     else{
        System.out.println("it is not prime nmber : " +a);
     }
     
     input.close();
    }
    public static void add(){
       Scanner input=new Scanner(System.in);
      System.out.println("enter the number : ");
      int a= input.nextInt();
      int num=0;
      while (a>0) {
      num=num+a%10;
      a/=10;
      }
      System.out.println(num);
      input.close();

     }
     public static void lcm(){
       Scanner input=new Scanner(System.in);
      System.out.println("enter the first number : ");
      int a= input.nextInt();
      System.out.println("enter the second number : ");
      int b= input.nextInt();
      for(int i=1;i<=b;i++){
        int factor =a*i;
        if(factor%b==0){
          System.out.println("the lcm is :" +factor);
          break;
        }
      }
      input.close();

}
public static void fibonacci(){
       Scanner input=new Scanner(System.in);
      System.out.print("enter the  number of term you want to print : ");
      int n= input.nextInt();
      int a=0,b=1;
      for(int i=1;i<=n;i++){
        System.out.print( a+ " ");
        int next=a+b;
        a=b;
        b=next;
        
      

      }
      input.close();
}
}

