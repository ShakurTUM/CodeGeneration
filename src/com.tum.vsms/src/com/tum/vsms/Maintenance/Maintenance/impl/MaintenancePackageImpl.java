/**
 */
package com.tum.vsms.Maintenance.Maintenance.impl;

import com.tum.vsms.Maintenance.Maintenance.FuelType;
import com.tum.vsms.Maintenance.Maintenance.Location;
import com.tum.vsms.Maintenance.Maintenance.Maintenance;
import com.tum.vsms.Maintenance.Maintenance.MaintenanceFactory;
import com.tum.vsms.Maintenance.Maintenance.MaintenancePackage;
import com.tum.vsms.Maintenance.Maintenance.MaintenanceStatus;
import com.tum.vsms.Maintenance.Maintenance.Recharge;
import com.tum.vsms.Maintenance.Maintenance.Refuel;
import com.tum.vsms.Maintenance.Maintenance.Relocate;
import com.tum.vsms.Maintenance.Maintenance.Repair;

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
public class MaintenancePackageImpl extends EPackageImpl implements MaintenancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenanceEClass = null;

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
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rechargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relocateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maintenanceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fuelTypeEEnum = null;

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
	 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaintenancePackageImpl() {
		super(eNS_URI, MaintenanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MaintenancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaintenancePackage init() {
		if (isInited) return (MaintenancePackage)EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMaintenancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MaintenancePackageImpl theMaintenancePackage = registeredMaintenancePackage instanceof MaintenancePackageImpl ? (MaintenancePackageImpl)registeredMaintenancePackage : new MaintenancePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMaintenancePackage.createPackageContents();

		// Initialize created meta-data
		theMaintenancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaintenancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaintenancePackage.eNS_URI, theMaintenancePackage);
		return theMaintenancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintenance() {
		return maintenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_Id() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_ReservationId() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_CustomerId() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_Status() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_Cost() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_Start_date() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_End_date() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_RequiredManpower() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintenance_RequiredTime() {
		return (EAttribute)maintenanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenance_Vehicle() {
		return (EReference)maintenanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenance_Location() {
		return (EReference)maintenanceEClass.getEStructuralFeatures().get(10);
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
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepair() {
		return repairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepair_IssueDetails() {
		return (EAttribute)repairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepair_RequiredTools() {
		return (EAttribute)repairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepair_Materials() {
		return (EAttribute)repairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecharge() {
		return rechargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecharge_RequiredCharge() {
		return (EAttribute)rechargeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecharge_Amount() {
		return (EAttribute)rechargeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecharge_Rate() {
		return (EAttribute)rechargeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecharge_CurrentCharge() {
		return (EAttribute)rechargeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefuel() {
		return refuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefuel_CurrentFuel() {
		return (EAttribute)refuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefuel_RequiredFuel() {
		return (EAttribute)refuelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefuel_FuelType() {
		return (EAttribute)refuelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefuel_Amount() {
		return (EAttribute)refuelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelocate() {
		return relocateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelocate_Destination() {
		return (EReference)relocateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaintenanceStatus() {
		return maintenanceStatusEEnum;
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
	public MaintenanceFactory getMaintenanceFactory() {
		return (MaintenanceFactory)getEFactoryInstance();
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
		maintenanceEClass = createEClass(MAINTENANCE);
		createEAttribute(maintenanceEClass, MAINTENANCE__ID);
		createEAttribute(maintenanceEClass, MAINTENANCE__RESERVATION_ID);
		createEAttribute(maintenanceEClass, MAINTENANCE__CUSTOMER_ID);
		createEAttribute(maintenanceEClass, MAINTENANCE__STATUS);
		createEAttribute(maintenanceEClass, MAINTENANCE__COST);
		createEAttribute(maintenanceEClass, MAINTENANCE__START_DATE);
		createEAttribute(maintenanceEClass, MAINTENANCE__END_DATE);
		createEAttribute(maintenanceEClass, MAINTENANCE__REQUIRED_MANPOWER);
		createEAttribute(maintenanceEClass, MAINTENANCE__REQUIRED_TIME);
		createEReference(maintenanceEClass, MAINTENANCE__VEHICLE);
		createEReference(maintenanceEClass, MAINTENANCE__LOCATION);

		vehicleEClass = createEClass(VEHICLE);

		locationEClass = createEClass(LOCATION);

		repairEClass = createEClass(REPAIR);
		createEAttribute(repairEClass, REPAIR__ISSUE_DETAILS);
		createEAttribute(repairEClass, REPAIR__REQUIRED_TOOLS);
		createEAttribute(repairEClass, REPAIR__MATERIALS);

		rechargeEClass = createEClass(RECHARGE);
		createEAttribute(rechargeEClass, RECHARGE__REQUIRED_CHARGE);
		createEAttribute(rechargeEClass, RECHARGE__AMOUNT);
		createEAttribute(rechargeEClass, RECHARGE__RATE);
		createEAttribute(rechargeEClass, RECHARGE__CURRENT_CHARGE);

		refuelEClass = createEClass(REFUEL);
		createEAttribute(refuelEClass, REFUEL__CURRENT_FUEL);
		createEAttribute(refuelEClass, REFUEL__REQUIRED_FUEL);
		createEAttribute(refuelEClass, REFUEL__FUEL_TYPE);
		createEAttribute(refuelEClass, REFUEL__AMOUNT);

		relocateEClass = createEClass(RELOCATE);
		createEReference(relocateEClass, RELOCATE__DESTINATION);

		// Create enums
		maintenanceStatusEEnum = createEEnum(MAINTENANCE_STATUS);
		fuelTypeEEnum = createEEnum(FUEL_TYPE);
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
		repairEClass.getESuperTypes().add(this.getMaintenance());
		rechargeEClass.getESuperTypes().add(this.getMaintenance());
		refuelEClass.getESuperTypes().add(this.getMaintenance());
		relocateEClass.getESuperTypes().add(this.getMaintenance());

		// Initialize classes, features, and operations; add parameters
		initEClass(maintenanceEClass, Maintenance.class, "Maintenance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaintenance_Id(), ecorePackage.getEString(), "id", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenance_ReservationId(), ecorePackage.getEString(), "reservationId", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenance_CustomerId(), ecorePackage.getEString(), "customerId", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenance_Status(), this.getMaintenanceStatus(), "status", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenance_Cost(), ecorePackage.getEFloat(), "cost", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenance_Start_date(), ecorePackage.getEDate(), "start_date", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenance_End_date(), ecorePackage.getEDate(), "end_date", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenance_RequiredManpower(), ecorePackage.getEInt(), "requiredManpower", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenance_RequiredTime(), ecorePackage.getEFloat(), "requiredTime", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaintenance_Vehicle(), this.getVehicle(), null, "vehicle", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaintenance_Location(), this.getLocation(), null, "location", null, 0, 1, Maintenance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleEClass, Object.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repairEClass, Repair.class, "Repair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepair_IssueDetails(), ecorePackage.getEString(), "issueDetails", null, 0, 1, Repair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepair_RequiredTools(), ecorePackage.getEString(), "requiredTools", null, 0, 1, Repair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepair_Materials(), ecorePackage.getEString(), "materials", null, 0, 1, Repair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rechargeEClass, Recharge.class, "Recharge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecharge_RequiredCharge(), ecorePackage.getEFloat(), "requiredCharge", null, 0, 1, Recharge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecharge_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, Recharge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecharge_Rate(), ecorePackage.getEDouble(), "rate", null, 0, 1, Recharge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecharge_CurrentCharge(), ecorePackage.getEFloat(), "currentCharge", null, 0, 1, Recharge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refuelEClass, Refuel.class, "Refuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefuel_CurrentFuel(), ecorePackage.getEFloat(), "currentFuel", null, 0, 1, Refuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefuel_RequiredFuel(), ecorePackage.getEFloat(), "requiredFuel", null, 0, 1, Refuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefuel_FuelType(), this.getFuelType(), "fuelType", null, 0, 1, Refuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefuel_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, Refuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relocateEClass, Relocate.class, "Relocate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelocate_Destination(), this.getLocation(), null, "destination", null, 0, 1, Relocate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(maintenanceStatusEEnum, MaintenanceStatus.class, "MaintenanceStatus");
		addEEnumLiteral(maintenanceStatusEEnum, MaintenanceStatus.STARTED);
		addEEnumLiteral(maintenanceStatusEEnum, MaintenanceStatus.CURRENT);
		addEEnumLiteral(maintenanceStatusEEnum, MaintenanceStatus.COMPLETED);

		initEEnum(fuelTypeEEnum, FuelType.class, "FuelType");
		addEEnumLiteral(fuelTypeEEnum, FuelType.PETROL);
		addEEnumLiteral(fuelTypeEEnum, FuelType.DIESEL);
		addEEnumLiteral(fuelTypeEEnum, FuelType.OCTANE);
		addEEnumLiteral(fuelTypeEEnum, FuelType.GASOLINE);

		// Create resource
		createResource(eNS_URI);
	}

} //MaintenancePackageImpl
