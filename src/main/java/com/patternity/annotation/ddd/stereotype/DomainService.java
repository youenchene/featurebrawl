/**
 * 
 */
package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents a domain service, i.e. a service that belongs to the domain and
 * the domain language. It is stateless as much as possible.
 * 
 * @see <a
 *      href="http://stochastyk.blogspot.com/2008/05/domain-services-in-domain-driven-design.html">DomainService</a>
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface DomainService {

}
