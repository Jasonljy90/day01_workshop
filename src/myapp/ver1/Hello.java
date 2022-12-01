package myapp.ver1;

import java.io.Console;

public class Hello {
    public static void main(String[] args){
        // Get system console
        Console cons = System.console();

        // Read from console, result is assigned to a variable
        String name = "";
        while(name.trim().length() == 0){
            name = cons.readLine("What is your name? ");
        }
        
        // use equals() for string comparison, == is for numbers)
        // if (name.trim().equals("")){ // name.trim().length() == 0         //name.trim().isEmpty()
        //     System.err.println("Please enter your name ");
        if (name.equals("fred")){
            System.out.println("Yabadabadoo");
        }else if (name.equals("barney")){
            System.out.println("Hello barney");
        }else{
        // Send a greeting to the namefred
        //System.out.printf("Hello " + name);
        System.out.printf("Hello %s, Nice to make your acquantance\n", name);
        }
        // switch (name.trim().toLowerCase()){
        //     case "fred":
        //         System.out.println("Yabadabadoo");
        //         break;
        //     case "barney":
        //         System.out.println("Hello barney");
        //         break;
        //     default:
        //         System.out.printf("Hello %s, Nice to make your acquantance\n", name);
       // }
    }
}
