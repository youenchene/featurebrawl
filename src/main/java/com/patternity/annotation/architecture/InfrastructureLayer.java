/**
 *
 */
package com.patternity.annotation.architecture;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks this package as the root of the infrastructure layer.
 *
 * This layer typically provides implementations of technical concerns such as
 * persistence, transactions, and other aspects.
 *
 * Following the {@link HexagonalArchitecture}, infrastructure elements can depend on everything they need to adapt
 * ports
 * to/from external clients, UI, service providers etc.
 *
 * @author Cyrille.Martraire
 */
@Retention(RetentionPolicy.CLASS)
@Documented
@Target(ElementType.PACKAGE)
public @interface InfrastructureLayer {

}
