package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Declares that this class is a companion utility for another class or class
 * family or hierarchy, just like java.util.Collections is a companion utility
 * for every Collection class.
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface CompanionUtility {

	Class<?>[] value() default {};
}
