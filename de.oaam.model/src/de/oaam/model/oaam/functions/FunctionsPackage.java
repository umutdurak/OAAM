/**
 */
package de.oaam.model.oaam.functions;

import de.oaam.model.oaam.common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Main part of the executable function description, including tasks and data flows.
 * <!-- end-model-doc -->
 * @see de.oaam.model.oaam.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.oaam.de/oaam/model/v100/functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.oaam.model.functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsPackage eINSTANCE = de.oaam.model.oaam.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl <em>Container A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFunctionsContainerA()
	 * @generated
	 */
	int FUNCTIONS_CONTAINER_A = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__IS_ATOMIC = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASKS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASK_LINKS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASK_GROUPS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Task Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Task Redundancies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__SIGNALS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Failure Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__FAILURE_EVENTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Subfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A__SUBFUNCTIONS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Container A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_CONTAINER_A_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.FunctionsImpl <em>Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.FunctionsImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFunctions()
	 * @generated
	 */
	int FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__ID = FUNCTIONS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__NAME = FUNCTIONS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__STYLE = FUNCTIONS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__ATTRIBUTES = FUNCTIONS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__DOCUMENTATION = FUNCTIONS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__MODIFIED = FUNCTIONS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__MODIFIER = FUNCTIONS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TRACE_LINK = FUNCTIONS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__VARIANTS = FUNCTIONS_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__OPERATION_MODES = FUNCTIONS_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__IS_ATOMIC = FUNCTIONS_CONTAINER_A__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASKS = FUNCTIONS_CONTAINER_A__TASKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASK_LINKS = FUNCTIONS_CONTAINER_A__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Task Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASK_GROUPS = FUNCTIONS_CONTAINER_A__TASK_GROUPS;

	/**
	 * The feature id for the '<em><b>Task Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASK_SYMMETRIES = FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Task Redundancies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__TASK_REDUNDANCIES = FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__SIGNALS = FUNCTIONS_CONTAINER_A__SIGNALS;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__SIGNAL_GROUPS = FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS;

	/**
	 * The feature id for the '<em><b>Failure Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__FAILURE_EVENTS = FUNCTIONS_CONTAINER_A__FAILURE_EVENTS;

	/**
	 * The feature id for the '<em><b>Subfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__SUBFUNCTIONS = FUNCTIONS_CONTAINER_A__SUBFUNCTIONS;

	/**
	 * The number of structural features of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_FEATURE_COUNT = FUNCTIONS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_OPERATION_COUNT = FUNCTIONS_CONTAINER_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TYPE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLEMENTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Device Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEVICE_BINDING = CommonPackage.ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>NParallels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NPARALLELS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FIXED_RATE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARAMETERS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.ExternalTaskLinkImpl <em>External Task Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.ExternalTaskLinkImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getExternalTaskLink()
	 * @generated
	 */
	int EXTERNAL_TASK_LINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__TYPE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__INPUTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__OUTPUTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__TASK = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK__FILTER = CommonPackage.ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>External Task Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>External Task Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_LINK_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskGroupImpl <em>Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskGroupImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskGroup()
	 * @generated
	 */
	int TASK_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__TASKS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__IS_ATOMIC = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskSymmetryImpl <em>Task Symmetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskSymmetryImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskSymmetry()
	 * @generated
	 */
	int TASK_SYMMETRY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY__TASKS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Symmetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SYMMETRY_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.TaskRedundancyImpl <em>Task Redundancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.TaskRedundancyImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskRedundancy()
	 * @generated
	 */
	int TASK_REDUNDANCY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY__TASKS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Redundancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Redundancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REDUNDANCY_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl <em>Failure Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.FailureConditionImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFailureCondition()
	 * @generated
	 */
	int FAILURE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__LOGIC = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Occurrence Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__MAX_OCCURRENCE_RATE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Single Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION__NO_SINGLE_FAILURE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Failure Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Failure Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_CONDITION_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl <em>System Input State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.SystemInputStateImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSystemInputState()
	 * @generated
	 */
	int SYSTEM_INPUT_STATE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__ID = CommonPackage.BOOL_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__NAME = CommonPackage.BOOL_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__STYLE = CommonPackage.BOOL_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__ATTRIBUTES = CommonPackage.BOOL_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__DOCUMENTATION = CommonPackage.BOOL_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__MODIFIED = CommonPackage.BOOL_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__MODIFIER = CommonPackage.BOOL_A_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__TRACE_LINK = CommonPackage.BOOL_A_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__OPERATION_MODES = CommonPackage.BOOL_A_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__VARIANTS = CommonPackage.BOOL_A_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__STATE = CommonPackage.BOOL_A_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE__OUTPUT = CommonPackage.BOOL_A_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>System Input State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE_FEATURE_COUNT = CommonPackage.BOOL_A_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>System Input State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_STATE_OPERATION_COUNT = CommonPackage.BOOL_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.SignalImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SOURCE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TARGET = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TYPE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__IN_INDEX = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Out Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__OUT_INDEX = CommonPackage.ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.SignalGroupImpl <em>Signal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.SignalGroupImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSignalGroup()
	 * @generated
	 */
	int SIGNAL_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__SIGNALS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.InputImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DECLARATION = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IMPLEMENTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Io Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IO_BINDINGS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__QUEUE_LENGTH = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OUTPUT_LINK = CommonPackage.ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.OutputImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IMPLEMENTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DECLARATION = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Io Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__IO_BINDINGS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fixed Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__FIXED_RATE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.ExternalOutputLinkImpl <em>External Output Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.ExternalOutputLinkImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getExternalOutputLink()
	 * @generated
	 */
	int EXTERNAL_OUTPUT_LINK = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__OPERATION_MODES = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__VARIANTS = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__OUTPUT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK__FILTER = CommonPackage.ELEMENT_A_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>External Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>External Output Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OUTPUT_LINK_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.SubfunctionImpl <em>Subfunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.SubfunctionImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSubfunction()
	 * @generated
	 */
	int SUBFUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__ID = FUNCTIONS_CONTAINER_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__NAME = FUNCTIONS_CONTAINER_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__STYLE = FUNCTIONS_CONTAINER_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__ATTRIBUTES = FUNCTIONS_CONTAINER_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__DOCUMENTATION = FUNCTIONS_CONTAINER_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__MODIFIED = FUNCTIONS_CONTAINER_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__MODIFIER = FUNCTIONS_CONTAINER_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__TRACE_LINK = FUNCTIONS_CONTAINER_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__VARIANTS = FUNCTIONS_CONTAINER_A__VARIANTS;

	/**
	 * The feature id for the '<em><b>Operation Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__OPERATION_MODES = FUNCTIONS_CONTAINER_A__OPERATION_MODES;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__IS_ATOMIC = FUNCTIONS_CONTAINER_A__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__TASKS = FUNCTIONS_CONTAINER_A__TASKS;

	/**
	 * The feature id for the '<em><b>Task Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__TASK_LINKS = FUNCTIONS_CONTAINER_A__TASK_LINKS;

	/**
	 * The feature id for the '<em><b>Task Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__TASK_GROUPS = FUNCTIONS_CONTAINER_A__TASK_GROUPS;

	/**
	 * The feature id for the '<em><b>Task Symmetries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__TASK_SYMMETRIES = FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES;

	/**
	 * The feature id for the '<em><b>Task Redundancies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__TASK_REDUNDANCIES = FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__SIGNALS = FUNCTIONS_CONTAINER_A__SIGNALS;

	/**
	 * The feature id for the '<em><b>Signal Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__SIGNAL_GROUPS = FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS;

	/**
	 * The feature id for the '<em><b>Failure Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__FAILURE_EVENTS = FUNCTIONS_CONTAINER_A__FAILURE_EVENTS;

	/**
	 * The feature id for the '<em><b>Subfunctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__SUBFUNCTIONS = FUNCTIONS_CONTAINER_A__SUBFUNCTIONS;

	/**
	 * The feature id for the '<em><b>Multiplicity Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__MULTIPLICITY_MIN = FUNCTIONS_CONTAINER_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION__MULTIPLICITY_MAX = FUNCTIONS_CONTAINER_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subfunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION_FEATURE_COUNT = FUNCTIONS_CONTAINER_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subfunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFUNCTION_OPERATION_COUNT = FUNCTIONS_CONTAINER_A_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.oaam.model.oaam.functions.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.oaam.model.oaam.functions.impl.ParameterImpl
	 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = CommonPackage.ELEMENT_A__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = CommonPackage.ELEMENT_A__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STYLE = CommonPackage.ELEMENT_A__STYLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ATTRIBUTES = CommonPackage.ELEMENT_A__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOCUMENTATION = CommonPackage.ELEMENT_A__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MODIFIED = CommonPackage.ELEMENT_A__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MODIFIER = CommonPackage.ELEMENT_A__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TRACE_LINK = CommonPackage.ELEMENT_A__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFINITION = CommonPackage.ELEMENT_A_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = CommonPackage.ELEMENT_A_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CommonPackage.ELEMENT_A_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = CommonPackage.ELEMENT_A_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Functions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functions</em>'.
	 * @see de.oaam.model.oaam.functions.Functions
	 * @generated
	 */
	EClass getFunctions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.FunctionsContainerA <em>Container A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container A</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA
	 * @generated
	 */
	EClass getFunctionsContainerA();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.FunctionsContainerA#isIsAtomic <em>Is Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Atomic</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#isIsAtomic()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EAttribute getFunctionsContainerA_IsAtomic();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTasks()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskLinks <em>Task Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Links</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTaskLinks()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_TaskLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskGroups <em>Task Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Groups</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTaskGroups()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_TaskGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskSymmetries <em>Task Symmetries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Symmetries</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTaskSymmetries()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_TaskSymmetries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getTaskRedundancies <em>Task Redundancies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Redundancies</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getTaskRedundancies()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_TaskRedundancies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getSignals()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_Signals();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSignalGroups <em>Signal Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Groups</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getSignalGroups()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_SignalGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getFailureEvents <em>Failure Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Events</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getFailureEvents()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_FailureEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.FunctionsContainerA#getSubfunctions <em>Subfunctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subfunctions</em>'.
	 * @see de.oaam.model.oaam.functions.FunctionsContainerA#getSubfunctions()
	 * @see #getFunctionsContainerA()
	 * @generated
	 */
	EReference getFunctionsContainerA_Subfunctions();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see de.oaam.model.oaam.functions.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Task#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getType()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getOutputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outputs();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Task#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getImplements()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Implements();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Task#getDeviceBinding <em>Device Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Binding</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getDeviceBinding()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_DeviceBinding();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Task#getNParallels <em>NParallels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NParallels</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getNParallels()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_NParallels();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Task#getFixedRate <em>Fixed Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Rate</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getFixedRate()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_FixedRate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.Task#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.oaam.model.oaam.functions.Task#getParameters()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Parameters();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.ExternalTaskLink <em>External Task Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Task Link</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink
	 * @generated
	 */
	EClass getExternalTaskLink();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getType()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EReference getExternalTaskLink_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getInputs()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EReference getExternalTaskLink_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getOutputs()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EReference getExternalTaskLink_Outputs();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getTask()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EReference getExternalTaskLink_Task();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.ExternalTaskLink#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalTaskLink#getFilter()
	 * @see #getExternalTaskLink()
	 * @generated
	 */
	EAttribute getExternalTaskLink_Filter();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Group</em>'.
	 * @see de.oaam.model.oaam.functions.TaskGroup
	 * @generated
	 */
	EClass getTaskGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.TaskGroup#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.functions.TaskGroup#getTasks()
	 * @see #getTaskGroup()
	 * @generated
	 */
	EReference getTaskGroup_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.TaskGroup#isIsAtomic <em>Is Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Atomic</em>'.
	 * @see de.oaam.model.oaam.functions.TaskGroup#isIsAtomic()
	 * @see #getTaskGroup()
	 * @generated
	 */
	EAttribute getTaskGroup_IsAtomic();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.TaskSymmetry <em>Task Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Symmetry</em>'.
	 * @see de.oaam.model.oaam.functions.TaskSymmetry
	 * @generated
	 */
	EClass getTaskSymmetry();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.TaskSymmetry#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.functions.TaskSymmetry#getTasks()
	 * @see #getTaskSymmetry()
	 * @generated
	 */
	EReference getTaskSymmetry_Tasks();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.TaskRedundancy <em>Task Redundancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Redundancy</em>'.
	 * @see de.oaam.model.oaam.functions.TaskRedundancy
	 * @generated
	 */
	EClass getTaskRedundancy();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.TaskRedundancy#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see de.oaam.model.oaam.functions.TaskRedundancy#getTasks()
	 * @see #getTaskRedundancy()
	 * @generated
	 */
	EReference getTaskRedundancy_Tasks();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.FailureCondition <em>Failure Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Condition</em>'.
	 * @see de.oaam.model.oaam.functions.FailureCondition
	 * @generated
	 */
	EClass getFailureCondition();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.functions.FailureCondition#getLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logic</em>'.
	 * @see de.oaam.model.oaam.functions.FailureCondition#getLogic()
	 * @see #getFailureCondition()
	 * @generated
	 */
	EReference getFailureCondition_Logic();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.FailureCondition#getMaxOccurrenceRate <em>Max Occurrence Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurrence Rate</em>'.
	 * @see de.oaam.model.oaam.functions.FailureCondition#getMaxOccurrenceRate()
	 * @see #getFailureCondition()
	 * @generated
	 */
	EAttribute getFailureCondition_MaxOccurrenceRate();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.FailureCondition#isNoSingleFailure <em>No Single Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Single Failure</em>'.
	 * @see de.oaam.model.oaam.functions.FailureCondition#isNoSingleFailure()
	 * @see #getFailureCondition()
	 * @generated
	 */
	EAttribute getFailureCondition_NoSingleFailure();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.SystemInputState <em>System Input State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Input State</em>'.
	 * @see de.oaam.model.oaam.functions.SystemInputState
	 * @generated
	 */
	EClass getSystemInputState();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.SystemInputState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.oaam.model.oaam.functions.SystemInputState#getState()
	 * @see #getSystemInputState()
	 * @generated
	 */
	EAttribute getSystemInputState_State();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.SystemInputState#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see de.oaam.model.oaam.functions.SystemInputState#getOutput()
	 * @see #getSystemInputState()
	 * @generated
	 */
	EReference getSystemInputState_Output();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see de.oaam.model.oaam.functions.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Signal#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getSource()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Source();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Signal#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getTarget()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Target();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Signal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getType()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Signal#getInIndex <em>In Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Index</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getInIndex()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_InIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Signal#getOutIndex <em>Out Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Index</em>'.
	 * @see de.oaam.model.oaam.functions.Signal#getOutIndex()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_OutIndex();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.SignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Group</em>'.
	 * @see de.oaam.model.oaam.functions.SignalGroup
	 * @generated
	 */
	EClass getSignalGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.SignalGroup#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signals</em>'.
	 * @see de.oaam.model.oaam.functions.SignalGroup#getSignals()
	 * @see #getSignalGroup()
	 * @generated
	 */
	EReference getSignalGroup_Signals();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see de.oaam.model.oaam.functions.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Input#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getDeclaration()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Declaration();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Input#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getImplements()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Implements();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.Input#getIoBindings <em>Io Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Io Bindings</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getIoBindings()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_IoBindings();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Input#getQueueLength <em>Queue Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Length</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getQueueLength()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_QueueLength();

	/**
	 * Returns the meta object for the containment reference '{@link de.oaam.model.oaam.functions.Input#getOutputLink <em>Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Link</em>'.
	 * @see de.oaam.model.oaam.functions.Input#getOutputLink()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_OutputLink();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see de.oaam.model.oaam.functions.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Output#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see de.oaam.model.oaam.functions.Output#getImplements()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Implements();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Output#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see de.oaam.model.oaam.functions.Output#getDeclaration()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Declaration();

	/**
	 * Returns the meta object for the reference list '{@link de.oaam.model.oaam.functions.Output#getIoBindings <em>Io Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Io Bindings</em>'.
	 * @see de.oaam.model.oaam.functions.Output#getIoBindings()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_IoBindings();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Output#getFixedRate <em>Fixed Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Rate</em>'.
	 * @see de.oaam.model.oaam.functions.Output#getFixedRate()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_FixedRate();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.ExternalOutputLink <em>External Output Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Output Link</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalOutputLink
	 * @generated
	 */
	EClass getExternalOutputLink();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.ExternalOutputLink#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalOutputLink#getOutput()
	 * @see #getExternalOutputLink()
	 * @generated
	 */
	EReference getExternalOutputLink_Output();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.ExternalOutputLink#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see de.oaam.model.oaam.functions.ExternalOutputLink#getFilter()
	 * @see #getExternalOutputLink()
	 * @generated
	 */
	EAttribute getExternalOutputLink_Filter();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Subfunction <em>Subfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subfunction</em>'.
	 * @see de.oaam.model.oaam.functions.Subfunction
	 * @generated
	 */
	EClass getSubfunction();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Subfunction#getMultiplicityMin <em>Multiplicity Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Min</em>'.
	 * @see de.oaam.model.oaam.functions.Subfunction#getMultiplicityMin()
	 * @see #getSubfunction()
	 * @generated
	 */
	EAttribute getSubfunction_MultiplicityMin();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Subfunction#getMultiplicityMax <em>Multiplicity Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Max</em>'.
	 * @see de.oaam.model.oaam.functions.Subfunction#getMultiplicityMax()
	 * @see #getSubfunction()
	 * @generated
	 */
	EAttribute getSubfunction_MultiplicityMax();

	/**
	 * Returns the meta object for class '{@link de.oaam.model.oaam.functions.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.oaam.model.oaam.functions.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link de.oaam.model.oaam.functions.Parameter#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see de.oaam.model.oaam.functions.Parameter#getDefinition()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Definition();

	/**
	 * Returns the meta object for the attribute '{@link de.oaam.model.oaam.functions.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.oaam.model.oaam.functions.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.FunctionsImpl <em>Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.FunctionsImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFunctions()
		 * @generated
		 */
		EClass FUNCTIONS = eINSTANCE.getFunctions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl <em>Container A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.FunctionsContainerAImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFunctionsContainerA()
		 * @generated
		 */
		EClass FUNCTIONS_CONTAINER_A = eINSTANCE.getFunctionsContainerA();

		/**
		 * The meta object literal for the '<em><b>Is Atomic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONS_CONTAINER_A__IS_ATOMIC = eINSTANCE.getFunctionsContainerA_IsAtomic();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASKS = eINSTANCE.getFunctionsContainerA_Tasks();

		/**
		 * The meta object literal for the '<em><b>Task Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASK_LINKS = eINSTANCE.getFunctionsContainerA_TaskLinks();

		/**
		 * The meta object literal for the '<em><b>Task Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASK_GROUPS = eINSTANCE.getFunctionsContainerA_TaskGroups();

		/**
		 * The meta object literal for the '<em><b>Task Symmetries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASK_SYMMETRIES = eINSTANCE.getFunctionsContainerA_TaskSymmetries();

		/**
		 * The meta object literal for the '<em><b>Task Redundancies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__TASK_REDUNDANCIES = eINSTANCE.getFunctionsContainerA_TaskRedundancies();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__SIGNALS = eINSTANCE.getFunctionsContainerA_Signals();

		/**
		 * The meta object literal for the '<em><b>Signal Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__SIGNAL_GROUPS = eINSTANCE.getFunctionsContainerA_SignalGroups();

		/**
		 * The meta object literal for the '<em><b>Failure Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__FAILURE_EVENTS = eINSTANCE.getFunctionsContainerA_FailureEvents();

		/**
		 * The meta object literal for the '<em><b>Subfunctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_CONTAINER_A__SUBFUNCTIONS = eINSTANCE.getFunctionsContainerA_Subfunctions();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TYPE = eINSTANCE.getTask_Type();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS = eINSTANCE.getTask_Outputs();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IMPLEMENTS = eINSTANCE.getTask_Implements();

		/**
		 * The meta object literal for the '<em><b>Device Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DEVICE_BINDING = eINSTANCE.getTask_DeviceBinding();

		/**
		 * The meta object literal for the '<em><b>NParallels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NPARALLELS = eINSTANCE.getTask_NParallels();

		/**
		 * The meta object literal for the '<em><b>Fixed Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__FIXED_RATE = eINSTANCE.getTask_FixedRate();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARAMETERS = eINSTANCE.getTask_Parameters();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.ExternalTaskLinkImpl <em>External Task Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.ExternalTaskLinkImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getExternalTaskLink()
		 * @generated
		 */
		EClass EXTERNAL_TASK_LINK = eINSTANCE.getExternalTaskLink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TASK_LINK__TYPE = eINSTANCE.getExternalTaskLink_Type();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TASK_LINK__INPUTS = eINSTANCE.getExternalTaskLink_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TASK_LINK__OUTPUTS = eINSTANCE.getExternalTaskLink_Outputs();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TASK_LINK__TASK = eINSTANCE.getExternalTaskLink_Task();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_TASK_LINK__FILTER = eINSTANCE.getExternalTaskLink_Filter();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskGroupImpl <em>Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskGroupImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskGroup()
		 * @generated
		 */
		EClass TASK_GROUP = eINSTANCE.getTaskGroup();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_GROUP__TASKS = eINSTANCE.getTaskGroup_Tasks();

		/**
		 * The meta object literal for the '<em><b>Is Atomic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_GROUP__IS_ATOMIC = eINSTANCE.getTaskGroup_IsAtomic();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskSymmetryImpl <em>Task Symmetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskSymmetryImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskSymmetry()
		 * @generated
		 */
		EClass TASK_SYMMETRY = eINSTANCE.getTaskSymmetry();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SYMMETRY__TASKS = eINSTANCE.getTaskSymmetry_Tasks();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.TaskRedundancyImpl <em>Task Redundancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.TaskRedundancyImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getTaskRedundancy()
		 * @generated
		 */
		EClass TASK_REDUNDANCY = eINSTANCE.getTaskRedundancy();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REDUNDANCY__TASKS = eINSTANCE.getTaskRedundancy_Tasks();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.FailureConditionImpl <em>Failure Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.FailureConditionImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getFailureCondition()
		 * @generated
		 */
		EClass FAILURE_CONDITION = eINSTANCE.getFailureCondition();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILURE_CONDITION__LOGIC = eINSTANCE.getFailureCondition_Logic();

		/**
		 * The meta object literal for the '<em><b>Max Occurrence Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_CONDITION__MAX_OCCURRENCE_RATE = eINSTANCE.getFailureCondition_MaxOccurrenceRate();

		/**
		 * The meta object literal for the '<em><b>No Single Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAILURE_CONDITION__NO_SINGLE_FAILURE = eINSTANCE.getFailureCondition_NoSingleFailure();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.SystemInputStateImpl <em>System Input State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.SystemInputStateImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSystemInputState()
		 * @generated
		 */
		EClass SYSTEM_INPUT_STATE = eINSTANCE.getSystemInputState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INPUT_STATE__STATE = eINSTANCE.getSystemInputState_State();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INPUT_STATE__OUTPUT = eINSTANCE.getSystemInputState_Output();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.SignalImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__SOURCE = eINSTANCE.getSignal_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__TARGET = eINSTANCE.getSignal_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__TYPE = eINSTANCE.getSignal_Type();

		/**
		 * The meta object literal for the '<em><b>In Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__IN_INDEX = eINSTANCE.getSignal_InIndex();

		/**
		 * The meta object literal for the '<em><b>Out Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__OUT_INDEX = eINSTANCE.getSignal_OutIndex();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.SignalGroupImpl <em>Signal Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.SignalGroupImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSignalGroup()
		 * @generated
		 */
		EClass SIGNAL_GROUP = eINSTANCE.getSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_GROUP__SIGNALS = eINSTANCE.getSignalGroup_Signals();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.InputImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__DECLARATION = eINSTANCE.getInput_Declaration();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__IMPLEMENTS = eINSTANCE.getInput_Implements();

		/**
		 * The meta object literal for the '<em><b>Io Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__IO_BINDINGS = eINSTANCE.getInput_IoBindings();

		/**
		 * The meta object literal for the '<em><b>Queue Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__QUEUE_LENGTH = eINSTANCE.getInput_QueueLength();

		/**
		 * The meta object literal for the '<em><b>Output Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__OUTPUT_LINK = eINSTANCE.getInput_OutputLink();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.OutputImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__IMPLEMENTS = eINSTANCE.getOutput_Implements();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__DECLARATION = eINSTANCE.getOutput_Declaration();

		/**
		 * The meta object literal for the '<em><b>Io Bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__IO_BINDINGS = eINSTANCE.getOutput_IoBindings();

		/**
		 * The meta object literal for the '<em><b>Fixed Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__FIXED_RATE = eINSTANCE.getOutput_FixedRate();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.ExternalOutputLinkImpl <em>External Output Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.ExternalOutputLinkImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getExternalOutputLink()
		 * @generated
		 */
		EClass EXTERNAL_OUTPUT_LINK = eINSTANCE.getExternalOutputLink();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_OUTPUT_LINK__OUTPUT = eINSTANCE.getExternalOutputLink_Output();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OUTPUT_LINK__FILTER = eINSTANCE.getExternalOutputLink_Filter();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.SubfunctionImpl <em>Subfunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.SubfunctionImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getSubfunction()
		 * @generated
		 */
		EClass SUBFUNCTION = eINSTANCE.getSubfunction();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBFUNCTION__MULTIPLICITY_MIN = eINSTANCE.getSubfunction_MultiplicityMin();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBFUNCTION__MULTIPLICITY_MAX = eINSTANCE.getSubfunction_MultiplicityMax();

		/**
		 * The meta object literal for the '{@link de.oaam.model.oaam.functions.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.oaam.model.oaam.functions.impl.ParameterImpl
		 * @see de.oaam.model.oaam.functions.impl.FunctionsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DEFINITION = eINSTANCE.getParameter_Definition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

	}

} //FunctionsPackage
