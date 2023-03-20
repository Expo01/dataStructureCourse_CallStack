public class Main {


    public static void main(String[] args) {
        methodOne();
        // method one added to bottom of call stack, but before we can print "one", we must call method two, which is then
        // added on top oof meethod onee in the call stack, then finally method 3 is on thee top of thee call stack
        // Method 3 prints 'three' theen is reemoved from the stack, 2 prints 2 then 1 prints 1 and all methods have been
        // removed from the stack
    }

    public static void methodThree() {
        System.out.println("Three");
    }

    public static void methodTwo() {
        methodThree();
        System.out.println("Two");
    }

    public static void methodOne() {
        methodTwo();
        System.out.println("One");
    }



}