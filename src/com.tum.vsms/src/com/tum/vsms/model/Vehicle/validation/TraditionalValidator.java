/**
 *
 * $Id$
 */
package com.tum.vsms.model.Vehicle.validation;

import com.tum.vsms.model.Vehicle.FuelType;

/**
 * A sample validator interface for {@link com.tum.vsms.model.Vehicle.Traditional}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TraditionalValidator {
	boolean validate();

	boolean validateCapacity(float value);
	boolean validateFuelType(FuelType value);
	boolean validateCurrentFuelLevel(float value);
}
