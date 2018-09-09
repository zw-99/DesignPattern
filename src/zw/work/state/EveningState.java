package zw.work.state;

public class EveningState extends State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getFinished()) {
			work.setState(new RestState());
			work.writeProgram();
		} else {
			if(work.getTime() < 21) {
				System.out.println("现在是" + work.getTime() + "点，还在加班，疲倦中");
			} else {
				work.setState(new SleepState());
				work.writeProgram();
			}
		}
	}
	
}
