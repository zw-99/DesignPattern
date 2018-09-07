package zw.db.factory.abstracts;

public class AccessUser implements IUser {

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("在Access数据库中给 User表中增加一条记录");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access数据库中根据ID得到User表中的一条记录");
		return null;
	}

}
