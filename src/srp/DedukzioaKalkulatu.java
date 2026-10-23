package srp;

public class DedukzioaKalkulatu {
    public float dkalkulatu(float billAmount, int deductionPercentage) {
        if (billAmount > 50000)
            return (billAmount * deductionPercentage + 5) / 100;
        else
            return (billAmount * deductionPercentage) / 100;
    }
}

