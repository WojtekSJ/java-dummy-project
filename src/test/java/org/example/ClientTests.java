package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClientTests {

    @Test
    void testGreeting_WhenNameIsNull_IllegalArgumentExceptionIsThrown() {
        Service service = mock(Service.class);
        when(service.isEven(0)).thenReturn(false);

        Client client = new Client(service);
        assertThatThrownBy(() -> client.greeting(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("must not be null or empty");
    }

    @Test
    void testGreeting_WhenNameIsBlank_IllegalArgumentExceptionIsThrown() {
        Service service = mock(Service.class);
        when(service.isEven(0)).thenReturn(false);

        Client client = new Client(service);
        assertThatThrownBy(() -> client.greeting(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("must not be null or empty");
    }

    @Test
    void testGreeting_WhenNameIsEven_GreetingIsInUpperCase() {
        Service service = mock(Service.class);
        when(service.isEven(4)).thenReturn(true);

        Client client = new Client(service);
        String greeting = client.greeting("test");
        assertThat(greeting).isEqualTo("HELLO, TEST");
    }

    @Test
    void testGreeting_WhenNameIsOdd_GreetingIsInLowerCase() {
        Service service = mock(Service.class);
        when(service.isEven(3)).thenReturn(false);

        Client client = new Client(service);
        String greeting = client.greeting("test");
        assertThat(greeting).isEqualTo("Hello, test");
    }
}
