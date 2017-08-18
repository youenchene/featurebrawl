package com.patternity.annotation.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * An object that never changes once built. This enables to share it freely
 * between any processes, threads, and even untrusted code as it can never be
 * changed.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Immutable_object">Immutable</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface Immutable {

}
