package oops.abstractinterface;

public class Firefox implements Browser{

	@Override
	public void open() {
		System.out.println("open Firefox Browser");
	}

	@Override
	public void close() {
		System.out.println("close Firefox Browser");
		
	}

}
