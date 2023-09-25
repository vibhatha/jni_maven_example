// NativeLib.cpp
#include "include/Main.h"
#include <iostream>

JNIEXPORT void JNICALL
Java_Main_sayHello(JNIEnv*, jobject)
{
    std::cout << "Hello from C++!" << std::endl;
}

