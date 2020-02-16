import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What number?");
        String input = keyboard.nextLine();
        double number = -1;

        try{
            number = Double.parseDouble(input);
        }catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("You entered something wrong.");
        }

        if(number <= Byte.MAX_VALUE){
            byte b = (byte)number;
            System.out.println("Byte");
        }
        else if(number <= Short.MAX_VALUE){
            short s = (short)number;
            System.out.println("Short");
        }
        else if(number <= Integer.MAX_VALUE){
            int i = (int)number;
            System.out.println("Integer");
        }
        else if(number <= Long.MAX_VALUE){
            long l = (long)number;
            System.out.println("Long");
        }
        else if(number <= Float.MAX_VALUE){
            float f = (float)number;
            System.out.println("Float");
        }
        else if(number <= Double.MAX_VALUE){
            System.out.println("Double");
        }

    }

}
