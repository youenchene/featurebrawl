package com.patternity.annotation.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Declares that at least one method has a side-effect.
 * 
 * A function has a side-effect when it "modifies some state or has an
 * observable interaction with calling functions or the outside world. For
 * example, a function might modify a global or static variable, modify one of
 * its arguments, raise an exception, write data to a display or file, read
 * data, or call other side-effecting functions."
 * 
 * Side-effects are usually not desirable and require special care when needed
 * 
 * @see <a
 *      href="http://en.wikipedia.org/wiki/Side_effect_(computer_science)">Side-Effect
 *      (Wikipedia)</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface SideEffect {

}
