/**
 */
package de.oaam.model.oaam.restrictions.impl;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.functions.Signal;
import de.oaam.model.oaam.functions.SignalGroup;
import de.oaam.model.oaam.functions.Subfunctions;
import de.oaam.model.oaam.functions.TaskGroup;

import de.oaam.model.oaam.hardware.Device;

import de.oaam.model.oaam.restrictions.DeviceRestriction;
import de.oaam.model.oaam.restrictions.RestrictionsPackage;
import de.oaam.model.oaam.restrictions.SignalGroupRestrictionA;
import de.oaam.model.oaam.restrictions.SignalRestrictionA;
import de.oaam.model.oaam.restrictions.SubfunctionRestrictionA;
import de.oaam.model.oaam.restrictions.TaskGroupRestrictionA;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getTaskGroups <em>Task Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getSignalGroups <em>Signal Groups</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getSubfunctions <em>Subfunctions</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#isIsForbidden <em>Is Forbidden</em>}</li>
 *   <li>{@link de.oaam.model.oaam.restrictions.impl.DeviceRestrictionImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceRestrictionImpl extends TaskRestrictionAImpl implements DeviceRestriction {
	/**
	 * The cached value of the '{@link #getTaskGroups() <em>Task Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskGroup> taskGroups;

	/**
	 * The cached value of the '{@link #getSignals() <em>Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signals;

	/**
	 * The cached value of the '{@link #getSignalGroups() <em>Signal Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalGroup> signalGroups;

	/**
	 * The cached value of the '{@link #getSubfunctions() <em>Subfunctions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Subfunctions> subfunctions;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeA> attributes;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected String modifier = MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LINK_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected String traceLink = TRACE_LINK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variants;

	/**
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

	/**
	 * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String deviceName = DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORBIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForbidden() <em>Is Forbidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isForbidden = IS_FORBIDDEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.DEVICE_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskGroup> getTaskGroups() {
		if (taskGroups == null) {
			taskGroups = new EObjectResolvingEList<TaskGroup>(TaskGroup.class, this, RestrictionsPackage.DEVICE_RESTRICTION__TASK_GROUPS);
		}
		return taskGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignals() {
		if (signals == null) {
			signals = new EObjectResolvingEList<Signal>(Signal.class, this, RestrictionsPackage.DEVICE_RESTRICTION__SIGNALS);
		}
		return signals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalGroup> getSignalGroups() {
		if (signalGroups == null) {
			signalGroups = new EObjectResolvingEList<SignalGroup>(SignalGroup.class, this, RestrictionsPackage.DEVICE_RESTRICTION__SIGNAL_GROUPS);
		}
		return signalGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subfunctions> getSubfunctions() {
		if (subfunctions == null) {
			subfunctions = new EObjectResolvingEList<Subfunctions>(Subfunctions.class, this, RestrictionsPackage.DEVICE_RESTRICTION__SUBFUNCTIONS);
		}
		return subfunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, RestrictionsPackage.DEVICE_RESTRICTION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(String newModifier) {
		String oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceLink() {
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(String newTraceLink) {
		String oldTraceLink = traceLink;
		traceLink = newTraceLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, RestrictionsPackage.DEVICE_RESTRICTION__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, RestrictionsPackage.DEVICE_RESTRICTION__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(String newDeviceName) {
		String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForbidden() {
		return isForbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForbidden(boolean newIsForbidden) {
		boolean oldIsForbidden = isForbidden;
		isForbidden = newIsForbidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.DEVICE_RESTRICTION__IS_FORBIDDEN, oldIsForbidden, isForbidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList<Device>(Device.class, this, RestrictionsPackage.DEVICE_RESTRICTION__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestrictionsPackage.DEVICE_RESTRICTION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case RestrictionsPackage.DEVICE_RESTRICTION__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
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
			case RestrictionsPackage.DEVICE_RESTRICTION__TASK_GROUPS:
				return getTaskGroups();
			case RestrictionsPackage.DEVICE_RESTRICTION__SIGNALS:
				return getSignals();
			case RestrictionsPackage.DEVICE_RESTRICTION__SIGNAL_GROUPS:
				return getSignalGroups();
			case RestrictionsPackage.DEVICE_RESTRICTION__SUBFUNCTIONS:
				return getSubfunctions();
			case RestrictionsPackage.DEVICE_RESTRICTION__ID:
				return getId();
			case RestrictionsPackage.DEVICE_RESTRICTION__NAME:
				return getName();
			case RestrictionsPackage.DEVICE_RESTRICTION__STYLE:
				return getStyle();
			case RestrictionsPackage.DEVICE_RESTRICTION__ATTRIBUTES:
				return getAttributes();
			case RestrictionsPackage.DEVICE_RESTRICTION__DOCUMENTATION:
				return getDocumentation();
			case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIED:
				return getModified();
			case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIER:
				return getModifier();
			case RestrictionsPackage.DEVICE_RESTRICTION__TRACE_LINK:
				return getTraceLink();
			case RestrictionsPackage.DEVICE_RESTRICTION__VARIANTS:
				return getVariants();
			case RestrictionsPackage.DEVICE_RESTRICTION__OPERATION_MODES:
				return getOperationModes();
			case RestrictionsPackage.DEVICE_RESTRICTION__DEVICE_NAME:
				return getDeviceName();
			case RestrictionsPackage.DEVICE_RESTRICTION__IS_FORBIDDEN:
				return isIsForbidden();
			case RestrictionsPackage.DEVICE_RESTRICTION__DEVICES:
				return getDevices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestrictionsPackage.DEVICE_RESTRICTION__TASK_GROUPS:
				getTaskGroups().clear();
				getTaskGroups().addAll((Collection<? extends TaskGroup>)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__SIGNALS:
				getSignals().clear();
				getSignals().addAll((Collection<? extends Signal>)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__SIGNAL_GROUPS:
				getSignalGroups().clear();
				getSignalGroups().addAll((Collection<? extends SignalGroup>)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__SUBFUNCTIONS:
				getSubfunctions().clear();
				getSubfunctions().addAll((Collection<? extends Subfunctions>)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__ID:
				setId((String)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__NAME:
				setName((String)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__STYLE:
				setStyle((String)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIED:
				setModified((Date)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIER:
				setModifier((String)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__IS_FORBIDDEN:
				setIsForbidden((Boolean)newValue);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
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
			case RestrictionsPackage.DEVICE_RESTRICTION__TASK_GROUPS:
				getTaskGroups().clear();
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__SIGNALS:
				getSignals().clear();
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__SIGNAL_GROUPS:
				getSignalGroups().clear();
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__SUBFUNCTIONS:
				getSubfunctions().clear();
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__ID:
				setId(ID_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__VARIANTS:
				getVariants().clear();
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__IS_FORBIDDEN:
				setIsForbidden(IS_FORBIDDEN_EDEFAULT);
				return;
			case RestrictionsPackage.DEVICE_RESTRICTION__DEVICES:
				getDevices().clear();
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
			case RestrictionsPackage.DEVICE_RESTRICTION__TASK_GROUPS:
				return taskGroups != null && !taskGroups.isEmpty();
			case RestrictionsPackage.DEVICE_RESTRICTION__SIGNALS:
				return signals != null && !signals.isEmpty();
			case RestrictionsPackage.DEVICE_RESTRICTION__SIGNAL_GROUPS:
				return signalGroups != null && !signalGroups.isEmpty();
			case RestrictionsPackage.DEVICE_RESTRICTION__SUBFUNCTIONS:
				return subfunctions != null && !subfunctions.isEmpty();
			case RestrictionsPackage.DEVICE_RESTRICTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RestrictionsPackage.DEVICE_RESTRICTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RestrictionsPackage.DEVICE_RESTRICTION__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case RestrictionsPackage.DEVICE_RESTRICTION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case RestrictionsPackage.DEVICE_RESTRICTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case RestrictionsPackage.DEVICE_RESTRICTION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case RestrictionsPackage.DEVICE_RESTRICTION__VARIANTS:
				return variants != null && !variants.isEmpty();
			case RestrictionsPackage.DEVICE_RESTRICTION__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case RestrictionsPackage.DEVICE_RESTRICTION__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case RestrictionsPackage.DEVICE_RESTRICTION__IS_FORBIDDEN:
				return isForbidden != IS_FORBIDDEN_EDEFAULT;
			case RestrictionsPackage.DEVICE_RESTRICTION__DEVICES:
				return devices != null && !devices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TaskGroupRestrictionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.DEVICE_RESTRICTION__TASK_GROUPS: return RestrictionsPackage.TASK_GROUP_RESTRICTION_A__TASK_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == SignalRestrictionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.DEVICE_RESTRICTION__SIGNALS: return RestrictionsPackage.SIGNAL_RESTRICTION_A__SIGNALS;
				default: return -1;
			}
		}
		if (baseClass == SignalGroupRestrictionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.DEVICE_RESTRICTION__SIGNAL_GROUPS: return RestrictionsPackage.SIGNAL_GROUP_RESTRICTION_A__SIGNAL_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == SubfunctionRestrictionA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.DEVICE_RESTRICTION__SUBFUNCTIONS: return RestrictionsPackage.SUBFUNCTION_RESTRICTION_A__SUBFUNCTIONS;
				default: return -1;
			}
		}
		if (baseClass == OaamBaseElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.DEVICE_RESTRICTION__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case RestrictionsPackage.DEVICE_RESTRICTION__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case RestrictionsPackage.DEVICE_RESTRICTION__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case RestrictionsPackage.DEVICE_RESTRICTION__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case RestrictionsPackage.DEVICE_RESTRICTION__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case RestrictionsPackage.DEVICE_RESTRICTION__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case RestrictionsPackage.DEVICE_RESTRICTION__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.DEVICE_RESTRICTION__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case RestrictionsPackage.DEVICE_RESTRICTION__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TaskGroupRestrictionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.TASK_GROUP_RESTRICTION_A__TASK_GROUPS: return RestrictionsPackage.DEVICE_RESTRICTION__TASK_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == SignalRestrictionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.SIGNAL_RESTRICTION_A__SIGNALS: return RestrictionsPackage.DEVICE_RESTRICTION__SIGNALS;
				default: return -1;
			}
		}
		if (baseClass == SignalGroupRestrictionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.SIGNAL_GROUP_RESTRICTION_A__SIGNAL_GROUPS: return RestrictionsPackage.DEVICE_RESTRICTION__SIGNAL_GROUPS;
				default: return -1;
			}
		}
		if (baseClass == SubfunctionRestrictionA.class) {
			switch (baseFeatureID) {
				case RestrictionsPackage.SUBFUNCTION_RESTRICTION_A__SUBFUNCTIONS: return RestrictionsPackage.DEVICE_RESTRICTION__SUBFUNCTIONS;
				default: return -1;
			}
		}
		if (baseClass == OaamBaseElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return RestrictionsPackage.DEVICE_RESTRICTION__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return RestrictionsPackage.DEVICE_RESTRICTION__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return RestrictionsPackage.DEVICE_RESTRICTION__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return RestrictionsPackage.DEVICE_RESTRICTION__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return RestrictionsPackage.DEVICE_RESTRICTION__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return RestrictionsPackage.DEVICE_RESTRICTION__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return RestrictionsPackage.DEVICE_RESTRICTION__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return RestrictionsPackage.DEVICE_RESTRICTION__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return RestrictionsPackage.DEVICE_RESTRICTION__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return RestrictionsPackage.DEVICE_RESTRICTION__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", style: ");
		result.append(style);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", modified: ");
		result.append(modified);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", traceLink: ");
		result.append(traceLink);
		result.append(", deviceName: ");
		result.append(deviceName);
		result.append(", isForbidden: ");
		result.append(isForbidden);
		result.append(')');
		return result.toString();
	}

} //DeviceRestrictionImpl
