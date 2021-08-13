/**
 */
package com.tum.vsms.Maintenance.Maintenance.impl;

import com.tum.vsms.Maintenance.Maintenance.Location;
import com.tum.vsms.Maintenance.Maintenance.Maintenance;
import com.tum.vsms.Maintenance.Maintenance.MaintenancePackage;
import com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getReservationId <em>Reservation Id</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getStart_date <em>Start date</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getEnd_date <em>End date</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getRequiredManpower <em>Required Manpower</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getRequiredTime <em>Required Time</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceImpl extends MinimalEObjectImpl.Container implements Maintenance {
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
	 * The default value of the '{@link #getReservationId() <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESERVATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservationId() <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationId()
	 * @generated
	 * @ordered
	 */
	protected String reservationId = RESERVATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected String customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MaintenanceStatus STATUS_EDEFAULT = MaintenanceStatus.STARTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MaintenanceStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart_date() <em>Start date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart_date() <em>Start date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_date()
	 * @generated
	 * @ordered
	 */
	protected Date start_date = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd_date() <em>End date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd_date() <em>End date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_date()
	 * @generated
	 * @ordered
	 */
	protected Date end_date = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredManpower() <em>Required Manpower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredManpower()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUIRED_MANPOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequiredManpower() <em>Required Manpower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredManpower()
	 * @generated
	 * @ordered
	 */
	protected int requiredManpower = REQUIRED_MANPOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredTime() <em>Required Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTime()
	 * @generated
	 * @ordered
	 */
	protected static final float REQUIRED_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRequiredTime() <em>Required Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTime()
	 * @generated
	 * @ordered
	 */
	protected float requiredTime = REQUIRED_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected vehicle vehicle;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.MAINTENANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReservationId() {
		return reservationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationId(String newReservationId) {
		String oldReservationId = reservationId;
		reservationId = newReservationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__RESERVATION_ID, oldReservationId, reservationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerId(String newCustomerId) {
		String oldCustomerId = customerId;
		customerId = newCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__CUSTOMER_ID, oldCustomerId, customerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(MaintenanceStatus newStatus) {
		MaintenanceStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart_date() {
		return start_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_date(Date newStart_date) {
		Date oldStart_date = start_date;
		start_date = newStart_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__START_DATE, oldStart_date, start_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd_date() {
		return end_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd_date(Date newEnd_date) {
		Date oldEnd_date = end_date;
		end_date = newEnd_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__END_DATE, oldEnd_date, end_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRequiredManpower() {
		return requiredManpower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredManpower(int newRequiredManpower) {
		int oldRequiredManpower = requiredManpower;
		requiredManpower = newRequiredManpower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__REQUIRED_MANPOWER, oldRequiredManpower, requiredManpower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRequiredTime() {
		return requiredTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredTime(float newRequiredTime) {
		float oldRequiredTime = requiredTime;
		requiredTime = newRequiredTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__REQUIRED_TIME, oldRequiredTime, requiredTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public vehicle getVehicle() {
		if (vehicle != null && ((EObject)vehicle).eIsProxy()) {
			InternalEObject oldVehicle = (InternalEObject)vehicle;
			vehicle = (vehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaintenancePackage.MAINTENANCE__VEHICLE, oldVehicle, vehicle));
			}
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public vehicle basicGetVehicle() {
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(vehicle newVehicle) {
		vehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__VEHICLE, oldVehicle, vehicle));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaintenancePackage.MAINTENANCE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.MAINTENANCE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.MAINTENANCE__ID:
				return getId();
			case MaintenancePackage.MAINTENANCE__RESERVATION_ID:
				return getReservationId();
			case MaintenancePackage.MAINTENANCE__CUSTOMER_ID:
				return getCustomerId();
			case MaintenancePackage.MAINTENANCE__STATUS:
				return getStatus();
			case MaintenancePackage.MAINTENANCE__COST:
				return getCost();
			case MaintenancePackage.MAINTENANCE__START_DATE:
				return getStart_date();
			case MaintenancePackage.MAINTENANCE__END_DATE:
				return getEnd_date();
			case MaintenancePackage.MAINTENANCE__REQUIRED_MANPOWER:
				return getRequiredManpower();
			case MaintenancePackage.MAINTENANCE__REQUIRED_TIME:
				return getRequiredTime();
			case MaintenancePackage.MAINTENANCE__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case MaintenancePackage.MAINTENANCE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaintenancePackage.MAINTENANCE__ID:
				setId((String)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__RESERVATION_ID:
				setReservationId((String)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__CUSTOMER_ID:
				setCustomerId((String)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__STATUS:
				setStatus((MaintenanceStatus)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__COST:
				setCost((Float)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__START_DATE:
				setStart_date((Date)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__END_DATE:
				setEnd_date((Date)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__REQUIRED_MANPOWER:
				setRequiredManpower((Integer)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__REQUIRED_TIME:
				setRequiredTime((Float)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__VEHICLE:
				setVehicle((vehicle)newValue);
				return;
			case MaintenancePackage.MAINTENANCE__LOCATION:
				setLocation((Location)newValue);
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
			case MaintenancePackage.MAINTENANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__RESERVATION_ID:
				setReservationId(RESERVATION_ID_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__CUSTOMER_ID:
				setCustomerId(CUSTOMER_ID_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__COST:
				setCost(COST_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__START_DATE:
				setStart_date(START_DATE_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__END_DATE:
				setEnd_date(END_DATE_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__REQUIRED_MANPOWER:
				setRequiredManpower(REQUIRED_MANPOWER_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__REQUIRED_TIME:
				setRequiredTime(REQUIRED_TIME_EDEFAULT);
				return;
			case MaintenancePackage.MAINTENANCE__VEHICLE:
				setVehicle((vehicle)null);
				return;
			case MaintenancePackage.MAINTENANCE__LOCATION:
				setLocation((Location)null);
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
			case MaintenancePackage.MAINTENANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MaintenancePackage.MAINTENANCE__RESERVATION_ID:
				return RESERVATION_ID_EDEFAULT == null ? reservationId != null : !RESERVATION_ID_EDEFAULT.equals(reservationId);
			case MaintenancePackage.MAINTENANCE__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerId != null : !CUSTOMER_ID_EDEFAULT.equals(customerId);
			case MaintenancePackage.MAINTENANCE__STATUS:
				return status != STATUS_EDEFAULT;
			case MaintenancePackage.MAINTENANCE__COST:
				return cost != COST_EDEFAULT;
			case MaintenancePackage.MAINTENANCE__START_DATE:
				return START_DATE_EDEFAULT == null ? start_date != null : !START_DATE_EDEFAULT.equals(start_date);
			case MaintenancePackage.MAINTENANCE__END_DATE:
				return END_DATE_EDEFAULT == null ? end_date != null : !END_DATE_EDEFAULT.equals(end_date);
			case MaintenancePackage.MAINTENANCE__REQUIRED_MANPOWER:
				return requiredManpower != REQUIRED_MANPOWER_EDEFAULT;
			case MaintenancePackage.MAINTENANCE__REQUIRED_TIME:
				return requiredTime != REQUIRED_TIME_EDEFAULT;
			case MaintenancePackage.MAINTENANCE__VEHICLE:
				return vehicle != null;
			case MaintenancePackage.MAINTENANCE__LOCATION:
				return location != null;
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
		result.append(", reservationId: ");
		result.append(reservationId);
		result.append(", customerId: ");
		result.append(customerId);
		result.append(", status: ");
		result.append(status);
		result.append(", cost: ");
		result.append(cost);
		result.append(", start_date: ");
		result.append(start_date);
		result.append(", end_date: ");
		result.append(end_date);
		result.append(", requiredManpower: ");
		result.append(requiredManpower);
		result.append(", requiredTime: ");
		result.append(requiredTime);
		result.append(')');
		return result.toString();
	}

} //MaintenanceImpl
