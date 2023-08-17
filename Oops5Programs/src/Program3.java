//3. final and constructor: Design an application where we need to have more than one
//constructor in a class. The final value of productkey should activate the antivirus
//for all clients who purchased the antivirus and those who not purchased they should 
//get the message saying "You are using free version, please upgrade"
////Remember: Transaction class should be there to process the transaction. Once the
//transaction done, then and then productkey should be approved. Else msg should be 
//displayed saying-"Transaction is not done - please pay first to activate product key"

public class Program3 {

	public static void main(String[] args) {
		Transaction t1 = new Transaction();
		t1.makeTransaction(100);
		AntiVirus a1 = new AntiVirus();
		a1.activate(t1);
		

	}

}

class AntiVirus{
	final int productKey;
	private boolean isActivated;
	
	public AntiVirus() {
		this.productKey = 0;
		this.isActivated = false;
	}
	
	public AntiVirus(int productKey) {
		this.productKey = productKey;
		this.isActivated = false;
	}
	
	public void activate(Transaction trans) {
		if(trans.isTransSuccess()) {
			isActivated = true;
			System.out.println("Product key activated");
		}
		else {
			System.out.println("Transaction not done yet");

		}
	}
	
	
}

class Transaction{
	static int productKey;
	private boolean transSuccess;
	
	public boolean isTransSuccess() {
		return transSuccess;
	}
	
	public Transaction() {
		this.transSuccess = false;
	}
	
	public void makeTransaction(int amount) {
		if(amount == 100) {
			this.transSuccess = true;
			productKey++;
			System.out.println("Transaction success");
		}
		else {
			System.out.println("Transaction failed");
		}
	}
}
