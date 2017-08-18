package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A class that combines one continuity and several versions. Each version captures the state of the object for some period of time$ while the continuity represents the on going object that goes through these changes in version
 * 
 * @see <a href="http://martinfowler.com/ap2/temporalObject.html ">TemporalObject</a>
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface TemporalObject {
}