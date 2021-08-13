/**
 */
package com.tum.vsms.Payment.Payment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.Payment#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Payment#getReservationId <em>Reservation Id</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Payment#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Payment#getPayment_date <em>Payment date</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Payment#getDescription <em>Description</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Payment#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Payment#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPayment_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Payment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Id</em>' attribute.
	 * @see #setReservationId(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPayment_ReservationId()
	 * @model
	 * @generated
	 */
	String getReservationId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Payment#getReservationId <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Id</em>' attribute.
	 * @see #getReservationId()
	 * @generated
	 */
	void setReservationId(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPayment_Amount()
	 * @model
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Payment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

	/**
	 * Returns the value of the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment date</em>' attribute.
	 * @see #setPayment_date(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPayment_Payment_date()
	 * @model
	 * @generated
	 */
	String getPayment_date();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Payment#getPayment_date <em>Payment date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment date</em>' attribute.
	 * @see #getPayment_date()
	 * @generated
	 */
	void setPayment_date(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPayment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Payment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPayment_Customer()
	 * @model
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Payment#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.tum.vsms.Payment.Payment.PaymentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.tum.vsms.Payment.Payment.PaymentStatus
	 * @see #setStatus(PaymentStatus)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getPayment_Status()
	 * @model
	 * @generated
	 */
	PaymentStatus getStatus();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Payment#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.tum.vsms.Payment.Payment.PaymentStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PaymentStatus value);

} // Payment
