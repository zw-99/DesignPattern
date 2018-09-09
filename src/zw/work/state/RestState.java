package zw.work.state;

public class RestState extends State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		System.out.println("现在是" + work.getTime() + "点，下班了，好好放松一下");
	}

}
