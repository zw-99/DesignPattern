package zw.work.state;

public class Work {
	private int time;
	private boolean finished = false;
	private State current;
	
	public Work() {
		// TODO Auto-generated constructor stub
		//ÉèÖÃ³õÊ¼×´Ì¬ÎªÔç³¿
		this.current = new MorningState();
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public boolean getFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public void setState(State current) {
		this.current = current;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void writeProgram() {
		current.writeProgram(this);
	}
}
