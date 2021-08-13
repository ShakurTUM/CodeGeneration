/**
 */
package com.tum.vsms.Reservation.Reservation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Addon#getId <em>Id</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Addon#getLocationId <em>Location Id</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Addon#getName <em>Name</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Addon#getAddonType <em>Addon Type</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Addon#getCount <em>Count</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Addon#getPrice <em>Price</em>}</li>
 *   <li>{@link com.tum.vsms.Reservation.Reservation.Addon#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddon()
 * @model
 * @generated
 */
public interface Addon extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddon_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Addon#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Location Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Id</em>' attribute.
	 * @see #setLocationId(String)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddon_LocationId()
	 * @model
	 * @generated
	 */
	String getLocationId();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Addon#getLocationId <em>Location Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Id</em>' attribute.
	 * @see #getLocationId()
	 * @generated
	 */
	void setLocationId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddon_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Addon#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Addon Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.tum.vsms.Reservation.Reservation.AddonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addon Type</em>' attribute.
	 * @see com.tum.vsms.Reservation.Reservation.AddonType
	 * @see #setAddonType(AddonType)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddon_AddonType()
	 * @model
	 * @generated
	 */
	AddonType getAddonType();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Addon#getAddonType <em>Addon Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addon Type</em>' attribute.
	 * @see com.tum.vsms.Reservation.Reservation.AddonType
	 * @see #getAddonType()
	 * @generated
	 */
	void setAddonType(AddonType value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddon_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Addon#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddon_Price()
	 * @model
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Addon#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddon_Rate()
	 * @model
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link com.tum.vsms.Reservation.Reservation.Addon#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

} // Addon
