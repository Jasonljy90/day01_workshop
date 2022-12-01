package myapp;

public class MyFirstApp{
    public static void main(String[] args){
        System.out.println("Hello World");
       System.out.println("foobar");
    } 
}

// cp: class path d: destination
// javac -sourcepath src -d classes src/myapp/*
// java -cp classes myapp.MyFirstApp