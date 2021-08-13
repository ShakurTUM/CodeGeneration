/**
 */
package com.tum.vsms.Reservation.Reservation.impl;

import com.tum.vsms.Reservation.Reservation.Addon;
import com.tum.vsms.Reservation.Reservation.AddonType;
import com.tum.vsms.Reservation.Reservation.ReservationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl#getLocationId <em>Location Id</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl#getAddonType <em>Addon Type</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddonImpl extends MinimalEObjectImpl.Container implements Addon {
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
	 * The default value of the '{@link #getLocationId() <em>Location Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationId() <em>Location Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationId()
	 * @generated
	 * @ordered
	 */
	protected String locationId = LOCATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddonType() <em>Addon Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddonType()
	 * @generated
	 * @ordered
	 */
	protected static final AddonType ADDON_TYPE_EDEFAULT = AddonType.EXTRA_SEAT;

	/**
	 * The cached value of the '{@link #getAddonType() <em>Addon Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddonType()
	 * @generated
	 * @ordered
	 */
	protected AddonType addonType = ADDON_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

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
	protected AddonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.ADDON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ADDON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationId() {
		return locationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationId(String newLocationId) {
		String oldLocationId = locationId;
		locationId = newLocationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ADDON__LOCATION_ID, oldLocationId, locationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ADDON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddonType getAddonType() {
		return addonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddonType(AddonType newAddonType) {
		AddonType oldAddonType = addonType;
		addonType = newAddonType == null ? ADDON_TYPE_EDEFAULT : newAddonType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ADDON__ADDON_TYPE, oldAddonType, addonType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ADDON__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ADDON__PRICE, oldPrice, price));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.ADDON__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReservationPackage.ADDON__ID:
				return getId();
			case ReservationPackage.ADDON__LOCATION_ID:
				return getLocationId();
			case ReservationPackage.ADDON__NAME:
				return getName();
			case ReservationPackage.ADDON__ADDON_TYPE:
				return getAddonType();
			case ReservationPackage.ADDON__COUNT:
				return getCount();
			case ReservationPackage.ADDON__PRICE:
				return getPrice();
			case ReservationPackage.ADDON__RATE:
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
			case ReservationPackage.ADDON__ID:
				setId((String)newValue);
				return;
			case ReservationPackage.ADDON__LOCATION_ID:
				setLocationId((String)newValue);
				return;
			case ReservationPackage.ADDON__NAME:
				setName((String)newValue);
				return;
			case ReservationPackage.ADDON__ADDON_TYPE:
				setAddonType((AddonType)newValue);
				return;
			case ReservationPackage.ADDON__COUNT:
				setCount((Integer)newValue);
				return;
			case ReservationPackage.ADDON__PRICE:
				setPrice((Integer)newValue);
				return;
			case ReservationPackage.ADDON__RATE:
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
			case ReservationPackage.ADDON__ID:
				setId(ID_EDEFAULT);
				return;
			case ReservationPackage.ADDON__LOCATION_ID:
				setLocationId(LOCATION_ID_EDEFAULT);
				return;
			case ReservationPackage.ADDON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReservationPackage.ADDON__ADDON_TYPE:
				setAddonType(ADDON_TYPE_EDEFAULT);
				return;
			case ReservationPackage.ADDON__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case ReservationPackage.ADDON__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ReservationPackage.ADDON__RATE:
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
			case ReservationPackage.ADDON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ReservationPackage.ADDON__LOCATION_ID:
				return LOCATION_ID_EDEFAULT == null ? locationId != null : !LOCATION_ID_EDEFAULT.equals(locationId);
			case ReservationPackage.ADDON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReservationPackage.ADDON__ADDON_TYPE:
				return addonType != ADDON_TYPE_EDEFAULT;
			case ReservationPackage.ADDON__COUNT:
				return count != COUNT_EDEFAULT;
			case ReservationPackage.ADDON__PRICE:
				return price != PRICE_EDEFAULT;
			case ReservationPackage.ADDON__RATE:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", locationId: ");
		result.append(locationId);
		result.append(", name: ");
		result.append(name);
		result.append(", addonType: ");
		result.append(addonType);
		result.append(", count: ");
		result.append(count);
		result.append(", price: ");
		result.append(price);
		result.append(", rate: ");
		result.append(rate);
		result.append(')');
		return result.toString();
	}

} //AddonImpl
