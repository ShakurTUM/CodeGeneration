/**
 */
package com.tum.vsms.Maintenance.Maintenance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.tum.vsms.Maintenance.Maintenance.MaintenanceFactory
 * @model kind="package"
 * @generated
 */
public interface MaintenancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Maintenance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.tum.vsms.Maintenance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.tum.vsms.Maintenance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenancePackage eINSTANCE = com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl <em>Maintenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getMaintenance()
	 * @generated
	 */
	int MAINTENANCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__RESERVATION_ID = 1;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__CUSTOMER_ID = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__COST = 4;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__START_DATE = 5;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__END_DATE = 6;

	/**
	 * The feature id for the '<em><b>Required Manpower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__REQUIRED_MANPOWER = 7;

	/**
	 * The feature id for the '<em><b>Required Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__REQUIRED_TIME = 8;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__VEHICLE = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE__LOCATION = 10;

	/**
	 * The number of structural features of the '<em>Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Maintenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.VehicleImpl
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 1;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.LocationImpl
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.RepairImpl <em>Repair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.RepairImpl
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getRepair()
	 * @generated
	 */
	int REPAIR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__ID = MAINTENANCE__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__RESERVATION_ID = MAINTENANCE__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__CUSTOMER_ID = MAINTENANCE__CUSTOMER_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__STATUS = MAINTENANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__COST = MAINTENANCE__COST;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__START_DATE = MAINTENANCE__START_DATE;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__END_DATE = MAINTENANCE__END_DATE;

	/**
	 * The feature id for the '<em><b>Required Manpower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__REQUIRED_MANPOWER = MAINTENANCE__REQUIRED_MANPOWER;

	/**
	 * The feature id for the '<em><b>Required Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__REQUIRED_TIME = MAINTENANCE__REQUIRED_TIME;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__VEHICLE = MAINTENANCE__VEHICLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__LOCATION = MAINTENANCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Issue Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__ISSUE_DETAILS = MAINTENANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Tools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__REQUIRED_TOOLS = MAINTENANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR__MATERIALS = MAINTENANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Repair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_FEATURE_COUNT = MAINTENANCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Repair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_OPERATION_COUNT = MAINTENANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.RechargeImpl <em>Recharge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.RechargeImpl
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getRecharge()
	 * @generated
	 */
	int RECHARGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__ID = MAINTENANCE__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__RESERVATION_ID = MAINTENANCE__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__CUSTOMER_ID = MAINTENANCE__CUSTOMER_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__STATUS = MAINTENANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__COST = MAINTENANCE__COST;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__START_DATE = MAINTENANCE__START_DATE;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__END_DATE = MAINTENANCE__END_DATE;

	/**
	 * The feature id for the '<em><b>Required Manpower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__REQUIRED_MANPOWER = MAINTENANCE__REQUIRED_MANPOWER;

	/**
	 * The feature id for the '<em><b>Required Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__REQUIRED_TIME = MAINTENANCE__REQUIRED_TIME;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__VEHICLE = MAINTENANCE__VEHICLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__LOCATION = MAINTENANCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Required Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__REQUIRED_CHARGE = MAINTENANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__AMOUNT = MAINTENANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__RATE = MAINTENANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE__CURRENT_CHARGE = MAINTENANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Recharge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE_FEATURE_COUNT = MAINTENANCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Recharge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECHARGE_OPERATION_COUNT = MAINTENANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.RefuelImpl <em>Refuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.RefuelImpl
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getRefuel()
	 * @generated
	 */
	int REFUEL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__ID = MAINTENANCE__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__RESERVATION_ID = MAINTENANCE__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__CUSTOMER_ID = MAINTENANCE__CUSTOMER_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__STATUS = MAINTENANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__COST = MAINTENANCE__COST;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__START_DATE = MAINTENANCE__START_DATE;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__END_DATE = MAINTENANCE__END_DATE;

	/**
	 * The feature id for the '<em><b>Required Manpower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__REQUIRED_MANPOWER = MAINTENANCE__REQUIRED_MANPOWER;

	/**
	 * The feature id for the '<em><b>Required Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__REQUIRED_TIME = MAINTENANCE__REQUIRED_TIME;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__VEHICLE = MAINTENANCE__VEHICLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__LOCATION = MAINTENANCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Current Fuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__CURRENT_FUEL = MAINTENANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Fuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__REQUIRED_FUEL = MAINTENANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__FUEL_TYPE = MAINTENANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL__AMOUNT = MAINTENANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Refuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL_FEATURE_COUNT = MAINTENANCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Refuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUEL_OPERATION_COUNT = MAINTENANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.RelocateImpl <em>Relocate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.RelocateImpl
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getRelocate()
	 * @generated
	 */
	int RELOCATE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__ID = MAINTENANCE__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__RESERVATION_ID = MAINTENANCE__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__CUSTOMER_ID = MAINTENANCE__CUSTOMER_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__STATUS = MAINTENANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__COST = MAINTENANCE__COST;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__START_DATE = MAINTENANCE__START_DATE;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__END_DATE = MAINTENANCE__END_DATE;

	/**
	 * The feature id for the '<em><b>Required Manpower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__REQUIRED_MANPOWER = MAINTENANCE__REQUIRED_MANPOWER;

	/**
	 * The feature id for the '<em><b>Required Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__REQUIRED_TIME = MAINTENANCE__REQUIRED_TIME;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__VEHICLE = MAINTENANCE__VEHICLE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__LOCATION = MAINTENANCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE__DESTINATION = MAINTENANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relocate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_FEATURE_COUNT = MAINTENANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relocate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATE_OPERATION_COUNT = MAINTENANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getMaintenanceStatus()
	 * @generated
	 */
	int MAINTENANCE_STATUS = 7;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Maintenance.Maintenance.FuelType <em>Fuel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Maintenance.Maintenance.FuelType
	 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getFuelType()
	 * @generated
	 */
	int FUEL_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance <em>Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance
	 * @generated
	 */
	EClass getMaintenance();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getId()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getReservationId <em>Reservation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Id</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getReservationId()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_ReservationId();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getCustomerId <em>Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Id</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getCustomerId()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_CustomerId();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getStatus()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getCost()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_Cost();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getStart_date <em>Start date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start date</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getStart_date()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_Start_date();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getEnd_date <em>End date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End date</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getEnd_date()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_End_date();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getRequiredManpower <em>Required Manpower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Manpower</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getRequiredManpower()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_RequiredManpower();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getRequiredTime <em>Required Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Time</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getRequiredTime()
	 * @see #getMaintenance()
	 * @generated
	 */
	EAttribute getMaintenance_RequiredTime();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getVehicle()
	 * @see #getMaintenance()
	 * @generated
	 */
	EReference getMaintenance_Vehicle();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance#getLocation()
	 * @see #getMaintenance()
	 * @generated
	 */
	EReference getMaintenance_Location();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="vehicle"
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Maintenance.Maintenance.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Maintenance.Maintenance.Repair <em>Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repair</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Repair
	 * @generated
	 */
	EClass getRepair();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Repair#getIssueDetails <em>Issue Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Details</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Repair#getIssueDetails()
	 * @see #getRepair()
	 * @generated
	 */
	EAttribute getRepair_IssueDetails();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Repair#getRequiredTools <em>Required Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Tools</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Repair#getRequiredTools()
	 * @see #getRepair()
	 * @generated
	 */
	EAttribute getRepair_RequiredTools();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Repair#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Materials</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Repair#getMaterials()
	 * @see #getRepair()
	 * @generated
	 */
	EAttribute getRepair_Materials();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Maintenance.Maintenance.Recharge <em>Recharge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recharge</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Recharge
	 * @generated
	 */
	EClass getRecharge();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getRequiredCharge <em>Required Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Charge</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Recharge#getRequiredCharge()
	 * @see #getRecharge()
	 * @generated
	 */
	EAttribute getRecharge_RequiredCharge();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Recharge#getAmount()
	 * @see #getRecharge()
	 * @generated
	 */
	EAttribute getRecharge_Amount();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Recharge#getRate()
	 * @see #getRecharge()
	 * @generated
	 */
	EAttribute getRecharge_Rate();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Recharge#getCurrentCharge <em>Current Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Charge</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Recharge#getCurrentCharge()
	 * @see #getRecharge()
	 * @generated
	 */
	EAttribute getRecharge_CurrentCharge();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Maintenance.Maintenance.Refuel <em>Refuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refuel</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Refuel
	 * @generated
	 */
	EClass getRefuel();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getCurrentFuel <em>Current Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Fuel</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Refuel#getCurrentFuel()
	 * @see #getRefuel()
	 * @generated
	 */
	EAttribute getRefuel_CurrentFuel();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getRequiredFuel <em>Required Fuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Fuel</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Refuel#getRequiredFuel()
	 * @see #getRefuel()
	 * @generated
	 */
	EAttribute getRefuel_RequiredFuel();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getFuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Type</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Refuel#getFuelType()
	 * @see #getRefuel()
	 * @generated
	 */
	EAttribute getRefuel_FuelType();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Maintenance.Maintenance.Refuel#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Refuel#getAmount()
	 * @see #getRefuel()
	 * @generated
	 */
	EAttribute getRefuel_Amount();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Maintenance.Maintenance.Relocate <em>Relocate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relocate</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Relocate
	 * @generated
	 */
	EClass getRelocate();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Maintenance.Maintenance.Relocate#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.Relocate#getDestination()
	 * @see #getRelocate()
	 * @generated
	 */
	EReference getRelocate_Destination();

	/**
	 * Returns the meta object for enum '{@link com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus
	 * @generated
	 */
	EEnum getMaintenanceStatus();

	/**
	 * Returns the meta object for enum '{@link com.tum.vsms.Maintenance.Maintenance.FuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fuel Type</em>'.
	 * @see com.tum.vsms.Maintenance.Maintenance.FuelType
	 * @generated
	 */
	EEnum getFuelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaintenanceFactory getMaintenanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl <em>Maintenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenanceImpl
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getMaintenance()
		 * @generated
		 */
		EClass MAINTENANCE = eINSTANCE.getMaintenance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__ID = eINSTANCE.getMaintenance_Id();

		/**
		 * The meta object literal for the '<em><b>Reservation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__RESERVATION_ID = eINSTANCE.getMaintenance_ReservationId();

		/**
		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__CUSTOMER_ID = eINSTANCE.getMaintenance_CustomerId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__STATUS = eINSTANCE.getMaintenance_Status();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__COST = eINSTANCE.getMaintenance_Cost();

		/**
		 * The meta object literal for the '<em><b>Start date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__START_DATE = eINSTANCE.getMaintenance_Start_date();

		/**
		 * The meta object literal for the '<em><b>End date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__END_DATE = eINSTANCE.getMaintenance_End_date();

		/**
		 * The meta object literal for the '<em><b>Required Manpower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__REQUIRED_MANPOWER = eINSTANCE.getMaintenance_RequiredManpower();

		/**
		 * The meta object literal for the '<em><b>Required Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE__REQUIRED_TIME = eINSTANCE.getMaintenance_RequiredTime();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE__VEHICLE = eINSTANCE.getMaintenance_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE__LOCATION = eINSTANCE.getMaintenance_Location();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.VehicleImpl
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.LocationImpl
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.RepairImpl <em>Repair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.RepairImpl
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getRepair()
		 * @generated
		 */
		EClass REPAIR = eINSTANCE.getRepair();

		/**
		 * The meta object literal for the '<em><b>Issue Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPAIR__ISSUE_DETAILS = eINSTANCE.getRepair_IssueDetails();

		/**
		 * The meta object literal for the '<em><b>Required Tools</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPAIR__REQUIRED_TOOLS = eINSTANCE.getRepair_RequiredTools();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPAIR__MATERIALS = eINSTANCE.getRepair_Materials();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.RechargeImpl <em>Recharge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.RechargeImpl
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getRecharge()
		 * @generated
		 */
		EClass RECHARGE = eINSTANCE.getRecharge();

		/**
		 * The meta object literal for the '<em><b>Required Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECHARGE__REQUIRED_CHARGE = eINSTANCE.getRecharge_RequiredCharge();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECHARGE__AMOUNT = eINSTANCE.getRecharge_Amount();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECHARGE__RATE = eINSTANCE.getRecharge_Rate();

		/**
		 * The meta object literal for the '<em><b>Current Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECHARGE__CURRENT_CHARGE = eINSTANCE.getRecharge_CurrentCharge();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.RefuelImpl <em>Refuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.RefuelImpl
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getRefuel()
		 * @generated
		 */
		EClass REFUEL = eINSTANCE.getRefuel();

		/**
		 * The meta object literal for the '<em><b>Current Fuel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFUEL__CURRENT_FUEL = eINSTANCE.getRefuel_CurrentFuel();

		/**
		 * The meta object literal for the '<em><b>Required Fuel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFUEL__REQUIRED_FUEL = eINSTANCE.getRefuel_RequiredFuel();

		/**
		 * The meta object literal for the '<em><b>Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFUEL__FUEL_TYPE = eINSTANCE.getRefuel_FuelType();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFUEL__AMOUNT = eINSTANCE.getRefuel_Amount();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.impl.RelocateImpl <em>Relocate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.RelocateImpl
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getRelocate()
		 * @generated
		 */
		EClass RELOCATE = eINSTANCE.getRelocate();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELOCATE__DESTINATION = eINSTANCE.getRelocate_Destination();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getMaintenanceStatus()
		 * @generated
		 */
		EEnum MAINTENANCE_STATUS = eINSTANCE.getMaintenanceStatus();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Maintenance.Maintenance.FuelType <em>Fuel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Maintenance.Maintenance.FuelType
		 * @see com.tum.vsms.Maintenance.Maintenance.impl.MaintenancePackageImpl#getFuelType()
		 * @generated
		 */
		EEnum FUEL_TYPE = eINSTANCE.getFuelType();

	}

} //MaintenancePackage
