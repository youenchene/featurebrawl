package com.patternity.annotation.testing;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A class responsible for the setup of everything required for a test
 * 
 * @see <a href="http://www.c2.com/cgi/wiki?ObjectMother">ObjectMother</a>
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface ObjectMother {
}