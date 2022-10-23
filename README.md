# Unit Testing with JUnit

This repository has small tutorials for testing your code. A common and necessary practice for any programmer looking to keep up with the needs of software production.

## 1. The purpose of software tests :fireworks:

### 1.1. What are software tests?
<p>
A software test is a piece of software, which executes another piece of software. It validates if that code results in the expected state (state testing) or executes the expected sequence of events (behavior testing). :trophy:
</p>

### 1.2. Why are software tests helpful? :bookmark_tabs:
<p>
Software unit tests help the developer to verify that the logic of a piece of the program is correct. Running tests automatically helps to identify software regressions introduced by changes in the source code. Having a high test coverage of your code allows you to continue developing features
without having to perform lots of manual tests.
</p>

## 2. Testing terminology

### 2.1. Code (or application) under test
<p>
The code which is tested is typically called the code under test. If you are testing an application, this is called the application under test.
</p>

### 2.2. Test fixture
<p>
A test fixture is a fixed state in code which is tested used as input for a test. Another way to describe this is a test precondition.
For example, a test fixture might be a a fixed string, which is used as input for a method. The test would validate if the method behaves correctly with this input.
</p>

### 2.3. Unit tests and unit testing
<p>
A unit test is a piece of code written by a developer that executes a specific functionality in the code to be tested and asserts a certain behavior or state.
 The percentage of code which is tested by unit tests is typically called test coverage.
A unit test targets a small unit of code, e.g., a method or a class. External dependencies should be removed from unit tests, e.g., by replacing the dependency with a test implementation or a (mock) object created by a test framework.
Unit tests are not suitable for testing complex user interface or component interaction. For this, you should develop integration tests.
</p>

### 2.4. Integration tests
<p>
An integration test aims to test the behavior of a component or the integration between a set of components. The term functional test is sometimes used as synonym for integration test. Integration tests check that the whole system works as intended, therefore they are reducing the need for intensive manual tests.
These kinds of tests allow you to translate your user stories into a test suite. The test would resemble an expected user interaction with the application.
</p>

### 2.5. Performance tests
<p>
Performance tests are used to benchmark software components repeatedly. Their purpose is to ensure that the code under test runs fast enough even if it’s under high load.
</p>