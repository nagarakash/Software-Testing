
// W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It 
// has two subclasses each having a method with the same name

package Module6;

//Abstract class with an abstract method
abstract class Parent {
 abstract void message(); // Abstract method with no body
}

//First subclass
class FirstSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is the first subclass message.");
 }
}

//Second subclass
class SecondSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is the second subclass message.");
 }
}

//Main class to run the program
public class P25_SubClass {
 public static void main(String[] args) {
     // Using Parent reference to hold subclass objects

     Parent obj1 = new FirstSubclass();
     obj1.message();  // Calls FirstSubclass version

     Parent obj2 = new SecondSubclass();
     obj2.message();  // Calls SecondSubclass version
 }
}

