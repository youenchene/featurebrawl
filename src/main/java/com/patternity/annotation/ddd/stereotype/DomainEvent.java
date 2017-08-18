package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Captures the memory of something interesting which affects the domain.
 * Usually use a verb in the past tense.
 * 
 * @see <a
 *      href="http://martinfowler.com/eaaDev/DomainEvent.html">DomainEvent</a>
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface DomainEvent {
}