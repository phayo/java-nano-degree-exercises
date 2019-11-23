package tutorial;

public class Main {
    public static void main(String[] args) {
        Student lewis = new Student("Java", "Lewis", "Ugwu", 3, 28, 3, 'M');
        System.out.println(lewis.getLaptopModel());
        System.out.println(lewis.repayLoan(450000L));
        System.out.println(lewis.getLoanAmountRemaining());
        System.out.println(lewis.repayLoan(0));
        System.out.println(lewis.repayLoan(567889939453245L));
        System.out.println(lewis.getLoanAmountRemaining());
        System.out.println(lewis.repayLoan(230000L));
    }
}
