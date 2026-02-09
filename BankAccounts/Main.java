package BankAccounts;

public class Main {
    public static void main(String[] args) {
        SimpleAccount simple = new SimpleAccount(1000);
        System.out.println("Обычный счет: " + simple.getBalance());

        CreditAccount credit = new CreditAccount(0, 5000);
        System.out.println("Кредитный счет: " + credit.getBalance());

        boolean success = credit.pay(2000);
        System.out.println("Оплата 2000 с кредитного: " + success);
        System.out.println("Баланс кредитного: " + credit.getBalance());

        success = simple.transfer(credit, 500);
        System.out.println("Перевод 500: " + success);
        System.out.println("Обычный счет: " + simple.getBalance());
        System.out.println("Кредитный счет: " + credit.getBalance());
    }
}