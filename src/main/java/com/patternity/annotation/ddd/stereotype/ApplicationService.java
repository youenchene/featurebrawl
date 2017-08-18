/**
 *
 */
package com.patternity.annotation.ddd.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Represents an application service, a service that takes care of
 * application-specific logic, typically by delegating to domain services. An
 * application service is typically stateless and must not contain any business
 * logic.
 * 
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Inherited
@Documented
public @interface ApplicationService {

}
