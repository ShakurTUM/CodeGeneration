/**
 */
package com.tum.vsms.Maintenance.Maintenance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage
 * @generated
 */
public interface MaintenanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenanceFactory eINSTANCE = com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Maintenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintenance</em>'.
	 * @generated
	 */
	Maintenance createMaintenance();

	/**
	 * Returns a new object of class '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle</em>'.
	 * @generated
	 */
	vehicle createVehicle();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Repair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repair</em>'.
	 * @generated
	 */
	Repair createRepair();

	/**
	 * Returns a new object of class '<em>Recharge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recharge</em>'.
	 * @generated
	 */
	Recharge createRecharge();

	/**
	 * Returns a new object of class '<em>Refuel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refuel</em>'.
	 * @generated
	 */
	Refuel createRefuel();

	/**
	 * Returns a new object of class '<em>Relocate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relocate</em>'.
	 * @generated
	 */
	Relocate createRelocate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MaintenancePackage getMaintenancePackage();

} //MaintenanceFactory
