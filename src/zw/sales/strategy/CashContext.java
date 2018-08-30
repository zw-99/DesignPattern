package zw.sales.strategy;

public class CashContext {
	private CashSuper cs = null;
	public CashContext(String mode) {
		// TODO Auto-generated constructor stub
		switch (mode) {
		case "����":
			cs = new CashNormal();
			break;
		case "����":
			cs = new CashRebate("0.85");
			break;
		case "����":
			cs = new CashReturn("100", "10");
			break;

		default:
			break;
		}
	}
	public double getResult(double money) {
		return cs.acceptCash(money);
	}
}
