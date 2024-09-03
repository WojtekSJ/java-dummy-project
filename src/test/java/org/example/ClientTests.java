package org.example;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClientTests {

    @Test
    void testGreeting() {
        Service service = mock(Service.class);
        when(service.isEven(anyInt())).thenReturn(true);

        Client client = new Client(service);
        String result = client.greeting("Alice");

        assertEquals("HELLO, ALICE", result);
    }

    @Test
    void testGreetingWithOddLengthName() {
        Service service = mock(Service.class);
        when(service.isEven(anyInt())).thenReturn(false);

        Client client = new Client(service);
        String result = client.greeting("Bob");

        assertEquals("Hello, Bob", result);
    }

    @Test
    void testGreetingWithNullName() {
        Service service = mock(Service.class);
        Client client = new Client(service);

        assertThrows(IllegalArgumentException.class, () -> client.greeting(null));
    }

    @Test
    void testGreetingWithEmptyName() {
        Service service = mock(Service.class);
        Client client = new Client(service);

        assertThrows(IllegalArgumentException.class, () -> client.greeting(""));
    }
}
