package zw.calculator.factory.simple;

public class OperationDiv extends Operation {

	@Override
	public double getResult() throws Exception {
		// TODO Auto-generated method stub
		double result=0;
		if (getNumberB() == 0) {
			throw new Exception("��������Ϊ��");
		}
		result = getNumberA() / getNumberB();
		return result;
	}

}
