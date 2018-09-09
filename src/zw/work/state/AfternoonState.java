package zw.work.state;

public class AfternoonState extends State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getTime() > 12 && work.getTime() < 18 ) {
			System.out.println("现在是" + work.getTime() + "点，有点困");
		} else {
			work.setState(new EveningState());
			work.writeProgram();
		}
	}

}
