package zw.domain;

import zw.calculator.factory.Operation;
import zw.calculator.factory.OperationFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//利用工厂模式设计的面向对象计算器
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(2);
		operation.setNumberB(1);
		double result = operation.getResult();
	}

}
