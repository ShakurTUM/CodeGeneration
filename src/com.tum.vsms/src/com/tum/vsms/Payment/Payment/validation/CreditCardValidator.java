/**
 *
 * $Id$
 */
package com.tum.vsms.Payment.Payment.validation;

import java.util.Date;

/**
 * A sample validator interface for {@link com.tum.vsms.Payment.Payment.CreditCard}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CreditCardValidator {
	boolean validate();

	boolean validateCardholderName(String value);
	boolean validateCardNumber(String value);
	boolean validateCvv(String value);
	boolean validateExpirationDate(Date value);
}
