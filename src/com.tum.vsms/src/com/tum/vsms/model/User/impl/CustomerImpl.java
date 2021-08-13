/**
 */
package com.tum.vsms.model.User.impl;

import com.tum.vsms.model.User.Customer;
import com.tum.vsms.model.User.UserPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.User.impl.CustomerImpl#getDrivingLicense <em>Driving License</em>}</li>
 *   <li>{@link com.tum.vsms.model.User.impl.CustomerImpl#getPassport <em>Passport</em>}</li>
 *   <li>{@link com.tum.vsms.model.User.impl.CustomerImpl#getInsurance <em>Insurance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends UserImpl implements Customer {
	/**
	 * The default value of the '{@link #getDrivingLicense() <em>Driving License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVING_LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDrivingLicense() <em>Driving License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingLicense()
	 * @generated
	 * @ordered
	 */
	protected String drivingLicense = DRIVING_LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassport() <em>Passport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassport()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassport() <em>Passport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassport()
	 * @generated
	 * @ordered
	 */
	protected String passport = PASSPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsurance() <em>Insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected static final String INSURANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected String insurance = INSURANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDrivingLicense() {
		return drivingLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrivingLicense(String newDrivingLicense) {
		String oldDrivingLicense = drivingLicense;
		drivingLicense = newDrivingLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CUSTOMER__DRIVING_LICENSE, oldDrivingLicense, drivingLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassport() {
		return passport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassport(String newPassport) {
		String oldPassport = passport;
		passport = newPassport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CUSTOMER__PASSPORT, oldPassport, passport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsurance() {
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurance(String newInsurance) {
		String oldInsurance = insurance;
		insurance = newInsurance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CUSTOMER__INSURANCE, oldInsurance, insurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void login() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logout() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void register() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPackage.CUSTOMER__DRIVING_LICENSE:
				return getDrivingLicense();
			case UserPackage.CUSTOMER__PASSPORT:
				return getPassport();
			case UserPackage.CUSTOMER__INSURANCE:
				return getInsurance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UserPackage.CUSTOMER__DRIVING_LICENSE:
				setDrivingLicense((String)newValue);
				return;
			case UserPackage.CUSTOMER__PASSPORT:
				setPassport((String)newValue);
				return;
			case UserPackage.CUSTOMER__INSURANCE:
				setInsurance((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UserPackage.CUSTOMER__DRIVING_LICENSE:
				setDrivingLicense(DRIVING_LICENSE_EDEFAULT);
				return;
			case UserPackage.CUSTOMER__PASSPORT:
				setPassport(PASSPORT_EDEFAULT);
				return;
			case UserPackage.CUSTOMER__INSURANCE:
				setInsurance(INSURANCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UserPackage.CUSTOMER__DRIVING_LICENSE:
				return DRIVING_LICENSE_EDEFAULT == null ? drivingLicense != null : !DRIVING_LICENSE_EDEFAULT.equals(drivingLicense);
			case UserPackage.CUSTOMER__PASSPORT:
				return PASSPORT_EDEFAULT == null ? passport != null : !PASSPORT_EDEFAULT.equals(passport);
			case UserPackage.CUSTOMER__INSURANCE:
				return INSURANCE_EDEFAULT == null ? insurance != null : !INSURANCE_EDEFAULT.equals(insurance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UserPackage.CUSTOMER___LOGIN:
				login();
				return null;
			case UserPackage.CUSTOMER___LOGOUT:
				logout();
				return null;
			case UserPackage.CUSTOMER___REGISTER:
				register();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (drivingLicense: ");
		result.append(drivingLicense);
		result.append(", passport: ");
		result.append(passport);
		result.append(", insurance: ");
		result.append(insurance);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
