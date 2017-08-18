package com.patternity.annotation.designpattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents the state of an object that can change at runtime, e.g. as a state machine.
 * 
 * @see <a href="http://en.wikipedia.org/wiki/State_pattern">State</a>
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface State {
}