/**
 */
package com.tum.vsms.Reservation.Reservation.util;

import com.tum.vsms.Reservation.Reservation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage
 * @generated
 */
public class ReservationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReservationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReservationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationSwitch<Adapter> modelSwitch =
		new ReservationSwitch<Adapter>() {
			@Override
			public Adapter caseReservation(Reservation object) {
				return createReservationAdapter();
			}
			@Override
			public Adapter casePastReservation(PastReservation object) {
				return createPastReservationAdapter();
			}
			@Override
			public Adapter caseCurrentReservation(CurrentReservation object) {
				return createCurrentReservationAdapter();
			}
			@Override
			public Adapter caseFutureReservation(FutureReservation object) {
				return createFutureReservationAdapter();
			}
			@Override
			public Adapter caseAddon(Addon object) {
				return createAddonAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Reservation.Reservation.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Reservation.Reservation.Reservation
	 * @generated
	 */
	public Adapter createReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Reservation.Reservation.PastReservation <em>Past Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Reservation.Reservation.PastReservation
	 * @generated
	 */
	public Adapter createPastReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Reservation.Reservation.CurrentReservation <em>Current Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Reservation.Reservation.CurrentReservation
	 * @generated
	 */
	public Adapter createCurrentReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Reservation.Reservation.FutureReservation <em>Future Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Reservation.Reservation.FutureReservation
	 * @generated
	 */
	public Adapter createFutureReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Reservation.Reservation.Addon <em>Addon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Reservation.Reservation.Addon
	 * @generated
	 */
	public Adapter createAddonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Reservation.Reservation.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Reservation.Reservation.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Reservation.Reservation.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Reservation.Reservation.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Reservation.Reservation.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Reservation.Reservation.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReservationAdapterFactory
