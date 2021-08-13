/**
 */
package com.tum.vsms.Reservation.Reservation.impl;

import com.tum.vsms.Reservation.Reservation.Addon;
import com.tum.vsms.Reservation.Reservation.AddonType;
import com.tum.vsms.Reservation.Reservation.CurrentReservation;
import com.tum.vsms.Reservation.Reservation.Customer;
import com.tum.vsms.Reservation.Reservation.FutureReservation;
import com.tum.vsms.Reservation.Reservation.Location;
import com.tum.vsms.Reservation.Reservation.PastReservation;
import com.tum.vsms.Reservation.Reservation.Reservation;
import com.tum.vsms.Reservation.Reservation.ReservationFactory;
import com.tum.vsms.Reservation.Reservation.ReservationPackage;
import com.tum.vsms.Reservation.Reservation.Vehicle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReservationPackageImpl extends EPackageImpl implements ReservationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pastReservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentReservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass futureReservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addonEClass = null;

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
	private EEnum addonTypeEEnum = null;

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
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReservationPackageImpl() {
		super(eNS_URI, ReservationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReservationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReservationPackage init() {
		if (isInited) return (ReservationPackage)EPackage.Registry.INSTANCE.getEPackage(ReservationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReservationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReservationPackageImpl theReservationPackage = registeredReservationPackage instanceof ReservationPackageImpl ? (ReservationPackageImpl)registeredReservationPackage : new ReservationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theReservationPackage.createPackageContents();

		// Initialize created meta-data
		theReservationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReservationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReservationPackage.eNS_URI, theReservationPackage);
		return theReservationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservation() {
		return reservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_Id() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_TotalCost() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_Start_time() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_End_time() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_Start_date() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_End_date() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_RefuelEnabled() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_ChargingEnabled() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_Duration() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Customer() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Vehicle() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Start_location() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_End_location() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPastReservation() {
		return pastReservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPastReservation__PaymentDetails() {
		return pastReservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentReservation() {
		return currentReservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCurrentReservation__ExtendReservation() {
		return currentReservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCurrentReservation__CompleteReservation() {
		return currentReservationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFutureReservation() {
		return futureReservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFutureReservation__StartReservation() {
		return futureReservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddon() {
		return addonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_Id() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_LocationId() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_Name() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_AddonType() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_Count() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_Price() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_Rate() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(6);
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
	public EEnum getAddonType() {
		return addonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationFactory getReservationFactory() {
		return (ReservationFactory)getEFactoryInstance();
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
		reservationEClass = createEClass(RESERVATION);
		createEAttribute(reservationEClass, RESERVATION__ID);
		createEAttribute(reservationEClass, RESERVATION__TOTAL_COST);
		createEAttribute(reservationEClass, RESERVATION__START_TIME);
		createEAttribute(reservationEClass, RESERVATION__END_TIME);
		createEAttribute(reservationEClass, RESERVATION__START_DATE);
		createEAttribute(reservationEClass, RESERVATION__END_DATE);
		createEAttribute(reservationEClass, RESERVATION__REFUEL_ENABLED);
		createEAttribute(reservationEClass, RESERVATION__CHARGING_ENABLED);
		createEAttribute(reservationEClass, RESERVATION__DURATION);
		createEReference(reservationEClass, RESERVATION__CUSTOMER);
		createEReference(reservationEClass, RESERVATION__VEHICLE);
		createEReference(reservationEClass, RESERVATION__START_LOCATION);
		createEReference(reservationEClass, RESERVATION__END_LOCATION);

		pastReservationEClass = createEClass(PAST_RESERVATION);
		createEOperation(pastReservationEClass, PAST_RESERVATION___PAYMENT_DETAILS);

		currentReservationEClass = createEClass(CURRENT_RESERVATION);
		createEOperation(currentReservationEClass, CURRENT_RESERVATION___EXTEND_RESERVATION);
		createEOperation(currentReservationEClass, CURRENT_RESERVATION___COMPLETE_RESERVATION);

		futureReservationEClass = createEClass(FUTURE_RESERVATION);
		createEOperation(futureReservationEClass, FUTURE_RESERVATION___START_RESERVATION);

		addonEClass = createEClass(ADDON);
		createEAttribute(addonEClass, ADDON__ID);
		createEAttribute(addonEClass, ADDON__LOCATION_ID);
		createEAttribute(addonEClass, ADDON__NAME);
		createEAttribute(addonEClass, ADDON__ADDON_TYPE);
		createEAttribute(addonEClass, ADDON__COUNT);
		createEAttribute(addonEClass, ADDON__PRICE);
		createEAttribute(addonEClass, ADDON__RATE);

		customerEClass = createEClass(CUSTOMER);

		vehicleEClass = createEClass(VEHICLE);

		locationEClass = createEClass(LOCATION);

		// Create enums
		addonTypeEEnum = createEEnum(ADDON_TYPE);
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
		pastReservationEClass.getESuperTypes().add(this.getReservation());
		currentReservationEClass.getESuperTypes().add(this.getReservation());
		futureReservationEClass.getESuperTypes().add(this.getReservation());

		// Initialize classes, features, and operations; add parameters
		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservation_Id(), ecorePackage.getEString(), "id", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_TotalCost(), ecorePackage.getEDouble(), "totalCost", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_Start_time(), ecorePackage.getEDate(), "start_time", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_End_time(), ecorePackage.getEString(), "end_time", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_Start_date(), ecorePackage.getEDate(), "start_date", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_End_date(), ecorePackage.getEDate(), "end_date", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_RefuelEnabled(), ecorePackage.getEBoolean(), "refuelEnabled", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_ChargingEnabled(), ecorePackage.getEBoolean(), "chargingEnabled", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservation_Customer(), this.getCustomer(), null, "customer", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservation_Vehicle(), this.getVehicle(), null, "vehicle", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservation_Start_location(), this.getLocation(), null, "start_location", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservation_End_location(), this.getLocation(), null, "end_location", null, 0, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pastReservationEClass, PastReservation.class, "PastReservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPastReservation__PaymentDetails(), null, "paymentDetails", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(currentReservationEClass, CurrentReservation.class, "CurrentReservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCurrentReservation__ExtendReservation(), null, "extendReservation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCurrentReservation__CompleteReservation(), null, "completeReservation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(futureReservationEClass, FutureReservation.class, "FutureReservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFutureReservation__StartReservation(), null, "startReservation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(addonEClass, Addon.class, "Addon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddon_Id(), ecorePackage.getEString(), "id", null, 0, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddon_LocationId(), ecorePackage.getEString(), "locationId", null, 0, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddon_Name(), ecorePackage.getEString(), "name", null, 0, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddon_AddonType(), this.getAddonType(), "addonType", null, 0, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddon_Count(), ecorePackage.getEInt(), "count", null, 0, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddon_Price(), ecorePackage.getEInt(), "price", null, 0, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddon_Rate(), ecorePackage.getEDouble(), "rate", null, 0, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(addonTypeEEnum, AddonType.class, "AddonType");
		addEEnumLiteral(addonTypeEEnum, AddonType.EXTRA_SEAT);
		addEEnumLiteral(addonTypeEEnum, AddonType.FOOD);
		addEEnumLiteral(addonTypeEEnum, AddonType.HEADSET);

		// Create resource
		createResource(eNS_URI);
	}

} //ReservationPackageImpl
