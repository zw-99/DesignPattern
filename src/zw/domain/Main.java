package zw.domain;

import zw.calculator.factory.simple.Operation;
import zw.calculator.factory.simple.OperationFactory;
import zw.clothing.decorator.LeatherShoes;
import zw.clothing.decorator.Person;
import zw.clothing.decorator.Suit;
import zw.clothing.decorator.Tie;
import zw.pursuit.proxy.Gril;
import zw.pursuit.proxy.Proxy;
import zw.sales.strategy.CashContext;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//利用简单工厂模式设计的面向对象计算器
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(2);
		operation.setNumberB(1);
		double result = operation.getResult();
		
		//使用策略模式和工厂模式设计超市收银优惠系统
		CashContext cashContext = new CashContext("正常");
		double totalMoney = cashContext.getResult(550);
		
		//使用装饰模式模拟人物穿着打扮
		Person person = new Person("zw");
		Suit suit = new Suit();
		Tie tie = new Tie();
		LeatherShoes leatherShoes = new LeatherShoes();
		leatherShoes.decrate(person);
		tie.decrate(leatherShoes);
		suit.decrate(tie);
		suit.show();
		System.out.println();
		
		//使用代理模式模拟追女孩
		Gril gril = new Gril("XX");
		Proxy proxy = new Proxy(gril);
		proxy.giveFlowers();
		proxy.giveChocolate();
	}

}
