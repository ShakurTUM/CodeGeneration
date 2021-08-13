/**
 */
package com.tum.vsms.Reservation.Reservation.impl;

import com.tum.vsms.Reservation.Reservation.PastReservation;
import com.tum.vsms.Reservation.Reservation.ReservationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Past Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PastReservationImpl extends ReservationImpl implements PastReservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PastReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReservationPackage.Literals.PAST_RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void paymentDetails() {
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
			case ReservationPackage.PAST_RESERVATION___PAYMENT_DETAILS:
				paymentDetails();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PastReservationImpl
