/**
 */
package com.tum.vsms.model.Vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getVehicleType()
 * @model
 * @generated
 */
public enum VehicleType implements Enumerator {
	/**
	 * The '<em><b>Economy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMY_VALUE
	 * @generated
	 * @ordered
	 */
	ECONOMY(0, "Economy", "Economy"),

	/**
	 * The '<em><b>Compact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACT(1, "Compact", "Compact"),

	/**
	 * The '<em><b>Mid Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	MID_SIZE(2, "MidSize", "MidSize"),

	/**
	 * The '<em><b>Full Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_SIZE(3, "FullSize", "FullSize"),

	/**
	 * The '<em><b>Premium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREMIUM_VALUE
	 * @generated
	 * @ordered
	 */
	PREMIUM(4, "Premium", "Premium"),

	/**
	 * The '<em><b>Luxary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUXARY_VALUE
	 * @generated
	 * @ordered
	 */
	LUXARY(5, "Luxary", "Luxary"),

	/**
	 * The '<em><b>Suv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUV_VALUE
	 * @generated
	 * @ordered
	 */
	SUV(6, "Suv", "Suv"),

	/**
	 * The '<em><b>Van</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAN_VALUE
	 * @generated
	 * @ordered
	 */
	VAN(7, "Van", "Van");

	/**
	 * The '<em><b>Economy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMY
	 * @model name="Economy"
	 * @generated
	 * @ordered
	 */
	public static final int ECONOMY_VALUE = 0;

	/**
	 * The '<em><b>Compact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACT
	 * @model name="Compact"
	 * @generated
	 * @ordered
	 */
	public static final int COMPACT_VALUE = 1;

	/**
	 * The '<em><b>Mid Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MID_SIZE
	 * @model name="MidSize"
	 * @generated
	 * @ordered
	 */
	public static final int MID_SIZE_VALUE = 2;

	/**
	 * The '<em><b>Full Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_SIZE
	 * @model name="FullSize"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_SIZE_VALUE = 3;

	/**
	 * The '<em><b>Premium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREMIUM
	 * @model name="Premium"
	 * @generated
	 * @ordered
	 */
	public static final int PREMIUM_VALUE = 4;

	/**
	 * The '<em><b>Luxary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUXARY
	 * @model name="Luxary"
	 * @generated
	 * @ordered
	 */
	public static final int LUXARY_VALUE = 5;

	/**
	 * The '<em><b>Suv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUV
	 * @model name="Suv"
	 * @generated
	 * @ordered
	 */
	public static final int SUV_VALUE = 6;

	/**
	 * The '<em><b>Van</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAN
	 * @model name="Van"
	 * @generated
	 * @ordered
	 */
	public static final int VAN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VehicleType[] VALUES_ARRAY =
		new VehicleType[] {
			ECONOMY,
			COMPACT,
			MID_SIZE,
			FULL_SIZE,
			PREMIUM,
			LUXARY,
			SUV,
			VAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VehicleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleType get(int value) {
		switch (value) {
			case ECONOMY_VALUE: return ECONOMY;
			case COMPACT_VALUE: return COMPACT;
			case MID_SIZE_VALUE: return MID_SIZE;
			case FULL_SIZE_VALUE: return FULL_SIZE;
			case PREMIUM_VALUE: return PREMIUM;
			case LUXARY_VALUE: return LUXARY;
			case SUV_VALUE: return SUV;
			case VAN_VALUE: return VAN;
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
	private VehicleType(int value, String name, String literal) {
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
	
} //VehicleType
