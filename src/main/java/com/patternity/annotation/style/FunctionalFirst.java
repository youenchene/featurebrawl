/**
 *
 */
package com.patternity.annotation.style;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks that this area of code follows the style "Functional First", i.e. in a
 * functional programming style as much as possible: immutable classes,
 * side-effect-free functions, return values that only depend on given
 * parameters, closure of operations...
 * 
 * <pre>
 * @see <a href="http://en.wikipedia.org/wiki/Functional_programming">Functional Programming (Wikipedia)</a>
 * </pre>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface FunctionalFirst {

	String value() default "";
}
