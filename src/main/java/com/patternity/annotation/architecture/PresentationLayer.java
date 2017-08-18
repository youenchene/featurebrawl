/**
 * 
 */
package com.patternity.annotation.architecture;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks this package as the root of the presentation/UI layer.
 * 
 * This layer contains every presentation-specific code, and delegates to the
 * lower layers (application, domain in particular).
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target(ElementType.PACKAGE)
public @interface PresentationLayer {

	String[] lowerLayer() default {};
}
