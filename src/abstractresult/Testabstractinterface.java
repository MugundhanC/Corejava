package abstractresult;

import oops.abstractinterface.Browser;
import oops.abstractinterface.Firefox;
import oops.abstractinterface.chrome;

public class Testabstractinterface {

	public static void main(String[] args) {
		
		Browser b=new chrome();
		b.open();
		b.close();
		Browser f=new Firefox();
		f.open();
		f.close();

	}

}
