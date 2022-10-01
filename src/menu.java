import java.util.Scanner; 

public class menu {
     public float x;
     public float y;

     public void showmenu()
     {
     try (Scanner userSelects = new Scanner(System.in)) {
          System.out.println();
          System.out.println("1.Addition");
          System.out.println("2.Subtraction");
          System.out.println("3.Multiplication");
          System.out.println("4.Division");
          //System.out.println("5.Your total");
          System.out.println("0.Exit");
          System.out.println();
          // math mathObject = new math();
          int selector = userSelects.nextInt();
          //float y;
          //float num; 
          switch(selector) {

               case 1:
               mathObject.adder(x, y);
               System.out.println("What is the number you are adding?");
               //num = x + y;
               break;
               
               case 2:
               
               mathObject.subber(x, y);
               System.out.println("What is the number you are subtracting? ");
               //num = x - y;
               break;

               case 3:
               mathObject.multier(x, y);
               System.out.println("What is the number if you are multiplying? ");
               break;

               case 4:
               mathObject.diviser(x, y);
               System.out.println("What is the number you are dividing? ");
               break;

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
