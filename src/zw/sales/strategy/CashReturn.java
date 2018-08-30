package zw.sales.strategy;

public class CashReturn extends CashSuper {
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;
	
	public CashReturn(String moneyCondition, String moneyReturn) {
		// TODO Auto-generated constructor stub
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}
	
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		double result = money;
		//若大于返利条件，则返回返利后的金额
		if (money >= moneyCondition) {
			result = money-Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
