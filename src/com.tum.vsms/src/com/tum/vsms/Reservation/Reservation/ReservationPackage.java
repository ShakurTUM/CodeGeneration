/**
 */
package com.tum.vsms.Reservation.Reservation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.tum.vsms.Reservation.Reservation.ReservationFactory
 * @model kind="package"
 * @generated
 */
public interface ReservationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Reservation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.tum.vsms.Reservation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.tum.vsms.Reservation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReservationPackage eINSTANCE = com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationImpl
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__TOTAL_COST = 1;

	/**
	 * The feature id for the '<em><b>Start time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__START_DATE = 4;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__END_DATE = 5;

	/**
	 * The feature id for the '<em><b>Refuel Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__REFUEL_ENABLED = 6;

	/**
	 * The feature id for the '<em><b>Charging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__CHARGING_ENABLED = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DURATION = 8;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__CUSTOMER = 9;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__VEHICLE = 10;

	/**
	 * The feature id for the '<em><b>Start location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__START_LOCATION = 11;

	/**
	 * The feature id for the '<em><b>End location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__END_LOCATION = 12;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.impl.PastReservationImpl <em>Past Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.impl.PastReservationImpl
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getPastReservation()
	 * @generated
	 */
	int PAST_RESERVATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__ID = RESERVATION__ID;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__TOTAL_COST = RESERVATION__TOTAL_COST;

	/**
	 * The feature id for the '<em><b>Start time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__START_TIME = RESERVATION__START_TIME;

	/**
	 * The feature id for the '<em><b>End time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__END_TIME = RESERVATION__END_TIME;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__START_DATE = RESERVATION__START_DATE;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__END_DATE = RESERVATION__END_DATE;

	/**
	 * The feature id for the '<em><b>Refuel Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__REFUEL_ENABLED = RESERVATION__REFUEL_ENABLED;

	/**
	 * The feature id for the '<em><b>Charging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__CHARGING_ENABLED = RESERVATION__CHARGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__DURATION = RESERVATION__DURATION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__CUSTOMER = RESERVATION__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__VEHICLE = RESERVATION__VEHICLE;

	/**
	 * The feature id for the '<em><b>Start location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__START_LOCATION = RESERVATION__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION__END_LOCATION = RESERVATION__END_LOCATION;

	/**
	 * The number of structural features of the '<em>Past Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION_FEATURE_COUNT = RESERVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION___PAYMENT_DETAILS = RESERVATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Past Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_RESERVATION_OPERATION_COUNT = RESERVATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.impl.CurrentReservationImpl <em>Current Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.impl.CurrentReservationImpl
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getCurrentReservation()
	 * @generated
	 */
	int CURRENT_RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__ID = RESERVATION__ID;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__TOTAL_COST = RESERVATION__TOTAL_COST;

	/**
	 * The feature id for the '<em><b>Start time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__START_TIME = RESERVATION__START_TIME;

	/**
	 * The feature id for the '<em><b>End time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__END_TIME = RESERVATION__END_TIME;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__START_DATE = RESERVATION__START_DATE;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__END_DATE = RESERVATION__END_DATE;

	/**
	 * The feature id for the '<em><b>Refuel Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__REFUEL_ENABLED = RESERVATION__REFUEL_ENABLED;

	/**
	 * The feature id for the '<em><b>Charging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__CHARGING_ENABLED = RESERVATION__CHARGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__DURATION = RESERVATION__DURATION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__CUSTOMER = RESERVATION__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__VEHICLE = RESERVATION__VEHICLE;

	/**
	 * The feature id for the '<em><b>Start location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__START_LOCATION = RESERVATION__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION__END_LOCATION = RESERVATION__END_LOCATION;

	/**
	 * The number of structural features of the '<em>Current Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION_FEATURE_COUNT = RESERVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Extend Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION___EXTEND_RESERVATION = RESERVATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Complete Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION___COMPLETE_RESERVATION = RESERVATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Current Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_RESERVATION_OPERATION_COUNT = RESERVATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.impl.FutureReservationImpl <em>Future Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.impl.FutureReservationImpl
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getFutureReservation()
	 * @generated
	 */
	int FUTURE_RESERVATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__ID = RESERVATION__ID;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__TOTAL_COST = RESERVATION__TOTAL_COST;

	/**
	 * The feature id for the '<em><b>Start time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__START_TIME = RESERVATION__START_TIME;

	/**
	 * The feature id for the '<em><b>End time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__END_TIME = RESERVATION__END_TIME;

	/**
	 * The feature id for the '<em><b>Start date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__START_DATE = RESERVATION__START_DATE;

	/**
	 * The feature id for the '<em><b>End date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__END_DATE = RESERVATION__END_DATE;

	/**
	 * The feature id for the '<em><b>Refuel Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__REFUEL_ENABLED = RESERVATION__REFUEL_ENABLED;

	/**
	 * The feature id for the '<em><b>Charging Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__CHARGING_ENABLED = RESERVATION__CHARGING_ENABLED;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__DURATION = RESERVATION__DURATION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__CUSTOMER = RESERVATION__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__VEHICLE = RESERVATION__VEHICLE;

	/**
	 * The feature id for the '<em><b>Start location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__START_LOCATION = RESERVATION__START_LOCATION;

	/**
	 * The feature id for the '<em><b>End location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION__END_LOCATION = RESERVATION__END_LOCATION;

	/**
	 * The number of structural features of the '<em>Future Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION_FEATURE_COUNT = RESERVATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION___START_RESERVATION = RESERVATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Future Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_RESERVATION_OPERATION_COUNT = RESERVATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl <em>Addon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.impl.AddonImpl
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getAddon()
	 * @generated
	 */
	int ADDON = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__ID = 0;

	/**
	 * The feature id for the '<em><b>Location Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__LOCATION_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__NAME = 2;

	/**
	 * The feature id for the '<em><b>Addon Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__ADDON_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__COUNT = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__PRICE = 5;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__RATE = 6;

	/**
	 * The number of structural features of the '<em>Addon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Addon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.impl.CustomerImpl
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 5;

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
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.impl.VehicleImpl
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 6;

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
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.impl.LocationImpl
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

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
	 * The meta object id for the '{@link com.tum.vsms.Reservation.Reservation.AddonType <em>Addon Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Reservation.Reservation.AddonType
	 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getAddonType()
	 * @generated
	 */
	int ADDON_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Reservation.Reservation.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getId()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#getTotalCost <em>Total Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cost</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getTotalCost()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_TotalCost();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_time <em>Start time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start time</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getStart_time()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Start_time();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_time <em>End time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End time</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getEnd_time()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_End_time();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_date <em>Start date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start date</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getStart_date()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Start_date();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_date <em>End date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End date</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getEnd_date()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_End_date();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#isRefuelEnabled <em>Refuel Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refuel Enabled</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#isRefuelEnabled()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_RefuelEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#isChargingEnabled <em>Charging Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging Enabled</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#isChargingEnabled()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_ChargingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Reservation#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getDuration()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Duration();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Reservation.Reservation.Reservation#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getCustomer()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Customer();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Reservation.Reservation.Reservation#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getVehicle()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Vehicle();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Reservation.Reservation.Reservation#getStart_location <em>Start location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start location</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getStart_location()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Start_location();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Reservation.Reservation.Reservation#getEnd_location <em>End location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End location</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation#getEnd_location()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_End_location();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Reservation.Reservation.PastReservation <em>Past Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Past Reservation</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.PastReservation
	 * @generated
	 */
	EClass getPastReservation();

	/**
	 * Returns the meta object for the '{@link com.tum.vsms.Reservation.Reservation.PastReservation#paymentDetails() <em>Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Payment Details</em>' operation.
	 * @see com.tum.vsms.Reservation.Reservation.PastReservation#paymentDetails()
	 * @generated
	 */
	EOperation getPastReservation__PaymentDetails();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Reservation.Reservation.CurrentReservation <em>Current Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Reservation</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.CurrentReservation
	 * @generated
	 */
	EClass getCurrentReservation();

	/**
	 * Returns the meta object for the '{@link com.tum.vsms.Reservation.Reservation.CurrentReservation#extendReservation() <em>Extend Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extend Reservation</em>' operation.
	 * @see com.tum.vsms.Reservation.Reservation.CurrentReservation#extendReservation()
	 * @generated
	 */
	EOperation getCurrentReservation__ExtendReservation();

	/**
	 * Returns the meta object for the '{@link com.tum.vsms.Reservation.Reservation.CurrentReservation#completeReservation() <em>Complete Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Complete Reservation</em>' operation.
	 * @see com.tum.vsms.Reservation.Reservation.CurrentReservation#completeReservation()
	 * @generated
	 */
	EOperation getCurrentReservation__CompleteReservation();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Reservation.Reservation.FutureReservation <em>Future Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Future Reservation</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.FutureReservation
	 * @generated
	 */
	EClass getFutureReservation();

	/**
	 * Returns the meta object for the '{@link com.tum.vsms.Reservation.Reservation.FutureReservation#startReservation() <em>Start Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Reservation</em>' operation.
	 * @see com.tum.vsms.Reservation.Reservation.FutureReservation#startReservation()
	 * @generated
	 */
	EOperation getFutureReservation__StartReservation();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Reservation.Reservation.Addon <em>Addon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addon</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Addon
	 * @generated
	 */
	EClass getAddon();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Addon#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Addon#getId()
	 * @see #getAddon()
	 * @generated
	 */
	EAttribute getAddon_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Addon#getLocationId <em>Location Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Id</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Addon#getLocationId()
	 * @see #getAddon()
	 * @generated
	 */
	EAttribute getAddon_LocationId();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Addon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Addon#getName()
	 * @see #getAddon()
	 * @generated
	 */
	EAttribute getAddon_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Addon#getAddonType <em>Addon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addon Type</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Addon#getAddonType()
	 * @see #getAddon()
	 * @generated
	 */
	EAttribute getAddon_AddonType();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Addon#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Addon#getCount()
	 * @see #getAddon()
	 * @generated
	 */
	EAttribute getAddon_Count();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Addon#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Addon#getPrice()
	 * @see #getAddon()
	 * @generated
	 */
	EAttribute getAddon_Price();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Reservation.Reservation.Addon#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Addon#getRate()
	 * @see #getAddon()
	 * @generated
	 */
	EAttribute getAddon_Rate();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Reservation.Reservation.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Reservation.Reservation.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Reservation.Reservation.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for enum '{@link com.tum.vsms.Reservation.Reservation.AddonType <em>Addon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Addon Type</em>'.
	 * @see com.tum.vsms.Reservation.Reservation.AddonType
	 * @generated
	 */
	EEnum getAddonType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReservationFactory getReservationFactory();

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
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationImpl
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__ID = eINSTANCE.getReservation_Id();

		/**
		 * The meta object literal for the '<em><b>Total Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__TOTAL_COST = eINSTANCE.getReservation_TotalCost();

		/**
		 * The meta object literal for the '<em><b>Start time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__START_TIME = eINSTANCE.getReservation_Start_time();

		/**
		 * The meta object literal for the '<em><b>End time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__END_TIME = eINSTANCE.getReservation_End_time();

		/**
		 * The meta object literal for the '<em><b>Start date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__START_DATE = eINSTANCE.getReservation_Start_date();

		/**
		 * The meta object literal for the '<em><b>End date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__END_DATE = eINSTANCE.getReservation_End_date();

		/**
		 * The meta object literal for the '<em><b>Refuel Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__REFUEL_ENABLED = eINSTANCE.getReservation_RefuelEnabled();

		/**
		 * The meta object literal for the '<em><b>Charging Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__CHARGING_ENABLED = eINSTANCE.getReservation_ChargingEnabled();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__DURATION = eINSTANCE.getReservation_Duration();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__CUSTOMER = eINSTANCE.getReservation_Customer();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__VEHICLE = eINSTANCE.getReservation_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Start location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__START_LOCATION = eINSTANCE.getReservation_Start_location();

		/**
		 * The meta object literal for the '<em><b>End location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__END_LOCATION = eINSTANCE.getReservation_End_location();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.impl.PastReservationImpl <em>Past Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.impl.PastReservationImpl
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getPastReservation()
		 * @generated
		 */
		EClass PAST_RESERVATION = eINSTANCE.getPastReservation();

		/**
		 * The meta object literal for the '<em><b>Payment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAST_RESERVATION___PAYMENT_DETAILS = eINSTANCE.getPastReservation__PaymentDetails();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.impl.CurrentReservationImpl <em>Current Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.impl.CurrentReservationImpl
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getCurrentReservation()
		 * @generated
		 */
		EClass CURRENT_RESERVATION = eINSTANCE.getCurrentReservation();

		/**
		 * The meta object literal for the '<em><b>Extend Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENT_RESERVATION___EXTEND_RESERVATION = eINSTANCE.getCurrentReservation__ExtendReservation();

		/**
		 * The meta object literal for the '<em><b>Complete Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENT_RESERVATION___COMPLETE_RESERVATION = eINSTANCE.getCurrentReservation__CompleteReservation();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.impl.FutureReservationImpl <em>Future Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.impl.FutureReservationImpl
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getFutureReservation()
		 * @generated
		 */
		EClass FUTURE_RESERVATION = eINSTANCE.getFutureReservation();

		/**
		 * The meta object literal for the '<em><b>Start Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUTURE_RESERVATION___START_RESERVATION = eINSTANCE.getFutureReservation__StartReservation();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.impl.AddonImpl <em>Addon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.impl.AddonImpl
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getAddon()
		 * @generated
		 */
		EClass ADDON = eINSTANCE.getAddon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDON__ID = eINSTANCE.getAddon_Id();

		/**
		 * The meta object literal for the '<em><b>Location Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDON__LOCATION_ID = eINSTANCE.getAddon_LocationId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDON__NAME = eINSTANCE.getAddon_Name();

		/**
		 * The meta object literal for the '<em><b>Addon Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDON__ADDON_TYPE = eINSTANCE.getAddon_AddonType();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDON__COUNT = eINSTANCE.getAddon_Count();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDON__PRICE = eINSTANCE.getAddon_Price();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDON__RATE = eINSTANCE.getAddon_Rate();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.impl.CustomerImpl
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.impl.VehicleImpl
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.impl.LocationImpl
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Reservation.Reservation.AddonType <em>Addon Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Reservation.Reservation.AddonType
		 * @see com.tum.vsms.Reservation.Reservation.impl.ReservationPackageImpl#getAddonType()
		 * @generated
		 */
		EEnum ADDON_TYPE = eINSTANCE.getAddonType();

	}

} //ReservationPackage
