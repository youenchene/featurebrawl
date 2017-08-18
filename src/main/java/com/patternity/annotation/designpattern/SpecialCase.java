/**
 * 
 */
package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a Special Case class or instance
 * 
 * @see <a href="http://martinfowler.com/eaaCatalog/specialCase.html">SpecialCase</a>
 * 
 *      SpecialCase objects must be immutable and singleton
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface SpecialCase {
}
