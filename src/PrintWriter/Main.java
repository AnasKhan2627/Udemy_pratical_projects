package PrintWriter;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        PrintWriter pw = new PrintWriter(System.out,true);
        String text = "Project 2";
        pw.println("This is "+text);
    }
}
