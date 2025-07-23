package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceGeneratedAiTests {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service();
    }

    @Test
    void testIsEven_PositiveNumber() {
        // GIVEN an even number
        int input = 4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_NegativeNumber() {
        // GIVEN an even number
        int input = -4;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be true
        assertTrue(result);
    }

    @Test
    void testIsEven_OddNumber() {
        // GIVEN an odd number
        int input = 5;
        // WHEN isEven method is called
        boolean result = service.isEven(input);
        // THEN the result should be false
        assertFalse(result);
    }

    @Test
    void testHighComplexityMethod_AllPositive() {
        // GIVEN a, b, and c are positive integers
        int a = 1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called with a, b, and c
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is positive", "b is positive", "c is positive"
    }

    @Test
    void testHighComplexityMethod_APositiveOthersNonPositive() {
        // GIVEN a is positive, b and c are non-positive integers
        int a = 1;
        int b = -2;
        int c = 0;
        // WHEN highComplexityMethod is called with a, b, and c
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is positive", "b is non-positive", "c is non-positive"
    }

    @Test
    void testHighComplexityMethod_ANonPositiveOthersPositive() {
        // GIVEN a is non-positive, b and c are positive integers
        int a = -1;
        int b = 2;
        int c = 3;
        // WHEN highComplexityMethod is called with a, b, and c
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is non-positive", "b is positive", "c is positive"
    }

    @Test
    void testHighComplexityMethod_AllNonPositive() {
        // GIVEN a, b, and c are non-positive integers
        int a = -1;
        int b = -2;
        int c = 0;
        // WHEN highComplexityMethod is called with a, b, and c
        service.highComplexityMethod(a, b, c);
        // THEN the output should be: "a is non-positive", "b is non-positive", "c is non-positive"
    }

}
