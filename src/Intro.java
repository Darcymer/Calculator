//import java.io.DataInput;
import java.util.Scanner;
// import java.io.File;
// import java.io.FileNotFoundException; 


class introduction{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to the Auto-Calculator!!!");
        System.out.println();
        System.out.print("Please write down your name : ");

        String fullname = input.next();
        System.out.println();
        System.out.print("So, " +fullname+" here is how this code works, you write down any math question you have");
        System.out.print( "particularly basic opperators, and we can solve it for you.");
        System.out.println();
        System.out.print("Please Look at the following menu:");
        System.out.println();
    // try {
    //     File myObj = new File("menu.java");
    //     Scanner myReader = new Scanner(myObj);
    //     while (myReader.hasNextLine()) {
    //       String data = myReader.nextLine();
    //       System.out.println(data);
    //     }
    //     myReader.close();
    //   } catch (FileNotFoundException e) {
    //     System.out.println("An error occurred.");
    //     e.printStackTrace();
    //   }
    }
}