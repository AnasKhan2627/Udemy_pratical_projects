package Basic_Arthimatic_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char operator = scan.next().charAt(0);
        int b = scan.nextInt();
        long result = 0;
        int flag = 1;

        switch (operator){

            case '+':
                result = a+b;
                break;

            case '-':
                result = a-b;
                break;

            case '*':
                result = a*b;
                break;

            case '/':
                result = a/b;
                break;

            case '%':
                result = a%b;
                break;

            default:
                System.out.println("Invalid Operator : "+ operator);
                flag = 0;
        }
        if(flag == 1)
            System.out.println(a+" "+operator+" "+b+" = "+result);

    }
}
