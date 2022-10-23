# :page_facing_up: Commit: Testing Sum Method with Traditional way 
<p>
Right now the test class is functional, but for good programming practice, errors must be handled
with exceptions (try-catch blocks), and not with conditional evaluations. Create tests this way,
with exception handling, as well as polluting the code with try-catch blocks,
it's a lot of work.
It is at this point that the use of a testing framework proves to be useful.</p>

# :page_facing_up: Commit: first test
<p>
The @Test annotation indicates that this test method must be executed by the framework. If we don't want a test method to be executed just remove the annotation.
What the test method does is create an instance of the Calculator class, and pass it two parameters
for the sum method, then checking the result.
As you can see, the initial values of the test variables are not optimized at all, this because the framework has no way of knowing the rules relevant to our system, putting
then default values. It is up to us to "cut" the test case, passing more suitable values for the test. Also notice that the verification of the result is done through an assertion method, called
assertEquals(), which takes two parameters. What this method does is check for equality between the parameters, and if these values are not equal, an exception is returned, and the test fails. Look
that we don't need to use conditional blocks or exception control structures, which makes our test code cleaner and more straightforward.
</p>