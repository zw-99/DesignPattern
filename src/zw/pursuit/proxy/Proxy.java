package zw.pursuit.proxy;

//�����࣬���������ʵ��ִ����Ϊ
public class Proxy implements IGiveGift {
	private Pursuit pursuit;
	public Proxy(Gril gril) {
		// TODO Auto-generated constructor stub
		pursuit = new Pursuit(gril);
	}
	
	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		pursuit.giveChocolate();
	}
	
}
