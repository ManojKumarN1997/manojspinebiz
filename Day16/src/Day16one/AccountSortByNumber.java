package Day16one;

import java.util.Comparator;

public class AccountSortByNumber implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		if(o1.getNumber()==o2.getNumber())
			return 1;
			
			else 
				return -1;
	}

}