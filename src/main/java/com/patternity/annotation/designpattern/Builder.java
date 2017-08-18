package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks the instance as following the Builder pattern to helps construct other
 * instances "products" step by step.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Builder_pattern">Builder Pattern
 *      (Wikipedia)</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Builder {

	Class<?>[] value() default {};
}
