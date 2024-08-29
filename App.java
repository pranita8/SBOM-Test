package com.example.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from the main application!");
        // Create instances of child components to demonstrate usage
        com.example.childcomponent1.SomeChildClass child1 = new com.example.childcomponent1.SomeChildClass();
        com.example.childcomponent2.SomeOtherClass child2 = new com.example.childcomponent2.SomeOtherClass();

        // Call methods to show interaction
        child1.doSomething();
        child2.doSomethingElse();
    }
}
