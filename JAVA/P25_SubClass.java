
// W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It 
// has two subclasses each having a method with the same name
// Create an abstract class Parent with a method message().

//Create two subclasses:
//One prints "This is first subclass".
//One prints "This is second subclass".
//Call the message() method using objects of both subclasses.

package Module6;

//Abstract class with abstract method
abstract class Parent {
 abstract void message(); // Abstract method
}

//First subclass
class FirstSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is first subclass");
 }
}

//Second subclass
class SecondSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is second subclass");
 }
}

//Main class
public class P25_SubClass {
 public static void main(String[] args) {
     // Creating object of FirstSubclass
     Parent obj1 = new FirstSubclass();
     obj1.message();  // Output: This is first subclass

     // Creating object of SecondSubclass
     Parent obj2 = new SecondSubclass();
     obj2.message();  // Output: This is second subclass
 }
}
