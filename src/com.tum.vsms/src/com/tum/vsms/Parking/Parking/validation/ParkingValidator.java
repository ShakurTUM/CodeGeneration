/**
 *
 * $Id$
 */
package com.tum.vsms.Parking.Parking.validation;

import com.tum.vsms.Parking.Parking.Customer;
import com.tum.vsms.Parking.Parking.Location;
import com.tum.vsms.Parking.Parking.Vehicle;


/**
 * A sample validator interface for {@link com.tum.vsms.Parking.Parking.Parking}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParkingValidator {
	boolean validate();

	boolean validateId(String value);

	boolean validateLocation(Location value);

	boolean validateCustomer(Customer value);

	boolean validateVehicle(Vehicle value);

	boolean validateName(String value);

	boolean validateAvailableVehicles(int value);

	boolean validateMaximumCapacity(int value);
}
