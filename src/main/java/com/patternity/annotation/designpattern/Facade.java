package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks an instance as following the Facade pattern that provides a simplified
 * interface to a larger body of code, such as an external library or a legacy
 * sub-system.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Facade_pattern">Facade Pattern
 *      (Wikipedia)</a>
 * @see Adapter
 * @see AntiCorruptionLayer
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Facade {

	/**
	 * Each class this facades shields from
	 */
	Class<?>[] subFacades() default {};

	/**
	 * The descriptions of each sub-system this facades shields from
	 */
	String[] subSystems() default {};
}
