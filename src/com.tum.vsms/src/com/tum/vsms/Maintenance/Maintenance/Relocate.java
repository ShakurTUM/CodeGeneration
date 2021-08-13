/**
 */
package com.tum.vsms.Maintenance.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relocate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Relocate#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRelocate()
 * @model
 * @generated
 */
public interface Relocate extends Maintenance {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Location)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRelocate_Destination()
	 * @model
	 * @generated
	 */
	Location getDestination();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Relocate#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Location value);

} // Relocate
