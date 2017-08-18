package com.patternity.annotation.properties;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Declares that the argument can be null
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Nullable {
}