/**
 */
package com.tum.vsms.model.Vehicle.impl;

import com.tum.vsms.model.Vehicle.FuelType;
import com.tum.vsms.model.Vehicle.Traditional;
import com.tum.vsms.model.Vehicle.VehiclePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.TraditionalImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.TraditionalImpl#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.TraditionalImpl#getCurrentFuelLevel <em>Current Fuel Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraditionalImpl extends VehicleImpl implements Traditional {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected float capacity = CAPACITY_EDEFAULT;

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
	 * The default value of the '{@link #getCurrentFuelLevel() <em>Current Fuel Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFuelLevel()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_FUEL_LEVEL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentFuelLevel() <em>Current Fuel Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFuelLevel()
	 * @generated
	 * @ordered
	 */
	protected float currentFuelLevel = CURRENT_FUEL_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclePackage.Literals.TRADITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(float newCapacity) {
		float oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.TRADITIONAL__CAPACITY, oldCapacity, capacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.TRADITIONAL__FUEL_TYPE, oldFuelType, fuelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentFuelLevel() {
		return currentFuelLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentFuelLevel(float newCurrentFuelLevel) {
		float oldCurrentFuelLevel = currentFuelLevel;
		currentFuelLevel = newCurrentFuelLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.TRADITIONAL__CURRENT_FUEL_LEVEL, oldCurrentFuelLevel, currentFuelLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VehiclePackage.TRADITIONAL__CAPACITY:
				return getCapacity();
			case VehiclePackage.TRADITIONAL__FUEL_TYPE:
				return getFuelType();
			case VehiclePackage.TRADITIONAL__CURRENT_FUEL_LEVEL:
				return getCurrentFuelLevel();
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
			case VehiclePackage.TRADITIONAL__CAPACITY:
				setCapacity((Float)newValue);
				return;
			case VehiclePackage.TRADITIONAL__FUEL_TYPE:
				setFuelType((FuelType)newValue);
				return;
			case VehiclePackage.TRADITIONAL__CURRENT_FUEL_LEVEL:
				setCurrentFuelLevel((Float)newValue);
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
			case VehiclePackage.TRADITIONAL__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case VehiclePackage.TRADITIONAL__FUEL_TYPE:
				setFuelType(FUEL_TYPE_EDEFAULT);
				return;
			case VehiclePackage.TRADITIONAL__CURRENT_FUEL_LEVEL:
				setCurrentFuelLevel(CURRENT_FUEL_LEVEL_EDEFAULT);
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
			case VehiclePackage.TRADITIONAL__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case VehiclePackage.TRADITIONAL__FUEL_TYPE:
				return fuelType != FUEL_TYPE_EDEFAULT;
			case VehiclePackage.TRADITIONAL__CURRENT_FUEL_LEVEL:
				return currentFuelLevel != CURRENT_FUEL_LEVEL_EDEFAULT;
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", fuelType: ");
		result.append(fuelType);
		result.append(", currentFuelLevel: ");
		result.append(currentFuelLevel);
		result.append(')');
		return result.toString();
	}

} //TraditionalImpl
