/**
 */
package com.tum.vsms.Parking.Parking.impl;

import com.tum.vsms.Parking.Parking.ChargingStation;
import com.tum.vsms.Parking.Parking.ParkingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charging Station</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ChargingStationImpl#getChargingEnabled <em>Charging Enabled</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ChargingStationImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ChargingStationImpl#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargingStationImpl extends ParkingImpl implements ChargingStation {
	/**
	 * The default value of the '{@link #getChargingEnabled() <em>Charging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARGING_ENABLED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChargingEnabled() <em>Charging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingEnabled()
	 * @generated
	 * @ordered
	 */
	protected int chargingEnabled = CHARGING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected double capacity = CAPACITY_EDEFAULT;

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
	protected ChargingStationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParkingPackage.Literals.CHARGING_STATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChargingEnabled() {
		return chargingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargingEnabled(int newChargingEnabled) {
		int oldChargingEnabled = chargingEnabled;
		chargingEnabled = newChargingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.CHARGING_STATION__CHARGING_ENABLED, oldChargingEnabled, chargingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(double newCapacity) {
		double oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.CHARGING_STATION__CAPACITY, oldCapacity, capacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.CHARGING_STATION__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParkingPackage.CHARGING_STATION__CHARGING_ENABLED:
				return getChargingEnabled();
			case ParkingPackage.CHARGING_STATION__CAPACITY:
				return getCapacity();
			case ParkingPackage.CHARGING_STATION__RATE:
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
			case ParkingPackage.CHARGING_STATION__CHARGING_ENABLED:
				setChargingEnabled((Integer)newValue);
				return;
			case ParkingPackage.CHARGING_STATION__CAPACITY:
				setCapacity((Double)newValue);
				return;
			case ParkingPackage.CHARGING_STATION__RATE:
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
			case ParkingPackage.CHARGING_STATION__CHARGING_ENABLED:
				setChargingEnabled(CHARGING_ENABLED_EDEFAULT);
				return;
			case ParkingPackage.CHARGING_STATION__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case ParkingPackage.CHARGING_STATION__RATE:
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
			case ParkingPackage.CHARGING_STATION__CHARGING_ENABLED:
				return chargingEnabled != CHARGING_ENABLED_EDEFAULT;
			case ParkingPackage.CHARGING_STATION__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case ParkingPackage.CHARGING_STATION__RATE:
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
		result.append(" (chargingEnabled: ");
		result.append(chargingEnabled);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", rate: ");
		result.append(rate);
		result.append(')');
		return result.toString();
	}

} //ChargingStationImpl
