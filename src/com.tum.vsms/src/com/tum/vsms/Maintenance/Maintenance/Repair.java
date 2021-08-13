/**
 */
package com.tum.vsms.Maintenance.Maintenance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Repair#getIssueDetails <em>Issue Details</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Repair#getRequiredTools <em>Required Tools</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.Repair#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRepair()
 * @model
 * @generated
 */
public interface Repair extends Maintenance {
	/**
	 * Returns the value of the '<em><b>Issue Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Details</em>' attribute.
	 * @see #setIssueDetails(String)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRepair_IssueDetails()
	 * @model
	 * @generated
	 */
	String getIssueDetails();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Repair#getIssueDetails <em>Issue Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Details</em>' attribute.
	 * @see #getIssueDetails()
	 * @generated
	 */
	void setIssueDetails(String value);

	/**
	 * Returns the value of the '<em><b>Required Tools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Tools</em>' attribute.
	 * @see #setRequiredTools(String)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRepair_RequiredTools()
	 * @model
	 * @generated
	 */
	String getRequiredTools();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Repair#getRequiredTools <em>Required Tools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Tools</em>' attribute.
	 * @see #getRequiredTools()
	 * @generated
	 */
	void setRequiredTools(String value);

	/**
	 * Returns the value of the '<em><b>Materials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' attribute.
	 * @see #setMaterials(String)
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#getRepair_Materials()
	 * @model
	 * @generated
	 */
	String getMaterials();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Maintenance.Maintenance.Repair#getMaterials <em>Materials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materials</em>' attribute.
	 * @see #getMaterials()
	 * @generated
	 */
	void setMaterials(String value);

} // Repair
