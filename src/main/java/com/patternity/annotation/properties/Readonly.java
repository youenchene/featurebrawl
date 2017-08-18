package com.patternity.annotation.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks the method(s) as being read-only, which also implies no side effect
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Readonly {
}