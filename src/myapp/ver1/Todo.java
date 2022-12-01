package myapp.ver1;

public class Todo {
    public static void main(String [] args){
        String[] tasks = new String[3];
        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";

        // for(int i = 0; i<tasks.length; i++){
        //     System.out.println(tasks[i]);
        // }
        
        int count = 0;
        while(count < tasks.length){
            System.out.printf("%d: %s\n", count, tasks[count]);
            count++;
        }
    }
}
