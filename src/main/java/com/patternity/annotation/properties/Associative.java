package com.patternity.annotation.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Declares that each method has the same result when called with parameters in
 * the reverse order.
 * 
 * In other words, for a method f(x, y):
 * 
 * <pre>
 * f(x, y) == f(y, x)
 * </pre>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Associative {

}
