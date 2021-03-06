/**
 *
 * $Id$
 */
package com.tum.vsms.model.User.validation;


/**
 * A sample validator interface for {@link com.tum.vsms.model.User.User}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UserValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateName(String value);
	boolean validateEmail(String value);
	boolean validateAge(int value);
	boolean validateGender(String value);
	boolean validatePhone(String value);
	boolean validatePassword(String value);
}
