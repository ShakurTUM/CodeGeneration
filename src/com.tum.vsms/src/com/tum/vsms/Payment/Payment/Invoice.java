/**
 */
package com.tum.vsms.Payment.Payment;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.Invoice#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Invoice#getCustomer_name <em>Customer name</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Invoice#getCustomer_address <em>Customer address</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Invoice#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Invoice#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Invoice#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.Invoice#getTotalCost <em>Total Cost</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getInvoice()
 * @model
 * @generated
 */
public interface Invoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getInvoice_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Invoice#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Customer name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer name</em>' attribute.
	 * @see #setCustomer_name(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getInvoice_Customer_name()
	 * @model
	 * @generated
	 */
	String getCustomer_name();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Invoice#getCustomer_name <em>Customer name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer name</em>' attribute.
	 * @see #getCustomer_name()
	 * @generated
	 */
	void setCustomer_name(String value);

	/**
	 * Returns the value of the '<em><b>Customer address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer address</em>' attribute.
	 * @see #setCustomer_address(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getInvoice_Customer_address()
	 * @model
	 * @generated
	 */
	String getCustomer_address();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Invoice#getCustomer_address <em>Customer address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer address</em>' attribute.
	 * @see #getCustomer_address()
	 * @generated
	 */
	void setCustomer_address(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getInvoice_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Invoice#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getInvoice_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Invoice#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getInvoice_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Invoice#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cost</em>' attribute.
	 * @see #setTotalCost(double)
	 * @see com.tum.vsms.Payment.Payment.PaymentPackage#getInvoice_TotalCost()
	 * @model
	 * @generated
	 */
	double getTotalCost();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Payment.Payment.Invoice#getTotalCost <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' attribute.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(double value);

} // Invoice
