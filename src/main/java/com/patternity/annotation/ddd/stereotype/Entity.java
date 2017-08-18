/**
 *
 */
package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents an entity in the DDD sense: An object that is not defined by its
 * attributes, but rather by a thread of continuity and its identity.
 * 
 * @see <a
 *      href="http://lostechies.com/joeocampo/2007/04/15/a-discussion-on-domain-driven-design-entities">Entity</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Entity {

}
