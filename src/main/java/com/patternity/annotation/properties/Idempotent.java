package com.patternity.annotation.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Declares that each method has the same effect when called once or any number
 * of times.
 * 
 * In other words, for a method f(x):
 * 
 * <pre>
 * f(f(x)) = f(x)
 * </pre>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Idempotent {

}
