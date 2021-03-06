/**
 *
 * $Id$
 */
package com.tum.vsms.Payment.Payment.validation;


/**
 * A sample validator interface for {@link com.tum.vsms.Payment.Payment.Cash}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CashValidator {
	boolean validate();

	boolean validateAddress(String value);
	boolean validateCustomerName(String value);
}
