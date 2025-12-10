class MethodOverloadingExample {

    // Overloaded method with one integer parameter
    void display(int a) {
        System.out.println("Display method with one integer: " + a);
    }

    // Overloaded method with two integer parameters
    void display(int a, int b) {
        System.out.println("Display method with two integers: " + a + ", " + b);
    }

    // Overloaded method with one string parameter
    void display(String str) {
        System.out.println("Display method with one string: " + str);
    }

    // Overloaded method with double parameter
    void display(double d) {
        System.out.println("Display method with one double: " + d);
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Calling different overloaded methods
        obj.display(10);          // Calls method with int
        obj.display(10, 20);      // Calls method with two ints
        obj.display("Hello");     // Calls method with String
        obj.display(3.14);        // Calls method with double
    }
