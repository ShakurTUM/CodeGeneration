/**
 */
package com.tum.vsms.Maintenance.Maintenance.util;

import com.tum.vsms.Maintenance.Maintenance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.tum.vsms.Maintenance.Maintenance.MaintenancePackage
 * @generated
 */
public class MaintenanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MaintenancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MaintenancePackage.eINSTANCE;
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
	protected MaintenanceSwitch<Adapter> modelSwitch =
		new MaintenanceSwitch<Adapter>() {
			@Override
			public Adapter caseMaintenance(Maintenance object) {
				return createMaintenanceAdapter();
			}
			@Override
			public Adapter caseVehicle(vehicle object) {
				return createVehicleAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseRepair(Repair object) {
				return createRepairAdapter();
			}
			@Override
			public Adapter caseRecharge(Recharge object) {
				return createRechargeAdapter();
			}
			@Override
			public Adapter caseRefuel(Refuel object) {
				return createRefuelAdapter();
			}
			@Override
			public Adapter caseRelocate(Relocate object) {
				return createRelocateAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Maintenance.Maintenance.Maintenance <em>Maintenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Maintenance.Maintenance.Maintenance
	 * @generated
	 */
	public Adapter createMaintenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Object <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Object
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Maintenance.Maintenance.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Maintenance.Maintenance.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Maintenance.Maintenance.Repair <em>Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Maintenance.Maintenance.Repair
	 * @generated
	 */
	public Adapter createRepairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Maintenance.Maintenance.Recharge <em>Recharge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Maintenance.Maintenance.Recharge
	 * @generated
	 */
	public Adapter createRechargeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Maintenance.Maintenance.Refuel <em>Refuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Maintenance.Maintenance.Refuel
	 * @generated
	 */
	public Adapter createRefuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tum.vsms.Maintenance.Maintenance.Relocate <em>Relocate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tum.vsms.Maintenance.Maintenance.Relocate
	 * @generated
	 */
	public Adapter createRelocateAdapter() {
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

} //MaintenanceAdapterFactory
