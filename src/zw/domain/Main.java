package zw.domain;

import zw.calculator.factory.Operation;
import zw.calculator.factory.OperationFactory;
import zw.sales.strategy.CashContext;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//利用工厂模式设计的面向对象计算器
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(2);
		operation.setNumberB(1);
		double result = operation.getResult();
		
		//使用策略模式和工厂模式设计超市收银优惠系统
		CashContext cashContext = new CashContext("正常");
		double totalMoney = cashContext.getResult(550);

	}

}
