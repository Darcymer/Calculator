import java.util.Scanner; 

public class welcomer {
    public void welcome()
    {
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Welcome to the Auto-Calculator!!!");
         System.out.println();
         System.out.print("Please write down your Full Name: ");
  
         String fullname = input.next();
         System.out.println();
         System.out.print("So, " +fullname+" here is how this code works, you write down any math question you have");
    }

     System.out.print( "particularly basic opperators, and we can solve it for you.");
     System.out.println();
     System.out.print("Please Look at the following menu:");
     System.out.println();
    }
}
