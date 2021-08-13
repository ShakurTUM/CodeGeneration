/**
 */
package com.tum.vsms.model.Vehicle.impl;

import com.tum.vsms.model.Vehicle.Electric;
import com.tum.vsms.model.Vehicle.VehiclePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.ElectricImpl#getBatteryState <em>Battery State</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.ElectricImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.ElectricImpl#getCharger <em>Charger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricImpl extends VehicleImpl implements Electric {
	/**
	 * The default value of the '{@link #getBatteryState() <em>Battery State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryState()
	 * @generated
	 * @ordered
	 */
	protected static final float BATTERY_STATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBatteryState() <em>Battery State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryState()
	 * @generated
	 * @ordered
	 */
	protected float batteryState = BATTERY_STATE_EDEFAULT;

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
	 * The default value of the '{@link #getCharger() <em>Charger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharger()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharger() <em>Charger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharger()
	 * @generated
	 * @ordered
	 */
	protected String charger = CHARGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclePackage.Literals.ELECTRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBatteryState() {
		return batteryState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatteryState(float newBatteryState) {
		float oldBatteryState = batteryState;
		batteryState = newBatteryState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.ELECTRIC__BATTERY_STATE, oldBatteryState, batteryState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.ELECTRIC__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharger() {
		return charger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharger(String newCharger) {
		String oldCharger = charger;
		charger = newCharger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.ELECTRIC__CHARGER, oldCharger, charger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VehiclePackage.ELECTRIC__BATTERY_STATE:
				return getBatteryState();
			case VehiclePackage.ELECTRIC__CAPACITY:
				return getCapacity();
			case VehiclePackage.ELECTRIC__CHARGER:
				return getCharger();
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
			case VehiclePackage.ELECTRIC__BATTERY_STATE:
				setBatteryState((Float)newValue);
				return;
			case VehiclePackage.ELECTRIC__CAPACITY:
				setCapacity((Float)newValue);
				return;
			case VehiclePackage.ELECTRIC__CHARGER:
				setCharger((String)newValue);
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
			case VehiclePackage.ELECTRIC__BATTERY_STATE:
				setBatteryState(BATTERY_STATE_EDEFAULT);
				return;
			case VehiclePackage.ELECTRIC__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case VehiclePackage.ELECTRIC__CHARGER:
				setCharger(CHARGER_EDEFAULT);
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
			case VehiclePackage.ELECTRIC__BATTERY_STATE:
				return batteryState != BATTERY_STATE_EDEFAULT;
			case VehiclePackage.ELECTRIC__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case VehiclePackage.ELECTRIC__CHARGER:
				return CHARGER_EDEFAULT == null ? charger != null : !CHARGER_EDEFAULT.equals(charger);
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
		result.append(" (batteryState: ");
		result.append(batteryState);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", charger: ");
		result.append(charger);
		result.append(')');
		return result.toString();
	}

} //ElectricImpl
