/**
 */
package com.tum.vsms.Payment.Payment;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Promo Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.PromoCode#getCode <em>Code</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.PromoCode#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPromoCode()
 * @model
 * @generated
 */
public interface PromoCode extends Payment {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPromoCode_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.PromoCode#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPromoCode_ExpirationDate()
	 * @model
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.PromoCode#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

} // PromoCode
