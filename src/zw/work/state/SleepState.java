package zw.work.state;

public class SleepState extends State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		System.out.println("现在是" + work.getTime() + "点，实在太困睡着了");
	}

}
