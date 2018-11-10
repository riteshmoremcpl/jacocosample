package au.com.coles.sample;

public class CardTransaction {

	  private double orderTotal;

	  public CardTransaction(double orderTotal) {
		this.orderTotal = orderTotal;
	  }

	  public double fullPayment(double paymentAmount) {
		if (this.orderTotal == paymentAmount) {
			return paymentAmount;
		} else {
			return 0.00;
		}
	  }
	  
	  public double fullRefund(double refundAmount) {
		if (this.orderTotal == refundAmount) {
			return refundAmount;
		} else {
			return 0.00;
		}
	  }
	  
	  public double partialRefund(double refundAmount) {
		if (this.orderTotal >= refundAmount) {
			return refundAmount;
		} else {
			return 0.00;
		}
	  }

}