class Point {
    int x;
    int y;   
}

class Variable2 {
    public static void main(String[] args) {
        Point p1 = new Point(); // creating object of Point class
        p1.x = 10; // For access the variable we use .(dot) operator
        p1.y = 20;
        System.out.println(p1.x+" "+p1.y);

        // Non-primitive are references
        Point p2 = p1; // here p1 & p2 point the same memory location
        p2.x = 30; // here we changed in p2
        System.out.println(p1.x); //that's why it changed in p1 also
        System.out.println(p2.x);
    }
}


 // Note:-

// For creating the object of any class we use "new" keyword. 
// syntax:- class_name obj_name = new class_name();
// For access the variable we use .(dot) operator, LIke:- obj_name.variable_name


// diff b/w primitive and non-primitive data type
// 1. Non-premitive Data-Type always References But the primitive are normal variables
// 2. Non-premitive Data-Type stored in "Heap" memory But the primitive are stored in "Stack" memory


// some memory allocation concept
// Piont p1; => It does not allocate any memory, it simply creates a reference variable.
// Piont p1 = new Point(); => Now memory is allocated in Heap, and we have reference to the memory in p1.
// Point p2 = p1; => This also does not allocate any memory for Point p2, P2 stores a reference which refere to the same memory as p1.
// int x; => It allocates memory for an integer variable on Stack.


// Default Value for Non-Primitive Type :- (if we not initialize with any value)
// if members are:
// int => 0
// boolean => false
// float => 0.0

// In case of Primitive Types if you try to access a Primitive variable without initilizing you will get compiler error.
// Eg:- This program throws an error

 /*
  class Test
 {
    public static void main(String[] args) {
        int x;
        System.out.println(x);      // error: variable x might not have been initialized
    }
 } 
 */