public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator2019 = new TaxCalculator2019(100_000);
        TaxReport report2019 = new TaxReport();

        report2019.showTax(calculator2019);
//        System.out.println(report2019.getTax());
    }
}
