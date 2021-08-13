/**
 */
package com.tum.vsms.Maintenance.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recharge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getRequiredCharge <em>Required Charge</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getRate <em>Rate</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getCurrentCharge <em>Current Charge</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRecharge()
 * @model
 * @generated
 */
public interface Recharge extends Maintenance {
	/**
	 * Returns the value of the '<em><b>Required Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Charge</em>' attribute.
	 * @see #setRequiredCharge(float)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRecharge_RequiredCharge()
	 * @model
	 * @generated
	 */
	float getRequiredCharge();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getRequiredCharge <em>Required Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Charge</em>' attribute.
	 * @see #getRequiredCharge()
	 * @generated
	 */
	void setRequiredCharge(float value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRecharge_Amount()
	 * @model
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRecharge_Rate()
	 * @model
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

	/**
	 * Returns the value of the '<em><b>Current Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Charge</em>' attribute.
	 * @see #setCurrentCharge(float)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRecharge_CurrentCharge()
	 * @model
	 * @generated
	 */
	float getCurrentCharge();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getCurrentCharge <em>Current Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Charge</em>' attribute.
	 * @see #getCurrentCharge()
	 * @generated
	 */
	void setCurrentCharge(float value);

} // Recharge
