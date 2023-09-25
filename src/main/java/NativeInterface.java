// NativeInterface.java
public class NativeInterface {
    public native void sayHello();
    static {
        System.loadLibrary("NativeLib");
    }
}

