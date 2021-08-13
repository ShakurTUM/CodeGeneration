/**
 */
package com.tum.vsms.Maintenance.Maintenance.impl;

import com.tum.vsms.Maintenance.Maintenance.MaintenancePackage;
import com.tum.vsms.Maintenance.Maintenance.Recharge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recharge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RechargeImpl#getRequiredCharge <em>Required Charge</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RechargeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RechargeImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RechargeImpl#getCurrentCharge <em>Current Charge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RechargeImpl extends MaintenanceImpl implements Recharge {
	/**
	 * The default value of the '{@link #getRequiredCharge() <em>Required Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCharge()
	 * @generated
	 * @ordered
	 */
	protected static final float REQUIRED_CHARGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRequiredCharge() <em>Required Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCharge()
	 * @generated
	 * @ordered
	 */
	protected float requiredCharge = REQUIRED_CHARGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected double rate = RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentCharge() <em>Current Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCharge()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_CHARGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentCharge() <em>Current Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCharge()
	 * @generated
	 * @ordered
	 */
	protected float currentCharge = CURRENT_CHARGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RechargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.RECHARGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRequiredCharge() {
		return requiredCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCharge(float newRequiredCharge) {
		float oldRequiredCharge = requiredCharge;
		requiredCharge = newRequiredCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.RECHARGE__REQUIRED_CHARGE, oldRequiredCharge, requiredCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.RECHARGE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(double newRate) {
		double oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.RECHARGE__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentCharge() {
		return currentCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCharge(float newCurrentCharge) {
		float oldCurrentCharge = currentCharge;
		currentCharge = newCurrentCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.RECHARGE__CURRENT_CHARGE, oldCurrentCharge, currentCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.RECHARGE__REQUIRED_CHARGE:
				return getRequiredCharge();
			case MaintenancePackage.RECHARGE__AMOUNT:
				return getAmount();
			case MaintenancePackage.RECHARGE__RATE:
				return getRate();
			case MaintenancePackage.RECHARGE__CURRENT_CHARGE:
				return getCurrentCharge();
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
			case MaintenancePackage.RECHARGE__REQUIRED_CHARGE:
				setRequiredCharge((Float)newValue);
				return;
			case MaintenancePackage.RECHARGE__AMOUNT:
				setAmount((Double)newValue);
				return;
			case MaintenancePackage.RECHARGE__RATE:
				setRate((Double)newValue);
				return;
			case MaintenancePackage.RECHARGE__CURRENT_CHARGE:
				setCurrentCharge((Float)newValue);
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
			case MaintenancePackage.RECHARGE__REQUIRED_CHARGE:
				setRequiredCharge(REQUIRED_CHARGE_EDEFAULT);
				return;
			case MaintenancePackage.RECHARGE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case MaintenancePackage.RECHARGE__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case MaintenancePackage.RECHARGE__CURRENT_CHARGE:
				setCurrentCharge(CURRENT_CHARGE_EDEFAULT);
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
			case MaintenancePackage.RECHARGE__REQUIRED_CHARGE:
				return requiredCharge != REQUIRED_CHARGE_EDEFAULT;
			case MaintenancePackage.RECHARGE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case MaintenancePackage.RECHARGE__RATE:
				return rate != RATE_EDEFAULT;
			case MaintenancePackage.RECHARGE__CURRENT_CHARGE:
				return currentCharge != CURRENT_CHARGE_EDEFAULT;
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
		result.append(" (requiredCharge: ");
		result.append(requiredCharge);
		result.append(", amount: ");
		result.append(amount);
		result.append(", rate: ");
		result.append(rate);
		result.append(", currentCharge: ");
		result.append(currentCharge);
		result.append(')');
		return result.toString();
	}

} //RechargeImpl
