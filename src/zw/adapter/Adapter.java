package zw.adapter;

//通过包装Adaptee类将原接口转为目标接口
public class Adapter implements Target {
	private Adaptee adaptee = new Adaptee();
	public void request() {
		adaptee.specificRequest();
	}
}
