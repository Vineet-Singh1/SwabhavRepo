package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {

	}

	@Override
	public void stopWork() {

	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot can't eat");

	}

	@Override
	public void stopEat() {

	}

}
