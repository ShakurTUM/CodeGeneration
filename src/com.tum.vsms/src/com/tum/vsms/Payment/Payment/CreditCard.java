/**
 */
package com.tum.vsms.Payment.Payment;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.CreditCard#getCardholderName <em>Cardholder Name</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.CreditCard#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.CreditCard#getCvv <em>Cvv</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.CreditCard#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getCreditCard()
 * @model
 * @generated
 */
public interface CreditCard extends Payment {
	/**
	 * Returns the value of the '<em><b>Cardholder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardholder Name</em>' attribute.
	 * @see #setCardholderName(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getCreditCard_CardholderName()
	 * @model
	 * @generated
	 */
	String getCardholderName();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.CreditCard#getCardholderName <em>Cardholder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardholder Name</em>' attribute.
	 * @see #getCardholderName()
	 * @generated
	 */
	void setCardholderName(String value);

	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getCreditCard_CardNumber()
	 * @model
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.CreditCard#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(String value);

	/**
	 * Returns the value of the '<em><b>Cvv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvv</em>' attribute.
	 * @see #setCvv(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getCreditCard_Cvv()
	 * @model
	 * @generated
	 */
	String getCvv();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.CreditCard#getCvv <em>Cvv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvv</em>' attribute.
	 * @see #getCvv()
	 * @generated
	 */
	void setCvv(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getCreditCard_ExpirationDate()
	 * @model
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.CreditCard#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void authorization();

} // CreditCard
