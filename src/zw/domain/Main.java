package zw.domain;


import zw.calculator.factory.Operation;
import zw.calculator.factory.OperationFactory;
import zw.clothing.decorator.LeatherShoes;
import zw.clothing.decorator.Person;
import zw.clothing.decorator.Suit;
import zw.clothing.decorator.Tie;
import zw.sales.strategy.CashContext;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//���ù���ģʽ��Ƶ�������������
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(2);
		operation.setNumberB(1);
		double result = operation.getResult();
		
		//ʹ�ò���ģʽ�͹���ģʽ��Ƴ��������Ż�ϵͳ
		CashContext cashContext = new CashContext("����");
		double totalMoney = cashContext.getResult(550);
		
		//ʹ��װ��ģʽģ�����ﴩ�Ŵ��
		Person person = new Person("zw");
		Suit suit = new Suit();
		Tie tie = new Tie();
		LeatherShoes leatherShoes = new LeatherShoes();
		leatherShoes.decrate(person);
		tie.decrate(leatherShoes);
		suit.decrate(tie);
		suit.show();

	}

}
