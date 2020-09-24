public class TaxReport {
    private TaxCalculator calculator;
    private double tax;

    public double getTax() {
        return tax;
    }

    public void showTax(TaxCalculator calculator) {
        System.out.println(calculator.caculateTax());
//        return tax;
    }
}
