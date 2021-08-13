/**
 */
package com.tum.vsms.Reservation.Reservation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Addon Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.tum.vsms.Reservation.Reservation.ReservationPackage#getAddonType()
 * @model
 * @generated
 */
public enum AddonType implements Enumerator {
	/**
	 * The '<em><b>Extra Seat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRA_SEAT_VALUE
	 * @generated
	 * @ordered
	 */
	EXTRA_SEAT(0, "ExtraSeat", "ExtraSeat"),

	/**
	 * The '<em><b>Food</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOD_VALUE
	 * @generated
	 * @ordered
	 */
	FOOD(0, "Food", "Food"),

	/**
	 * The '<em><b>Headset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADSET_VALUE
	 * @generated
	 * @ordered
	 */
	HEADSET(0, "Headset", "Headset");

	/**
	 * The '<em><b>Extra Seat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTRA_SEAT
	 * @model name="ExtraSeat"
	 * @generated
	 * @ordered
	 */
	public static final int EXTRA_SEAT_VALUE = 0;

	/**
	 * The '<em><b>Food</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOOD
	 * @model name="Food"
	 * @generated
	 * @ordered
	 */
	public static final int FOOD_VALUE = 0;

	/**
	 * The '<em><b>Headset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADSET
	 * @model name="Headset"
	 * @generated
	 * @ordered
	 */
	public static final int HEADSET_VALUE = 0;

	/**
	 * An array of all the '<em><b>Addon Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AddonType[] VALUES_ARRAY =
		new AddonType[] {
			EXTRA_SEAT,
			FOOD,
			HEADSET,
		};

	/**
	 * A public read-only list of all the '<em><b>Addon Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AddonType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Addon Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddonType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddonType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Addon Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddonType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddonType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Addon Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddonType get(int value) {
		switch (value) {
			case EXTRA_SEAT_VALUE: return EXTRA_SEAT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AddonType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AddonType
