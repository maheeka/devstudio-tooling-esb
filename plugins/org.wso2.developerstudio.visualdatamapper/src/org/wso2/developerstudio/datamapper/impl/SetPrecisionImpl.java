/**
 */
package org.wso2.developerstudio.datamapper.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.wso2.developerstudio.datamapper.DataMapperOperatorType;
import org.wso2.developerstudio.datamapper.DataMapperPackage;
import org.wso2.developerstudio.datamapper.SchemaDataType;
import org.wso2.developerstudio.datamapper.SetPrecision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Precision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.datamapper.impl.SetPrecisionImpl#getNumberOfDigits <em>Number Of Digits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetPrecisionImpl extends OperatorImpl implements SetPrecision {
	/**
	 * The default value of the '{@link #getNumberOfDigits() <em>Number Of Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDigits()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DIGITS_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getNumberOfDigits() <em>Number Of Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDigits()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDigits = NUMBER_OF_DIGITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SetPrecisionImpl() {
		super();
		setDefaultInputConnectors(1);
		setDefaultOutputConnectors(1);
		setInputSizeFixed(true);
		setOutputSizeFixed(true);
		getInputVariableType().add(SchemaDataType.INT);
		getInputVariableType().add(SchemaDataType.DOUBLE);
		getOutputVariableType().add(SchemaDataType.INT);
		getOutputVariableType().add(SchemaDataType.DOUBLE);
		setOperatorType(DataMapperOperatorType.SET_PRECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataMapperPackage.Literals.SET_PRECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDigits() {
		return numberOfDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDigits(int newNumberOfDigits) {
		int oldNumberOfDigits = numberOfDigits;
		numberOfDigits = newNumberOfDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataMapperPackage.SET_PRECISION__NUMBER_OF_DIGITS, oldNumberOfDigits, numberOfDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataMapperPackage.SET_PRECISION__NUMBER_OF_DIGITS:
				return getNumberOfDigits();
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
			case DataMapperPackage.SET_PRECISION__NUMBER_OF_DIGITS:
				setNumberOfDigits((Integer)newValue);
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
			case DataMapperPackage.SET_PRECISION__NUMBER_OF_DIGITS:
				setNumberOfDigits(NUMBER_OF_DIGITS_EDEFAULT);
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
			case DataMapperPackage.SET_PRECISION__NUMBER_OF_DIGITS:
				return numberOfDigits != NUMBER_OF_DIGITS_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numberOfDigits: ");
		result.append(numberOfDigits);
		result.append(')');
		return result.toString();
	}

} //SetPrecisionImpl