/**
 */
package com.tum.vsms.model.Vehicle.impl;

import com.tum.vsms.model.Vehicle.Position;
import com.tum.vsms.model.Vehicle.Vehicle;
import com.tum.vsms.model.Vehicle.VehiclePackage;
import com.tum.vsms.model.Vehicle.VehicleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getVehicleType <em>Vehicle Type</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getLicense <em>License</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getRegistration <em>Registration</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getYear <em>Year</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getAvailableSeat <em>Available Seat</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getAdditionalSeat <em>Additional Seat</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getVehicleId <em>Vehicle Id</em>}</li>
 *   <li>{@link com.tum.vsms.model.Vehicle.impl.VehicleImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends MinimalEObjectImpl.Container implements Vehicle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleType VEHICLE_TYPE_EDEFAULT = VehicleType.ECONOMY;

	/**
	 * The cached value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected VehicleType vehicleType = VEHICLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistration() <em>Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistration()
	 * @generated
	 * @ordered
	 */
	protected String registration = REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected String brand = BRAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableSeat() <em>Available Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSeat()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_SEAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableSeat() <em>Available Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSeat()
	 * @generated
	 * @ordered
	 */
	protected int availableSeat = AVAILABLE_SEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalSeat() <em>Additional Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalSeat()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDITIONAL_SEAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAdditionalSeat() <em>Additional Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalSeat()
	 * @generated
	 * @ordered
	 */
	protected int additionalSeat = ADDITIONAL_SEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleId() <em>Vehicle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleId()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleId() <em>Vehicle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleId()
	 * @generated
	 * @ordered
	 */
	protected String vehicleId = VEHICLE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclePackage.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleType(VehicleType newVehicleType) {
		VehicleType oldVehicleType = vehicleType;
		vehicleType = newVehicleType == null ? VEHICLE_TYPE_EDEFAULT : newVehicleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__VEHICLE_TYPE, oldVehicleType, vehicleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistration() {
		return registration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistration(String newRegistration) {
		String oldRegistration = registration;
		registration = newRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__REGISTRATION, oldRegistration, registration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(String newBrand) {
		String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__BRAND, oldBrand, brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableSeat() {
		return availableSeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableSeat(int newAvailableSeat) {
		int oldAvailableSeat = availableSeat;
		availableSeat = newAvailableSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__AVAILABLE_SEAT, oldAvailableSeat, availableSeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAdditionalSeat() {
		return additionalSeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalSeat(int newAdditionalSeat) {
		int oldAdditionalSeat = additionalSeat;
		additionalSeat = newAdditionalSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__ADDITIONAL_SEAT, oldAdditionalSeat, additionalSeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleId() {
		return vehicleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleId(String newVehicleId) {
		String oldVehicleId = vehicleId;
		vehicleId = newVehicleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__VEHICLE_ID, oldVehicleId, vehicleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VehiclePackage.VEHICLE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VehiclePackage.VEHICLE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclePackage.VEHICLE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VehiclePackage.VEHICLE__POSITION:
				return basicSetPosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VehiclePackage.VEHICLE__NAME:
				return getName();
			case VehiclePackage.VEHICLE__VEHICLE_TYPE:
				return getVehicleType();
			case VehiclePackage.VEHICLE__LICENSE:
				return getLicense();
			case VehiclePackage.VEHICLE__REGISTRATION:
				return getRegistration();
			case VehiclePackage.VEHICLE__BRAND:
				return getBrand();
			case VehiclePackage.VEHICLE__MODEL:
				return getModel();
			case VehiclePackage.VEHICLE__YEAR:
				return getYear();
			case VehiclePackage.VEHICLE__COLOR:
				return getColor();
			case VehiclePackage.VEHICLE__AVAILABLE_SEAT:
				return getAvailableSeat();
			case VehiclePackage.VEHICLE__ADDITIONAL_SEAT:
				return getAdditionalSeat();
			case VehiclePackage.VEHICLE__VEHICLE_ID:
				return getVehicleId();
			case VehiclePackage.VEHICLE__POSITION:
				return getPosition();
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
			case VehiclePackage.VEHICLE__NAME:
				setName((String)newValue);
				return;
			case VehiclePackage.VEHICLE__VEHICLE_TYPE:
				setVehicleType((VehicleType)newValue);
				return;
			case VehiclePackage.VEHICLE__LICENSE:
				setLicense((String)newValue);
				return;
			case VehiclePackage.VEHICLE__REGISTRATION:
				setRegistration((String)newValue);
				return;
			case VehiclePackage.VEHICLE__BRAND:
				setBrand((String)newValue);
				return;
			case VehiclePackage.VEHICLE__MODEL:
				setModel((String)newValue);
				return;
			case VehiclePackage.VEHICLE__YEAR:
				setYear((String)newValue);
				return;
			case VehiclePackage.VEHICLE__COLOR:
				setColor((String)newValue);
				return;
			case VehiclePackage.VEHICLE__AVAILABLE_SEAT:
				setAvailableSeat((Integer)newValue);
				return;
			case VehiclePackage.VEHICLE__ADDITIONAL_SEAT:
				setAdditionalSeat((Integer)newValue);
				return;
			case VehiclePackage.VEHICLE__VEHICLE_ID:
				setVehicleId((String)newValue);
				return;
			case VehiclePackage.VEHICLE__POSITION:
				setPosition((Position)newValue);
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
			case VehiclePackage.VEHICLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__VEHICLE_TYPE:
				setVehicleType(VEHICLE_TYPE_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__REGISTRATION:
				setRegistration(REGISTRATION_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__BRAND:
				setBrand(BRAND_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__AVAILABLE_SEAT:
				setAvailableSeat(AVAILABLE_SEAT_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__ADDITIONAL_SEAT:
				setAdditionalSeat(ADDITIONAL_SEAT_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__VEHICLE_ID:
				setVehicleId(VEHICLE_ID_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__POSITION:
				setPosition((Position)null);
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
			case VehiclePackage.VEHICLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VehiclePackage.VEHICLE__VEHICLE_TYPE:
				return vehicleType != VEHICLE_TYPE_EDEFAULT;
			case VehiclePackage.VEHICLE__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case VehiclePackage.VEHICLE__REGISTRATION:
				return REGISTRATION_EDEFAULT == null ? registration != null : !REGISTRATION_EDEFAULT.equals(registration);
			case VehiclePackage.VEHICLE__BRAND:
				return BRAND_EDEFAULT == null ? brand != null : !BRAND_EDEFAULT.equals(brand);
			case VehiclePackage.VEHICLE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case VehiclePackage.VEHICLE__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case VehiclePackage.VEHICLE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case VehiclePackage.VEHICLE__AVAILABLE_SEAT:
				return availableSeat != AVAILABLE_SEAT_EDEFAULT;
			case VehiclePackage.VEHICLE__ADDITIONAL_SEAT:
				return additionalSeat != ADDITIONAL_SEAT_EDEFAULT;
			case VehiclePackage.VEHICLE__VEHICLE_ID:
				return VEHICLE_ID_EDEFAULT == null ? vehicleId != null : !VEHICLE_ID_EDEFAULT.equals(vehicleId);
			case VehiclePackage.VEHICLE__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", vehicleType: ");
		result.append(vehicleType);
		result.append(", license: ");
		result.append(license);
		result.append(", registration: ");
		result.append(registration);
		result.append(", brand: ");
		result.append(brand);
		result.append(", model: ");
		result.append(model);
		result.append(", year: ");
		result.append(year);
		result.append(", color: ");
		result.append(color);
		result.append(", availableSeat: ");
		result.append(availableSeat);
		result.append(", additionalSeat: ");
		result.append(additionalSeat);
		result.append(", vehicleId: ");
		result.append(vehicleId);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
