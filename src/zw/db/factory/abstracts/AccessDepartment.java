package zw.db.factory.abstracts;

public class AccessDepartment implements IDepartment {

	@Override
	public void insertDept(Department department) {
		// TODO Auto-generated method stub
		System.out.println("��Access���ݿ��и� Department��������һ����¼");
	}

	@Override
	public Department getDept(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access���ݿ��и���ID�õ�Department���е�һ����¼");
		return null;
	}
	
}
