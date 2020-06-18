package Day16one;

import java.util.Comparator;

public class AccountSortByPhonenumber implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		if(o1.getPhone()==o2.getPhone())
			return 1;
			
			else 
				return -1;
	}

}
