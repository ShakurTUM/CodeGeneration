/**
 */
package com.tum.vsms.Parking.Parking.impl;

import com.tum.vsms.Parking.Parking.Anywhere;
import com.tum.vsms.Parking.Parking.ChargingStation;
import com.tum.vsms.Parking.Parking.Customer;
import com.tum.vsms.Parking.Parking.FuelingStation;
import com.tum.vsms.Parking.Parking.Location;
import com.tum.vsms.Parking.Parking.Parking;
import com.tum.vsms.Parking.Parking.ParkingFactory;
import com.tum.vsms.Parking.Parking.ParkingPackage;

import com.tum.vsms.Parking.Parking.Traditional;
import com.tum.vsms.Parking.Parking.Vehicle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParkingPackageImpl extends EPackageImpl implements ParkingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traditionalEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargingStationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuelingStationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anywhereEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.tum.vsms.Parking.Parking.ParkingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParkingPackageImpl() {
		super(eNS_URI, ParkingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ParkingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParkingPackage init() {
		if (isInited) return (ParkingPackage)EPackage.Registry.INSTANCE.getEPackage(ParkingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredParkingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ParkingPackageImpl theParkingPackage = registeredParkingPackage instanceof ParkingPackageImpl ? (ParkingPackageImpl)registeredParkingPackage : new ParkingPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theParkingPackage.createPackageContents();

		// Initialize created meta-data
		theParkingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParkingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParkingPackage.eNS_URI, theParkingPackage);
		return theParkingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParking() {
		return parkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParking_Id() {
		return (EAttribute)parkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParking_Location() {
		return (EReference)parkingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParking_Customer() {
		return (EReference)parkingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParking_Vehicle() {
		return (EReference)parkingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParking_Name() {
		return (EAttribute)parkingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParking_AvailableVehicles() {
		return (EAttribute)parkingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParking_MaximumCapacity() {
		return (EAttribute)parkingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraditional() {
		return traditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChargingStation() {
		return chargingStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChargingStation_ChargingEnabled() {
		return (EAttribute)chargingStationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChargingStation_Capacity() {
		return (EAttribute)chargingStationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChargingStation_Rate() {
		return (EAttribute)chargingStationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuelingStation() {
		return fuelingStationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuelingStation_FuelEnabled() {
		return (EAttribute)fuelingStationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuelingStation_Capacity() {
		return (EAttribute)fuelingStationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuelingStation_Rate() {
		return (EAttribute)fuelingStationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnywhere() {
		return anywhereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParkingFactory getParkingFactory() {
		return (ParkingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		parkingEClass = createEClass(PARKING);
		createEAttribute(parkingEClass, PARKING__ID);
		createEReference(parkingEClass, PARKING__LOCATION);
		createEReference(parkingEClass, PARKING__CUSTOMER);
		createEReference(parkingEClass, PARKING__VEHICLE);
		createEAttribute(parkingEClass, PARKING__NAME);
		createEAttribute(parkingEClass, PARKING__AVAILABLE_VEHICLES);
		createEAttribute(parkingEClass, PARKING__MAXIMUM_CAPACITY);

		vehicleEClass = createEClass(VEHICLE);

		customerEClass = createEClass(CUSTOMER);

		locationEClass = createEClass(LOCATION);

		traditionalEClass = createEClass(TRADITIONAL);

		chargingStationEClass = createEClass(CHARGING_STATION);
		createEAttribute(chargingStationEClass, CHARGING_STATION__CHARGING_ENABLED);
		createEAttribute(chargingStationEClass, CHARGING_STATION__CAPACITY);
		createEAttribute(chargingStationEClass, CHARGING_STATION__RATE);

		fuelingStationEClass = createEClass(FUELING_STATION);
		createEAttribute(fuelingStationEClass, FUELING_STATION__FUEL_ENABLED);
		createEAttribute(fuelingStationEClass, FUELING_STATION__CAPACITY);
		createEAttribute(fuelingStationEClass, FUELING_STATION__RATE);

		anywhereEClass = createEClass(ANYWHERE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		traditionalEClass.getESuperTypes().add(this.getParking());
		chargingStationEClass.getESuperTypes().add(this.getParking());
		fuelingStationEClass.getESuperTypes().add(this.getParking());
		anywhereEClass.getESuperTypes().add(this.getParking());

		// Initialize classes, features, and operations; add parameters
		initEClass(parkingEClass, Parking.class, "Parking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParking_Id(), ecorePackage.getEString(), "id", null, 0, 1, Parking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParking_Location(), this.getLocation(), null, "location", null, 0, 1, Parking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParking_Customer(), this.getCustomer(), null, "customer", null, 0, 1, Parking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParking_Vehicle(), this.getVehicle(), null, "vehicle", null, 0, 1, Parking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParking_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParking_AvailableVehicles(), ecorePackage.getEInt(), "availableVehicles", null, 0, 1, Parking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParking_MaximumCapacity(), ecorePackage.getEInt(), "maximumCapacity", null, 0, 1, Parking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(traditionalEClass, Traditional.class, "Traditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chargingStationEClass, ChargingStation.class, "ChargingStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChargingStation_ChargingEnabled(), ecorePackage.getEInt(), "chargingEnabled", null, 0, 1, ChargingStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingStation_Capacity(), ecorePackage.getEDouble(), "capacity", null, 0, 1, ChargingStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChargingStation_Rate(), ecorePackage.getEDouble(), "rate", null, 0, 1, ChargingStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuelingStationEClass, FuelingStation.class, "FuelingStation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuelingStation_FuelEnabled(), ecorePackage.getEString(), "fuelEnabled", null, 0, 1, FuelingStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuelingStation_Capacity(), ecorePackage.getEString(), "capacity", null, 0, 1, FuelingStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuelingStation_Rate(), ecorePackage.getEDouble(), "rate", null, 0, 1, FuelingStation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anywhereEClass, Anywhere.class, "Anywhere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ParkingPackageImpl
