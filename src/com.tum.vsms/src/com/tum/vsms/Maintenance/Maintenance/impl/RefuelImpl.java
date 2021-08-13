/**
 */
package com.tum.vsms.Maintenance.Maintenance.impl;

import com.tum.vsms.Maintenance.Maintenance.FuelType;
import com.tum.vsms.Maintenance.Maintenance.MaintenancePackage;
import com.tum.vsms.Maintenance.Maintenance.Refuel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RefuelImpl#getCurrentFuel <em>Current Fuel</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RefuelImpl#getRequiredFuel <em>Required Fuel</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RefuelImpl#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RefuelImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefuelImpl extends MaintenanceImpl implements Refuel {
	/**
	 * The default value of the '{@link #getCurrentFuel() <em>Current Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFuel()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_FUEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentFuel() <em>Current Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFuel()
	 * @generated
	 * @ordered
	 */
	protected float currentFuel = CURRENT_FUEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredFuel() <em>Required Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFuel()
	 * @generated
	 * @ordered
	 */
	protected static final float REQUIRED_FUEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRequiredFuel() <em>Required Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFuel()
	 * @generated
	 * @ordered
	 */
	protected float requiredFuel = REQUIRED_FUEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelType()
	 * @generated
	 * @ordered
	 */
	protected static final FuelType FUEL_TYPE_EDEFAULT = FuelType.PETROL;

	/**
	 * The cached value of the '{@link #getFuelType() <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelType()
	 * @generated
	 * @ordered
	 */
	protected FuelType fuelType = FUEL_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.REFUEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentFuel() {
		return currentFuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentFuel(float newCurrentFuel) {
		float oldCurrentFuel = currentFuel;
		currentFuel = newCurrentFuel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REFUEL__CURRENT_FUEL, oldCurrentFuel, currentFuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRequiredFuel() {
		return requiredFuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredFuel(float newRequiredFuel) {
		float oldRequiredFuel = requiredFuel;
		requiredFuel = newRequiredFuel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REFUEL__REQUIRED_FUEL, oldRequiredFuel, requiredFuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuelType getFuelType() {
		return fuelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelType(FuelType newFuelType) {
		FuelType oldFuelType = fuelType;
		fuelType = newFuelType == null ? FUEL_TYPE_EDEFAULT : newFuelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REFUEL__FUEL_TYPE, oldFuelType, fuelType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REFUEL__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.REFUEL__CURRENT_FUEL:
				return getCurrentFuel();
			case MaintenancePackage.REFUEL__REQUIRED_FUEL:
				return getRequiredFuel();
			case MaintenancePackage.REFUEL__FUEL_TYPE:
				return getFuelType();
			case MaintenancePackage.REFUEL__AMOUNT:
				return getAmount();
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
			case MaintenancePackage.REFUEL__CURRENT_FUEL:
				setCurrentFuel((Float)newValue);
				return;
			case MaintenancePackage.REFUEL__REQUIRED_FUEL:
				setRequiredFuel((Float)newValue);
				return;
			case MaintenancePackage.REFUEL__FUEL_TYPE:
				setFuelType((FuelType)newValue);
				return;
			case MaintenancePackage.REFUEL__AMOUNT:
				setAmount((Double)newValue);
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
			case MaintenancePackage.REFUEL__CURRENT_FUEL:
				setCurrentFuel(CURRENT_FUEL_EDEFAULT);
				return;
			case MaintenancePackage.REFUEL__REQUIRED_FUEL:
				setRequiredFuel(REQUIRED_FUEL_EDEFAULT);
				return;
			case MaintenancePackage.REFUEL__FUEL_TYPE:
				setFuelType(FUEL_TYPE_EDEFAULT);
				return;
			case MaintenancePackage.REFUEL__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
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
			case MaintenancePackage.REFUEL__CURRENT_FUEL:
				return currentFuel != CURRENT_FUEL_EDEFAULT;
			case MaintenancePackage.REFUEL__REQUIRED_FUEL:
				return requiredFuel != REQUIRED_FUEL_EDEFAULT;
			case MaintenancePackage.REFUEL__FUEL_TYPE:
				return fuelType != FUEL_TYPE_EDEFAULT;
			case MaintenancePackage.REFUEL__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
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
		result.append(" (currentFuel: ");
		result.append(currentFuel);
		result.append(", requiredFuel: ");
		result.append(requiredFuel);
		result.append(", fuelType: ");
		result.append(fuelType);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //RefuelImpl
