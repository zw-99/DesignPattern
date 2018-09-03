package zw.resume.prototype;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	
	public Resume(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	private Resume(WorkExperience work) throws CloneNotSupportedException {
		// TODO Auto-generated constructor stub
		this.work = (WorkExperience) work.clone();
	}


	public void setPersonInformation(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}


	public void setWork(String workDate, String workExperience) {
		work.setWorkDate(workDate);
		work.setCompany(workExperience);
	}

	public void show() {
		System.out.println(name + " " + sex + " " + age);
		System.out.println("工作经历:" + work.getWorkDate() + " " + work.getCompany());
	}
	
	public Object clone() throws CloneNotSupportedException {
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.age = this.age;
		obj.sex = this.sex;
		return obj;
	}
}
