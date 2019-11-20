import java.util.Scanner;
import java.lang.Math.*;

public class javaDay3 {
    public static void main(String[] args) {
    // A1
    String hannah = "Did Hannah see bees? Hannah did.";

        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        System.out.println(hannah.indexOf("b"));

    // A2
    String a2string = "Was it a car or a cat I saw?";
        System.out.println(a2string.substring(9, 12));

    // A3
    String a3string = "  Did Tom see dogs?";
        System.out.println(hannah.indexOf("?"));
        System.out.println(hannah.startsWith("Did"));
        System.out.println(hannah.startsWith("see"));
        System.out.println(hannah.compareTo(a3string));
        System.out.println(a3string.trim());
        System.out.println(a3string.replace("dogs","cats"));
        System.out.println(a3string.replaceAll("e","3"));

        String[] output = a3string.split(" ");
        for (int i = 0; i < output.length;i++){
            System.out.println(output[i]);
        }

    // A4
    String names = "John Doe";
        String namestring1 = String.valueOf(names.charAt(0));
        String namestring2 = String.valueOf(names.charAt(5));
        System.out.println(namestring1+namestring2);

    // A5
        Scanner a5 = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        double fahrenheitValue = Integer.parseInt(a5.nextLine());
        double celsiusValue = (fahrenheitValue-32)*5/9;
        System.out.println(celsiusValue);

        Scanner a51 = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        double celsiusValue1 = Integer.parseInt(a51.nextLine());
        double fahrenheitValue1 = (celsiusValue1*1.8)+32;
        System.out.println(fahrenheitValue1);

    // A6
        Scanner s6 = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        int radius = Integer.parseInt(s6.nextLine());
        double area = Math.PI * Math.pow(radius, 2.0);
        System.out.println("the area of the circle ist: "+ area);

    // A7







    }
}
public MyClass {
public static int calcAverage ( int input1, int input2, int input3){
        System.out.print(input1);
        System.out.print(input2);
        }
        }
