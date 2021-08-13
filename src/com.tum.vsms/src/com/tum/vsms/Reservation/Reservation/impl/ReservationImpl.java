/**
 */
package com.tum.vsms.Reservation.Reservation.impl;

import com.tum.vsms.Reservation.Reservation.Customer;
import com.tum.vsms.Reservation.Reservation.Location;
import com.tum.vsms.Reservation.Reservation.Reservation;
import com.tum.vsms.Reservation.Reservation.ReservationPackage;
import com.tum.vsms.Reservation.Reservation.Vehicle;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getStart_time <em>Start time</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getEnd_time <em>End time</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getStart_date <em>Start date</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getEnd_date <em>End date</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#isRefuelEnabled <em>Refuel Enabled</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#isChargingEnabled <em>Charging Enabled</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getStart_location <em>Start location</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl#getEnd_location <em>End location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationImpl extends MinimalEObjectImpl.Container implements Reservation {
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
	 * The default value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected double totalCost = TOTAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart_time() <em>Start time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_time()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart_time() <em>Start time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_time()
	 * @generated
	 * @ordered
	 */
	protected Date start_time = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd_time() <em>End time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_time()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd_time() <em>End time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_time()
	 * @generated
	 * @ordered
	 */
	protected String end_time = END_TIME_EDEFAULT;

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
	 * The default value of the '{@link #isRefuelEnabled() <em>Refuel Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefuelEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFUEL_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefuelEnabled() <em>Refuel Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefuelEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean refuelEnabled = REFUEL_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isChargingEnabled() <em>Charging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChargingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHARGING_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChargingEnabled() <em>Charging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChargingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean chargingEnabled = CHARGING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

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
	 * The cached value of the '{@link #getStart_location() <em>Start location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_location()
	 * @generated
	 * @ordered
	 */
	protected Location start_location;

	/**
	 * The cached value of the '{@link #getEnd_location() <em>End location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_location()
	 * @generated
	 * @ordered
	 */
	protected Location end_location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.RESERVATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(double newTotalCost) {
		double oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__TOTAL_COST, oldTotalCost, totalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart_time() {
		return start_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_time(Date newStart_time) {
		Date oldStart_time = start_time;
		start_time = newStart_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__START_TIME, oldStart_time, start_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd_time() {
		return end_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd_time(String newEnd_time) {
		String oldEnd_time = end_time;
		end_time = newEnd_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__END_TIME, oldEnd_time, end_time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__START_DATE, oldStart_date, start_date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__END_DATE, oldEnd_date, end_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefuelEnabled() {
		return refuelEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefuelEnabled(boolean newRefuelEnabled) {
		boolean oldRefuelEnabled = refuelEnabled;
		refuelEnabled = newRefuelEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__REFUEL_ENABLED, oldRefuelEnabled, refuelEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChargingEnabled() {
		return chargingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargingEnabled(boolean newChargingEnabled) {
		boolean oldChargingEnabled = chargingEnabled;
		chargingEnabled = newChargingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__CHARGING_ENABLED, oldChargingEnabled, chargingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__DURATION, oldDuration, duration));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.RESERVATION__CUSTOMER, oldCustomer, customer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__CUSTOMER, oldCustomer, customer));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.RESERVATION__VEHICLE, oldVehicle, vehicle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__VEHICLE, oldVehicle, vehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getStart_location() {
		if (start_location != null && start_location.eIsProxy()) {
			InternalEObject oldStart_location = (InternalEObject)start_location;
			start_location = (Location)eResolveProxy(oldStart_location);
			if (start_location != oldStart_location) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.RESERVATION__START_LOCATION, oldStart_location, start_location));
			}
		}
		return start_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetStart_location() {
		return start_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_location(Location newStart_location) {
		Location oldStart_location = start_location;
		start_location = newStart_location;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__START_LOCATION, oldStart_location, start_location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getEnd_location() {
		if (end_location != null && end_location.eIsProxy()) {
			InternalEObject oldEnd_location = (InternalEObject)end_location;
			end_location = (Location)eResolveProxy(oldEnd_location);
			if (end_location != oldEnd_location) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationPackage.RESERVATION__END_LOCATION, oldEnd_location, end_location));
			}
		}
		return end_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetEnd_location() {
		return end_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd_location(Location newEnd_location) {
		Location oldEnd_location = end_location;
		end_location = newEnd_location;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReservationPackage.RESERVATION__END_LOCATION, oldEnd_location, end_location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReservationPackage.RESERVATION__ID:
				return getId();
			case ReservationPackage.RESERVATION__TOTAL_COST:
				return getTotalCost();
			case ReservationPackage.RESERVATION__START_TIME:
				return getStart_time();
			case ReservationPackage.RESERVATION__END_TIME:
				return getEnd_time();
			case ReservationPackage.RESERVATION__START_DATE:
				return getStart_date();
			case ReservationPackage.RESERVATION__END_DATE:
				return getEnd_date();
			case ReservationPackage.RESERVATION__REFUEL_ENABLED:
				return isRefuelEnabled();
			case ReservationPackage.RESERVATION__CHARGING_ENABLED:
				return isChargingEnabled();
			case ReservationPackage.RESERVATION__DURATION:
				return getDuration();
			case ReservationPackage.RESERVATION__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ReservationPackage.RESERVATION__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case ReservationPackage.RESERVATION__START_LOCATION:
				if (resolve) return getStart_location();
				return basicGetStart_location();
			case ReservationPackage.RESERVATION__END_LOCATION:
				if (resolve) return getEnd_location();
				return basicGetEnd_location();
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
			case ReservationPackage.RESERVATION__ID:
				setId((String)newValue);
				return;
			case ReservationPackage.RESERVATION__TOTAL_COST:
				setTotalCost((Double)newValue);
				return;
			case ReservationPackage.RESERVATION__START_TIME:
				setStart_time((Date)newValue);
				return;
			case ReservationPackage.RESERVATION__END_TIME:
				setEnd_time((String)newValue);
				return;
			case ReservationPackage.RESERVATION__START_DATE:
				setStart_date((Date)newValue);
				return;
			case ReservationPackage.RESERVATION__END_DATE:
				setEnd_date((Date)newValue);
				return;
			case ReservationPackage.RESERVATION__REFUEL_ENABLED:
				setRefuelEnabled((Boolean)newValue);
				return;
			case ReservationPackage.RESERVATION__CHARGING_ENABLED:
				setChargingEnabled((Boolean)newValue);
				return;
			case ReservationPackage.RESERVATION__DURATION:
				setDuration((Double)newValue);
				return;
			case ReservationPackage.RESERVATION__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ReservationPackage.RESERVATION__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case ReservationPackage.RESERVATION__START_LOCATION:
				setStart_location((Location)newValue);
				return;
			case ReservationPackage.RESERVATION__END_LOCATION:
				setEnd_location((Location)newValue);
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
			case ReservationPackage.RESERVATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__TOTAL_COST:
				setTotalCost(TOTAL_COST_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__START_TIME:
				setStart_time(START_TIME_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__END_TIME:
				setEnd_time(END_TIME_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__START_DATE:
				setStart_date(START_DATE_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__END_DATE:
				setEnd_date(END_DATE_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__REFUEL_ENABLED:
				setRefuelEnabled(REFUEL_ENABLED_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__CHARGING_ENABLED:
				setChargingEnabled(CHARGING_ENABLED_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ReservationPackage.RESERVATION__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ReservationPackage.RESERVATION__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case ReservationPackage.RESERVATION__START_LOCATION:
				setStart_location((Location)null);
				return;
			case ReservationPackage.RESERVATION__END_LOCATION:
				setEnd_location((Location)null);
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
			case ReservationPackage.RESERVATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ReservationPackage.RESERVATION__TOTAL_COST:
				return totalCost != TOTAL_COST_EDEFAULT;
			case ReservationPackage.RESERVATION__START_TIME:
				return START_TIME_EDEFAULT == null ? start_time != null : !START_TIME_EDEFAULT.equals(start_time);
			case ReservationPackage.RESERVATION__END_TIME:
				return END_TIME_EDEFAULT == null ? end_time != null : !END_TIME_EDEFAULT.equals(end_time);
			case ReservationPackage.RESERVATION__START_DATE:
				return START_DATE_EDEFAULT == null ? start_date != null : !START_DATE_EDEFAULT.equals(start_date);
			case ReservationPackage.RESERVATION__END_DATE:
				return END_DATE_EDEFAULT == null ? end_date != null : !END_DATE_EDEFAULT.equals(end_date);
			case ReservationPackage.RESERVATION__REFUEL_ENABLED:
				return refuelEnabled != REFUEL_ENABLED_EDEFAULT;
			case ReservationPackage.RESERVATION__CHARGING_ENABLED:
				return chargingEnabled != CHARGING_ENABLED_EDEFAULT;
			case ReservationPackage.RESERVATION__DURATION:
				return duration != DURATION_EDEFAULT;
			case ReservationPackage.RESERVATION__CUSTOMER:
				return customer != null;
			case ReservationPackage.RESERVATION__VEHICLE:
				return vehicle != null;
			case ReservationPackage.RESERVATION__START_LOCATION:
				return start_location != null;
			case ReservationPackage.RESERVATION__END_LOCATION:
				return end_location != null;
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
		result.append(", totalCost: ");
		result.append(totalCost);
		result.append(", start_time: ");
		result.append(start_time);
		result.append(", end_time: ");
		result.append(end_time);
		result.append(", start_date: ");
		result.append(start_date);
		result.append(", end_date: ");
		result.append(end_date);
		result.append(", refuelEnabled: ");
		result.append(refuelEnabled);
		result.append(", chargingEnabled: ");
		result.append(chargingEnabled);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
