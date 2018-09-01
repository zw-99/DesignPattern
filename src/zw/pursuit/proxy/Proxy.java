package zw.pursuit.proxy;

//代理类，对外代替真实类执行行为
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
