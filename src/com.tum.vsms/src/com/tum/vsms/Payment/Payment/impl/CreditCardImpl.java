/**
 */
package com.tum.vsms.Payment.Payment.impl;

import com.tum.vsms.Payment.Payment.CreditCard;
import com.tum.vsms.Payment.Payment.PaymentPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.CreditCardImpl#getCardholderName <em>Cardholder Name</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.CreditCardImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.CreditCardImpl#getCvv <em>Cvv</em>}</li>
 *   <li>{@link com.tum.vsms.Payment.Payment.impl.CreditCardImpl#getExpirationDate <em>Expiration Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreditCardImpl extends PaymentImpl implements CreditCard {
	/**
	 * The default value of the '{@link #getCardholderName() <em>Cardholder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardholderName()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDHOLDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardholderName() <em>Cardholder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardholderName()
	 * @generated
	 * @ordered
	 */
	protected String cardholderName = CARDHOLDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected String cardNumber = CARD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCvv() <em>Cvv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvv()
	 * @generated
	 * @ordered
	 */
	protected static final String CVV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCvv() <em>Cvv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvv()
	 * @generated
	 * @ordered
	 */
	protected String cvv = CVV_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.CREDIT_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardholderName() {
		return cardholderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardholderName(String newCardholderName) {
		String oldCardholderName = cardholderName;
		cardholderName = newCardholderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__CARDHOLDER_NAME, oldCardholderName, cardholderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardNumber(String newCardNumber) {
		String oldCardNumber = cardNumber;
		cardNumber = newCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__CARD_NUMBER, oldCardNumber, cardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCvv() {
		return cvv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCvv(String newCvv) {
		String oldCvv = cvv;
		cvv = newCvv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__CVV, oldCvv, cvv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(Date newExpirationDate) {
		Date oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void authorization() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.CREDIT_CARD__CARDHOLDER_NAME:
				return getCardholderName();
			case PaymentPackage.CREDIT_CARD__CARD_NUMBER:
				return getCardNumber();
			case PaymentPackage.CREDIT_CARD__CVV:
				return getCvv();
			case PaymentPackage.CREDIT_CARD__EXPIRATION_DATE:
				return getExpirationDate();
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
			case PaymentPackage.CREDIT_CARD__CARDHOLDER_NAME:
				setCardholderName((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__CARD_NUMBER:
				setCardNumber((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__CVV:
				setCvv((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__EXPIRATION_DATE:
				setExpirationDate((Date)newValue);
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
			case PaymentPackage.CREDIT_CARD__CARDHOLDER_NAME:
				setCardholderName(CARDHOLDER_NAME_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__CARD_NUMBER:
				setCardNumber(CARD_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__CVV:
				setCvv(CVV_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
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
			case PaymentPackage.CREDIT_CARD__CARDHOLDER_NAME:
				return CARDHOLDER_NAME_EDEFAULT == null ? cardholderName != null : !CARDHOLDER_NAME_EDEFAULT.equals(cardholderName);
			case PaymentPackage.CREDIT_CARD__CARD_NUMBER:
				return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
			case PaymentPackage.CREDIT_CARD__CVV:
				return CVV_EDEFAULT == null ? cvv != null : !CVV_EDEFAULT.equals(cvv);
			case PaymentPackage.CREDIT_CARD__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PaymentPackage.CREDIT_CARD___AUTHORIZATION:
				authorization();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (cardholderName: ");
		result.append(cardholderName);
		result.append(", cardNumber: ");
		result.append(cardNumber);
		result.append(", cvv: ");
		result.append(cvv);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(')');
		return result.toString();
	}

} //CreditCardImpl
