/**
 */
package com.tum.vsms.model.User;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.User.Operative#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.model.User.UserPackage#getOperative()
 * @model
 * @generated
 */
public interface Operative extends User {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link com.tum.vsms.model.User.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see com.tum.vsms.model.User.Level
	 * @see #setPosition(Level)
	 * @see com.tum.vsms.model.User.UserPackage#getOperative_Position()
	 * @model
	 * @generated
	 */
	Level getPosition();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.User.Operative#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see com.tum.vsms.model.User.Level
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Level value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void maintenanceOperation();

} // Operative
