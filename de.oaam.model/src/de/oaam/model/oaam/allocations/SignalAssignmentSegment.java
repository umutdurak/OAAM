/**
 */
package de.oaam.model.oaam.allocations;

import de.oaam.model.oaam.capabilities.SignalOnConnectionOrDeviceCapability;

import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.hardware.Connection;
import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Assignment Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signal segment is the allocations of a signal to either one device or one connection. Many consecutive segment define a full signal allocations path
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getCapability <em>Capability</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getDevice <em>Device</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getConnection <em>Connection</em>}</li>
 *   <li>{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getSchedules <em>Schedules</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalAssignmentSegment()
 * @model
 * @generated
 */
public interface SignalAssignmentSegment extends OaamBaseElementA, VariantDependentElementA, ModeDependentElementA {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the used capabilty, which specifies the resource consumtion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see #setCapability(SignalOnConnectionOrDeviceCapability)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalAssignmentSegment_Capability()
	 * @model required="true"
	 * @generated
	 */
	SignalOnConnectionOrDeviceCapability getCapability();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getCapability <em>Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(SignalOnConnectionOrDeviceCapability value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalAssignmentSegment_Device()
	 * @model
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either device or connection can be filled. Not both at the same time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalAssignmentSegment_Connection()
	 * @model
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.allocations.SignalAssignmentSegment#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link de.oaam.model.oaam.allocations.Schedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The schedules for this signal segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedules</em>' containment reference list.
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#getSignalAssignmentSegment_Schedules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schedule> getSchedules();

} // SignalAssignmentSegment
