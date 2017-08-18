package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a Null Object class or instance, to favour instead of null
 * 
 * @see <a
 *      href="http://www.refactoring.com/catalog/introduceNullObject.html">NullObject</a>
 * 
 *      Null objects must be immutable and singleton
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NullObject {

}
