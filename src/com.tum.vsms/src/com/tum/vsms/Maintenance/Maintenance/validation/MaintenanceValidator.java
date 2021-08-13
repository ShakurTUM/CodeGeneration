/**
 *
 * $Id$
 */
package com.tum.vsms.Maintenance.Maintenance.validation;

import com.tum.vsms.Maintenance.Maintenance.Location;
import com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus;

import java.util.Date;

/**
 * A sample validator interface for {@link com.tum.vsms.Maintenance.Maintenance.Maintenance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MaintenanceValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateReservationId(String value);
	boolean validateCustomerId(String value);
	boolean validateStatus(MaintenanceStatus value);
	boolean validateCost(float value);
	boolean validateStart_date(Date value);
	boolean validateEnd_date(Date value);
	boolean validateRequiredManpower(int value);
	boolean validateRequiredTime(float value);
	boolean validateVehicle(vehicle value);
	boolean validateLocation(Location value);
}
