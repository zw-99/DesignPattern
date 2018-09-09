package zw.work.state;

public class MorningState extends State {
	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getTime() < 12) {
			System.out.println("现在是" + work.getTime() + "点，精力充沛");
		} else {
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

}
