/**
 */
package com.tum.vsms.Maintenance.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getCurrentFuel <em>Current Fuel</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getRequiredFuel <em>Required Fuel</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRefuel()
 * @model
 * @generated
 */
public interface Refuel extends Maintenance {
	/**
	 * Returns the value of the '<em><b>Current Fuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Fuel</em>' attribute.
	 * @see #setCurrentFuel(float)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRefuel_CurrentFuel()
	 * @model
	 * @generated
	 */
	float getCurrentFuel();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getCurrentFuel <em>Current Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Fuel</em>' attribute.
	 * @see #getCurrentFuel()
	 * @generated
	 */
	void setCurrentFuel(float value);

	/**
	 * Returns the value of the '<em><b>Required Fuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Fuel</em>' attribute.
	 * @see #setRequiredFuel(float)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRefuel_RequiredFuel()
	 * @model
	 * @generated
	 */
	float getRequiredFuel();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getRequiredFuel <em>Required Fuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Fuel</em>' attribute.
	 * @see #getRequiredFuel()
	 * @generated
	 */
	void setRequiredFuel(float value);

	/**
	 * Returns the value of the '<em><b>Fuel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.tum.vsms.Maintenance.Maintenance.FuelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Type</em>' attribute.
	 * @see com.tum.vsms.Maintenance.Maintenance.FuelType
	 * @see #setFuelType(FuelType)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRefuel_FuelType()
	 * @model
	 * @generated
	 */
	FuelType getFuelType();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getFuelType <em>Fuel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Type</em>' attribute.
	 * @see com.tum.vsms.Maintenance.Maintenance.FuelType
	 * @see #getFuelType()
	 * @generated
	 */
	void setFuelType(FuelType value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRefuel_Amount()
	 * @model
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

} // Refuel
