package Day16two;

public class BalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7257052348361479785L;
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Balance is not Enough";
	}

}

