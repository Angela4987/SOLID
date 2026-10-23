package dip;

public class Deduction implements DeductionCalculator{
    public float calcDeduction(float billAmount, int deductionPercentage) {
        if (billAmount > 50000)
            return (billAmount * deductionPercentage + 5) / 100;
        else
            return (billAmount * deductionPercentage) / 100;
    }
}
