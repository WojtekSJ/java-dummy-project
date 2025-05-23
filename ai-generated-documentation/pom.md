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
         - `artifactId`: Unique identifier for the project within the organization.
         - `version`: Current version of the project.

   - **Properties:**
     -  **Description:** Sets various properties used throughout the build process, such as Java source and target versions (`maven.compiler.source`, `maven.compiler.target`), source encoding (`project.build.sourceEncoding`), and dependency versions (e.g., `junit.jupiter.version`).
     -  **Parameters:** 
         - Property names are defined within the `<properties>` section, followed by their values.

   - **Dependencies:**
     -  **Description:** Lists external libraries required for the project's functionality and testing. Each dependency includes its group ID, artifact ID, version, and scope (e.g., `test` for test dependencies).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the dependency's provider.
         - `artifactId`: Unique identifier for the dependency within the provider.
         - `version`: Specific version of the dependency to use.
         - `scope`: Defines the dependency's usage context (e.g., `compile`, `test`).

   - **Build Plugins:**
     -  **Description:** Configures plugins that extend Maven's functionality. In this case, it includes the `maven-surefire-plugin` for running unit tests.
     -  **Parameters:** 
         - `groupId`: Unique identifier for the plugin provider.
         - `artifactId`: Unique identifier for the plugin within the provider.
         - `version`: Specific version of the plugin to use.

**5. Language Version:** Java 17 (specified by `<maven.compiler.source>` and `<maven.compiler.target>`)

**6. Dependency Versions:**

   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter Engine: 5.10.0
   - JUnit Jupiter API: 5.10.0
   - Mockito JUnit Jupiter: 5.6.0

**7. Pseudo Code:**

1. **Read `pom.xml` file.**
2. **Extract project metadata:**
    - Group ID, Artifact ID, Version
3. **Extract properties:**
    - Java source and target versions
    - Source encoding
    - Dependency versions (e.g., JUnit Jupiter)
4. **Iterate through dependencies:**
    - For each dependency:
        - Extract group ID, artifact ID, version, and scope.
5. **Configure build plugins:**
    - Find the `maven-surefire-plugin` configuration.
6. **Compile source code:**
    - Use Java compiler with specified source and target versions.
7. **Run unit tests:**
    - Utilize `maven-surefire-plugin` to execute tests defined in the project structure.
8. **Package application:**
    - Create a distributable archive (e.g., JAR) based on project configuration.

**8. Dependencies and Plugins Equivalents:**

   - **Maven:** Gradle, npm (for JavaScript projects)


