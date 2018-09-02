package zw.calculator.factory;

public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}

}
