import java.util.Scanner; 

public class menu {

     public void showmenu()
     {
     try (Scanner userSelects = new Scanner(System.in)) {
          // The menu the user will select from
          
          System.out.println();
          System.out.println("1.Addition");
          System.out.println("2.Subtraction");
          System.out.println("3.Multiplication");
          System.out.println("4.Division");
          //System.out.println("5.Your total");
          // above is for future implementation
          System.out.println("0.Exit");
          System.out.println();

          //math mathObject = new math();
          int selector = userSelects.nextInt();

          // float x;
          // float y;
          //float y;
          //float num; 

          // Calls the math object to relate it to the switch case below can relate to it
          math mathobj = new math();

          // switch case is better for preformance instead of a if-else statements for the code
          switch(selector) {

               case 1:
               System.out.println("What is the number you are adding?");
               mathobj.adder(selector, selector);
               
               case 2:
               System.out.println("What is the number you are subtracting? ");
               mathobj.subber(selector, selector);
               
               case 3:
               System.out.println("What is the number if you are multiplying? ");
               mathobj.multier(selector, selector);
               
               case 4:
               System.out.println("What is the number you are dividing? ");
               mathobj.diviser(selector, selector);
               
               // for future implementation
               // case 5:
               // System.out.println("This is your total: ");
               // //return num;

               case 0:
               System.out.println("Thank you for trying our simple calculator... Until Next Time.");
               break;

               default:
               System.out.println("Ok, so you selected the wrong key. Please try again.");
          }
     }
     }
}
