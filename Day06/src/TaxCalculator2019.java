public class TaxCalculator2019 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2019(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double caculateTax() {
        return taxableIncome * 0.3;//ty le cua nam 2019
    }
}
