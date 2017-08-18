/**
 *
 */
package com.patternity.annotation.strategic;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this element is part of an AntiCorruption Layer
 *
 * An {@link AntiCorruptionLayer} is a means of linking two {@link BoundedContext}.
 *
 * This is usually implemented through a set of Adapter and Facade or more specialised patterns such as DataMapper.
 *
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target(ElementType.PACKAGE)
public @interface AntiCorruptionLayer {

    Class<?>[] hedgesAgainstContexts() default {};

    String[] hedgedFrom() default {};
}
