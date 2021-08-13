/**
 */
package com.tum.vsms.model.Vehicle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.Vehicle.Traditional#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Traditional#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Traditional#getCurrentFuelLevel <em>Current Fuel Level</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getTraditional()
 * @model
 * @generated
 */
public interface Traditional extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(float)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getTraditional_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Traditional#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Type</b></em>' attribute.
	 * The default value is <code>"Petrol"</code>.
	 * The literals are from the enumeration {@link com.tum.vsms.model.Vehicle.FuelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Type</em>' attribute.
	 * @see com.tum.vsms.model.Vehicle.FuelType
	 * @see #setFuelType(FuelType)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getTraditional_FuelType()
	 * @model default="Petrol"
	 * @generated
	 */
	FuelType getFuelType();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Traditional#getFuelType <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Type</em>' attribute.
	 * @see com.tum.vsms.model.Vehicle.FuelType
	 * @see #getFuelType()
	 * @generated
	 */
	void setFuelType(FuelType value);

	/**
	 * Returns the value of the '<em><b>Current Fuel Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Fuel Level</em>' attribute.
	 * @see #setCurrentFuelLevel(float)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getTraditional_CurrentFuelLevel()
	 * @model
	 * @generated
	 */
	float getCurrentFuelLevel();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Traditional#getCurrentFuelLevel <em>Current Fuel Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Fuel Level</em>' attribute.
	 * @see #getCurrentFuelLevel()
	 * @generated
	 */
	void setCurrentFuelLevel(float value);

} // Traditional
