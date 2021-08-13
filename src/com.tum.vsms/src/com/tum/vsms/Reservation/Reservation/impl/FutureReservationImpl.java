/**
 */
package com.tum.vsms.Reservation.Reservation.impl;

import com.tum.vsms.Reservation.Reservation.FutureReservation;
import com.tum.vsms.Reservation.Reservation.ReservationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Future Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FutureReservationImpl extends ReservationImpl implements FutureReservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FutureReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.FUTURE_RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startReservation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ReservationPackage.FUTURE_RESERVATION___START_RESERVATION:
				startReservation();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FutureReservationImpl
