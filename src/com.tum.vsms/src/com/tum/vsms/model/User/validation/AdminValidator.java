/**
 *
 * $Id$
 */
package com.tum.vsms.model.User.validation;

import com.tum.vsms.model.User.Role;

/**
 * A sample validator interface for {@link com.tum.vsms.model.User.Admin}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AdminValidator {
	boolean validate();

	boolean validateRole(Role value);
}