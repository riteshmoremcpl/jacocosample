package au.com.coles.unittest;

import junit.framework.Assert;
import org.junit.Test;
import au.com.coles.sample.CardTransaction;

public class TestCardTransaction {
    @Test
    public void testTransactions() {
       CardTransaction cardTransaction = new CardTransaction(50.00);
       Assert.assertEquals(50.00, cardTransaction.fullPayment(50.00));
	   Assert.assertEquals(50.00, cardTransaction.fullRefund(50.00));
	   Assert.assertEquals(40.00, cardTransaction.partialRefund(40.00));
    }
}