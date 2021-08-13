/**
 */
package com.tum.vsms.model.User;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.User.Admin#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.model.User.UserPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends User {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link com.tum.vsms.model.User.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see com.tum.vsms.model.User.Role
	 * @see #setRole(Role)
	 * @see com.tum.vsms.model.User.UserPackage#getAdmin_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.User.Admin#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see com.tum.vsms.model.User.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void adminOperation();

} // Admin
