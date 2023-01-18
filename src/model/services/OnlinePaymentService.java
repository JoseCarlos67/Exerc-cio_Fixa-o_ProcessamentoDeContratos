package model.services;

public interface OnlinePaymentService {

	public double paymentFee(double amount);
	
	public double interes(double amount, int months);
	
}
