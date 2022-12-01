package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;
public class shopping {
    public static void main(String[] args){
        // Get system console
        Console cons = System.console();
        List<String> shoppingList = new LinkedList<>();
        String userInput = "";
        while(!userInput.toLowerCase().equals("quit")){
            System.out.println("Welcome to your shopping cart");
            userInput = cons.readLine("> ");
            switch (userInput.toLowerCase()){
                case "add":
                    userInput = cons.readLine("> ");
                    String[] arrOfItem = userInput.toLowerCase().split(",");

                    for (String item : arrOfItem){
                        shoppingList.add(item);
                        System.out.printf("%s added to cart\n", item);
                    }
                    break;
                case "delete":
                    userInput = cons.readLine("> ");
                    int index = Integer.parseInt(userInput) - 1;
                    if (index > shoppingList.size() -1 || index < 0){
                        System.out.println("Invalid index!");
                        break;
                    }
                    System.out.printf("%s removed from the cart\n", shoppingList.get(index));
                    shoppingList.remove(index);
                    break;
                case "list":
                    if (shoppingList.size() == 0){
                        System.out.println("Your cart is empty");
                    }else{
                        for (int i = 0; i < shoppingList.size(); i++){
                            System.out.printf("%d. %s\n", i+1, shoppingList.get(i));
                        }
                }
            }
        }
    }
}
