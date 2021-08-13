/**
 */
package com.tum.vsms.Payment.Payment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.Bank#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Bank#getIBAN <em>IBAN</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Bank#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getBank()
 * @model
 * @generated
 */
public interface Bank extends Payment {
	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Number</em>' attribute.
	 * @see #setAccountNumber(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getBank_AccountNumber()
	 * @model
	 * @generated
	 */
	String getAccountNumber();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Bank#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #getAccountNumber()
	 * @generated
	 */
	void setAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>IBAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBAN</em>' attribute.
	 * @see #setIBAN(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getBank_IBAN()
	 * @model
	 * @generated
	 */
	String getIBAN();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Bank#getIBAN <em>IBAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBAN</em>' attribute.
	 * @see #getIBAN()
	 * @generated
	 */
	void setIBAN(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getBank_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Bank#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void authorization();

} // Bank
