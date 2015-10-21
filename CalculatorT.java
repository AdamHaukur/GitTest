import java.util.*;
public class CalculatorT {
	

    public static void main(String[] args) {
    	double number1 = 0;
      double number2 = 0;

    	Scanner in = new Scanner(System.in);

      	System.out.println("Welcome two number calculator");
      	System.out.println("Choose + , -  or *  then press enter");

      	char ops = in.next().charAt(0);
        number1 = in.nextInt();
        number2 = in.nextInt();

      	if(ops == '+'){
      		double total = add(number1,number2);
      		System.out.println(total);

      	}
      	else if(ops == '-'){
      		System.out.println(minus(number1,number2));
      	}
        else if(ops == '*'){
          System.out.println(mult(number1,number2));
        }
      	
      	else{
      		System.out.println("ERROR");
      	}

    }

    public static double add(double number1, double number2){

      		double addnumbers = number1 + number2;
      		return addnumbers;
    }

    public static double minus(double a, double b){

      		double minusNumbers = a - b;
      		return minusNumbers;
    }
     public static double mult(double a, double b){

          double multNumbers = a * b;
          return multNumbers;
    }

}