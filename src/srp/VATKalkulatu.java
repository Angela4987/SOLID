package srp;

public class VATKalkulatu {
	 private static final double VAT_RATE = 0.18;

	    public float vkalkulatu(Bill bill) {
	    	if ("0".equals(bill.code))
	            return 0;
	        return (float) (bill.billAmount * VAT_RATE);
	    }
}



