package zw.db.factory.abstracts;

public class SQLServerDepartment implements IDepartment {

	@Override
	public void insertDept(Department department) {
		// TODO Auto-generated method stub
		System.out.println("在SQLServer数据库中给Department表中增加一条记录");
	}

	@Override
	public Department getDept(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQLServer数据库中根据ID得到Department表中的一条记录");
		return null;
	}
	
}
