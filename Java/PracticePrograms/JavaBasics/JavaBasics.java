import java.util.ArrayList;
import java.util.List;

// Java basics practice file
// Corresponding to L - 1 (1.1, 1.2, 1.3)

class JavaBasics{
    public static void main(String args[]){
    // Lesson 1.1
        // Concept of variable
        int intVar = 32;
        System.out.println(intVar);

        // Concept of constants (using final keyword)
        final int intConstant = 3;
        System.out.println(intConstant);

        // Inference variables, variable type inferred at compile time
        var inferenceVar = Integer.valueOf(21);
        System.out.println(inferenceVar.getClass());

    // Lesson 1.2
        // Primitive datatypes - (byte, short, int, long, float, double, char boolean)
        byte primitiveDatatypeByte = 1;
        System.out.println(primitiveDatatypeByte);

        // Complex type - (String, Array, Classes/Interfaces/Objects, Enum, Wrappers, Collections)
        String firstname = "Priyanshu Singh";
        String lastName = new String("Singh");

        int[] intArray = {1,2,3,4};
        
        Integer wrapperInt = 5;

        // Collection types
        List<Integer> arrayList = new ArrayList<>(); // Only use wrapper class with collection types.

    // Lesson 1.3 
        // Implicit conversion 
        short base = 34;
        int newBase = base; // smaller to larger - auto
        base = (short)newBase; // larger to smaller - manual
    }
}