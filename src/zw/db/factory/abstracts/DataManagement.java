package zw.db.factory.abstracts;

import java.lang.reflect.InvocationTargetException;

public class DataManagement {
	//工厂创建具体对象
	//可通过配置文件和反射实现数据库类型的选择。
	private static final String db = "Access"; 
	private static final String AssemblyName = "zw.db.factory.abstracts.";
	
	public static IUser createUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		IUser user = (IUser) Class.forName(AssemblyName + db + "User").getDeclaredConstructor().newInstance();
		return user;
	}
	
	public static IDepartment createDepartment() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		IDepartment department = (IDepartment) Class.forName(AssemblyName + db + "Department").getDeclaredConstructor().newInstance();
		return department;
	}
}
