##  Build Script Documentation:

**1. Overview:**

This `pom.xml` file defines a project configuration for the "dummy-java-project" using Maven, an open-source build automation tool. It specifies project metadata (group ID, artifact ID, version), properties used throughout the build process, dependencies required by the project, and plugins to execute specific tasks during the build lifecycle.

**2. Build Tool:** Maven

**3. Script/File Name:** `pom.xml`

**4. Detailed Documentation:**

   - **Project Metadata:**
     -  **Description:** Defines basic information about the project, including its group ID (`org.example`), artifact ID (`dummy-java-project`), and version (`1.0-SNAPSHOT`). 
     -  **Parameters:** None. These are fixed values defined within the `pom.xml` file.

   - **Properties:**
     -  **Description:** Sets various properties used throughout the build process, such as Java source and target versions, project encoding, and dependency versions.
     -  **Parameters:** Key-value pairs defining property names and their values. Examples include: `maven.compiler.source`, `maven.compiler.target`, `project.build.sourceEncoding`, `junit.jupiter.version`.

   - **Dependencies:**
     -  **Description:** Lists external libraries required by the project, specifying their group ID, artifact ID, version, and scope (e.g., `test` for testing dependencies).
     -  **Parameters:** Each dependency is defined with its own set of parameters: `groupId`, `artifactId`, `version`, and `scope`.
     -  **Important Logic:** Maven automatically downloads and manages these dependencies during the build process, ensuring they are available to the project.

   - **Plugins:**
     -  **Description:** Defines plugins used to extend Maven's functionality. In this case, it includes the `maven-surefire-plugin` for running unit tests.
     -  **Parameters:** Each plugin has its own set of parameters, such as `groupId`, `artifactId`, and `version`.

   - **Build Lifecycle:**
     -  **Description:** Maven follows a predefined build lifecycle with phases like compile, test, package, etc. The `pom.xml` file configures these phases and the plugins executed during each phase.


**5. Language Version:** Java 17 (specified by `maven.compiler.source` and `maven.compiler.target` properties)

**6. Dependency Versions:**
   -  mockito-core: 5.6.0
   -  assertj-core: 3.24.2
   -  junit-jupiter-engine: 5.10.0 (defined by `junit.jupiter.version` property)
   -  junit-jupiter-api: 5.10.0 (defined by `junit.jupiter.version` property)
   -  mockito-junit-jupiter: 5.6.0

**7. Pseudo Code:**

```
// Define project metadata and properties
SET groupId = "org.example"
SET artifactId = "dummy-java-project"
SET version = "1.0-SNAPSHOT"
SET mavenCompilerSource = "17"
SET mavenCompilerTarget = "17"
SET projectBuildSourceEncoding = "UTF-8"
SET junitJupiterVersion = "5.10.0"

// Define dependencies
ADD dependency(groupId = "org.mockito", artifactId = "mockito-core", version = "5.6.0", scope = "test")
ADD dependency(groupId = "org.assertj", artifactId = "assertj-core", version = "3.24.2")
ADD dependency(groupId = "org.junit.jupiter", artifactId = "junit-jupiter-engine", version = junitJupiterVersion)
ADD dependency(groupId = "org.junit.jupiter", artifactId = "junit-jupiter-api", version = junitJupiterVersion)
ADD dependency(groupId = "org.mockito", artifactId = "mockito-junit-jupiter", version = "5.6.0", scope = "test")

// Configure plugins
ADD plugin(groupId = "org.apache.maven.plugins", artifactId = "maven-surefire-plugin", version = "3.0.0")

// Execute build lifecycle phases (compile, test, package, etc.)
```


**8. Dependencies and Plugins Equivalents:**

* **Maven:** 
    *  Gradle: Similar functionality achieved through `buildscript`, `dependencies` blocks, and plugins configuration.
    * npm: Uses `package.json` for project metadata, dependencies, and scripts.



