package zw.work.state;

public class SleepState extends State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		System.out.println("������" + work.getTime() + "�㣬ʵ��̫��˯����");
	}

}
