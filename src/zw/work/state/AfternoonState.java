package zw.work.state;

public class AfternoonState extends State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getTime() > 12 && work.getTime() < 18 ) {
			System.out.println("������" + work.getTime() + "�㣬�е���");
		} else {
			work.setState(new EveningState());
			work.writeProgram();
		}
	}

}
