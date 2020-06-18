package Day16one;

import java.util.Comparator;

public class AccountSortByBalance implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		if(o1.getBalance()==o2.getBalance())
			return 0;
			else if(o1.getBalance()>o2.getBalance())
				return 1;
			else 
				return -1;
	}

}
