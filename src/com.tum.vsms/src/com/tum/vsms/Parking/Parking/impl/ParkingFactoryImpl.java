/**
 */
package com.tum.vsms.Parking.Parking.impl;

import com.tum.vsms.Parking.Parking.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParkingFactoryImpl extends EFactoryImpl implements ParkingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParkingFactory init() {
		try {
			ParkingFactory theParkingFactory = (ParkingFactory)EPackage.Registry.INSTANCE.getEFactory(ParkingPackage.eNS_URI);
			if (theParkingFactory != null) {
				return theParkingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParkingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParkingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ParkingPackage.PARKING: return createParking();
			case ParkingPackage.VEHICLE: return createVehicle();
			case ParkingPackage.CUSTOMER: return createCustomer();
			case ParkingPackage.LOCATION: return createLocation();
			case ParkingPackage.TRADITIONAL: return createTraditional();
			case ParkingPackage.CHARGING_STATION: return createChargingStation();
			case ParkingPackage.FUELING_STATION: return createFuelingStation();
			case ParkingPackage.ANYWHERE: return createAnywhere();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parking createParking() {
		ParkingImpl parking = new ParkingImpl();
		return parking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle createVehicle() {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Traditional createTraditional() {
		TraditionalImpl traditional = new TraditionalImpl();
		return traditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargingStation createChargingStation() {
		ChargingStationImpl chargingStation = new ChargingStationImpl();
		return chargingStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuelingStation createFuelingStation() {
		FuelingStationImpl fuelingStation = new FuelingStationImpl();
		return fuelingStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anywhere createAnywhere() {
		AnywhereImpl anywhere = new AnywhereImpl();
		return anywhere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParkingPackage getParkingPackage() {
		return (ParkingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParkingPackage getPackage() {
		return ParkingPackage.eINSTANCE;
	}

} //ParkingFactoryImpl
