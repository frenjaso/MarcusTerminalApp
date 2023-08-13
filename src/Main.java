public class Main {

    /**
     * You can look online for some more detail about this, but generally, `public static void main(String[] args)` is the syntax for the
     * entry point to **any** java program. Java needs to be compiled before it's run. Most IDEs (like IntelliJ or VS Code) will do this for
     * you behind the scenes when you click "run," and will subsequently execute the compiled code. Java code gets compiled into a ".jar"
     * file, like "marcusTerminalApp.jar" or something, which you can execute easily from the terminal like:
     * `java -jar marcusTerminalApp.jar`.
     *
     * When you execute a jar like that, Java will look for, and execute a public and static method called "main" that takes in a String
     * array (defined like `String[]`), which is what we have here. If your program is missing such a method, you'll get an error, and I
     * *think* you'll also get an error if you have two such methods, but I'm not 100% sure.
     *
     * Anyway, you'll notice that you this method also exists in the Web App that we built in the `MarcusApplication` file. In that file, it
     * just calls one method, but behind the scenes of that, Spring performs all kinds of stuff that sets up and runs the server.
     *
     * This project is super vanilla, just a place to play around. Literally the only thing here atm is the single line of code that prints
     * "Hello World". `System.out.println` is how you print a line to the console btw. You can think of it as writing a String to the
     * standard output stream for the application, which, in this case, is the terminal.
     */
    public static void main(String[] args) {
        System.out.println("Hello world!"); // this is how you print to the terminal in Java
    }
}