/**
 *
 * $Id$
 */
package com.tum.vsms.Payment.Payment.validation;

import com.tum.vsms.Payment.Payment.Customer;
import com.tum.vsms.Payment.Payment.PaymentStatus;


/**
 * A sample validator interface for {@link com.tum.vsms.Payment.Payment.Payment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PaymentValidator {
	boolean validate();

	boolean validateId(String value);

	boolean validateReservationId(String value);

	boolean validateAmount(double value);

	boolean validatePayment_date(String value);

	boolean validateDescription(String value);

	boolean validateCustomer(Customer value);

	boolean validateStatus(PaymentStatus value);
}
