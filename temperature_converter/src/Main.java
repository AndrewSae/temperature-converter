// AndrewSae
import java.util.Scanner;
public class Main {

	static int whatToConvert = 0;
	static Scanner in = new Scanner(System.in);

    public static void conversions() {
        System.out.println("What two temperatures would you like to convert?");
        System.out.println("[1]:celsius to fahrenheit");
        System.out.println("[2]:fahrenheit to celsius");
        System.out.println("[3]:celsius to kelvin");
        System.out.println("[4]:fahrenheit to kelvin");
        System.out.println("[5]:kelvin to celsius");
        System.out.println("[6]:kelvin to fahrenheit");
      }
      public static void options() {
        System.out.println("what would you like to do now?");
        System.out.println("[1]:convert the same thing");
        System.out.println("[2]:convert something else");
        System.out.println("[3]:exit");
      }
      
      public static void whatToDo() {
        conversions();  
        whatToConvert = in.nextInt();
        if (whatToConvert == 1) {
          cF();
        } else if (whatToConvert == 2) {
        	fC();
        } else if (whatToConvert == 3) {
        	cK();
        } else if (whatToConvert == 4) {
        	fK();
        } else if (whatToConvert == 5) {
        	kC();
        } else if (whatToConvert == 6) {
        	kF();
        }
         else {
          System.out.flush();
          System.out.println(whatToConvert + ": is a unknown command pls try again:");
          whatToDo();
        }
      }
      
//      runs once conversion method was run
      public static void whatNext() {
        options();
        int choice = in.nextInt();
        if (choice == 1) {
        	if (whatToConvert == 1) {
                cF();
              } else if (whatToConvert == 2) {
              	fC();
              } else if (whatToConvert == 3) {
              	cK();
              } else if (whatToConvert == 4) {
              	fK();
              } else if (whatToConvert == 5) {
              	kC();
              } else if (whatToConvert == 6) {
              	kF();
              }
        } else if (choice == 2) {
        	whatToDo();
        } else if (choice == 3) {
        	System.exit(1);
        } else {
            System.out.flush();
            System.out.println(choice + ": is a unknown command pls try again:");
            whatNext();
          }
        whatNext();
      }
      
//      conversion methods 
       public static void cF() {
        System.out.println("please enter the temperature in celsius:");
        double cToF = in.nextDouble();
        System.out.println(cToF + "°C is about " + (cToF * 1.8 + 32) + "°F");
      }
       public static void fC() {
        System.out.println("please enter the temperature in fahrenheit:");
        double fToC = in.nextDouble();
        System.out.println(fToC + "°F is about " + (fToC - 32) / 1.8 + "°C");
      }
       public static void cK() {
    	   System.out.println("enter the temperature in celsius:");
    	   double cToK = in.nextDouble();
    	   System.out.println(cToK + "°C is about " + (cToK + 273.15) + "°K");
       }
       public static void fK() {
    	   System.out.println("enter the temperature in fahrenheit:");
    	   double fToK = in.nextDouble();
    	   System.out.println(fToK + "°F is about " + ((fToK - 32)*5/9 + 273.15) + "°K");
       }
       public static void kC() {
    	   System.out.println("enter the temperature in kelvin:");
    	   double kToC = in.nextDouble();
    	   System.out.println(kToC + "°K is about " + (kToC - 273.15) + "°C");
       }
       public static void kF() {
    	   System.out.println("enter the temperature in kelvin:");
    	   double kToF = in.nextDouble();
    	   System.out.println(kToF + "°K is about " + ((kToF - 273.15)* 9/5 + 32) + "°C");
       }
       
    public static void main(String[] args) throws Exception {

    	while (true) {
    		whatToDo();
    		whatNext();    	
    		}
    }
}
