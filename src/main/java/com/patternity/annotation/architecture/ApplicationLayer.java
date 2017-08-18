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
 * Marks this package as the root of the application layer.
 * 
 * This layer (usually very thin) delegates to the domain layer to realize each
 * applicative use-case. It typically decides when to start/stop transactions
 * around a full use-case.
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target(ElementType.PACKAGE)
public @interface ApplicationLayer {

    String[] domainLayer() default {};
}
