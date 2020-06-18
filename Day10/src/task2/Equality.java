package task2;

public class Equality {
	String name;
	String type;
	String number;
	 Float balance;
	 Equality (){
			number = "321456746908";
			name = "Manoj";
			type = "saving";
			balance = (float) 1750.0;
	 }
	 Equality(String number,String name,String type,float balance){
			this.number = number;
			this.name = name;
			this.type = type;
			this.balance =balance;
	 }
	 
	@Override
	 public String toString() {
			String data = "Number is : "+number+
					"\nName is : "+name+
					"\nType is : "+type+
					"\nbalance is "+balance;
			return data;
		}
	@Override
	public boolean equals(Object obj) {
	Equality other = (Equality)obj;//Type cast
		if(this.number == other.number)
			return true;
		else
			return false;
	}
		
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equality check1 = new Equality("321456746908","Manoj","current",(float) 1750.00);
		Equality check2 = new Equality("456421479086","Kumar","savings",(float)1750.00);
		System.out.println(check1);
		System.out.println(check2);
		if(check1.equals(check2))
			System.out.println("Both have same details");
		else
			System.out.println("Both have different data");
	}

}