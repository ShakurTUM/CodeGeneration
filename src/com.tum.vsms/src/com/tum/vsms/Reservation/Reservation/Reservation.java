/**
 */
package com.tum.vsms.Reservation.Reservation;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_time <em>Start time</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_time <em>End time</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_date <em>Start date</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_date <em>End date</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#isRefuelEnabled <em>Refuel Enabled</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#isChargingEnabled <em>Charging Enabled</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_location <em>Start location</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_location <em>End location</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cost</em>' attribute.
	 * @see #setTotalCost(double)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_TotalCost()
	 * @model
	 * @generated
	 */
	double getTotalCost();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getTotalCost <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cost</em>' attribute.
	 * @see #getTotalCost()
	 * @generated
	 */
	void setTotalCost(double value);

	/**
	 * Returns the value of the '<em><b>Start time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start time</em>' attribute.
	 * @see #setStart_time(Date)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_Start_time()
	 * @model
	 * @generated
	 */
	Date getStart_time();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_time <em>Start time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start time</em>' attribute.
	 * @see #getStart_time()
	 * @generated
	 */
	void setStart_time(Date value);

	/**
	 * Returns the value of the '<em><b>End time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End time</em>' attribute.
	 * @see #setEnd_time(String)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_End_time()
	 * @model
	 * @generated
	 */
	String getEnd_time();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_time <em>End time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End time</em>' attribute.
	 * @see #getEnd_time()
	 * @generated
	 */
	void setEnd_time(String value);

	/**
	 * Returns the value of the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start date</em>' attribute.
	 * @see #setStart_date(Date)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_Start_date()
	 * @model
	 * @generated
	 */
	Date getStart_date();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_date <em>Start date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start date</em>' attribute.
	 * @see #getStart_date()
	 * @generated
	 */
	void setStart_date(Date value);

	/**
	 * Returns the value of the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End date</em>' attribute.
	 * @see #setEnd_date(Date)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_End_date()
	 * @model
	 * @generated
	 */
	Date getEnd_date();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_date <em>End date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End date</em>' attribute.
	 * @see #getEnd_date()
	 * @generated
	 */
	void setEnd_date(Date value);

	/**
	 * Returns the value of the '<em><b>Refuel Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refuel Enabled</em>' attribute.
	 * @see #setRefuelEnabled(boolean)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_RefuelEnabled()
	 * @model
	 * @generated
	 */
	boolean isRefuelEnabled();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#isRefuelEnabled <em>Refuel Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refuel Enabled</em>' attribute.
	 * @see #isRefuelEnabled()
	 * @generated
	 */
	void setRefuelEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Charging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Enabled</em>' attribute.
	 * @see #setChargingEnabled(boolean)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_ChargingEnabled()
	 * @model
	 * @generated
	 */
	boolean isChargingEnabled();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#isChargingEnabled <em>Charging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Enabled</em>' attribute.
	 * @see #isChargingEnabled()
	 * @generated
	 */
	void setChargingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_Customer()
	 * @model
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_Vehicle()
	 * @model
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * Returns the value of the '<em><b>Start location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start location</em>' reference.
	 * @see #setStart_location(Location)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_Start_location()
	 * @model
	 * @generated
	 */
	Location getStart_location();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_location <em>Start location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start location</em>' reference.
	 * @see #getStart_location()
	 * @generated
	 */
	void setStart_location(Location value);

	/**
	 * Returns the value of the '<em><b>End location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End location</em>' reference.
	 * @see #setEnd_location(Location)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getReservation_End_location()
	 * @model
	 * @generated
	 */
	Location getEnd_location();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_location <em>End location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End location</em>' reference.
	 * @see #getEnd_location()
	 * @generated
	 */
	void setEnd_location(Location value);

} // Reservation
