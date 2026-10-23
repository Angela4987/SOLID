package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	private DedukzioaKalkulatu dedukzioaKalkulatu = new DedukzioaKalkulatu();
	private VATKalkulatu vatkalkulatu = new VATKalkulatu();
	
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billDeduction = dedukzioaKalkulatu.dkalkulatu(billAmount, deductionPercentage);
		// VAT kalkulatzen dugu
		VAT = vatkalkulatu.vkalkulatu(this);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}
