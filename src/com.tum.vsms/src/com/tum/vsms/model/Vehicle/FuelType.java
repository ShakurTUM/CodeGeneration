/**
 */
package com.tum.vsms.model.Vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fuel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.tum.vsms.model.Vehicle.VehiclePackage#getFuelType()
 * @model
 * @generated
 */
public enum FuelType implements Enumerator {
	/**
	 * The '<em><b>Petrol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PETROL_VALUE
	 * @generated
	 * @ordered
	 */
	PETROL(0, "Petrol", "Petrol"),

	/**
	 * The '<em><b>Diesel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIESEL_VALUE
	 * @generated
	 * @ordered
	 */
	DIESEL(1, "Diesel", "Diesel"),

	/**
	 * The '<em><b>Octane</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTANE_VALUE
	 * @generated
	 * @ordered
	 */
	OCTANE(2, "Octane", "Octane"),

	/**
	 * The '<em><b>Gasoline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASOLINE_VALUE
	 * @generated
	 * @ordered
	 */
	GASOLINE(3, "Gasoline", "Gasoline");

	/**
	 * The '<em><b>Petrol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PETROL
	 * @model name="Petrol"
	 * @generated
	 * @ordered
	 */
	public static final int PETROL_VALUE = 0;

	/**
	 * The '<em><b>Diesel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIESEL
	 * @model name="Diesel"
	 * @generated
	 * @ordered
	 */
	public static final int DIESEL_VALUE = 1;

	/**
	 * The '<em><b>Octane</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTANE
	 * @model name="Octane"
	 * @generated
	 * @ordered
	 */
	public static final int OCTANE_VALUE = 2;

	/**
	 * The '<em><b>Gasoline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASOLINE
	 * @model name="Gasoline"
	 * @generated
	 * @ordered
	 */
	public static final int GASOLINE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Fuel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FuelType[] VALUES_ARRAY =
		new FuelType[] {
			PETROL,
			DIESEL,
			OCTANE,
			GASOLINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Fuel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FuelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fuel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FuelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FuelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fuel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FuelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FuelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fuel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FuelType get(int value) {
		switch (value) {
			case PETROL_VALUE: return PETROL;
			case DIESEL_VALUE: return DIESEL;
			case OCTANE_VALUE: return OCTANE;
			case GASOLINE_VALUE: return GASOLINE;
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
	private FuelType(int value, String name, String literal) {
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
	
} //FuelType
