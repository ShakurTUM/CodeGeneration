/**
 */
package com.tum.vsms.Payment.Payment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paypal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.Paypal#getEmail <em>Email</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Paypal#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPaypal()
 * @model
 * @generated
 */
public interface Paypal extends Payment {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPaypal_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Paypal#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPaypal_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Paypal#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // Paypal
