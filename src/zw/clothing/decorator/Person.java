package zw.clothing.decorator;

//Person��Ϊװ��ģʽ�е�ConcreteComponent��
public class Person {
	private String name;
	
	public Person() {}
	public Person(String name) {
		this.name=name;
	}
	public void show() {
		System.out.print("װ���" + name);
	}
}
