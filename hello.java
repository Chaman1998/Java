
/**
 * main
 */
public class hello {

    public static void main(String[] args) {    //not created again this
        System.out.print("Hello World");      //This print the output
        System.out.println("Hello World");

        System.out.println(args[1]);        //this print the hole output
        //If we want to use this 'args[0]' then use "java hello.java 1,2,3"
        //Here we we insert the like this '1,2,3 30' [use space] then we use this 'args[1]', for see the output
    }
}
//  ** if want this code convert to the bytecode then use 'javac hello.java' first
//  And then run this bytecode with this 'java hello.java'
//  Here the '1,2,3....' we insert with 'java hello.java' this called 'Command Line Arguments'. This is mainly the input

// This code compile to the ByteCode with Compiler
//      |
//      |
//      v
// Now this ByteCode understand by run time environment [JRE --> Java Run Time Environment]
//      |
//      |
//      v
// In the JRE, The JVM[Java Virtual Machine] that run the application
//      |
//      |
//      v
//  And Both the JRE and JVM within the JDK[Java Development Kit]

