/**
 */
package com.tum.vsms.Parking.Parking.impl;

import com.tum.vsms.Parking.Parking.FuelingStation;
import com.tum.vsms.Parking.Parking.ParkingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fueling Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.FuelingStationImpl#getFuelEnabled <em>Fuel Enabled</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.FuelingStationImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.FuelingStationImpl#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuelingStationImpl extends ParkingImpl implements FuelingStation {
	/**
	 * The default value of the '{@link #getFuelEnabled() <em>Fuel Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String FUEL_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuelEnabled() <em>Fuel Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelEnabled()
	 * @generated
	 * @ordered
	 */
	protected String fuelEnabled = FUEL_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected String capacity = CAPACITY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuelingStationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParkingPackage.Literals.FUELING_STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFuelEnabled() {
		return fuelEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuelEnabled(String newFuelEnabled) {
		String oldFuelEnabled = fuelEnabled;
		fuelEnabled = newFuelEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.FUELING_STATION__FUEL_ENABLED, oldFuelEnabled, fuelEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(String newCapacity) {
		String oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.FUELING_STATION__CAPACITY, oldCapacity, capacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.FUELING_STATION__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParkingPackage.FUELING_STATION__FUEL_ENABLED:
				return getFuelEnabled();
			case ParkingPackage.FUELING_STATION__CAPACITY:
				return getCapacity();
			case ParkingPackage.FUELING_STATION__RATE:
				return getRate();
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
			case ParkingPackage.FUELING_STATION__FUEL_ENABLED:
				setFuelEnabled((String)newValue);
				return;
			case ParkingPackage.FUELING_STATION__CAPACITY:
				setCapacity((String)newValue);
				return;
			case ParkingPackage.FUELING_STATION__RATE:
				setRate((Double)newValue);
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
			case ParkingPackage.FUELING_STATION__FUEL_ENABLED:
				setFuelEnabled(FUEL_ENABLED_EDEFAULT);
				return;
			case ParkingPackage.FUELING_STATION__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case ParkingPackage.FUELING_STATION__RATE:
				setRate(RATE_EDEFAULT);
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
			case ParkingPackage.FUELING_STATION__FUEL_ENABLED:
				return FUEL_ENABLED_EDEFAULT == null ? fuelEnabled != null : !FUEL_ENABLED_EDEFAULT.equals(fuelEnabled);
			case ParkingPackage.FUELING_STATION__CAPACITY:
				return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
			case ParkingPackage.FUELING_STATION__RATE:
				return rate != RATE_EDEFAULT;
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
		result.append(" (fuelEnabled: ");
		result.append(fuelEnabled);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", rate: ");
		result.append(rate);
		result.append(')');
		return result.toString();
	}

} //FuelingStationImpl
