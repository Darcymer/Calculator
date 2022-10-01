import java.util.Scanner; 

public class menu {

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

          // float x;
          // float y;
          //float y;
          //float num; 
          math mathobj = new math();
          switch(selector) {

               case 1:
               System.out.println("What is the number you are adding?");
               mathobj.adder(selector, selector);

               //num = x + y;
               
               
               case 2:
               System.out.println("What is the number you are subtracting? ");
               mathobj.subber(selector, selector);

               //num = x - y;
               

               case 3:
               System.out.println("What is the number if you are multiplying? ");
               mathobj.multier(selector, selector);
               

               case 4:
               System.out.println("What is the number you are dividing? ");
               mathobj.diviser(selector, selector);
               

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
