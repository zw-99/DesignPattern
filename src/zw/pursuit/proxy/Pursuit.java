package zw.pursuit.proxy;

//����ģʽ��ʵ��
public class Pursuit implements IGiveGift {
	private Gril gril;
	public Pursuit(Gril gril) {
		// TODO Auto-generated constructor stub
		this.gril = gril;
	}
	
	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(gril.getName() + ",�����ʻ�");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(gril.getName() + ",�����ɿ���");
	}

}
