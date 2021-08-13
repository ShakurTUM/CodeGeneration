/**
 */
package com.tum.vsms.Parking.Parking.impl;

import com.tum.vsms.Parking.Parking.Customer;
import com.tum.vsms.Parking.Parking.Location;
import com.tum.vsms.Parking.Parking.Parking;
import com.tum.vsms.Parking.Parking.ParkingPackage;

import com.tum.vsms.Parking.Parking.Vehicle;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl#getAvailableVehicles <em>Available Vehicles</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl#getMaximumCapacity <em>Maximum Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParkingImpl extends MinimalEObjectImpl.Container implements Parking {
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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

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
	 * The default value of the '{@link #getAvailableVehicles() <em>Available Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableVehicles()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_VEHICLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableVehicles() <em>Available Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableVehicles()
	 * @generated
	 * @ordered
	 */
	protected int availableVehicles = AVAILABLE_VEHICLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumCapacity() <em>Maximum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumCapacity() <em>Maximum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumCapacity()
	 * @generated
	 * @ordered
	 */
	protected int maximumCapacity = MAXIMUM_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParkingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParkingPackage.Literals.PARKING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.PARKING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParkingPackage.PARKING__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.PARKING__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParkingPackage.PARKING__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.PARKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getVehicle() {
		if (vehicle != null && vehicle.eIsProxy()) {
			InternalEObject oldVehicle = (InternalEObject)vehicle;
			vehicle = (Vehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParkingPackage.PARKING__VEHICLE, oldVehicle, vehicle));
			}
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		Vehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.PARKING__VEHICLE, oldVehicle, vehicle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.PARKING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableVehicles() {
		return availableVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableVehicles(int newAvailableVehicles) {
		int oldAvailableVehicles = availableVehicles;
		availableVehicles = newAvailableVehicles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.PARKING__AVAILABLE_VEHICLES, oldAvailableVehicles, availableVehicles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumCapacity() {
		return maximumCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumCapacity(int newMaximumCapacity) {
		int oldMaximumCapacity = maximumCapacity;
		maximumCapacity = newMaximumCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkingPackage.PARKING__MAXIMUM_CAPACITY, oldMaximumCapacity, maximumCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParkingPackage.PARKING__ID:
				return getId();
			case ParkingPackage.PARKING__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ParkingPackage.PARKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ParkingPackage.PARKING__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case ParkingPackage.PARKING__NAME:
				return getName();
			case ParkingPackage.PARKING__AVAILABLE_VEHICLES:
				return getAvailableVehicles();
			case ParkingPackage.PARKING__MAXIMUM_CAPACITY:
				return getMaximumCapacity();
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
			case ParkingPackage.PARKING__ID:
				setId((String)newValue);
				return;
			case ParkingPackage.PARKING__LOCATION:
				setLocation((Location)newValue);
				return;
			case ParkingPackage.PARKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ParkingPackage.PARKING__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case ParkingPackage.PARKING__NAME:
				setName((String)newValue);
				return;
			case ParkingPackage.PARKING__AVAILABLE_VEHICLES:
				setAvailableVehicles((Integer)newValue);
				return;
			case ParkingPackage.PARKING__MAXIMUM_CAPACITY:
				setMaximumCapacity((Integer)newValue);
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
			case ParkingPackage.PARKING__ID:
				setId(ID_EDEFAULT);
				return;
			case ParkingPackage.PARKING__LOCATION:
				setLocation((Location)null);
				return;
			case ParkingPackage.PARKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ParkingPackage.PARKING__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case ParkingPackage.PARKING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ParkingPackage.PARKING__AVAILABLE_VEHICLES:
				setAvailableVehicles(AVAILABLE_VEHICLES_EDEFAULT);
				return;
			case ParkingPackage.PARKING__MAXIMUM_CAPACITY:
				setMaximumCapacity(MAXIMUM_CAPACITY_EDEFAULT);
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
			case ParkingPackage.PARKING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ParkingPackage.PARKING__LOCATION:
				return location != null;
			case ParkingPackage.PARKING__CUSTOMER:
				return customer != null;
			case ParkingPackage.PARKING__VEHICLE:
				return vehicle != null;
			case ParkingPackage.PARKING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ParkingPackage.PARKING__AVAILABLE_VEHICLES:
				return availableVehicles != AVAILABLE_VEHICLES_EDEFAULT;
			case ParkingPackage.PARKING__MAXIMUM_CAPACITY:
				return maximumCapacity != MAXIMUM_CAPACITY_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(", availableVehicles: ");
		result.append(availableVehicles);
		result.append(", maximumCapacity: ");
		result.append(maximumCapacity);
		result.append(')');
		return result.toString();
	}

} //ParkingImpl
