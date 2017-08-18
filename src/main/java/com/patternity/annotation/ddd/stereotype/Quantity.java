package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a Quantity, a particular kind of {@link @ValueObject}
 * 
 * @see <a href="http://martinfowler.com/eaaDev/quantity.html">Quantity</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@ValueObject
public @interface Quantity {
}
