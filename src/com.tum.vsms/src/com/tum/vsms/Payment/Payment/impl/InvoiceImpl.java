/**
 */
package com.tum.vsms.Payment.Payment.impl;

import com.tum.vsms.Payment.Payment.Invoice;
import com.tum.vsms.Payment.Payment.PaymentPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl#getCustomer_name <em>Customer name</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl#getCustomer_address <em>Customer address</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl#getTotalCost <em>Total Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceImpl extends MinimalEObjectImpl.Container implements Invoice {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomer_name() <em>Customer name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomer_name() <em>Customer name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer_name()
	 * @generated
	 * @ordered
	 */
	protected String customer_name = CUSTOMER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomer_address() <em>Customer address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer_address()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomer_address() <em>Customer address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer_address()
	 * @generated
	 * @ordered
	 */
	protected String customer_address = CUSTOMER_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected double totalCost = TOTAL_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.INVOICE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomer_name() {
		return customer_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer_name(String newCustomer_name) {
		String oldCustomer_name = customer_name;
		customer_name = newCustomer_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.INVOICE__CUSTOMER_NAME, oldCustomer_name, customer_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomer_address() {
		return customer_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer_address(String newCustomer_address) {
		String oldCustomer_address = customer_address;
		customer_address = newCustomer_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.INVOICE__CUSTOMER_ADDRESS, oldCustomer_address, customer_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.INVOICE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.INVOICE__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.INVOICE__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(double newTotalCost) {
		double oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.INVOICE__TOTAL_COST, oldTotalCost, totalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.INVOICE__ID:
				return getId();
			case PaymentPackage.INVOICE__CUSTOMER_NAME:
				return getCustomer_name();
			case PaymentPackage.INVOICE__CUSTOMER_ADDRESS:
				return getCustomer_address();
			case PaymentPackage.INVOICE__DURATION:
				return getDuration();
			case PaymentPackage.INVOICE__START_DATE:
				return getStartDate();
			case PaymentPackage.INVOICE__END_DATE:
				return getEndDate();
			case PaymentPackage.INVOICE__TOTAL_COST:
				return getTotalCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PaymentPackage.INVOICE__ID:
				setId((String)newValue);
				return;
			case PaymentPackage.INVOICE__CUSTOMER_NAME:
				setCustomer_name((String)newValue);
				return;
			case PaymentPackage.INVOICE__CUSTOMER_ADDRESS:
				setCustomer_address((String)newValue);
				return;
			case PaymentPackage.INVOICE__DURATION:
				setDuration((String)newValue);
				return;
			case PaymentPackage.INVOICE__START_DATE:
				setStartDate((Date)newValue);
				return;
			case PaymentPackage.INVOICE__END_DATE:
				setEndDate((Date)newValue);
				return;
			case PaymentPackage.INVOICE__TOTAL_COST:
				setTotalCost((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PaymentPackage.INVOICE__ID:
				setId(ID_EDEFAULT);
				return;
			case PaymentPackage.INVOICE__CUSTOMER_NAME:
				setCustomer_name(CUSTOMER_NAME_EDEFAULT);
				return;
			case PaymentPackage.INVOICE__CUSTOMER_ADDRESS:
				setCustomer_address(CUSTOMER_ADDRESS_EDEFAULT);
				return;
			case PaymentPackage.INVOICE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case PaymentPackage.INVOICE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case PaymentPackage.INVOICE__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case PaymentPackage.INVOICE__TOTAL_COST:
				setTotalCost(TOTAL_COST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PaymentPackage.INVOICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PaymentPackage.INVOICE__CUSTOMER_NAME:
				return CUSTOMER_NAME_EDEFAULT == null ? customer_name != null : !CUSTOMER_NAME_EDEFAULT.equals(customer_name);
			case PaymentPackage.INVOICE__CUSTOMER_ADDRESS:
				return CUSTOMER_ADDRESS_EDEFAULT == null ? customer_address != null : !CUSTOMER_ADDRESS_EDEFAULT.equals(customer_address);
			case PaymentPackage.INVOICE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case PaymentPackage.INVOICE__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case PaymentPackage.INVOICE__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case PaymentPackage.INVOICE__TOTAL_COST:
				return totalCost != TOTAL_COST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", customer_name: ");
		result.append(customer_name);
		result.append(", customer_address: ");
		result.append(customer_address);
		result.append(", duration: ");
		result.append(duration);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", totalCost: ");
		result.append(totalCost);
		result.append(')');
		return result.toString();
	}

} //InvoiceImpl
