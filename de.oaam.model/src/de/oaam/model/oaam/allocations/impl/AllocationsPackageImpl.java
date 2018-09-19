/**
 */
package de.oaam.model.oaam.allocations.impl;

import de.oaam.model.oaam.OaamPackage;

import de.oaam.model.oaam.allocations.Allocations;
import de.oaam.model.oaam.allocations.AllocationsContainerA;
import de.oaam.model.oaam.allocations.AllocationsFactory;
import de.oaam.model.oaam.allocations.AllocationsPackage;
import de.oaam.model.oaam.allocations.ConnectionAssignment;
import de.oaam.model.oaam.allocations.ConnectionAssignmentSegment;
import de.oaam.model.oaam.allocations.DeviceAssignment;
import de.oaam.model.oaam.allocations.Schedule;
import de.oaam.model.oaam.allocations.ScheduledTime;
import de.oaam.model.oaam.allocations.SignalAssignment;
import de.oaam.model.oaam.allocations.SignalAssignmentSegment;
import de.oaam.model.oaam.allocations.Suballocations;
import de.oaam.model.oaam.allocations.SubdeviceAssignment;
import de.oaam.model.oaam.allocations.TaskAssignment;

import de.oaam.model.oaam.anatomy.AnatomyPackage;

import de.oaam.model.oaam.anatomy.impl.AnatomyPackageImpl;

import de.oaam.model.oaam.capabilities.CapabilitiesPackage;

import de.oaam.model.oaam.capabilities.impl.CapabilitiesPackageImpl;

import de.oaam.model.oaam.common.CommonPackage;

import de.oaam.model.oaam.common.impl.CommonPackageImpl;

import de.oaam.model.oaam.functions.FunctionsPackage;

import de.oaam.model.oaam.functions.impl.FunctionsPackageImpl;

import de.oaam.model.oaam.hardware.HardwarePackage;

import de.oaam.model.oaam.hardware.impl.HardwarePackageImpl;

import de.oaam.model.oaam.impl.OaamPackageImpl;

import de.oaam.model.oaam.library.LibraryPackage;

import de.oaam.model.oaam.library.impl.LibraryPackageImpl;

import de.oaam.model.oaam.restrictions.RestrictionsPackage;

import de.oaam.model.oaam.restrictions.impl.RestrictionsPackageImpl;

import de.oaam.model.oaam.scenario.ScenarioPackage;

import de.oaam.model.oaam.scenario.impl.ScenarioPackageImpl;

import de.oaam.model.oaam.systems.SystemsPackage;

