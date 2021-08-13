/**
 */
package com.tum.vsms.model.Vehicle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.Vehicle.Electric#getBatteryState <em>Battery State</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Electric#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Electric#getCharger <em>Charger</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getElectric()
 * @model
 * @generated
 */
public interface Electric extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Battery State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery State</em>' attribute.
	 * @see #setBatteryState(float)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getElectric_BatteryState()
	 * @model
	 * @generated
	 */
	float getBatteryState();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Electric#getBatteryState <em>Battery State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery State</em>' attribute.
	 * @see #getBatteryState()
	 * @generated
	 */
	void setBatteryState(float value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(float)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getElectric_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Electric#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Charger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charger</em>' attribute.
	 * @see #setCharger(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getElectric_Charger()
	 * @model
	 * @generated
	 */
	String getCharger();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Electric#getCharger <em>Charger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charger</em>' attribute.
	 * @see #getCharger()
	 * @generated
	 */
	void setCharger(String value);

} // Electric
