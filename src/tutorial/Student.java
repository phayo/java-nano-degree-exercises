package tutorial;


public class Student {
    private Loan loan;

    private Laptop laptop;
    private String stack;
    private String firstName;
    private String lastName;
    private int flat;
    private byte age;
    private int squad;
    private char gender;

    public Student(String stack, String firstName, String lastName, int flat, int age, int squad, char gender) {
        this.stack = stack;
        this.firstName = firstName;
        this.lastName = lastName;
        this.flat = flat;
        this.age = (byte) age;
        this.squad = squad;
        this.gender = gender;
        this.laptop = new Laptop("SSD", "HP");
        this.loan = new Loan(3000000);
    }

    public Student() {
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public byte getAge() {
        return age;
    }

    public int getSquad() {
        return squad;
    }

    public char getGender() {
        return gender;
    }

    public String getLaptopDiskType(){
        return this.laptop.getHdd();
    }

    public String getLaptopModel(){
        return this.laptop.getModel();
    }
    public boolean getLaptopHealth(){
        return this.laptop.isFaulty();
    }

    public long getLoanAmountRemaining(){
        return this.loan.getAmount();
    }

    public boolean repayLoan(long amount){
        return this.loan.payLoanInstallment(amount);
    }

}
