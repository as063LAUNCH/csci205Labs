/* **********************
 *******************
 * CSCI205 -Software Engineering and Design
 * Spring2016
 *
 * Name: Sienna & Anushikha
 * Date: Feb 8, 2016
 * Time: 10:22:54 AM
 *
 * Project: csci205
 * Package: lab06
 * File: CashRegister
 * Description:
 *
 * ****************************************
 */
package lab06;

/**
 *
 * @author slm053 and as063
 */
public class CashRegister {
    /**
     * the name of the cash drawer *
     */
    private String sName;
    /**
     * the amount of cash in the drawer *
     */
    private double cashInDrawer;

    private boolean isInTransaction;

    private double transTotal;

    private int numItemsInTrans = 0;

    private double amountPaid;

    /**
     * Initialize a default, empty cash register
     */
    public CashRegister() {
        this.cashInDrawer = 0;
        this.isInTransaction = false;
        this.transTotal = 0;
        this.numItemsInTrans = 0;
        this.amountPaid = 0;
        this.sName = "Default";

    }

    /**
     * Initialize an empty cash register with a specified name
     *
     * @param sName - the name of the register
     */
    public CashRegister(String sName) {
        this();
        this.sName = sName;
    }

    /**
     * Get the value of amountPaid
     *
     * @return the value of amountPaid
     */
    public double getAmountPaid() {
        return amountPaid;
    }

    /**
     * Set the value of amountPaid
     *
     * @param amountPaid new value of amountPaid
     */
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * Get the value of numItemsInTrans
     *
     * @return the value of numItemsInTrans
     */
    public int getNumItemsInTrans() {
        return numItemsInTrans;
    }

    /**
     * Set the value of numItemsInTrans
     *
     * @param numItemsInTrans new value of numItemsInTrans
     */
    public void setNumItemsInTrans(int numItemsInTrans) {
        this.numItemsInTrans = numItemsInTrans;
    }

    /**
     * Get the value of transTotal
     *
     * @return the value of transTotal
     */
    public double getTransactionTotal() {
        return transTotal;
    }

    /**
     * Set the value of transTotal
     *
     * @param transTotal new value of transTotal
     */
    public void setTransTotal(double transTotal) {
        this.transTotal = transTotal;
    }

    /**
     * Get the value of isInTransaction
     *
     * @return the value of isInTransaction
     */
    public boolean isInTransaction() {
        return isInTransaction;
    }

    /**
     * Set the value of isInTransaction
     *
     * @param isInTransaction new value of isInTransaction
     */
    public void setIsInTransaction(boolean isInTransaction) {
        this.isInTransaction = isInTransaction;
    }

    /**
     * Get the value of sName
     *
     * @return the value of sName
     */
    public String getName() {
        return sName;
    }

    /**
     * Set the value of sName
     *
     * @param sName new value of sName
     */
    public void setName(String sName) {
        this.sName = sName;
    }

    /**
     * Get the value of cashInDrawer Restarts the amount of cash in the drawer
     * at 0.
     *
     * @return the value of cashInDrawer
     */
    public double finishDay() {
        double temp = this.cashInDrawer;
        this.cashInDrawer = 0;
        return temp;
    }

    /**
     * Sets the value of cashInDrawer
     *
     * @param cashInDrawer the value for the cashInDrawer
     */
    public void startDay(double cashInDrawer) {
        this.cashInDrawer = cashInDrawer;
    }

    /**
     * starts a Transaction
     *
     * @return boolean whether or not you can start a transaction
     */
    public boolean startTransaction() {
        if (isInTransaction == true) {
            return false;
        } else {
            isInTransaction = true;
            return this.cashInDrawer != 0;
        }
    }

    /**
     * finishes a transaction
     *
     * @return boolean of whether or not amountOwed is zero and transaction is
     * complete
     */
    public boolean finishTransaction() {

        if (getAmountOwed() <= 0) {
            isInTransaction = false;
            amountPaid = 0;
            transTotal = 0;
            numItemsInTrans = 0;
            return true;
        } else {
            return false;
        }
    }

    /**
     * retrieves the amount owed
     *
     * @return double amountOwed.
     */
    public double getAmountOwed() {
        double amountOwed = transTotal - amountPaid;
        return amountOwed;
    }

    /**
     * collects a payment
     *
     * @return double of the amountOwed.
     */
    public double collectPayment(double amountPaid) {

        this.amountPaid += amountPaid;
        double amountOwed = getAmountOwed();
        if (transTotal > this.amountPaid) {
            cashInDrawer += amountPaid;
            return (-1 * amountOwed);
        } else if (amountOwed == 0) {
            cashInDrawer += amountPaid;
            return 0;
        } else if (transTotal < this.amountPaid) {
            cashInDrawer += amountOwed + amountPaid;
            return -1 * (amountOwed);
        }
        return amountOwed;
    }

    /**
     * Scans an item and adds it's price to the transaction and its quantity to
     * the number of transactions
     *
     * @param price a double of the price of the item
     */
    public void scanItem(double price) {
        transTotal += price;
        numItemsInTrans += 1;
    }

    /**
     * represents the cash register
     *
     * @return string representation of the cash register
     */
    @Override
    public String toString() {
        if (isInTransaction() == true) {
            return "Cash in the drawer: " + cashInDrawer + "\nIs in transaction: " + isInTransaction + "\nTotal of transaction: " + transTotal + "\nNumber of items in transaction: "
                   + numItemsInTrans + "\nAmount paid by customer " + amountPaid + "\nName of register: " + sName;
        } else {
            return "Cash in the drawer: " + cashInDrawer + "\nIs in transaction: " + isInTransaction + "\nName of register: " + sName;
        }

    }
}
