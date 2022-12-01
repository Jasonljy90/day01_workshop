package myapp.ver1;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;
//import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        // Console cons = System.console();
        // List<String> myTodo = new ArrayList<>();
        // String input = "";
        // input = cons.readLine("Please enter your name: ");
        // myTodo.add(input);
        // myTodo.add("Hello");
        // myTodo.add("Panda");
        // myTodo.add("Hey");
        // for(int i = 0; i<myTodo.size(); i++){
        // System.out.println(myTodo.get(i));
        // }
        List<Integer> listOfInt = new LinkedList<>();
        Console cons = System.console();
        
        String item = "";
        while(true){
            item = cons.readLine("Please enter a number: ");
            item = item.trim();
            
            if(item.toLowerCase().equals("stop")){
                break;
            }
            listOfInt.add(Integer.parseInt(item));
        }
        System.out.printf("Number of elements in the list: %d\n", listOfInt.size());
        for(int index = 0; index < listOfInt.size(); index++){
            System.out.printf("[%d]: %s\n", index, listOfInt.get(index));
        }
    }
}
