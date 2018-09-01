package zw.pursuit.proxy;

//代理模式真实类
public class Pursuit implements IGiveGift {
	private Gril gril;
	public Pursuit(Gril gril) {
		// TODO Auto-generated constructor stub
		this.gril = gril;
	}
	
	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(gril.getName() + ",送你鲜花");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(gril.getName() + ",送你巧克力");
	}

}
