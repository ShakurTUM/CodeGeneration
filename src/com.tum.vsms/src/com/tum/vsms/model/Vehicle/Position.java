/**
 */
package com.tum.vsms.model.Vehicle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.Vehicle.Position#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Position#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.Position#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Name</em>' attribute.
	 * @see #setLocationName(String)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getPosition_LocationName()
	 * @model
	 * @generated
	 */
	String getLocationName();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Position#getLocationName <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Name</em>' attribute.
	 * @see #getLocationName()
	 * @generated
	 */
	void setLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getPosition_Latitude()
	 * @model
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Position#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getPosition_Longitude()
	 * @model
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link com.tum.vsms.model.Vehicle.Position#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

} // Position
