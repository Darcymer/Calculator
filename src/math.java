import java.util.Scanner;

public class math{
    
  public Object adder;
  public Object subber;
  public Object multier;
  public Object diviser;
  public Object moder;

  Scanner userSelects = new Scanner(System.in);
    
    float num;
    float x = userSelects.nextFloat();
    float y = userSelects.nextFloat();

    // Add 2 numbers
    public float adder (float x, float y){
        num = x + y;
        return num;
    }


    // Subtract 2 numbers
    public float subber (float x, float y){
        float num;
        num = x - y;
        return num;
    }

    //Multiply 2 numbers
    public float multier (float x, float y){
        float num;
        num = x * y;
        return num;
    }
    //Divide 2 numbers
    public float diviser (float x, float y){
        float num;
        num = x / y;
        if (num < 0){
       
            System.out.println("we are not going to do anything in regards to 0's, please try again");
        }
        else{
        return num;
    }
    return num;
    }

    // for future implementation
    // public float moder (float x, float y){
    //     float num;
    //     num = x % y;
    //     return num;
    // }
    //Show the results
    // public float resulter(){
    
    // }
}



