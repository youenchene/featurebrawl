package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a policy of the domain
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Policy {

	String[] section() default {};
}