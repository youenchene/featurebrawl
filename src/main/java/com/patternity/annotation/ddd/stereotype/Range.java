package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a Range, a particular kind of {@link @ValueObject}
 * 
 * @see <a href="http://martinfowler.com/eaaDev/Range.html">Range</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@ValueObject
public @interface Range {

	String brief() default "Represent a range of values";

	String link() default "http://martinfowler.com/ap2/range.html";
}
