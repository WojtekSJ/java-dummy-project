##  Build Script Documentation:

**1. Overview:**

This `pom.xml` file is a configuration file for the Maven build tool. It defines the structure, dependencies, and build process for a Java project named "dummy-java-project". 

The script primarily focuses on setting up the project's environment, including specifying the Java version, defining dependencies for testing (JUnit Jupiter, AssertJ, Mockito), and configuring the test execution using the Maven Surefire plugin.

**2. Build Tool:** Maven

**3. Script/File Name:** pom.xml

**4. Detailed Documentation:**

   - **Project Information:**
     -  **Description:** Defines basic project metadata like group ID (`org.example`), artifact ID (`dummy-java-project`), and version (`1.0-SNAPSHOT`).
     -  **Parameters:** None
     -  **Important Logic:** This section sets up the fundamental identification of the project within Maven's repository system.

   - **Properties:**
     -  **Description:** Defines various properties used throughout the build process, such as Java source and target versions (`maven.compiler.source`, `maven.compiler.target`), source encoding (`project.build.sourceEncoding`), and dependency versions (e.g., `junit.jupiter.version`).
     -  **Parameters:** Property names and their values.
     -  **Important Logic:** Properties allow for centralized configuration adjustments, making it easier to manage project settings across different build configurations.

   - **Dependencies:**
     -  **Description:** Lists external libraries required by the project. Each dependency includes its group ID, artifact ID, version, and scope (e.g., `test` for testing dependencies).
     -  **Parameters:** Dependency metadata: groupId, artifactId, version, scope.
     -  **Important Logic:** Dependencies ensure that the project has access to necessary libraries for compilation and execution. The `test` scope indicates that these dependencies are only used during testing phases.

   - **Build Configuration:**
     -  **Description:** Defines plugins used to extend Maven's functionality. In this case, it includes the `maven-surefire-plugin` responsible for executing tests.
     -  **Parameters:** Plugin group ID, artifact ID, and version.
     -  **Important Logic:** Plugins allow customization of the build process, enabling tasks like testing, code generation, or deployment.

**5. Language Version:** Java 17 (specified by `maven.compiler.source` and `maven.compiler.target`)

**6. Dependency Versions:**

   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter Engine: 5.10.0
   - JUnit Jupiter API: 5.10.0
   - Mockito JUnit Jupiter: 5.6.0

**7. Pseudo Code:**

1. **Project Initialization:**
    - Read `pom.xml` file to gather project metadata, properties, and dependencies.
2. **Dependency Resolution:**
    - Download required libraries based on the specified dependency information.
3. **Compilation:**
    - Compile Java source code using the configured Java version (17).
4. **Test Execution:**
    - Configure and execute tests using the `maven-surefire-plugin`.
    - Report test results, including successes, failures, and skipped tests.

**8. Dependencies and Plugins Equivalents:**

   - Maven Surefire Plugin:
      - Gradle: `test` task with appropriate configuration
      - npm: Jest or Mocha frameworks for testing JavaScript code



