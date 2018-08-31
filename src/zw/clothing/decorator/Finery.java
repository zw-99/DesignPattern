package zw.clothing.decorator;

//Finery作为Decorate，只有ConcreteComponent类，没有抽象的Component类，Decorate可直接继承于ConcreteComponent
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
