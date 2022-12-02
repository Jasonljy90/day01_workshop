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
            String[] arrOfItem = userInput.toLowerCase().split(" ");
            switch (arrOfItem[0]){
                case "add":
                    for (int i = 1; i < arrOfItem.length; i++){
                        shoppingList.add(arrOfItem[i]);
                        System.out.printf("%s added to cart\n", arrOfItem[i]);
                    }
                    break;
                case "delete":
                    int index = Integer.parseInt(arrOfItem[1]) - 1;
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
                    break;
                default:
                    System.out.printf("Unknown command: %s\n", userInput);
            }
        }
    }
}
