package user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        bufferedInput();
        scannerInput();
    }

    public static void bufferedInput() throws IOException {
        BufferedReader reader   = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------------BufferedReader----------------------------------------");
        System.out.println("Enter a Integer");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Integer value : "+n);
        System.out.println("Enter text");
        String text = reader.readLine();
        System.out.println("Text : "+text);
        System.out.println("Enter a Floating Point Number");
        double d = Double.parseDouble(reader.readLine());
        System.out.println("Double entered : "+d);
        System.out.println("Enter a Character");
        char ch = reader.readLine().charAt(0);
        System.out.println("Character : "+ch);
    }

    public static void scannerInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------Scanner----------------------------------------");
        System.out.println("Enter a Integer");
        int n = scan.nextInt();
        System.out.println("Integer value : "+n);
        System.out.println("Enter text");
        String text = scan.next();
        System.out.println("Text : "+text);
        System.out.println("Enter a Floating Point Number");
        double d = scan.nextDouble();
        System.out.println("Double entered : "+d);
        System.out.println("Enter a Character");
        char ch = scan.next().charAt(0);
        System.out.println("Character : "+ch);
    }

}
