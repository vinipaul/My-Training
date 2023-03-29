/**2.	Write a program, where RBI will be an interface, 
 * have a method recurringDeposit which can accept the amount and duration.
 *  This must be implemented in class HDFC. 
 *a.	When a customer deposit amount in HDFC, 
 they must be able to know how much amount they will get after depositing for n period of time. 
b.	Interest rate is defined in RBI interface. **/

package com.interfaces;

public interface RBI {
double recurringDeposit(float amount,float duration);
 double interest=.04;
}
