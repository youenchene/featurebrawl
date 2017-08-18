package com.patternity.annotation.smell;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks this code as NOT following the The Law of Demeter (LoD) or Principle of
 * Least Knowledge, aka "Don't talk to strangers".
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Law_of_Demeter">Law of Demeter
 *      (Wikipedia)</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface LawOfDemeterViolation {

	String value() default "";
}
