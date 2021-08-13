/**
 */
package com.tum.vsms.Parking.Parking;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charging Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Parking.Parking.ChargingStation#getChargingEnabled <em>Charging Enabled</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.ChargingStation#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.ChargingStation#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getChargingStation()
 * @model
 * @generated
 */
public interface ChargingStation extends Parking {
	/**
	 * Returns the value of the '<em><b>Charging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging Enabled</em>' attribute.
	 * @see #setChargingEnabled(int)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getChargingStation_ChargingEnabled()
	 * @model
	 * @generated
	 */
	int getChargingEnabled();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.ChargingStation#getChargingEnabled <em>Charging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging Enabled</em>' attribute.
	 * @see #getChargingEnabled()
	 * @generated
	 */
	void setChargingEnabled(int value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(double)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getChargingStation_Capacity()
	 * @model
	 * @generated
	 */
	double getCapacity();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.ChargingStation#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getChargingStation_Rate()
	 * @model
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.ChargingStation#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

} // ChargingStation
