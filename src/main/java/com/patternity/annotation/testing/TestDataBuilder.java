package com.patternity.annotation.testing;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;

/**
 * A Builder for a class to test that 1. Has an instance variable for each constructor parameter, 2. Initialises its instance variables to commonly used or safe values, 3. Has a 'build' method that creates a new object using the values in its instance variables and 4. Has "chainable" public methods for overriding the values in its instance variables.
 * 
 * @see <a href="http://www.natpryce.com/articles/000714.html">TestDataBuilder</a>
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface TestDataBuilder {
}