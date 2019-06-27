# Cucumber-Eclipse-With-Libs

Demonstration project for a problem I was having with the Cucumber-Eclipse plugin, when the step definitions are in an included library.

## Building

`gradlew build eclipse`

This builds the subproject "steps-lib" that includes a single `MySteps.java` class with step definitions, and includes that library `steps-lib.jar` in the top-level project.

Next, import the top-level project into Eclipse. The subproject shouldn't be visible (even if you import this as a Gradle project) because the subproject is not included as a dependency in the main project. 

**This is a shortcut on my part for purposes of demonstration**. In practice, I am creating the .jar file in a completely separate project and publishing it to Artifactory. The published library is included as a dependency in my actual project. I am simulating that here by creating a subproject, building a .jar in that subproject, and including it as a dependency in the top-level project.

When you open the feature file (`src/test/resources/features/CustomerInquiry.feature`) in Eclipse with the Cucumber-Eclipse plugin, you will see that all the steps are highlighted in yellow because the plugin does not find my step definitions in the separate library.

If, OTOH, you copy steps-lib/src/main/java/com/steps/ to src/main/java/com/steps/, the step definitions will be found.

## The Big Question
"Should the Cucumber-Eclipse plugin support step definitions in separate libraries?" The docs imply it is possible, but I'm not finding that to be true.

Hopefully, I'm missing something really obvious. I *really* want this to work because it will allow us to share step definitions across many internal projects.

