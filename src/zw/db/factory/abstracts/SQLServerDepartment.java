package zw.db.factory.abstracts;

public class SQLServerDepartment implements IDepartment {

	@Override
	public void insertDept(Department department) {
		// TODO Auto-generated method stub
		System.out.println("��SQLServer���ݿ��и�Department��������һ����¼");
	}

	@Override
	public Department getDept(int id) {
		// TODO Auto-generated method stub
		System.out.println("��SQLServer���ݿ��и���ID�õ�Department���е�һ����¼");
		return null;
	}
	
}
