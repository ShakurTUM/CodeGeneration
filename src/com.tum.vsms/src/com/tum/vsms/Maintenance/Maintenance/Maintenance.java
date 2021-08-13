/**
 */
package com.tum.vsms.Maintenance.Maintenance;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getReservationId <em>Reservation Id</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getStatus <em>Status</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getCost <em>Cost</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getStart_date <em>Start date</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getEnd_date <em>End date</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getRequiredManpower <em>Required Manpower</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getRequiredTime <em>Required Time</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance()
 * @model
 * @generated
 */
public interface Maintenance extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Id</em>' attribute.
	 * @see #setReservationId(String)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_ReservationId()
	 * @model
	 * @generated
	 */
	String getReservationId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getReservationId <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Id</em>' attribute.
	 * @see #getReservationId()
	 * @generated
	 */
	void setReservationId(String value);

	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(String)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_CustomerId()
	 * @model
	 * @generated
	 */
	String getCustomerId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus
	 * @see #setStatus(MaintenanceStatus)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_Status()
	 * @model
	 * @generated
	 */
	MaintenanceStatus getStatus();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MaintenanceStatus value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_Cost()
	 * @model
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start date</em>' attribute.
	 * @see #setStart_date(Date)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_Start_date()
	 * @model
	 * @generated
	 */
	Date getStart_date();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getStart_date <em>Start date</em>}' attribute.
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
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_End_date()
	 * @model
	 * @generated
	 */
	Date getEnd_date();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getEnd_date <em>End date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End date</em>' attribute.
	 * @see #getEnd_date()
	 * @generated
	 */
	void setEnd_date(Date value);

	/**
	 * Returns the value of the '<em><b>Required Manpower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Manpower</em>' attribute.
	 * @see #setRequiredManpower(int)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_RequiredManpower()
	 * @model
	 * @generated
	 */
	int getRequiredManpower();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getRequiredManpower <em>Required Manpower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Manpower</em>' attribute.
	 * @see #getRequiredManpower()
	 * @generated
	 */
	void setRequiredManpower(int value);

	/**
	 * Returns the value of the '<em><b>Required Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Time</em>' attribute.
	 * @see #setRequiredTime(float)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_RequiredTime()
	 * @model
	 * @generated
	 */
	float getRequiredTime();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getRequiredTime <em>Required Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Time</em>' attribute.
	 * @see #getRequiredTime()
	 * @generated
	 */
	void setRequiredTime(float value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Object)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_Vehicle()
	 * @model type="com.tum.vsms.Maintenance.Maintenance.Vehicle"
	 * @generated
	 */
	vehicle getVehicle();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(vehicle value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getMaintenance_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Maintenance
