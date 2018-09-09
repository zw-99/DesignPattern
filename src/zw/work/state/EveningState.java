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
				System.out.println("������" + work.getTime() + "�㣬���ڼӰ࣬ƣ����");
			} else {
				work.setState(new SleepState());
				work.writeProgram();
			}
		}
	}
	
}
