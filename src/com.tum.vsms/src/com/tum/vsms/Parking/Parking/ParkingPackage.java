/**
 */
package com.tum.vsms.Parking.Parking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.tum.vsms.Parking.Parking.ParkingFactory
 * @model kind="package"
 * @generated
 */
public interface ParkingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Parking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.tum.vsms.Parking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.tum.vsms.Parking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParkingPackage eINSTANCE = com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl <em>Parking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingImpl
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getParking()
	 * @generated
	 */
	int PARKING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING__ID = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING__VEHICLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING__NAME = 4;

	/**
	 * The feature id for the '<em><b>Available Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING__AVAILABLE_VEHICLES = 5;

	/**
	 * The feature id for the '<em><b>Maximum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING__MAXIMUM_CAPACITY = 6;

	/**
	 * The number of structural features of the '<em>Parking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Parking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARKING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.tum.vsms.Parking.Parking.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Parking.Parking.impl.VehicleImpl
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getVehicle()
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
	 * The meta object id for the '{@link com.tum.vsms.Parking.Parking.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Parking.Parking.impl.CustomerImpl
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Parking.Parking.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Parking.Parking.impl.LocationImpl
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

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
	 * The meta object id for the '{@link com.tum.vsms.Parking.Parking.impl.TraditionalImpl <em>Traditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Parking.Parking.impl.TraditionalImpl
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getTraditional()
	 * @generated
	 */
	int TRADITIONAL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__ID = PARKING__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__LOCATION = PARKING__LOCATION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__CUSTOMER = PARKING__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__VEHICLE = PARKING__VEHICLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__NAME = PARKING__NAME;

	/**
	 * The feature id for the '<em><b>Available Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__AVAILABLE_VEHICLES = PARKING__AVAILABLE_VEHICLES;

	/**
	 * The feature id for the '<em><b>Maximum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL__MAXIMUM_CAPACITY = PARKING__MAXIMUM_CAPACITY;

	/**
	 * The number of structural features of the '<em>Traditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_FEATURE_COUNT = PARKING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Traditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADITIONAL_OPERATION_COUNT = PARKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Parking.Parking.impl.ChargingStationImpl <em>Charging Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Parking.Parking.impl.ChargingStationImpl
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getChargingStation()
	 * @generated
	 */
	int CHARGING_STATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__ID = PARKING__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__LOCATION = PARKING__LOCATION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__CUSTOMER = PARKING__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__VEHICLE = PARKING__VEHICLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__NAME = PARKING__NAME;

	/**
	 * The feature id for the '<em><b>Available Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__AVAILABLE_VEHICLES = PARKING__AVAILABLE_VEHICLES;

	/**
	 * The feature id for the '<em><b>Maximum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__MAXIMUM_CAPACITY = PARKING__MAXIMUM_CAPACITY;

	/**
	 * The feature id for the '<em><b>Charging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__CHARGING_ENABLED = PARKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__CAPACITY = PARKING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION__RATE = PARKING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Charging Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION_FEATURE_COUNT = PARKING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Charging Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGING_STATION_OPERATION_COUNT = PARKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Parking.Parking.impl.FuelingStationImpl <em>Fueling Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Parking.Parking.impl.FuelingStationImpl
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getFuelingStation()
	 * @generated
	 */
	int FUELING_STATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__ID = PARKING__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__LOCATION = PARKING__LOCATION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__CUSTOMER = PARKING__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__VEHICLE = PARKING__VEHICLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__NAME = PARKING__NAME;

	/**
	 * The feature id for the '<em><b>Available Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__AVAILABLE_VEHICLES = PARKING__AVAILABLE_VEHICLES;

	/**
	 * The feature id for the '<em><b>Maximum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__MAXIMUM_CAPACITY = PARKING__MAXIMUM_CAPACITY;

	/**
	 * The feature id for the '<em><b>Fuel Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__FUEL_ENABLED = PARKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__CAPACITY = PARKING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION__RATE = PARKING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fueling Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION_FEATURE_COUNT = PARKING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fueling Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUELING_STATION_OPERATION_COUNT = PARKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Parking.Parking.impl.AnywhereImpl <em>Anywhere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Parking.Parking.impl.AnywhereImpl
	 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getAnywhere()
	 * @generated
	 */
	int ANYWHERE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE__ID = PARKING__ID;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE__LOCATION = PARKING__LOCATION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE__CUSTOMER = PARKING__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE__VEHICLE = PARKING__VEHICLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE__NAME = PARKING__NAME;

	/**
	 * The feature id for the '<em><b>Available Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE__AVAILABLE_VEHICLES = PARKING__AVAILABLE_VEHICLES;

	/**
	 * The feature id for the '<em><b>Maximum Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE__MAXIMUM_CAPACITY = PARKING__MAXIMUM_CAPACITY;

	/**
	 * The number of structural features of the '<em>Anywhere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE_FEATURE_COUNT = PARKING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anywhere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANYWHERE_OPERATION_COUNT = PARKING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Parking.Parking.Parking <em>Parking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parking</em>'.
	 * @see com.tum.vsms.Parking.Parking.Parking
	 * @generated
	 */
	EClass getParking();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.Parking#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.tum.vsms.Parking.Parking.Parking#getId()
	 * @see #getParking()
	 * @generated
	 */
	EAttribute getParking_Id();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Parking.Parking.Parking#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see com.tum.vsms.Parking.Parking.Parking#getLocation()
	 * @see #getParking()
	 * @generated
	 */
	EReference getParking_Location();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Parking.Parking.Parking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see com.tum.vsms.Parking.Parking.Parking#getCustomer()
	 * @see #getParking()
	 * @generated
	 */
	EReference getParking_Customer();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Parking.Parking.Parking#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see com.tum.vsms.Parking.Parking.Parking#getVehicle()
	 * @see #getParking()
	 * @generated
	 */
	EReference getParking_Vehicle();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.Parking#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tum.vsms.Parking.Parking.Parking#getName()
	 * @see #getParking()
	 * @generated
	 */
	EAttribute getParking_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.Parking#getAvailableVehicles <em>Available Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Vehicles</em>'.
	 * @see com.tum.vsms.Parking.Parking.Parking#getAvailableVehicles()
	 * @see #getParking()
	 * @generated
	 */
	EAttribute getParking_AvailableVehicles();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.Parking#getMaximumCapacity <em>Maximum Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Capacity</em>'.
	 * @see com.tum.vsms.Parking.Parking.Parking#getMaximumCapacity()
	 * @see #getParking()
	 * @generated
	 */
	EAttribute getParking_MaximumCapacity();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Parking.Parking.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see com.tum.vsms.Parking.Parking.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Parking.Parking.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see com.tum.vsms.Parking.Parking.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Parking.Parking.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see com.tum.vsms.Parking.Parking.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Parking.Parking.Traditional <em>Traditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traditional</em>'.
	 * @see com.tum.vsms.Parking.Parking.Traditional
	 * @generated
	 */
	EClass getTraditional();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Parking.Parking.ChargingStation <em>Charging Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charging Station</em>'.
	 * @see com.tum.vsms.Parking.Parking.ChargingStation
	 * @generated
	 */
	EClass getChargingStation();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.ChargingStation#getChargingEnabled <em>Charging Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Enabled</em>'.
	 * @see com.tum.vsms.Parking.Parking.ChargingStation#getChargingEnabled()
	 * @see #getChargingStation()
	 * @generated
	 */
	EAttribute getChargingStation_ChargingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.ChargingStation#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.tum.vsms.Parking.Parking.ChargingStation#getCapacity()
	 * @see #getChargingStation()
	 * @generated
	 */
	EAttribute getChargingStation_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.ChargingStation#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see com.tum.vsms.Parking.Parking.ChargingStation#getRate()
	 * @see #getChargingStation()
	 * @generated
	 */
	EAttribute getChargingStation_Rate();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Parking.Parking.FuelingStation <em>Fueling Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fueling Station</em>'.
	 * @see com.tum.vsms.Parking.Parking.FuelingStation
	 * @generated
	 */
	EClass getFuelingStation();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.FuelingStation#getFuelEnabled <em>Fuel Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Enabled</em>'.
	 * @see com.tum.vsms.Parking.Parking.FuelingStation#getFuelEnabled()
	 * @see #getFuelingStation()
	 * @generated
	 */
	EAttribute getFuelingStation_FuelEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.FuelingStation#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.tum.vsms.Parking.Parking.FuelingStation#getCapacity()
	 * @see #getFuelingStation()
	 * @generated
	 */
	EAttribute getFuelingStation_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Parking.Parking.FuelingStation#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see com.tum.vsms.Parking.Parking.FuelingStation#getRate()
	 * @see #getFuelingStation()
	 * @generated
	 */
	EAttribute getFuelingStation_Rate();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Parking.Parking.Anywhere <em>Anywhere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anywhere</em>'.
	 * @see com.tum.vsms.Parking.Parking.Anywhere
	 * @generated
	 */
	EClass getAnywhere();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParkingFactory getParkingFactory();

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
		 * The meta object literal for the '{@link com.tum.vsms.Parking.Parking.impl.ParkingImpl <em>Parking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingImpl
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getParking()
		 * @generated
		 */
		EClass PARKING = eINSTANCE.getParking();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARKING__ID = eINSTANCE.getParking_Id();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARKING__LOCATION = eINSTANCE.getParking_Location();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARKING__CUSTOMER = eINSTANCE.getParking_Customer();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARKING__VEHICLE = eINSTANCE.getParking_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARKING__NAME = eINSTANCE.getParking_Name();

		/**
		 * The meta object literal for the '<em><b>Available Vehicles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARKING__AVAILABLE_VEHICLES = eINSTANCE.getParking_AvailableVehicles();

		/**
		 * The meta object literal for the '<em><b>Maximum Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARKING__MAXIMUM_CAPACITY = eINSTANCE.getParking_MaximumCapacity();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Parking.Parking.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Parking.Parking.impl.VehicleImpl
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Parking.Parking.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Parking.Parking.impl.CustomerImpl
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Parking.Parking.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Parking.Parking.impl.LocationImpl
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Parking.Parking.impl.TraditionalImpl <em>Traditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Parking.Parking.impl.TraditionalImpl
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getTraditional()
		 * @generated
		 */
		EClass TRADITIONAL = eINSTANCE.getTraditional();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Parking.Parking.impl.ChargingStationImpl <em>Charging Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Parking.Parking.impl.ChargingStationImpl
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getChargingStation()
		 * @generated
		 */
		EClass CHARGING_STATION = eINSTANCE.getChargingStation();

		/**
		 * The meta object literal for the '<em><b>Charging Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_STATION__CHARGING_ENABLED = eINSTANCE.getChargingStation_ChargingEnabled();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_STATION__CAPACITY = eINSTANCE.getChargingStation_Capacity();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGING_STATION__RATE = eINSTANCE.getChargingStation_Rate();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Parking.Parking.impl.FuelingStationImpl <em>Fueling Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Parking.Parking.impl.FuelingStationImpl
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getFuelingStation()
		 * @generated
		 */
		EClass FUELING_STATION = eINSTANCE.getFuelingStation();

		/**
		 * The meta object literal for the '<em><b>Fuel Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUELING_STATION__FUEL_ENABLED = eINSTANCE.getFuelingStation_FuelEnabled();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUELING_STATION__CAPACITY = eINSTANCE.getFuelingStation_Capacity();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUELING_STATION__RATE = eINSTANCE.getFuelingStation_Rate();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Parking.Parking.impl.AnywhereImpl <em>Anywhere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Parking.Parking.impl.AnywhereImpl
		 * @see com.tum.vsms.Parking.Parking.impl.ParkingPackageImpl#getAnywhere()
		 * @generated
		 */
		EClass ANYWHERE = eINSTANCE.getAnywhere();

	}

} //ParkingPackage
