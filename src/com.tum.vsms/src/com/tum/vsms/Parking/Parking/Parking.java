/**
 */
package com.tum.vsms.Parking.Parking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Parking.Parking.Parking#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.Parking#getLocation <em>Location</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.Parking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.Parking#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.Parking#getName <em>Name</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.Parking#getAvailableVehicles <em>Available Vehicles</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.Parking#getMaximumCapacity <em>Maximum Capacity</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getParking()
 * @model
 * @generated
 */
public interface Parking extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getParking_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.Parking#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getParking_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.Parking#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getParking_Customer()
	 * @model
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.Parking#getCustomer <em>Customer</em>}' reference.
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
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getParking_Vehicle()
	 * @model
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.Parking#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getParking_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.Parking#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Available Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Vehicles</em>' attribute.
	 * @see #setAvailableVehicles(int)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getParking_AvailableVehicles()
	 * @model
	 * @generated
	 */
	int getAvailableVehicles();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.Parking#getAvailableVehicles <em>Available Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Vehicles</em>' attribute.
	 * @see #getAvailableVehicles()
	 * @generated
	 */
	void setAvailableVehicles(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Capacity</em>' attribute.
	 * @see #setMaximumCapacity(int)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getParking_MaximumCapacity()
	 * @model
	 * @generated
	 */
	int getMaximumCapacity();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.Parking#getMaximumCapacity <em>Maximum Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Capacity</em>' attribute.
	 * @see #getMaximumCapacity()
	 * @generated
	 */
	void setMaximumCapacity(int value);

} // Parking
