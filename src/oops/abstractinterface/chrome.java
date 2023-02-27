package oops.abstractinterface;

public class chrome implements Browser {

	@Override
	public void open() {
		System.out.println("open chrome Browser");
		
	}

	@Override
	public void close() {
		System.out.println("close chrome Browser");
		
	}

}
