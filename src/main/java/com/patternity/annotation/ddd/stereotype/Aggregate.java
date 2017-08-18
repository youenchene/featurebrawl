/**
 *
 */
package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents an Aggregate, i.e. a cluster of associated objects that are
 * treated as a unit for the purpose of data changes. External references are
 * restricted to one member of the Aggregate, designated as the root
 * 
 * @see <a href="http://domaindrivendesign.org/node/88">Aggregate</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Aggregate {

	/**
	 * The Entity class that is the root of this aggregate; a class declared
	 * here is assumed to be an Entity
	 */
	Class<?> root();

	/**
	 * Every Entity class that is part of this aggregate; every class declared
	 * here is assumed to an Entity
	 */
	Class<?>[] memberEntities() default {};
}
