package dip;

import java.util.Date;

public class Bill {

    public String code;
    public Date billDate;
    public float billAmount;
    public float VAT;
    public float billDeduction;
    public float billTotal;
    public int deductionPercentage;

    private DeductionCalculator d;
    private VATCalculator v;

    public void totalCalc() {
        billDeduction = d.calcDeduction(billAmount, deductionPercentage);

        float VATAmount = v.calcVAT(billAmount);

        billTotal = (billAmount - billDeduction) + VATAmount;
    }
}