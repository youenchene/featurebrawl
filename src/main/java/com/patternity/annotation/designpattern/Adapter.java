package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks an instance as following the (Object) Adapter pattern (aka Wrapper)
 * that translates one interface for a class into a compatible interface.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Adapter_pattern">Adapter Pattern
 *      (Wikipedia)</a>
 * 
 * @see Facade
 * @see AntiCorruptionLayer
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Adapter {

	Class<?>[] targetTypes() default {};

	Class<?>[] adaptees() default {};
}
