package zw.adapter;

//ͨ����װAdaptee�ཫԭ�ӿ�תΪĿ��ӿ�
public class Adapter implements Target {
	private Adaptee adaptee = new Adaptee();
	public void request() {
		adaptee.specificRequest();
	}
}
