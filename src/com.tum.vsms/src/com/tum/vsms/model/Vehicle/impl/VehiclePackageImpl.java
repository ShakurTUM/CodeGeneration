/**
 */
package com.tum.vsms.model.Vehicle.impl;

import com.tum.vsms.model.Vehicle.Electric;
import com.tum.vsms.model.Vehicle.FuelType;
import com.tum.vsms.model.Vehicle.Position;
import com.tum.vsms.model.Vehicle.Traditional;
import com.tum.vsms.model.Vehicle.Vehicle;
import com.tum.vsms.model.Vehicle.VehicleFactory;
import com.tum.vsms.model.Vehicle.VehiclePackage;
import com.tum.vsms.model.Vehicle.VehicleType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VehiclePackageImpl extends EPackageImpl implements VehiclePackage {
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
	private EClass electricEClass = null;

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
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fuelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vehicleTypeEEnum = null;

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
	 * @see com.tum.vsms.model.Vehicle.VehiclePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VehiclePackageImpl() {
		super(eNS_URI, VehicleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VehiclePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VehiclePackage init() {
		if (isInited) return (VehiclePackage)EPackage.Registry.INSTANCE.getEPackage(VehiclePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVehiclePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VehiclePackageImpl theVehiclePackage = registeredVehiclePackage instanceof VehiclePackageImpl ? (VehiclePackageImpl)registeredVehiclePackage : new VehiclePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVehiclePackage.createPackageContents();

		// Initialize created meta-data
		theVehiclePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVehiclePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VehiclePackage.eNS_URI, theVehiclePackage);
		return theVehiclePackage;
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
	public EAttribute getVehicle_Name() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_VehicleType() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_License() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Registration() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Brand() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Model() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Year() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Color() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_AvailableSeat() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_AdditionalSeat() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_VehicleId() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_Position() {
		return (EReference)vehicleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectric() {
		return electricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectric_BatteryState() {
		return (EAttribute)electricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectric_Capacity() {
		return (EAttribute)electricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectric_Charger() {
		return (EAttribute)electricEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTraditional_Capacity() {
		return (EAttribute)traditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraditional_FuelType() {
		return (EAttribute)traditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraditional_CurrentFuelLevel() {
		return (EAttribute)traditionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_LocationName() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Latitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Longitude() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFuelType() {
		return fuelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVehicleType() {
		return vehicleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFactory getVehicleFactory() {
		return (VehicleFactory)getEFactoryInstance();
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
		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__NAME);
		createEAttribute(vehicleEClass, VEHICLE__VEHICLE_TYPE);
		createEAttribute(vehicleEClass, VEHICLE__LICENSE);
		createEAttribute(vehicleEClass, VEHICLE__REGISTRATION);
		createEAttribute(vehicleEClass, VEHICLE__BRAND);
		createEAttribute(vehicleEClass, VEHICLE__MODEL);
		createEAttribute(vehicleEClass, VEHICLE__YEAR);
		createEAttribute(vehicleEClass, VEHICLE__COLOR);
		createEAttribute(vehicleEClass, VEHICLE__AVAILABLE_SEAT);
		createEAttribute(vehicleEClass, VEHICLE__ADDITIONAL_SEAT);
		createEAttribute(vehicleEClass, VEHICLE__VEHICLE_ID);
		createEReference(vehicleEClass, VEHICLE__POSITION);

		electricEClass = createEClass(ELECTRIC);
		createEAttribute(electricEClass, ELECTRIC__BATTERY_STATE);
		createEAttribute(electricEClass, ELECTRIC__CAPACITY);
		createEAttribute(electricEClass, ELECTRIC__CHARGER);

		traditionalEClass = createEClass(TRADITIONAL);
		createEAttribute(traditionalEClass, TRADITIONAL__CAPACITY);
		createEAttribute(traditionalEClass, TRADITIONAL__FUEL_TYPE);
		createEAttribute(traditionalEClass, TRADITIONAL__CURRENT_FUEL_LEVEL);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__LOCATION_NAME);
		createEAttribute(positionEClass, POSITION__LATITUDE);
		createEAttribute(positionEClass, POSITION__LONGITUDE);

		// Create enums
		fuelTypeEEnum = createEEnum(FUEL_TYPE);
		vehicleTypeEEnum = createEEnum(VEHICLE_TYPE);
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
		electricEClass.getESuperTypes().add(this.getVehicle());
		traditionalEClass.getESuperTypes().add(this.getVehicle());

		// Initialize classes, features, and operations; add parameters
		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_VehicleType(), this.getVehicleType(), "vehicleType", "Economy", 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_License(), ecorePackage.getEString(), "license", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Registration(), ecorePackage.getEString(), "registration", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Brand(), ecorePackage.getEString(), "brand", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Model(), ecorePackage.getEString(), "model", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Year(), ecorePackage.getEString(), "year", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Color(), ecorePackage.getEString(), "color", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_AvailableSeat(), ecorePackage.getEInt(), "availableSeat", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_AdditionalSeat(), ecorePackage.getEInt(), "additionalSeat", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_VehicleId(), ecorePackage.getEString(), "vehicleId", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Position(), this.getPosition(), null, "position", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricEClass, Electric.class, "Electric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectric_BatteryState(), ecorePackage.getEFloat(), "batteryState", null, 0, 1, Electric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectric_Capacity(), ecorePackage.getEFloat(), "capacity", null, 0, 1, Electric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectric_Charger(), ecorePackage.getEString(), "charger", null, 0, 1, Electric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traditionalEClass, Traditional.class, "Traditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraditional_Capacity(), ecorePackage.getEFloat(), "capacity", null, 0, 1, Traditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraditional_FuelType(), this.getFuelType(), "fuelType", "Petrol", 0, 1, Traditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTraditional_CurrentFuelLevel(), ecorePackage.getEFloat(), "currentFuelLevel", null, 0, 1, Traditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_LocationName(), ecorePackage.getEString(), "locationName", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Latitude(), ecorePackage.getEFloat(), "latitude", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Longitude(), ecorePackage.getEFloat(), "longitude", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fuelTypeEEnum, FuelType.class, "FuelType");
		addEEnumLiteral(fuelTypeEEnum, FuelType.PETROL);
		addEEnumLiteral(fuelTypeEEnum, FuelType.DIESEL);
		addEEnumLiteral(fuelTypeEEnum, FuelType.OCTANE);
		addEEnumLiteral(fuelTypeEEnum, FuelType.GASOLINE);

		initEEnum(vehicleTypeEEnum, VehicleType.class, "VehicleType");
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.ECONOMY);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.COMPACT);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.MID_SIZE);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.FULL_SIZE);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.PREMIUM);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.LUXARY);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.SUV);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.VAN);

		// Create resource
		createResource(eNS_URI);
	}

} //VehiclePackageImpl
