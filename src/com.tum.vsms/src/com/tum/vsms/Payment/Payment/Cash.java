/**
 */
package com.tum.vsms.Payment.Payment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cash</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.Cash#getAddress <em>Address</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Cash#getCustomerName <em>Customer Name</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getCash()
 * @model
 * @generated
 */
public interface Cash extends Payment {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getCash_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Cash#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Name</em>' attribute.
	 * @see #setCustomerName(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getCash_CustomerName()
	 * @model
	 * @generated
	 */
	String getCustomerName();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Cash#getCustomerName <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Name</em>' attribute.
	 * @see #getCustomerName()
	 * @generated
	 */
	void setCustomerName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void authorization();

} // Cash
