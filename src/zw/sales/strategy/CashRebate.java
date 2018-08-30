package zw.sales.strategy;

public class CashRebate extends CashSuper {
	private double moneyRebate = 1d;
	
	public CashRebate(String rebate) {
		// TODO Auto-generated constructor stub
		this.moneyRebate = Double.parseDouble(rebate);
	}
	
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money * moneyRebate;
	}

}
