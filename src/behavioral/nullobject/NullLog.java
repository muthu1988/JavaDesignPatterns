package behavioral.nullobject;

public class NullLog implements Log {

	private int val = 0;

	@Override
	public int getRecordLimit() {
		// TODO Auto-generated method stub
		return val + 1;
	}

	@Override
	public int getRecordCount() {
		// TODO Auto-generated method stub
		return val++;
	}

	@Override
	public void logInfo(String message) {
		// TODO Auto-generated method stub
	}
}