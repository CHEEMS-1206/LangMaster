// Hello World program in c++
#include <iostream>
// #include <bits/stdc++.h> -> gets everything including STL, vector, string algo map etc
using namespace std;

int main(){
    cout << "Hello World !" << endl ;
    return 0;
}

/* 
--> RUNNING C++ PROGRAMS - 
    1> Setup compiler
        - download msys
        - run installation, once done msys cmd prompt opens
            update packages using -> pacman -Syu
            than terminal will be closed
        - search for msys in run, open terminal
            install gcc compiler -> pacman -S mingw-w64-ucrt-x86_64-gcc
        - add path "C:\msys64\ucrt64\bin" to env variables path
        - check installation using -> g++ --version
    2> Running programs
        - g++ filename -o outputFileName -> generates exe file which can be run directly.
        - run in terminal -> ./outputFileName.exe
*/