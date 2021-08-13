/**
 */
package com.tum.vsms.Payment.Payment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.tum.vsms.Payment.Payment.PaymentFactory
 * @model kind="package"
 * @generated
 */
public interface PaymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Payment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.tum.vsms.Payment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.tum.vsms.Payment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentPackage eINSTANCE = com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentImpl
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__RESERVATION_ID = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_DATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__CUSTOMER = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__STATUS = 6;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.impl.InvoiceImpl
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Customer name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CUSTOMER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Customer address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CUSTOMER_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__START_DATE = 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__END_DATE = 5;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__TOTAL_COST = 6;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.impl.CustomerImpl
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.impl.CashImpl <em>Cash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.impl.CashImpl
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getCash()
	 * @generated
	 */
	int CASH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__ID = PAYMENT__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__RESERVATION_ID = PAYMENT__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__AMOUNT = PAYMENT__AMOUNT;

	/**
	 * The feature id for the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__PAYMENT_DATE = PAYMENT__PAYMENT_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__DESCRIPTION = PAYMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__CUSTOMER = PAYMENT__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__STATUS = PAYMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__ADDRESS = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH__CUSTOMER_NAME = PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Authorization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH___AUTHORIZATION = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.impl.CreditCardImpl <em>Credit Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.impl.CreditCardImpl
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getCreditCard()
	 * @generated
	 */
	int CREDIT_CARD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__ID = PAYMENT__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__RESERVATION_ID = PAYMENT__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__AMOUNT = PAYMENT__AMOUNT;

	/**
	 * The feature id for the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__PAYMENT_DATE = PAYMENT__PAYMENT_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__DESCRIPTION = PAYMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CUSTOMER = PAYMENT__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__STATUS = PAYMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Cardholder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CARDHOLDER_NAME = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CARD_NUMBER = PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cvv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CVV = PAYMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__EXPIRATION_DATE = PAYMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Credit Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Authorization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD___AUTHORIZATION = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Credit Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.impl.BankImpl
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ID = PAYMENT__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__RESERVATION_ID = PAYMENT__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__AMOUNT = PAYMENT__AMOUNT;

	/**
	 * The feature id for the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__PAYMENT_DATE = PAYMENT__PAYMENT_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__DESCRIPTION = PAYMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__CUSTOMER = PAYMENT__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__STATUS = PAYMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ACCOUNT_NUMBER = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IBAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__IBAN = PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__PASSWORD = PAYMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Authorization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___AUTHORIZATION = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.impl.PromoCodeImpl <em>Promo Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.impl.PromoCodeImpl
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getPromoCode()
	 * @generated
	 */
	int PROMO_CODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__ID = PAYMENT__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__RESERVATION_ID = PAYMENT__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__AMOUNT = PAYMENT__AMOUNT;

	/**
	 * The feature id for the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__PAYMENT_DATE = PAYMENT__PAYMENT_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__DESCRIPTION = PAYMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__CUSTOMER = PAYMENT__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__STATUS = PAYMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__CODE = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE__EXPIRATION_DATE = PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Promo Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Promo Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMO_CODE_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.impl.PaypalImpl <em>Paypal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.impl.PaypalImpl
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getPaypal()
	 * @generated
	 */
	int PAYPAL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__ID = PAYMENT__ID;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__RESERVATION_ID = PAYMENT__RESERVATION_ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__AMOUNT = PAYMENT__AMOUNT;

	/**
	 * The feature id for the '<em><b>Payment date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__PAYMENT_DATE = PAYMENT__PAYMENT_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__DESCRIPTION = PAYMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__CUSTOMER = PAYMENT__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__STATUS = PAYMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__EMAIL = PAYMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL__PASSWORD = PAYMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Paypal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL_FEATURE_COUNT = PAYMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Paypal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYPAL_OPERATION_COUNT = PAYMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tum.vsms.Payment.Payment.PaymentStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tum.vsms.Payment.Payment.PaymentStatus
	 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getPaymentStatus()
	 * @generated
	 */
	int PAYMENT_STATUS = 8;


	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Payment.Payment.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see com.tum.vsms.Payment.Payment.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Payment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.tum.vsms.Payment.Payment.Payment#getId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Payment#getReservationId <em>Reservation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Id</em>'.
	 * @see com.tum.vsms.Payment.Payment.Payment#getReservationId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_ReservationId();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see com.tum.vsms.Payment.Payment.Payment#getAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Payment#getPayment_date <em>Payment date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment date</em>'.
	 * @see com.tum.vsms.Payment.Payment.Payment#getPayment_date()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Payment_date();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Payment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.tum.vsms.Payment.Payment.Payment#getDescription()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Description();

	/**
	 * Returns the meta object for the reference '{@link com.tum.vsms.Payment.Payment.Payment#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see com.tum.vsms.Payment.Payment.Payment#getCustomer()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Customer();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Payment#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.tum.vsms.Payment.Payment.Payment#getStatus()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Status();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Payment.Payment.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see com.tum.vsms.Payment.Payment.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Invoice#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.tum.vsms.Payment.Payment.Invoice#getId()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Invoice#getCustomer_name <em>Customer name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer name</em>'.
	 * @see com.tum.vsms.Payment.Payment.Invoice#getCustomer_name()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Customer_name();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Invoice#getCustomer_address <em>Customer address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer address</em>'.
	 * @see com.tum.vsms.Payment.Payment.Invoice#getCustomer_address()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Customer_address();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Invoice#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.tum.vsms.Payment.Payment.Invoice#getDuration()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Duration();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Invoice#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see com.tum.vsms.Payment.Payment.Invoice#getStartDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Invoice#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see com.tum.vsms.Payment.Payment.Invoice#getEndDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Invoice#getTotalCost <em>Total Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cost</em>'.
	 * @see com.tum.vsms.Payment.Payment.Invoice#getTotalCost()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_TotalCost();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Payment.Payment.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see com.tum.vsms.Payment.Payment.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Payment.Payment.Cash <em>Cash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash</em>'.
	 * @see com.tum.vsms.Payment.Payment.Cash
	 * @generated
	 */
	EClass getCash();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Cash#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see com.tum.vsms.Payment.Payment.Cash#getAddress()
	 * @see #getCash()
	 * @generated
	 */
	EAttribute getCash_Address();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Cash#getCustomerName <em>Customer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Name</em>'.
	 * @see com.tum.vsms.Payment.Payment.Cash#getCustomerName()
	 * @see #getCash()
	 * @generated
	 */
	EAttribute getCash_CustomerName();

	/**
	 * Returns the meta object for the '{@link com.tum.vsms.Payment.Payment.Cash#authorization() <em>Authorization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authorization</em>' operation.
	 * @see com.tum.vsms.Payment.Payment.Cash#authorization()
	 * @generated
	 */
	EOperation getCash__Authorization();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Payment.Payment.CreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card</em>'.
	 * @see com.tum.vsms.Payment.Payment.CreditCard
	 * @generated
	 */
	EClass getCreditCard();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.CreditCard#getCardholderName <em>Cardholder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardholder Name</em>'.
	 * @see com.tum.vsms.Payment.Payment.CreditCard#getCardholderName()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_CardholderName();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.CreditCard#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see com.tum.vsms.Payment.Payment.CreditCard#getCardNumber()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_CardNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.CreditCard#getCvv <em>Cvv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvv</em>'.
	 * @see com.tum.vsms.Payment.Payment.CreditCard#getCvv()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_Cvv();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.CreditCard#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see com.tum.vsms.Payment.Payment.CreditCard#getExpirationDate()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_ExpirationDate();

	/**
	 * Returns the meta object for the '{@link com.tum.vsms.Payment.Payment.CreditCard#authorization() <em>Authorization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authorization</em>' operation.
	 * @see com.tum.vsms.Payment.Payment.CreditCard#authorization()
	 * @generated
	 */
	EOperation getCreditCard__Authorization();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Payment.Payment.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see com.tum.vsms.Payment.Payment.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Bank#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see com.tum.vsms.Payment.Payment.Bank#getAccountNumber()
	 * @see #getBank()
	 * @generated
	 */
	EAttribute getBank_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Bank#getIBAN <em>IBAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IBAN</em>'.
	 * @see com.tum.vsms.Payment.Payment.Bank#getIBAN()
	 * @see #getBank()
	 * @generated
	 */
	EAttribute getBank_IBAN();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Bank#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tum.vsms.Payment.Payment.Bank#getPassword()
	 * @see #getBank()
	 * @generated
	 */
	EAttribute getBank_Password();

	/**
	 * Returns the meta object for the '{@link com.tum.vsms.Payment.Payment.Bank#authorization() <em>Authorization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authorization</em>' operation.
	 * @see com.tum.vsms.Payment.Payment.Bank#authorization()
	 * @generated
	 */
	EOperation getBank__Authorization();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Payment.Payment.PromoCode <em>Promo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promo Code</em>'.
	 * @see com.tum.vsms.Payment.Payment.PromoCode
	 * @generated
	 */
	EClass getPromoCode();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.PromoCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.tum.vsms.Payment.Payment.PromoCode#getCode()
	 * @see #getPromoCode()
	 * @generated
	 */
	EAttribute getPromoCode_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.PromoCode#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see com.tum.vsms.Payment.Payment.PromoCode#getExpirationDate()
	 * @see #getPromoCode()
	 * @generated
	 */
	EAttribute getPromoCode_ExpirationDate();

	/**
	 * Returns the meta object for class '{@link com.tum.vsms.Payment.Payment.Paypal <em>Paypal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paypal</em>'.
	 * @see com.tum.vsms.Payment.Payment.Paypal
	 * @generated
	 */
	EClass getPaypal();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Paypal#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see com.tum.vsms.Payment.Payment.Paypal#getEmail()
	 * @see #getPaypal()
	 * @generated
	 */
	EAttribute getPaypal_Email();

	/**
	 * Returns the meta object for the attribute '{@link com.tum.vsms.Payment.Payment.Paypal#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tum.vsms.Payment.Payment.Paypal#getPassword()
	 * @see #getPaypal()
	 * @generated
	 */
	EAttribute getPaypal_Password();

	/**
	 * Returns the meta object for enum '{@link com.tum.vsms.Payment.Payment.PaymentStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see com.tum.vsms.Payment.Payment.PaymentStatus
	 * @generated
	 */
	EEnum getPaymentStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PaymentFactory getPaymentFactory();

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
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentImpl
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__ID = eINSTANCE.getPayment_Id();

		/**
		 * The meta object literal for the '<em><b>Reservation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__RESERVATION_ID = eINSTANCE.getPayment_ReservationId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT = eINSTANCE.getPayment_Amount();

		/**
		 * The meta object literal for the '<em><b>Payment date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_DATE = eINSTANCE.getPayment_Payment_date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__DESCRIPTION = eINSTANCE.getPayment_Description();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__CUSTOMER = eINSTANCE.getPayment_Customer();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__STATUS = eINSTANCE.getPayment_Status();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.impl.InvoiceImpl
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__ID = eINSTANCE.getInvoice_Id();

		/**
		 * The meta object literal for the '<em><b>Customer name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__CUSTOMER_NAME = eINSTANCE.getInvoice_Customer_name();

		/**
		 * The meta object literal for the '<em><b>Customer address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__CUSTOMER_ADDRESS = eINSTANCE.getInvoice_Customer_address();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__DURATION = eINSTANCE.getInvoice_Duration();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__START_DATE = eINSTANCE.getInvoice_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__END_DATE = eINSTANCE.getInvoice_EndDate();

		/**
		 * The meta object literal for the '<em><b>Total Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__TOTAL_COST = eINSTANCE.getInvoice_TotalCost();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.impl.CustomerImpl
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.impl.CashImpl <em>Cash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.impl.CashImpl
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getCash()
		 * @generated
		 */
		EClass CASH = eINSTANCE.getCash();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH__ADDRESS = eINSTANCE.getCash_Address();

		/**
		 * The meta object literal for the '<em><b>Customer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH__CUSTOMER_NAME = eINSTANCE.getCash_CustomerName();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CASH___AUTHORIZATION = eINSTANCE.getCash__Authorization();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.impl.CreditCardImpl <em>Credit Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.impl.CreditCardImpl
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getCreditCard()
		 * @generated
		 */
		EClass CREDIT_CARD = eINSTANCE.getCreditCard();

		/**
		 * The meta object literal for the '<em><b>Cardholder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CARDHOLDER_NAME = eINSTANCE.getCreditCard_CardholderName();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CARD_NUMBER = eINSTANCE.getCreditCard_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Cvv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CVV = eINSTANCE.getCreditCard_Cvv();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__EXPIRATION_DATE = eINSTANCE.getCreditCard_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CREDIT_CARD___AUTHORIZATION = eINSTANCE.getCreditCard__Authorization();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.impl.BankImpl
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK__ACCOUNT_NUMBER = eINSTANCE.getBank_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>IBAN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK__IBAN = eINSTANCE.getBank_IBAN();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK__PASSWORD = eINSTANCE.getBank_Password();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK___AUTHORIZATION = eINSTANCE.getBank__Authorization();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.impl.PromoCodeImpl <em>Promo Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.impl.PromoCodeImpl
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getPromoCode()
		 * @generated
		 */
		EClass PROMO_CODE = eINSTANCE.getPromoCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMO_CODE__CODE = eINSTANCE.getPromoCode_Code();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMO_CODE__EXPIRATION_DATE = eINSTANCE.getPromoCode_ExpirationDate();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.impl.PaypalImpl <em>Paypal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.impl.PaypalImpl
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getPaypal()
		 * @generated
		 */
		EClass PAYPAL = eINSTANCE.getPaypal();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYPAL__EMAIL = eINSTANCE.getPaypal_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYPAL__PASSWORD = eINSTANCE.getPaypal_Password();

		/**
		 * The meta object literal for the '{@link com.tum.vsms.Payment.Payment.PaymentStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tum.vsms.Payment.Payment.PaymentStatus
		 * @see com.tum.vsms.Payment.Payment.impl.PaymentPackageImpl#getPaymentStatus()
		 * @generated
		 */
		EEnum PAYMENT_STATUS = eINSTANCE.getPaymentStatus();

	}

} //PaymentPackage
