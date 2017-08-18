package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a condition to be satisfied in the domain
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Specification {
}