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

    private DeductionCalculator deductionCalculator;
    private VATCalculator vatCalculator;

    public void totalCalc() {
        billDeduction = deductionCalculator.calcDeduction(
                billAmount,
                deductionPercentage
        );

        float VATAmount = vatCalculator.calcVAT(billAmount);

        billTotal = (billAmount - billDeduction) + VATAmount;
    }
}