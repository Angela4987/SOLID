package dip;

public class VAT implements VATCalculator{
	 private static final double VAT_RATE = 0.18;

	    public float calcVAT(float billAmount) {
	        return (float) (billAmount * VAT_RATE);
	    }
}
