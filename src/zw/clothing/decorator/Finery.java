package zw.clothing.decorator;

//Finery��ΪDecorate��ֻ��ConcreteComponent�࣬û�г����Component�࣬Decorate��ֱ�Ӽ̳���ConcreteComponent
public class Finery extends Person {
	protected Person component;
	public void decrate(Person component) {
		this.component = component;
	}
	
	public void show() {
		if (component != null) {
			component.show();
		}
	}
}
