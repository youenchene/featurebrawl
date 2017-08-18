/**
 *
 */
package com.patternity.annotation.strategic;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks this package as being dedicated to one particular bounded context.
 * 
 * @see <a href="http://domaindrivendesign.org/node/91">BoundedContext</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface BoundedContext {

	String value();
}
