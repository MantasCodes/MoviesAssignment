package controllers;

import asg.cliche.Command;
import asg.cliche.ShellFactory;
import asg.cliche.example.HelloWorld;
import models.User;

import java.io.IOException;
import java.util.Collection;

public class Main {

    @Command// first
   public Collection<User> createUser() {
    	
    
   MovandUserAPI MovandUserAPI = new MovandUserAPI();

    MovandUserAPI.createUser("Bart", "Simpson",45,   "male", "plantworker");
    MovandUserAPI.createUser("Homer", "Simpson",12,  "male", "student");
    MovandUserAPI.createUser("Lisa", "Simpson",11,  "female", "student");

    Collection<User> users = MovandUserAPI.getUsers();
    System.out.println(users);
	return users; //return the Collection of users 
    }
    @Command // One,
    public String hello() {
        return "Hello, World!";
    }

    @Command // two,
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("hello", "", new HelloWorld())
            .commandLoop(); // and three.
    }
    
}
