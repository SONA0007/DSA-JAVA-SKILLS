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

# Why the `swap` Method Doesn't Work as Expected

## **Overview**

The `swap` method is supposed to exchange the values of `i` and `j`. However, due to Java's parameter-passing mechanism
and the nature of `Integer` objects, the original values of `i` and `j` in the main method remain unchanged.

---

## **Key Concepts**

### **1. Java's Pass-by-Value Mechanism**

- Java **always passes arguments by value**, even for objects.
- When you pass a variable to a method:
   - For primitives, a copy of the value is passed.
   - For objects, a copy of the reference is passed (not the actual object).
- Changes to the parameter inside the method **do not affect the original variable** in the caller.

---

### **2. Immutability of the `Integer` Class**

- The `Integer` class in Java is **immutable**, meaning its value cannot be changed once created.
- If you reassign an `Integer` variable inside a method, it creates a new `Integer` object rather than modifying the
  original.

---

## **Behavior in the Swap Method**

### **For Primitives:**

- When swapping primitives like `int`:
   - The method operates on **copies** of the values of `i` and `j`.
   - Any changes to these copies do not affect the original variables in the caller.

### **For Integer Objects:**

- When swapping `Integer` objects:
   - The method swaps the **references** locally within its scope.
   - However, the original references in the caller remain unchanged.

---

## **Key Points**

### **1. Integer Immutability**

- The `Integer` class is immutable, so you cannot change the value of an `Integer` object once it is created.
- You can only reassign the reference to point to a new `Integer` object.

### **2. Java's Pass-by-Value**

- Java's parameter-passing mechanism ensures that changes to parameters inside the method do not affect the arguments
  passed in from the caller.

---

### **Example: Swap Method**

```java
public static void swap(Integer i, Integer j) {
   Integer temp = i; // Copies the reference of i
   i = j;            // Reassigns i to reference j's object
   j = temp;         // Reassigns j to reference i's object
}

public static void main(String[] args) {
   Integer a = 10;
   Integer b = 20;
   swap(a, b);
   System.out.println("a: " + a + ", b: " + b); // Outputs: a: 10, b: 20
}
```

### Pre-Increment and Post-Increment

| Operation                     | `stack1[++top] = value;`                 | `stack1[top++] = value;`                |
|-------------------------------|------------------------------------------|-----------------------------------------|
| **When `top` is incremented** | Before assigning value to `stack1[top]`. | After assigning value to `stack1[top]`. |
| **Position of the Value**     | Value is placed at the next index.       | Value is placed at the current index.   |
