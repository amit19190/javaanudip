import java.util.Scanner;
public class LargestFourNumbers 
{
   public static void main(String[] args) 
   {
    int n1,n2,n3,n4,largest;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter first number 1: ");
      n1 = sc.nextInt();
      System.out.println("Please enter second number 2: ");
      n2 = sc.nextInt();
      System.out.println("Please enter third number 3: ");
      n3 = sc.nextInt();
      System.out.println("Please enter fourth number 4: ");
      n4 = sc.nextInt();
      largest=((n1>n2 && n1>n3 && n1>n4)?n1:(n2>n3 && n2>n4)?n2:(n3>n4)?n3:n4);
      System.out.printf("Largest among %d %d %d and %d is %d",n1,n2,n3,n4,largest);
      }
}
         