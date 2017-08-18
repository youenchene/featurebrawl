package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * An object is used to represent and encapsulate all the information needed to call a method at a later time
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Command_pattern">Command</a>
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Command {
}