##  pom.xml Build Script Documentation

**1. Overview:**

This `pom.xml` file defines the build configuration for a Java project using Maven. It specifies project metadata, dependencies, and plugins required for compiling, testing, and packaging the application. 

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
     -  **Description:** Lists external libraries required for the project's functionality and testing. Each dependency includes its group ID, artifact ID, version, and scope (e.g., `test` for test dependencies).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the library's provider.
         - `artifactId`: Name of the library within the provider.
         - `version`: Specific version of the library to use.
         - `scope`: Defines the dependency's usage context (e.g., `compile`, `test`).

   - **Plugins:**
     -  **Description:** Specifies plugins used to extend Maven's functionality during the build process. Each plugin has a group ID, artifact ID, and version.
     -  **Parameters:** 
         - `groupId`: Unique identifier for the plugin provider.
         - `artifactId`: Name of the plugin within the provider.
         - `version`: Specific version of the plugin to use.

   - **Maven Surefire Plugin:**
     -  **Description:** Executes tests defined in the project using JUnit Jupiter. 
     -  **Parameters:** N/A (Configuration is handled through default settings)
     -  **Important Logic:** Automatically discovers and runs test classes annotated with `@Test` within the project's source directories.

**5. Language Version:** Java 17 (specified by `<maven.compiler.source>` and `<maven.compiler.target>`)

**6. Dependency Versions:**
   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter Engine: 5.10.0
   - JUnit Jupiter API: 5.10.0
   - Mockito JUnit Jupiter: 5.6.0

**7. Pseudo Code:**

```
// Project Setup Phase
  - Define project metadata (groupId, artifactId, version)
  - Set properties (source/target Java versions, encoding, dependency versions)
  - Declare dependencies (libraries required for project and testing)

// Build Phase
  - Compile source code using specified Java version
  - Execute tests using Maven Surefire Plugin:
    - Discover test classes annotated with @Test
    - Run tests and report results

// Package Phase
  - Create a distributable archive (e.g., JAR file) containing compiled code and dependencies


```

**8. Dependencies and Plugins Equivalents:**

* **Maven:** Gradle, npm (for JavaScript projects)
* **Maven Surefire Plugin:** Gradle's `Test` task, npm's `jest`, `mocha`



