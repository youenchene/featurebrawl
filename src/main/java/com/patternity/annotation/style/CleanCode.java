/**
 *
 */
package com.patternity.annotation.style;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks that this area of code follows the style from the book Clean Code
 * 
 * <pre>
 * @see <a href="http://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882">Clean Code by Robert C. Martin (Uncle Bob)</a>
 * </pre>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface CleanCode {

	String value() default "";
}
