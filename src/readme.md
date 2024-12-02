# Using '==' Operator 
In java === operator is not used.
## Collections (Framework) in java

* Has different classes
* Can use as library
* Dynamic length
# classes-
1. ArrayList
2. Linked list
3. vector
4. HashSet
5. PriorityQueue
6. TreeSet
7. LinkedHashSet
# Interfaces
1. set
2. queue
3. dequeue
4. List
# Collections
1. list -- allows duplicate
2. map -- not allows duplicates
3. queue
4. set 
5. iterator 
6. collections
## SWAPPING CONCEPT 
1. Immutability of Integer Objects
   In Java, Integer is an immutable wrapper class for the primitive int type. When you create an Integer object, its value cannot be changed. The swap method attempts to swap the references of a and b, but since Java is pass-by-value (or more accurately, pass-by-copy-of-reference), the changes made inside the swap method do not affect the original references in the main method.
2. Pass-by-Value in Java
   Java uses pass-by-value, which means that when you pass a variable to a method, what gets passed is a copy of the reference to the object, not the actual reference itself. So, when you swap a and b inside the swap method, you're only swapping the copies of the references, not the original references themselves.
3. Effect on Primitive Types
   Similarly, for primitive types like int, the swap method receives copies of i and j. Any changes to i and j within the method do not affect the original variables in the main method.
   Why the Swap Doesn't Work:
   For int Variables:

The swap method is supposed to swap i and j, but because it operates on copies of i and j, the original i and j in the main method remain unchanged.
For Integer Objects:

Since Integer is immutable, the swap method can only swap the references locally within the method. The original references in the main method remain unchanged.
Key Points:
Integer Immutability: The Integer class is immutable, so you cannot change the value of an Integer object once it is created. You can only reassign the reference to point to a new Integer object.
Java's Pass-by-Value: Java always passes arguments by value, which means that changes to parameters inside the method do not affect the arguments passed in from the caller.