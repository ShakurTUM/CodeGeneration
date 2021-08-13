/**
 */
package com.tum.vsms.model.Vehicle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getName <em>Name</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getLicense <em>License</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getRegistration <em>Registration</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getBrand <em>Brand</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getModel <em>Model</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getYear <em>Year</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getColor <em>Color</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getAvailableSeat <em>Available Seat</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getAdditionalSeat <em>Additional Seat</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getVehicleId <em>Vehicle Id</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Vehicle#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Type</b></em>' attribute.
	 * The default value is <code>"Economy"</code>.
	 * The literals are from the enumeration {@link com.tum.vsms.model.Vehicle.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Type</em>' attribute.
	 * @see com.tum.vsms.model.Vehicle.VehicleType
	 * @see #setVehicleType(VehicleType)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_VehicleType()
	 * @model default="Economy"
	 * @generated
	 */
	VehicleType getVehicleType();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getVehicleType <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Type</em>' attribute.
	 * @see com.tum.vsms.model.Vehicle.VehicleType
	 * @see #getVehicleType()
	 * @generated
	 */
	void setVehicleType(VehicleType value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration</em>' attribute.
	 * @see #setRegistration(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_Registration()
	 * @model
	 * @generated
	 */
	String getRegistration();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getRegistration <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration</em>' attribute.
	 * @see #getRegistration()
	 * @generated
	 */
	void setRegistration(String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_Year()
	 * @model
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Available Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Seat</em>' attribute.
	 * @see #setAvailableSeat(int)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_AvailableSeat()
	 * @model
	 * @generated
	 */
	int getAvailableSeat();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getAvailableSeat <em>Available Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Seat</em>' attribute.
	 * @see #getAvailableSeat()
	 * @generated
	 */
	void setAvailableSeat(int value);

	/**
	 * Returns the value of the '<em><b>Additional Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Seat</em>' attribute.
	 * @see #setAdditionalSeat(int)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_AdditionalSeat()
	 * @model
	 * @generated
	 */
	int getAdditionalSeat();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getAdditionalSeat <em>Additional Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Seat</em>' attribute.
	 * @see #getAdditionalSeat()
	 * @generated
	 */
	void setAdditionalSeat(int value);

	/**
	 * Returns the value of the '<em><b>Vehicle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Id</em>' attribute.
	 * @see #setVehicleId(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_VehicleId()
	 * @model
	 * @generated
	 */
	String getVehicleId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getVehicleId <em>Vehicle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Id</em>' attribute.
	 * @see #getVehicleId()
	 * @generated
	 */
	void setVehicleId(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicle_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Vehicle#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // Vehicle
