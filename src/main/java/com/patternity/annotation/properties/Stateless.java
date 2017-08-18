package com.patternity.annotation.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Declares that each method is stateless, i.e. it does not manage any state of
 * conversation with its client. This property is a key to higher scalability,
 * among many other good things.
 * 
 * @see <a
 *      href="http://en.wikipedia.org/wiki/Service_Statelessness_Principle">Stateless</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Stateless {

}
