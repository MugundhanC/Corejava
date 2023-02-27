package abstractresult;

import oops.abstractclass.Browser;
import oops.abstractclass.Chrome;
import oops.abstractclass.Firefox;

public class Testabstractresult {

	public static void main(String[] args) {
		
		Browser b=new Chrome();
		b.open();
		b.close();
		Browser f=new Firefox();
		f.open();
		f.close();

	}

}
