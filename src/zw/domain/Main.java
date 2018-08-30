package zw.domain;

import zw.calculator.factory.Operation;
import zw.calculator.factory.OperationFactory;
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

	}

}
