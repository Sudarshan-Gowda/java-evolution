# Java Evolution

A hands-on reference repository exploring Java language features, standard-library additions, JVM improvements, and coding examples across Java 8, 11, 12, and 17.

## Repository structure

```text
java-evolution/
├── java-8/
├── java-11/
├── java-12/
├── java-17/
├── pom.xml
└── README.md
```

Each version is an independent Maven module with its own compiler release level and examples organized by topic.

## Prerequisites

- JDK 17 or later
- Apache Maven 3.8+
- Git

A newer JDK can compile code targeting older Java releases when configured with `maven.compiler.release`. This does not replace testing on the actual target runtimes. Run each module's tests on its corresponding JDK when runtime compatibility matters.

## Build

Build all modules:

```bash
mvn clean verify
```

Build one module:

```bash
mvn clean verify -pl java-8
mvn clean verify -pl java-11
mvn clean verify -pl java-17
```

## Topics roadmap

| Version | Topics to explore |
|---|---|
| Java 8 | Lambdas, functional interfaces, Streams, Optional, Date/Time API |
| Java 11 | `var` in lambda parameters, String methods, Files API, standard HTTP Client |
| Java 12 | String `indent()` and `transform()`, Files mismatch API, switch expressions (preview) |
| Java 17 | Records, sealed classes, pattern matching for `instanceof`, text blocks |

The examples are intentionally small and focused. Each topic should explain what changed, why it matters, and when to use it.

## Adding a new Java version

1. Create a new module directory, such as `java-21`.
2. Add its `pom.xml` with the appropriate `maven.compiler.release`.
3. Add examples under `src/main/java`.
4. Register the module in the root `pom.xml`.
5. Document the new features in this README.

