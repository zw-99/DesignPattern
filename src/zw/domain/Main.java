package zw.domain;

import zw.calculator.factory.Operation;
import zw.calculator.factory.OperationFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//���ù���ģʽ��Ƶ�������������
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(2);
		operation.setNumberB(1);
		double result = operation.getResult();
	}

}
