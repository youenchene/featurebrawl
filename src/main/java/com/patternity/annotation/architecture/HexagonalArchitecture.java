/**
 *
 */
package com.patternity.annotation.architecture;

import com.patternity.annotation.smell.Draft;

/**
 * Indicates the decision to follow the Hexagonal Architecture in every
 * sub-package
 * 
 * This architecture style revolves around a core {@link @DomainLayer}, a small
 * {@link ApplicationLayer} for the application-specific behaviours, adapters on
 * each port to adapt to and from the {@link InfrastructureLayer}.
 * 
 * @see <a href="http://alistair.cockburn.us/Hexagonal+architecture">Ports and
 *      Adapters by Alistair</a>
 * @see <a href="http://pragprog.com/magazines/2009-12/going-naked">Hexagonal
 *      Architecture on Pragmatic Programmers</a>
 * @see <a href="http://incubator.apache.org/isis/">Hexagonal Architecture with
 *      Apache Isis</a>
 * @author Cyrille.Martraire
 */
@Draft("Not clear how to name the surrounding layers... API/SPI?")
public @interface HexagonalArchitecture {

}
