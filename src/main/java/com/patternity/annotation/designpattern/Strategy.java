package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents an algorithms that can be selected at runtime
 * 
 * @see <a href="http://en.wikipedia.org/wiki/Strategy_pattern">Strategy</a>
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Strategy {
}