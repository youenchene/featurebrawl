package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks the instance as a Factory that produces some types of instances.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Factory_pattern">Factory Pattern
 *      (Wikipedia)</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Factory {

	Class<?>[] products() default {};
}
