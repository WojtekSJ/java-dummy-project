##  Maven Build Script Documentation

**1. Overview:**

This Maven `pom.xml` file defines the build configuration for a Java project named "dummy-java-project". It specifies project metadata, dependencies, and plugins required for compiling, testing, and packaging the project. 

**2. Build Tool:** Maven

**3. Script/File Name:** pom.xml

**4. Detailed Documentation:**

   - **Project Metadata:**
     -  **Description:** Defines basic information about the project, including its group ID (`org.example`), artifact ID (`dummy-java-project`), and version (`1.0-SNAPSHOT`).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the project's organization.
         - `artifactId`: Name of the project within the organization.
         - `version`: Current version of the project.

   - **Properties:**
     -  **Description:** Sets various properties used throughout the build process, such as Java source and target versions (`maven.compiler.source`, `maven.compiler.target`), source encoding (`project.build.sourceEncoding`), and dependency versions (e.g., `junit.jupiter.version`).
     -  **Parameters:** 
         - Property names are defined within the `<properties>` section, followed by their values.

   - **Dependencies:**
     -  **Description:** Lists external libraries required for the project to function correctly. Each dependency includes its group ID, artifact ID, version, and scope (e.g., `test` for testing dependencies).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the library's provider.
         - `artifactId`: Name of the library within the provider.
         - `version`: Specific version of the library to use.
         - `scope`: Defines the dependency's usage context (e.g., `compile` for main code, `test` for testing).

   - **Plugins:**
     -  **Description:** Specifies plugins that extend Maven's functionality. In this case, it includes the `maven-surefire-plugin` for running unit tests.
     -  **Parameters:** 
         - `groupId`: Unique identifier for the plugin provider.
         - `artifactId`: Name of the plugin within the provider.
         - `version`: Specific version of the plugin to use.

   - **Important Logic:** The script relies on Maven's built-in mechanisms to resolve dependencies, compile source code, and execute tests based on the defined configurations.


**5. Language Version:** Java 17 (specified by `<maven.compiler.source>` and `<maven.compiler.target>`)

**6. Dependency Versions:**
   - `mockito-core`: 5.6.0
   - `assertj-core`: 3.24.2
   - `junit-jupiter-engine`:  5.10.0 (defined by `junit.jupiter.version` property)
   - `junit-jupiter-api`: 5.10.0 (defined by `junit.jupiter.version` property)
   - `mockito-junit-jupiter`: 5.6.0
   - `maven-surefire-plugin`: 3.0.0

**7. Pseudo Code:**

```
// Project Setup Phase
  1. Define project metadata: groupId, artifactId, version
  2. Set properties: Java source and target versions, encoding, dependency versions
  3. Declare dependencies: Include required libraries with their versions and scopes (e.g., test)

// Build Process Phase
  1. Resolve dependencies based on declared versions and Maven repositories
  2. Compile source code using specified Java version
  3. Execute unit tests using the `maven-surefire-plugin` 
     - Run tests defined in the project's test directory
     - Report test results to console

// Packaging Phase (Optional)
  1. Package compiled code into a desired format (e.g., JAR, WAR) based on project configuration



```


**8. Dependencies and Plugins Equivalents:**

* **Maven:** 
    * `maven-surefire-plugin`: Gradle equivalent: `test` task with appropriate configurations for test execution.
    *  Other Maven plugins can be mapped to their Gradle counterparts based on functionality (e.g., dependency management, code generation).


