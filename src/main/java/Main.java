public class Main {

    // Load the native library
    static {
        System.loadLibrary("NativeLib");
    }

    // Declare the native method
    public native void sayHello();

    public static void main(String[] args) {
        // Create an instance of the Main class
        Main main = new Main();

        // Call the native method
        main.sayHello();
    }
}
