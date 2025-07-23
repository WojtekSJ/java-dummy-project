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

public class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        String name = "John";
        Mockito.when(serviceMock.isEven(name.length())).thenReturn(false);
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, John", greeting);
    }

    @Test
    void greeting_NullName_ThrowsException() {
        // GIVEN
        String name = null;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EmptyName_ThrowsException() {
        // GIVEN
        String name = "";
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EvenLengthName_ReturnsUpperCaseGreeting() {
        // GIVEN
        String name = "Alice";
        Mockito.when(serviceMock.isEven(name.length())).thenReturn(true);
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("HELLO, ALICE", greeting);
    }

    @Test
    void greeting_OddLengthName_ReturnsLowerCaseGreeting() {
        // GIVEN
        String name = "Bob";
        Mockito.when(serviceMock.isEven(name.length())).thenReturn(false);
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, Bob", greeting);
    }


}
/*
2025-07-23 14:32:01.620 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:36)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-23 14:32:01.625 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Generating code...
2025-07-23 14:32:01.625 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Using prompt:

There is an error in the previously generated test class.

>> ERROR:

[ERROR] Tests run: 5, Failures: 2, Errors: 0, Skipped: 0, Time elapsed: 0.13 s <<< FAILURE! - in org.example.ClientGeneratedAiTests
[ERROR] org.example.ClientGeneratedAiTests.greeting_ValidName_ReturnsGreeting  Time elapsed: 0.06 s  <<< FAILURE!
[ERROR] org.example.ClientGeneratedAiTests.greeting_EvenLengthName_ReturnsUpperCaseGreeting  Time elapsed: 0.004 s  <<< FAILURE!
[ERROR] Failures: 
[ERROR]   ClientGeneratedAiTests.greeting_EvenLengthName_ReturnsUpperCaseGreeting:65 expected: <HELLO, ALICE> but was: <Hello, Alice>
[ERROR]   ClientGeneratedAiTests.greeting_ValidName_ReturnsGreeting:39 expected: <Hello, John> but was: <HELLO, JOHN>
[ERROR] Tests run: 5, Failures: 2, Errors: 0, Skipped: 0
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.0.0:test (default-test) on project dummy-java-project: There are test failures.
[ERROR] 
[ERROR] Please refer to C:\Users\wojci\AppData\Local\Temp\codeai-test-15057573325964587158\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# TASK: Correct the error in the test class.

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.

2025-07-23 14:32:01.626 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-23 14:32:18.750 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2254, outputTokenCount = 383, totalTokenCount = 2637 }
2025-07-23 14:32:18.751 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Done
2025-07-23 14:32:18.751 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Generated code:
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = new Service();
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        String name = "John";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, John", greeting);
    }

    @Test
    void greeting_NullName_ThrowsException() {
        // GIVEN
        String name = null;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EmptyName_ThrowsException() {
        // GIVEN
        String name = "";
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EvenLengthName_ReturnsUpperCaseGreeting() {
        // GIVEN
        String name = "Alice";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("HELLO, ALICE", greeting);
    }

    @Test
    void greeting_OddLengthName_ReturnsLowerCaseGreeting() {
        // GIVEN
        String name = "Bob";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, Bob", greeting);
    }


}




2025-07-23 14:32:18.751 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Refining code...
2025-07-23 14:32:18.752 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Done
2025-07-23 14:32:25.765 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-23 14:32:25.766 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Generating code...
2025-07-23 14:32:25.766 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[- Ensure the `Service` class correctly implements the expected logic for greeting based on name length and case. 
- Verify that the `Client` class is using the `Service` object appropriately to generate greetings.


]

In this code:

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

public class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = new Service();
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        String name = "John";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, John", greeting);
    }

    @Test
    void greeting_NullName_ThrowsException() {
        // GIVEN
        String name = null;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EmptyName_ThrowsException() {
        // GIVEN
        String name = "";
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EvenLengthName_ReturnsUpperCaseGreeting() {
        // GIVEN
        String name = "Alice";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("HELLO, ALICE", greeting);
    }

    @Test
    void greeting_OddLengthName_ReturnsLowerCaseGreeting() {
        // GIVEN
        String name = "Bob";
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, Bob", greeting);
    }


}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-23 14:32:25.766 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-23 14:33:02.614 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3347, outputTokenCount = 633, totalTokenCount = 3980 }
2025-07-23 14:33:02.616 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Done
2025-07-23 14:33:02.616 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Generated code:
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

public class ClientGeneratedAiTests {

    private Service serviceMock;
    private Client client;

    @BeforeEach
    void setUp() {
        serviceMock = Mockito.mock(Service.class);
        client = new Client(serviceMock);
    }

    @Test
    void greeting_ValidName_ReturnsGreeting() {
        // GIVEN
        String name = "John";
        Mockito.when(serviceMock.isEven(name.length())).thenReturn(false);
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, John", greeting);
    }

    @Test
    void greeting_NullName_ThrowsException() {
        // GIVEN
        String name = null;
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EmptyName_ThrowsException() {
        // GIVEN
        String name = "";
        // WHEN
        assertThrows(IllegalArgumentException.class, () -> client.greeting(name));
    }

    @Test
    void greeting_EvenLengthName_ReturnsUpperCaseGreeting() {
        // GIVEN
        String name = "Alice";
        Mockito.when(serviceMock.isEven(name.length())).thenReturn(true);
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("HELLO, ALICE", greeting);
    }

    @Test
    void greeting_OddLengthName_ReturnsLowerCaseGreeting() {
        // GIVEN
        String name = "Bob";
        Mockito.when(serviceMock.isEven(name.length())).thenReturn(false);
        // WHEN
        String greeting = client.greeting(name);
        // THEN
        assertEquals("Hello, Bob", greeting);
    }


}




2025-07-23 14:33:02.616 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Refining code...
2025-07-23 14:33:02.617 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=org.example.ClientGeneratedAiTests.java}] - Done
*/
