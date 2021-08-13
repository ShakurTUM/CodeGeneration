/**
 *
 * $Id$
 */
package com.tum.vsms.Reservation.Reservation.validation;

import com.tum.vsms.Reservation.Reservation.AddonType;

/**
 * A sample validator interface for {@link com.tum.vsms.Reservation.Reservation.Addon}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AddonValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateLocationId(String value);
	boolean validateName(String value);
	boolean validateAddonType(AddonType value);
	boolean validateCount(int value);
	boolean validatePrice(int value);
	boolean validateRate(double value);
}