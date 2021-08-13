/**
 */
package com.tum.vsms.model.User;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.User.Customer#getDrivingLicense <em>Driving License</em>}</li>
 *   <li>{@link com.tum.vsms.model.User.Customer#getPassport <em>Passport</em>}</li>
 *   <li>{@link com.tum.vsms.model.User.Customer#getInsurance <em>Insurance</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.model.User.UserPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Driving License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driving License</em>' attribute.
	 * @see #setDrivingLicense(String)
	 * @see com.tum.vsms.model.User.UserPackage#getCustomer_DrivingLicense()
	 * @model
	 * @generated
	 */
	String getDrivingLicense();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.User.Customer#getDrivingLicense <em>Driving License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driving License</em>' attribute.
	 * @see #getDrivingLicense()
	 * @generated
	 */
	void setDrivingLicense(String value);

	/**
	 * Returns the value of the '<em><b>Passport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passport</em>' attribute.
	 * @see #setPassport(String)
	 * @see com.tum.vsms.model.User.UserPackage#getCustomer_Passport()
	 * @model
	 * @generated
	 */
	String getPassport();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.User.Customer#getPassport <em>Passport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passport</em>' attribute.
	 * @see #getPassport()
	 * @generated
	 */
	void setPassport(String value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' attribute.
	 * @see #setInsurance(String)
	 * @see com.tum.vsms.model.User.UserPackage#getCustomer_Insurance()
	 * @model
	 * @generated
	 */
	String getInsurance();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.User.Customer#getInsurance <em>Insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance</em>' attribute.
	 * @see #getInsurance()
	 * @generated
	 */
	void setInsurance(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void login();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void logout();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void register();

} // Customer
