package zw.clothing.decorator;

//Person作为装饰模式中的ConcreteComponent类
public class Person {
	private String name;
	
	public Person() {}
	public Person(String name) {
		this.name=name;
	}
	public void show() {
		System.out.print("装扮的" + name);
	}
}
