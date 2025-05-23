## Service.java Documentation

**1. Overview:**

This Java code defines a `Service` class that provides utility methods for basic mathematical operations and conditional logic. It includes a method to check if a number is even and another method with complex nested conditional statements. 

**2. Package/module name:**

org.example

**3. Class/file name:**

Service.java

**4. Detailed Documentation:**

   - **`isEven(int input)`**
     - **Description:** This method determines if a given integer is even.
     - **Parameters:** 
       - `input`: An integer value to be checked.
     - **Return Values:** 
       - `true`: If the input number is even (divisible by 2 with no remainder).
       - `false`: If the input number is odd.
     - **Important Logic:** The method uses the modulo operator (`%`) to calculate the remainder when the input is divided by 2. If the remainder is 0, the number is even; otherwise, it's odd.

   - **`highComplexityMethod(int a, int b, int c)`**
     - **Description:** This method demonstrates complex nested conditional logic based on the signs of three integer inputs. It prints various messages to the console depending on the combinations of positive and non-positive values for `a`, `b`, and `c`.
     - **Parameters:** 
       - `a`: An integer value.
       - `b`: An integer value.
       - `c`: An integer value.
     - **Return Values:** None (void method).
     - **Important Logic:** The method uses a series of nested `if` and `else if` statements to evaluate the signs of `a`, `b`, and `c`. It prints messages indicating whether each variable is positive or non-positive, creating a comprehensive output based on all possible combinations.

**5. Pseudo Code:**


```
// Class: Service

// Method: isEven(input)
  1. Calculate the remainder when input is divided by 2 (input % 2).
  2. If the remainder is equal to 0, return true (even number).
  3. Otherwise, return false (odd number).

// Method: highComplexityMethod(a, b, c)
  1. Check the sign of 'a':
    - If 'a' is 0:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a, b, and c are positive".
            - Otherwise: Print "a and b are positive, c is non-positive".
        - Otherwise: 
          - Print "b is non-positive, a is 0".
    - If 'a' is negative:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is non-positive, b and c are positive".
            - Otherwise: Print "a is non-positive, b is positive, c is non-positive".
        - Otherwise: 
          - Print "a is non-positive, b is non-positive".
    - Otherwise:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is non-positive, b and c are positive".
            - Otherwise: Print "a is non-positive, b is positive, c is non-positive".
        - Otherwise: 
          - Print "a is non-positive, b is non-positive".



```

**Dependencies and Libraries:**

* This code does not rely on any external libraries. It uses standard Java built-in functionalities.


