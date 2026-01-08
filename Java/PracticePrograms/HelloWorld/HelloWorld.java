// Hello World program in java

class HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}

/*
--> RUNNING JAVA PROGRAMS - 
    1> Setup compiler
        - Install JDK
        - add JDK path to path variable in env vars
        - test with ----> javac --version
                    ----> java --version
    2> Running programs
        - use java compiler to compile the .java file 
            javac filename.java -> this will generate a compiled .class file having same name as the class.
            ClassName.class
        - use java to interpret this compiled .class file
            java ClassName -> interprets the compiled java code
        ** never use ".class" as in ClassFile.class with java as it will throw error.
*/