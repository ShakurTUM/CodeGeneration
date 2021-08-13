/**
 */
package com.tum.vsms.Maintenance.Maintenance.impl;

import com.tum.vsms.Maintenance.Maintenance.MaintenancePackage;
import com.tum.vsms.Maintenance.Maintenance.Repair;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RepairImpl#getIssueDetails <em>Issue Details</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RepairImpl#getRequiredTools <em>Required Tools</em>}</li>
 *   <li>{@link com.tum.vsms.Maintenance.Maintenance.impl.RepairImpl#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepairImpl extends MaintenanceImpl implements Repair {
	/**
	 * The default value of the '{@link #getIssueDetails() <em>Issue Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDetails() <em>Issue Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDetails()
	 * @generated
	 * @ordered
	 */
	protected String issueDetails = ISSUE_DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredTools() <em>Required Tools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTools()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_TOOLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredTools() <em>Required Tools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredTools()
	 * @generated
	 * @ordered
	 */
	protected String requiredTools = REQUIRED_TOOLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaterials() <em>Materials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected String materials = MATERIALS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.REPAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssueDetails() {
		return issueDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDetails(String newIssueDetails) {
		String oldIssueDetails = issueDetails;
		issueDetails = newIssueDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REPAIR__ISSUE_DETAILS, oldIssueDetails, issueDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredTools() {
		return requiredTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredTools(String newRequiredTools) {
		String oldRequiredTools = requiredTools;
		requiredTools = newRequiredTools;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REPAIR__REQUIRED_TOOLS, oldRequiredTools, requiredTools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaterials() {
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterials(String newMaterials) {
		String oldMaterials = materials;
		materials = newMaterials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.REPAIR__MATERIALS, oldMaterials, materials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.REPAIR__ISSUE_DETAILS:
				return getIssueDetails();
			case MaintenancePackage.REPAIR__REQUIRED_TOOLS:
				return getRequiredTools();
			case MaintenancePackage.REPAIR__MATERIALS:
				return getMaterials();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MaintenancePackage.REPAIR__ISSUE_DETAILS:
				setIssueDetails((String)newValue);
				return;
			case MaintenancePackage.REPAIR__REQUIRED_TOOLS:
				setRequiredTools((String)newValue);
				return;
			case MaintenancePackage.REPAIR__MATERIALS:
				setMaterials((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MaintenancePackage.REPAIR__ISSUE_DETAILS:
				setIssueDetails(ISSUE_DETAILS_EDEFAULT);
				return;
			case MaintenancePackage.REPAIR__REQUIRED_TOOLS:
				setRequiredTools(REQUIRED_TOOLS_EDEFAULT);
				return;
			case MaintenancePackage.REPAIR__MATERIALS:
				setMaterials(MATERIALS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MaintenancePackage.REPAIR__ISSUE_DETAILS:
				return ISSUE_DETAILS_EDEFAULT == null ? issueDetails != null : !ISSUE_DETAILS_EDEFAULT.equals(issueDetails);
			case MaintenancePackage.REPAIR__REQUIRED_TOOLS:
				return REQUIRED_TOOLS_EDEFAULT == null ? requiredTools != null : !REQUIRED_TOOLS_EDEFAULT.equals(requiredTools);
			case MaintenancePackage.REPAIR__MATERIALS:
				return MATERIALS_EDEFAULT == null ? materials != null : !MATERIALS_EDEFAULT.equals(materials);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (issueDetails: ");
		result.append(issueDetails);
		result.append(", requiredTools: ");
		result.append(requiredTools);
		result.append(", materials: ");
		result.append(materials);
		result.append(')');
		return result.toString();
	}

} //RepairImpl
