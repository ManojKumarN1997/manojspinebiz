package Day16one;

import java.util.Comparator;

public class AccountSortByAge implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
			return 0;
			else if(o1.getAge()>o2.getAge())
				return 1;
			else 
				return -1;
	}

	
	}