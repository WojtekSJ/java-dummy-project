## Service.java Documentation

**1. Overview**

The `Service` class provides utility methods for basic mathematical operations and conditional logic evaluation. It includes a method to check if a given integer is even and another method that performs complex conditional checks based on three input integers. 

**2. Package/module name:** org.example

**3. Class/file name:** Service.java

**4. Detailed Documentation**

   - **`isEven(int input)`**
     - **Description:** This method determines if a given integer is even.
     - **Parameters:** 
       - `input`: An integer value to be checked.
     - **Return Values:** 
       - `true`: If the input integer is even (divisible by 2 with no remainder).
       - `false`: If the input integer is odd.
     - **Important Logic:** The method uses the modulo operator (`%`) to calculate the remainder when the input is divided by 2. If the remainder is 0, the number is even; otherwise, it's odd.

   - **`highComplexityMethod(int a, int b, int c)`**
     - **Description:** This method performs a series of nested conditional checks based on the signs of three input integers (a, b, and c). It prints messages to the console indicating the sign of each integer.
     - **Parameters:** 
       - `a`: The first integer.
       - `b`: The second integer.
       - `c`: The third integer.
     - **Return Values:** None (void method)
     - **Important Logic:** This method uses a series of `if` and `else if` statements to evaluate the signs of `a`, `b`, and `c`. It prints messages based on the combinations of positive and non-positive values for each integer.

**5. Pseudo Code**


```
// Class: Service

// Method: isEven(input)
  1. Calculate the remainder when input is divided by 2 (input % 2).
  2. If the remainder is 0, return true (even number).
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
          - Print "b is non-positive".
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is 0, b is non-positive, and c is positive".
            - Otherwise: Print "a is 0, b and c are non-positive".
    - If 'a' is negative:
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is non-positive, b and c are positive".
            - Otherwise: Print "a is non-positive, b is positive, and c is non-positive".
        - Otherwise: 
          - Print "b is non-positive".
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is non-positive, b is non-positive, and c is positive".
            - Otherwise: Print "a is non-positive, b and c are non-positive".
    - Otherwise: 
      - Check the sign of 'b':
        - If 'b' is positive:
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is positive, b and c are positive".
            - Otherwise: Print "a is positive, b is positive, and c is non-positive".
        - Otherwise: 
          - Print "b is non-positive".
          - Check the sign of 'c':
            - If 'c' is positive: Print "a is positive, b is non-positive, and c is positive".
            - Otherwise: Print "a is positive, b and c are non-positive".



```

**6. Dependencies and Libraries:**


* The `Service` class does not explicitly depend on any external libraries. It utilizes basic Java language constructs for its functionality. 




