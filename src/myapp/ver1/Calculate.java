package myapp.ver1;

import java.io.Console;

public class Calculate {
    public static void main(String [] args){
        // Get system console
        Console cons = System.console();
        int num = 0;
        int count = 0;
        String userInput = cons.readLine("Enter a number: ");
        while (!userInput.trim().toLowerCase().equals("stop")){
           num += Integer.parseInt(userInput);
           count++;
           userInput = cons.readLine("Enter a number: ");
        }
        System.out.printf("The total of adding %d number is %d", count, num);
    }
}
