import java.util.Scanner;
import java.lang.Math.*;

public class JavaDay3 {
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
        /*
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
        */
    // A6
        /*
        Scanner s6 = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        int radius = Integer.parseInt(s6.nextLine());
        double area = Math.PI * Math.pow(radius, 2.0);
        System.out.println("the area of the circle ist: "+ area);
         */
    // A7
        /*
        Scanner s71 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int input1 = Integer.parseInt(s71.nextLine());
        Scanner s72 = new Scanner(System.in);
        System.out.print("Enter second number");
        int input2 = Integer.parseInt(s72.nextLine());
        Scanner s73 = new Scanner(System.in);
        System.out.print("Enter third number");
        int input3 = Integer.parseInt(s73.nextLine());
        calcAverage(input1,input2,input3);
        */
    // A8
        Scanner s8 = new Scanner(System.in);
        System.out.println("Enter first subject and than grade in % divided by space between): ");
        String subjectGrade = s8.nextLine();
        int indexDiv = subjectGrade.indexOf(" ");
        String subject = subjectGrade.substring(0,indexDiv);
        String gradeString = subjectGrade.substring(indexDiv);
        gradeString = gradeString.trim();
        int grade = Integer.parseInt(gradeString);
        System.out.println(subject);
        System.out.println(grade);
        grading(subject,grade);

    // Extras A4
        Scanner sE4 = new Scanner(System.in);
        System.out.println("Enter First and Lastname");
        String cLStr = sE4.nextLine();
        initMaker(cLStr);

    }
    public static void initMaker(String cLStr){
        String initialenAusgabe = "";
        int l = cLStr.length();
        for (int i = 0; i < l; i++){
            if(Character.isUpperCase(cLStr.charAt(i))){
                char letter = cLStr.charAt(i);
                initialenAusgabe = initialenAusgabe + letter + " ";
            }
        }
        System.out.println(initialenAusgabe);
    }

    public static void  writeText(String text) {
        System.out.print(text);   //prints the text parameter to System.out.
    }

    public static void calcAverage(int input1, int input2, int input3){
        double outAverage = (input1+input2+input3)/3;
        System.out.println("The average is: "+outAverage);
    };
    public static void grading(String subject, int grade){
        String gradeLabel ="";
        if(grade>=90){gradeLabel = "A";}
        else if(grade>=80){gradeLabel = "B";}
        else if(grade>=70){gradeLabel = "C";}
        else if(grade>=60){gradeLabel = "D";}
        else if(grade>=40){gradeLabel = "E";}
        else if(grade<40){gradeLabel = "F";}
        System.out.println("In "+subject+" your grade is "+ gradeLabel);
    }




}

