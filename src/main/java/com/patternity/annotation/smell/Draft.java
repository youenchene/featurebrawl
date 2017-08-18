/**
 *
 */
package com.patternity.annotation.smell;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks this implementation as a draft not used for the moment but that can be
 * used as a starting point for future use.
 * 
 * This also means it can be safely deprecated and removed if desired.
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Draft {

	String value() default "";
}
