public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("I'm learning java!");
    System.out.println("It's going to be a long journey.");
    System.out.println(123);
    System.out.println(1+2);

    // Testing variables
    String name = "John";
    System.out.println(name);
    int myNum = 15;
    System.out.println(myNum);
    myNum = 10;
    System.out.println(myNum);
    float myFloat = 1.5f;
    System.out.println(myFloat);
    char myLetter = 'a';
    System.out.println(myLetter);
    boolean myBool = true;
    System.out.println(myBool);
    
    // Printing variables
    System.out.println("My name is " + name);
    System.out.println("My number is " + myNum);
    String firstName = "Ken ";
    String lastName = "Smith";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    int x = 5, y = 6;
    System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
    int w, z;
    w = z = 10;
    System.out.println("The value of w is " + w);
  }
}
