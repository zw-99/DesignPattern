package zw.domain;
import zw.calculator.factory.*;
import zw.calculator.factory.AddFactory;
import zw.calculator.factory.simple.Operation;
import zw.calculator.factory.simple.OperationFactory;
import zw.clothing.decorator.LeatherShoes;
import zw.clothing.decorator.Person;
import zw.clothing.decorator.Suit;
import zw.clothing.decorator.Tie;
import zw.db.factory.abstracts.DataManagement;
import zw.db.factory.abstracts.Department;
import zw.db.factory.abstracts.IDepartment;
import zw.db.factory.abstracts.IUser;
import zw.db.factory.abstracts.User;
import zw.pursuit.proxy.Gril;
import zw.pursuit.proxy.Proxy;
import zw.resume.prototype.Resume;
import zw.sales.strategy.CashContext;
import zw.work.state.Work;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("***********�򵥹���ģʽ***********");
		//���ü򵥹���ģʽ��Ƶ�������������
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(2);
		operation.setNumberB(1);
		double result = operation.getResult();
		
		
		System.out.println("***********����ģʽ***********");
		//����ģʽ���������������
		//�ӷ�
		IFactory addFactory = new AddFactory();
		zw.calculator.factory.Operation operationAdd = addFactory.createOperation();
		operationAdd.setNumberA(4);
		operationAdd.setNumberB(3);
		double addResult = operationAdd.getResult();
		//����
		IFactory subFactory = new SubFactory();
		zw.calculator.factory.Operation operationSub = subFactory.createOperation();
		operationSub.setNumberA(4);
		operationSub.setNumberB(3);
		double subResult = operationSub.getResult();	
		
		
		System.out.println("***********���󹤳�ģʽ***********");
		//���󹤳�ģʽģ��������ݿ����
		User user = new User();
		Department department = new Department();
		IUser iUser = DataManagement.createUser();
		iUser.insertUser(user);
		iUser.getUser(1);
			
		IDepartment iDepartment = DataManagement.createDepartment();
		iDepartment.insertDept(department);
		iDepartment.getDept(1);
		
		
		System.out.println("***********����ģʽ***********");
		//ʹ�ò���ģʽ�͹���ģʽ��Ƴ��������Ż�ϵͳ
		CashContext cashContext = new CashContext("����");
		double totalMoney = cashContext.getResult(550);
		
		
		System.out.println("***********װ��ģʽ***********");
		//ʹ��װ��ģʽģ�����ﴩ�Ŵ��
		Person person = new Person("zw");
		Suit suit = new Suit();
		Tie tie = new Tie();
		LeatherShoes leatherShoes = new LeatherShoes();
		leatherShoes.decrate(person);
		tie.decrate(leatherShoes);
		suit.decrate(tie);
		suit.show();
		System.out.println();
		
		
		System.out.println("***********����ģʽ***********");
		//ʹ�ô���ģʽģ��׷Ů��
		Gril gril = new Gril("XX");
		Proxy proxy = new Proxy(gril);
		proxy.giveFlowers();
		proxy.giveChocolate();
		
		
		System.out.println("***********ԭ��ģʽ***********");
		//ԭ��ģʽ��Ƽ���
		Resume resume1 = new Resume("zw");
		resume1.setPersonInformation("��", "23");
		resume1.setWork("2017-04", "�嶫");
		resume1.show();
		Resume resume2 = (Resume)resume1.clone();
		resume2.setWork("2017-09", "ѧУ");
		resume2.show();
		
		System.out.println("***********ԭ��ģʽ***********");
		//״̬ģʽģʽ����״̬
		Work work = new Work();
		work.setTime(10);
		work.writeProgram();
		work.setTime(15);
		work.writeProgram();
		work.setTime(20);
		//work.setFinished(true);
		work.writeProgram();
		work.setTime(23);
		work.writeProgram();
	}

}