import de.oaam.model.oaam.systems.impl.SystemsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationsPackageImpl extends EPackageImpl implements AllocationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationsContainerAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalAssignmentSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionAssignmentSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subdeviceAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suballocationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduledTimeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.oaam.model.oaam.allocations.AllocationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AllocationsPackageImpl() {
		super(eNS_URI, AllocationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AllocationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AllocationsPackage init() {
		if (isInited) return (AllocationsPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);

		// Obtain or create and register package
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AllocationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AllocationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OaamPackageImpl theOaamPackage = (OaamPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) instanceof OaamPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaamPackage.eNS_URI) : OaamPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		ScenarioPackageImpl theScenarioPackage = (ScenarioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) instanceof ScenarioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI) : ScenarioPackage.eINSTANCE);
		SystemsPackageImpl theSystemsPackage = (SystemsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) instanceof SystemsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemsPackage.eNS_URI) : SystemsPackage.eINSTANCE);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) instanceof FunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI) : FunctionsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		AnatomyPackageImpl theAnatomyPackage = (AnatomyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) instanceof AnatomyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI) : AnatomyPackage.eINSTANCE);
		CapabilitiesPackageImpl theCapabilitiesPackage = (CapabilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) instanceof CapabilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI) : CapabilitiesPackage.eINSTANCE);
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI) : RestrictionsPackage.eINSTANCE);

		// Create package meta-data objects
		theAllocationsPackage.createPackageContents();
		theOaamPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theScenarioPackage.createPackageContents();
		theSystemsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theAnatomyPackage.createPackageContents();
		theCapabilitiesPackage.createPackageContents();
		theRestrictionsPackage.createPackageContents();

		// Initialize created meta-data
		theAllocationsPackage.initializePackageContents();
		theOaamPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theScenarioPackage.initializePackageContents();
		theSystemsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theAnatomyPackage.initializePackageContents();
		theCapabilitiesPackage.initializePackageContents();
		theRestrictionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAllocationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AllocationsPackage.eNS_URI, theAllocationsPackage);
		return theAllocationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationsContainerA() {
		return allocationsContainerAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_DeviceAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_SubdeviceAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_ConnectionAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_TaskAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_SignalAssignments() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationsContainerA_Suballocations() {
		return (EReference)allocationsContainerAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskAssignment() {
		return taskAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAssignment_Capability() {
		return (EReference)taskAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAssignment_Task() {
		return (EReference)taskAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAssignment_Device() {
		return (EReference)taskAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskAssignment_Schedule() {
		return (EReference)taskAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalAssignment() {
		return signalAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignment_Segments() {
		return (EReference)signalAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignment_Signal() {
		return (EReference)signalAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionAssignment() {
		return connectionAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignment_Segments() {
		return (EReference)connectionAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignment_Connection() {
		return (EReference)connectionAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalAssignmentSegment() {
		return signalAssignmentSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignmentSegment_Capability() {
		return (EReference)signalAssignmentSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignmentSegment_Device() {
		return (EReference)signalAssignmentSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalAssignmentSegment_Connection() {
		return (EReference)signalAssignmentSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceAssignment() {
		return deviceAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceAssignment_Device() {
		return (EReference)deviceAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceAssignment_Location() {
		return (EReference)deviceAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceAssignment_Capability() {
		return (EReference)deviceAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionAssignmentSegment() {
		return connectionAssignmentSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignmentSegment_Capability() {
		return (EReference)connectionAssignmentSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignmentSegment_Location() {
		return (EReference)connectionAssignmentSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionAssignmentSegment_Duct() {
		return (EReference)connectionAssignmentSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubdeviceAssignment() {
		return subdeviceAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdeviceAssignment_Capability() {
		return (EReference)subdeviceAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdeviceAssignment_Subdevice() {
		return (EReference)subdeviceAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubdeviceAssignment_TargetDevice() {
		return (EReference)subdeviceAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocations() {
		return allocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuballocations() {
		return suballocationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Rate() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_IsPeriodic() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchedule_Priority() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_ScheduledTimes() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduledTime() {
		return scheduledTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTime_Cycle() {
		return (EAttribute)scheduledTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTime_StartTime() {
		return (EAttribute)scheduledTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTime_Duration() {
		return (EAttribute)scheduledTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTime_Restart() {
		return (EAttribute)scheduledTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsFactory getAllocationsFactory() {
		return (AllocationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		allocationsContainerAEClass = createEClass(ALLOCATIONS_CONTAINER_A);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__DEVICE_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__SUBDEVICE_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__CONNECTION_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__TASK_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__SIGNAL_ASSIGNMENTS);
		createEReference(allocationsContainerAEClass, ALLOCATIONS_CONTAINER_A__SUBALLOCATIONS);

		taskAssignmentEClass = createEClass(TASK_ASSIGNMENT);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__CAPABILITY);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__TASK);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__DEVICE);
		createEReference(taskAssignmentEClass, TASK_ASSIGNMENT__SCHEDULE);

		signalAssignmentEClass = createEClass(SIGNAL_ASSIGNMENT);
		createEReference(signalAssignmentEClass, SIGNAL_ASSIGNMENT__SEGMENTS);
		createEReference(signalAssignmentEClass, SIGNAL_ASSIGNMENT__SIGNAL);

		connectionAssignmentEClass = createEClass(CONNECTION_ASSIGNMENT);
		createEReference(connectionAssignmentEClass, CONNECTION_ASSIGNMENT__SEGMENTS);
		createEReference(connectionAssignmentEClass, CONNECTION_ASSIGNMENT__CONNECTION);

		signalAssignmentSegmentEClass = createEClass(SIGNAL_ASSIGNMENT_SEGMENT);
		createEReference(signalAssignmentSegmentEClass, SIGNAL_ASSIGNMENT_SEGMENT__CAPABILITY);
		createEReference(signalAssignmentSegmentEClass, SIGNAL_ASSIGNMENT_SEGMENT__DEVICE);
		createEReference(signalAssignmentSegmentEClass, SIGNAL_ASSIGNMENT_SEGMENT__CONNECTION);

		deviceAssignmentEClass = createEClass(DEVICE_ASSIGNMENT);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__DEVICE);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__LOCATION);
		createEReference(deviceAssignmentEClass, DEVICE_ASSIGNMENT__CAPABILITY);

		connectionAssignmentSegmentEClass = createEClass(CONNECTION_ASSIGNMENT_SEGMENT);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__CAPABILITY);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__LOCATION);
		createEReference(connectionAssignmentSegmentEClass, CONNECTION_ASSIGNMENT_SEGMENT__DUCT);

		subdeviceAssignmentEClass = createEClass(SUBDEVICE_ASSIGNMENT);
		createEReference(subdeviceAssignmentEClass, SUBDEVICE_ASSIGNMENT__CAPABILITY);
		createEReference(subdeviceAssignmentEClass, SUBDEVICE_ASSIGNMENT__SUBDEVICE);
		createEReference(subdeviceAssignmentEClass, SUBDEVICE_ASSIGNMENT__TARGET_DEVICE);

		allocationsEClass = createEClass(ALLOCATIONS);

		suballocationsEClass = createEClass(SUBALLOCATIONS);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__RATE);
		createEAttribute(scheduleEClass, SCHEDULE__IS_PERIODIC);
		createEAttribute(scheduleEClass, SCHEDULE__PRIORITY);
		createEReference(scheduleEClass, SCHEDULE__SCHEDULED_TIMES);

		scheduledTimeEClass = createEClass(SCHEDULED_TIME);
		createEAttribute(scheduledTimeEClass, SCHEDULED_TIME__CYCLE);
		createEAttribute(scheduledTimeEClass, SCHEDULED_TIME__START_TIME);
		createEAttribute(scheduledTimeEClass, SCHEDULED_TIME__DURATION);
		createEAttribute(scheduledTimeEClass, SCHEDULED_TIME__RESTART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		ScenarioPackage theScenarioPackage = (ScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioPackage.eNS_URI);
		CapabilitiesPackage theCapabilitiesPackage = (CapabilitiesPackage)EPackage.Registry.INSTANCE.getEPackage(CapabilitiesPackage.eNS_URI);
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		HardwarePackage theHardwarePackage = (HardwarePackage)EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI);
		AnatomyPackage theAnatomyPackage = (AnatomyPackage)EPackage.Registry.INSTANCE.getEPackage(AnatomyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		allocationsContainerAEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		taskAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		taskAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		taskAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		signalAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		signalAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		signalAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		connectionAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		connectionAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		connectionAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		signalAssignmentSegmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		signalAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		signalAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		deviceAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		deviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		deviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		connectionAssignmentSegmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		subdeviceAssignmentEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		subdeviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		subdeviceAssignmentEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		allocationsEClass.getESuperTypes().add(this.getAllocationsContainerA());
		suballocationsEClass.getESuperTypes().add(this.getAllocationsContainerA());
		suballocationsEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		suballocationsEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		scheduleEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		scheduleEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		scheduleEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());
		scheduledTimeEClass.getESuperTypes().add(theCommonPackage.getOaamBaseElementA());
		scheduledTimeEClass.getESuperTypes().add(theScenarioPackage.getModeDependentElementA());
		scheduledTimeEClass.getESuperTypes().add(theScenarioPackage.getVariantDependentElementA());

		// Initialize classes, features, and operations; add parameters
		initEClass(allocationsContainerAEClass, AllocationsContainerA.class, "AllocationsContainerA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationsContainerA_DeviceAssignments(), this.getDeviceAssignment(), null, "deviceAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_SubdeviceAssignments(), this.getSubdeviceAssignment(), null, "subdeviceAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_ConnectionAssignments(), this.getConnectionAssignment(), null, "connectionAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_TaskAssignments(), this.getTaskAssignment(), null, "taskAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_SignalAssignments(), this.getSignalAssignment(), null, "signalAssignments", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationsContainerA_Suballocations(), this.getSuballocations(), null, "suballocations", null, 0, -1, AllocationsContainerA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskAssignmentEClass, TaskAssignment.class, "TaskAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskAssignment_Capability(), theCapabilitiesPackage.getTaskOnDeviceCapability(), null, "capability", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAssignment_Task(), theFunctionsPackage.getTask(), null, "task", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAssignment_Device(), theHardwarePackage.getDevice(), null, "device", null, 1, 1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskAssignment_Schedule(), this.getSchedule(), null, "schedule", null, 0, -1, TaskAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalAssignmentEClass, SignalAssignment.class, "SignalAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalAssignment_Segments(), this.getSignalAssignmentSegment(), null, "segments", null, 0, -1, SignalAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignment_Signal(), theFunctionsPackage.getSignal(), null, "signal", null, 1, 1, SignalAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionAssignmentEClass, ConnectionAssignment.class, "ConnectionAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionAssignment_Segments(), this.getConnectionAssignmentSegment(), null, "segments", null, 0, -1, ConnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignment_Connection(), theHardwarePackage.getConnection(), null, "connection", null, 1, 1, ConnectionAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalAssignmentSegmentEClass, SignalAssignmentSegment.class, "SignalAssignmentSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalAssignmentSegment_Capability(), theCapabilitiesPackage.getSignalOnConnectionOrDeviceCapability(), null, "capability", null, 1, 1, SignalAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignmentSegment_Device(), theHardwarePackage.getDevice(), null, "device", null, 0, 1, SignalAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignalAssignmentSegment_Connection(), theHardwarePackage.getConnection(), null, "connection", null, 0, 1, SignalAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceAssignmentEClass, DeviceAssignment.class, "DeviceAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceAssignment_Device(), theHardwarePackage.getDevice(), null, "device", null, 1, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceAssignment_Location(), theAnatomyPackage.getLocation(), null, "location", null, 0, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceAssignment_Capability(), theCapabilitiesPackage.getDeviceInLocationCapability(), null, "capability", null, 1, 1, DeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionAssignmentSegmentEClass, ConnectionAssignmentSegment.class, "ConnectionAssignmentSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionAssignmentSegment_Capability(), theCapabilitiesPackage.getConnectionInDuctOrLocationCapability(), null, "capability", null, 1, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignmentSegment_Location(), theAnatomyPackage.getLocation(), null, "location", null, 0, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionAssignmentSegment_Duct(), theAnatomyPackage.getDuct(), null, "duct", null, 0, 1, ConnectionAssignmentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subdeviceAssignmentEClass, SubdeviceAssignment.class, "SubdeviceAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubdeviceAssignment_Capability(), theCapabilitiesPackage.getSubdeviceInDeviceCapability(), null, "capability", null, 1, 1, SubdeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceAssignment_Subdevice(), theHardwarePackage.getDevice(), null, "subdevice", null, 1, 1, SubdeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubdeviceAssignment_TargetDevice(), theHardwarePackage.getDevice(), null, "targetDevice", null, 1, 1, SubdeviceAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationsEClass, Allocations.class, "Allocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suballocationsEClass, Suballocations.class, "Suballocations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_Rate(), ecorePackage.getEDouble(), "rate", "0.0", 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_IsPeriodic(), ecorePackage.getEBoolean(), "isPeriodic", "true", 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_Priority(), ecorePackage.getEInt(), "priority", "0", 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_ScheduledTimes(), this.getScheduledTime(), null, "scheduledTimes", null, 1, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduledTimeEClass, ScheduledTime.class, "ScheduledTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledTime_Cycle(), ecorePackage.getEInt(), "cycle", "1", 1, 1, ScheduledTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledTime_StartTime(), ecorePackage.getEDouble(), "startTime", "0.0", 1, 1, ScheduledTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledTime_Duration(), ecorePackage.getEDouble(), "duration", "0.0", 1, 1, ScheduledTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduledTime_Restart(), ecorePackage.getEBoolean(), "restart", "true", 1, 1, ScheduledTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (scheduledTimeEClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });
	}

} //AllocationsPackageImpl