package zw.db.factory.abstracts;

public class AccessUser implements IUser {

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("��Access���ݿ��и� User��������һ����¼");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access���ݿ��и���ID�õ�User���е�һ����¼");
		return null;
	}

}
