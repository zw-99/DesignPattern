package zw.work.state;

public class MorningState extends State {
	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getTime() < 12) {
			System.out.println("������" + work.getTime() + "�㣬��������");
		} else {
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

}
