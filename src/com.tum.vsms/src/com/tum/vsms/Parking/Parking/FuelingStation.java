/**
 */
package com.tum.vsms.Parking.Parking;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fueling Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Parking.Parking.FuelingStation#getFuelEnabled <em>Fuel Enabled</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.FuelingStation#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.tum.vsms.Parking.Parking.FuelingStation#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getFuelingStation()
 * @model
 * @generated
 */
public interface FuelingStation extends Parking {
	/**
	 * Returns the value of the '<em><b>Fuel Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Enabled</em>' attribute.
	 * @see #setFuelEnabled(String)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getFuelingStation_FuelEnabled()
	 * @model
	 * @generated
	 */
	String getFuelEnabled();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.FuelingStation#getFuelEnabled <em>Fuel Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Enabled</em>' attribute.
	 * @see #getFuelEnabled()
	 * @generated
	 */
	void setFuelEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(String)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getFuelingStation_Capacity()
	 * @model
	 * @generated
	 */
	String getCapacity();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.FuelingStation#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(String value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#getFuelingStation_Rate()
	 * @model
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Parking.Parking.FuelingStation#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

} // FuelingStation
