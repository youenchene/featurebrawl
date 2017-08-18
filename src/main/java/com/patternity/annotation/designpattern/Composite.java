package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks an instance as following the composite pattern that describes that a
 * group of objects are to be treated in the same way as a single instance of an
 * object.
 * 
 * The intent of a composite is to "compose" objects into tree structures to
 * represent part-whole hierarchies. Implementing the composite pattern lets
 * clients treat individual objects and compositions uniformly.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Composite_pattern">Composite
 *      Pattern (Wikipedia)</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Composite {

}
