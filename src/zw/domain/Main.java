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
		System.out.println("***********简单工厂模式***********");
		//利用简单工厂模式设计的面向对象计算器
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(2);
		operation.setNumberB(1);
		double result = operation.getResult();
		
		
		System.out.println("***********工厂模式***********");
		//工厂模式设计面向对象计算器
		//加法
		IFactory addFactory = new AddFactory();
		zw.calculator.factory.Operation operationAdd = addFactory.createOperation();
		operationAdd.setNumberA(4);
		operationAdd.setNumberB(3);
		double addResult = operationAdd.getResult();
		//减法
		IFactory subFactory = new SubFactory();
		zw.calculator.factory.Operation operationSub = subFactory.createOperation();
		operationSub.setNumberA(4);
		operationSub.setNumberB(3);
		double subResult = operationSub.getResult();	
		
		
		System.out.println("***********抽象工厂模式***********");
		//抽象工厂模式模拟多种数据库操作
		User user = new User();
		Department department = new Department();
		IUser iUser = DataManagement.createUser();
		iUser.insertUser(user);
		iUser.getUser(1);
			
		IDepartment iDepartment = DataManagement.createDepartment();
		iDepartment.insertDept(department);
		iDepartment.getDept(1);
		
		
		System.out.println("***********策略模式***********");
		//使用策略模式和工厂模式设计超市收银优惠系统
		CashContext cashContext = new CashContext("正常");
		double totalMoney = cashContext.getResult(550);
		
		
		System.out.println("***********装饰模式***********");
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
		
		
		System.out.println("***********代理模式***********");
		//使用代理模式模拟追女孩
		Gril gril = new Gril("XX");
		Proxy proxy = new Proxy(gril);
		proxy.giveFlowers();
		proxy.giveChocolate();
		
		
		System.out.println("***********原型模式***********");
		//原型模式设计简历
		Resume resume1 = new Resume("zw");
		resume1.setPersonInformation("男", "23");
		resume1.setWork("2017-04", "渝东");
		resume1.show();
		Resume resume2 = (Resume)resume1.clone();
		resume2.setWork("2017-09", "学校");
		resume2.show();
		
		System.out.println("***********原型模式***********");
		//状态模式模式工作状态
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
