package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks the class as a mixin of several classes or interfaces, regardless of
 * how it's done.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Mixin">Mixin (Wikipedia</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface Mixin {
}
