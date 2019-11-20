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


    }
}
