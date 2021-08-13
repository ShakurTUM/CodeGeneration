/**
 */
package com.tum.vsms.model.Vehicle;

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
 * @see com.tum.vsms.model.Vehicle.VehicleFactory
 * @model kind="package"
 * @generated
 */
public interface VehiclePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Vehicle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.tum.vsms.Vehicle";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.tum.vsms.Vehicle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VehiclePackage eINSTANCE = com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.model.Vehicle.impl.VehicleImpl
	 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VEHICLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__LICENSE = 2;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__REGISTRATION = 3;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__BRAND = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__MODEL = 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__YEAR = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__COLOR = 7;

	/**
	 * The feature id for the '<em><b>Available Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__AVAILABLE_SEAT = 8;

	/**
	 * The feature id for the '<em><b>Additional Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ADDITIONAL_SEAT = 9;

	/**
	 * The feature id for the '<em><b>Vehicle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VEHICLE_ID = 10;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__POSITION = 11;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.model.Vehicle.impl.ElectricImpl <em>Electric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.model.Vehicle.impl.ElectricImpl
	 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getElectric()
	 * @generated
	 */
	int ELECTRIC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__VEHICLE_TYPE = VEHICLE__VEHICLE_TYPE;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__LICENSE = VEHICLE__LICENSE;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__REGISTRATION = VEHICLE__REGISTRATION;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__BRAND = VEHICLE__BRAND;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__MODEL = VEHICLE__MODEL;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__YEAR = VEHICLE__YEAR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__COLOR = VEHICLE__COLOR;

	/**
	 * The feature id for the '<em><b>Available Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__AVAILABLE_SEAT = VEHICLE__AVAILABLE_SEAT;

	/**
	 * The feature id for the '<em><b>Additional Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__ADDITIONAL_SEAT = VEHICLE__ADDITIONAL_SEAT;

	/**
	 * The feature id for the '<em><b>Vehicle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__VEHICLE_ID = VEHICLE__VEHICLE_ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__POSITION = VEHICLE__POSITION;

	/**
	 * The feature id for the '<em><b>Battery State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__BATTERY_STATE = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__CAPACITY = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC__CHARGER = VEHICLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Electric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Electric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRIC_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.model.Vehicle.impl.TraditionalImpl <em>Traditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.model.Vehicle.impl.TraditionalImpl
	 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getTraditional()
	 * @generated
	 */
	int TRADITIONAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__VEHICLE_TYPE = VEHICLE__VEHICLE_TYPE;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__LICENSE = VEHICLE__LICENSE;

	/**
	 * The feature id for the '<em><b>Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__REGISTRATION = VEHICLE__REGISTRATION;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__BRAND = VEHICLE__BRAND;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__MODEL = VEHICLE__MODEL;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__YEAR = VEHICLE__YEAR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__COLOR = VEHICLE__COLOR;

	/**
	 * The feature id for the '<em><b>Available Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__AVAILABLE_SEAT = VEHICLE__AVAILABLE_SEAT;

	/**
	 * The feature id for the '<em><b>Additional Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__ADDITIONAL_SEAT = VEHICLE__ADDITIONAL_SEAT;

	/**
	 * The feature id for the '<em><b>Vehicle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__VEHICLE_ID = VEHICLE__VEHICLE_ID;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__POSITION = VEHICLE__POSITION;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__CAPACITY = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fuel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__FUEL_TYPE = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Fuel Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__CURRENT_FUEL_LEVEL = VEHICLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Traditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.model.Vehicle.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.model.Vehicle.impl.PositionImpl
	 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 3;

	/**
	 * The feature id for the '<em><b>Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LOCATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LONGITUDE = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.model.Vehicle.FuelType <em>Fuel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.model.Vehicle.FuelType
	 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getFuelType()
	 * @generated
	 */
	int FUEL_TYPE = 4;

	/**
	 * The meta object id for the '{@link com.tum.vsms.model.Vehicle.VehicleType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.model.Vehicle.VehicleType
	 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link com.tum.vsms.model.Vehicle.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getVehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Type</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getVehicleType()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_VehicleType();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getLicense()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_License();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getRegistration <em>Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getRegistration()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Registration();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getBrand()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Brand();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getModel()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Model();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getYear()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Year();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getColor()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Color();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getAvailableSeat <em>Available Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Seat</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getAvailableSeat()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_AvailableSeat();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getAdditionalSeat <em>Additional Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Seat</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getAdditionalSeat()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_AdditionalSeat();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Vehicle#getVehicleId <em>Vehicle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Id</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getVehicleId()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_VehicleId();

	/**
	 * Returns the meta object for the containment reference '{@link com.tum.vsms.model.Vehicle.Vehicle#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see com.tum.vsms.model.Vehicle.Vehicle#getPosition()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Position();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.model.Vehicle.Electric <em>Electric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electric</em>'.
	 * @see com.tum.vsms.model.Vehicle.Electric
	 * @generated
	 */
	EClass getElectric();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Electric#getBatteryState <em>Battery State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery State</em>'.
	 * @see com.tum.vsms.model.Vehicle.Electric#getBatteryState()
	 * @see #getElectric()
	 * @generated
	 */
	EAttribute getElectric_BatteryState();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Electric#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.tum.vsms.model.Vehicle.Electric#getCapacity()
	 * @see #getElectric()
	 * @generated
	 */
	EAttribute getElectric_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Electric#getCharger <em>Charger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charger</em>'.
	 * @see com.tum.vsms.model.Vehicle.Electric#getCharger()
	 * @see #getElectric()
	 * @generated
	 */
	EAttribute getElectric_Charger();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.model.Vehicle.Traditional <em>Traditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traditional</em>'.
	 * @see com.tum.vsms.model.Vehicle.Traditional
	 * @generated
	 */
	EClass getTraditional();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Traditional#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.tum.vsms.model.Vehicle.Traditional#getCapacity()
	 * @see #getTraditional()
	 * @generated
	 */
	EAttribute getTraditional_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Traditional#getFuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Type</em>'.
	 * @see com.tum.vsms.model.Vehicle.Traditional#getFuelType()
	 * @see #getTraditional()
	 * @generated
	 */
	EAttribute getTraditional_FuelType();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Traditional#getCurrentFuelLevel <em>Current Fuel Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Fuel Level</em>'.
	 * @see com.tum.vsms.model.Vehicle.Traditional#getCurrentFuelLevel()
	 * @see #getTraditional()
	 * @generated
	 */
	EAttribute getTraditional_CurrentFuelLevel();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.model.Vehicle.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see com.tum.vsms.model.Vehicle.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Position#getLocationName <em>Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Name</em>'.
	 * @see com.tum.vsms.model.Vehicle.Position#getLocationName()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_LocationName();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Position#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see com.tum.vsms.model.Vehicle.Position#getLatitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.model.Vehicle.Position#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see com.tum.vsms.model.Vehicle.Position#getLongitude()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Longitude();

	/**
	 * Returns the meta object for enum '{@link com.tum.vsms.model.Vehicle.FuelType <em>Fuel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fuel Type</em>'.
	 * @see com.tum.vsms.model.Vehicle.FuelType
	 * @generated
	 */
	EEnum getFuelType();

	/**
	 * Returns the meta object for enum '{@link com.tum.vsms.model.Vehicle.VehicleType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see com.tum.vsms.model.Vehicle.VehicleType
	 * @generated
	 */
	EEnum getVehicleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VehicleFactory getVehicleFactory();

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
		 * The meta object literal for the '{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.model.Vehicle.impl.VehicleImpl
		 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__VEHICLE_TYPE = eINSTANCE.getVehicle_VehicleType();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__LICENSE = eINSTANCE.getVehicle_License();

		/**
		 * The meta object literal for the '<em><b>Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__REGISTRATION = eINSTANCE.getVehicle_Registration();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__BRAND = eINSTANCE.getVehicle_Brand();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__MODEL = eINSTANCE.getVehicle_Model();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__YEAR = eINSTANCE.getVehicle_Year();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__COLOR = eINSTANCE.getVehicle_Color();

		/**
		 * The meta object literal for the '<em><b>Available Seat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__AVAILABLE_SEAT = eINSTANCE.getVehicle_AvailableSeat();

		/**
		 * The meta object literal for the '<em><b>Additional Seat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__ADDITIONAL_SEAT = eINSTANCE.getVehicle_AdditionalSeat();

		/**
		 * The meta object literal for the '<em><b>Vehicle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__VEHICLE_ID = eINSTANCE.getVehicle_VehicleId();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__POSITION = eINSTANCE.getVehicle_Position();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.model.Vehicle.impl.ElectricImpl <em>Electric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.model.Vehicle.impl.ElectricImpl
		 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getElectric()
		 * @generated
		 */
		EClass ELECTRIC = eINSTANCE.getElectric();

		/**
		 * The meta object literal for the '<em><b>Battery State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC__BATTERY_STATE = eINSTANCE.getElectric_BatteryState();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC__CAPACITY = eINSTANCE.getElectric_Capacity();

		/**
		 * The meta object literal for the '<em><b>Charger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRIC__CHARGER = eINSTANCE.getElectric_Charger();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.model.Vehicle.impl.TraditionalImpl <em>Traditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.model.Vehicle.impl.TraditionalImpl
		 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getTraditional()
		 * @generated
		 */
		EClass TRADITIONAL = eINSTANCE.getTraditional();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADITIONAL__CAPACITY = eINSTANCE.getTraditional_Capacity();

		/**
		 * The meta object literal for the '<em><b>Fuel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADITIONAL__FUEL_TYPE = eINSTANCE.getTraditional_FuelType();

		/**
		 * The meta object literal for the '<em><b>Current Fuel Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADITIONAL__CURRENT_FUEL_LEVEL = eINSTANCE.getTraditional_CurrentFuelLevel();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.model.Vehicle.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.model.Vehicle.impl.PositionImpl
		 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LOCATION_NAME = eINSTANCE.getPosition_LocationName();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LATITUDE = eINSTANCE.getPosition_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LONGITUDE = eINSTANCE.getPosition_Longitude();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.model.Vehicle.FuelType <em>Fuel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.model.Vehicle.FuelType
		 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getFuelType()
		 * @generated
		 */
		EEnum FUEL_TYPE = eINSTANCE.getFuelType();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.model.Vehicle.VehicleType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.model.Vehicle.VehicleType
		 * @see com.tum.vsms.model.Vehicle.impl.VehiclePackageImpl#getVehicleType()
		 * @generated
		 */
		EEnum VEHICLE_TYPE = eINSTANCE.getVehicleType();

	}

} //VehiclePackage
