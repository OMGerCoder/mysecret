/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package xyz.omger.mysecret;


public class App {
    

    public static void main(String[] args) {
    	System.out.println("Shhh! Don't tell anybody that I work for the FBI, or I will hunt you down.");
    	try {
    		Thread.sleep(3000);
    	}
    	catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
    	}
    	System.out.println("Did you do it?");
    	try {
    		Thread.sleep(2000);
    	}
    	catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
    	}
    	System.out.println("I really think you did");
    	try {
    		Thread.sleep(3000);
    	}
    	catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
    	}
    	System.out.println("YOU DID IT! I AM COMING FOR YOU!");
    }
}
