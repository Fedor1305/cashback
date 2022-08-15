public class Main {
    public static void main(String[] args) {  // Объявляете переменные для входных данных и
        int balance = 200;   // параметров программы: начального счёта,
        int accrual = 2000;   // суммы пополнения и тп
        if (accrual > 1000) {      // Условным оператором проверяете превысила ли
                                    // сумма пополнения порог и для этих двух разных
            int bonus = accrual / 100 * 101; // сценариев рассчитываете сумму бонуса и выводите
            System.out.println("Ваш баланс: " + (balance + bonus) ); // на экран.

            System.out.println("Количество бонусных рублей: " + (bonus -accrual) );
        } else {
            System.out.println("Ваш баланс: " + (balance + accrual) );
            System.out.println("Количество бонусных рублей: 0");
        }




    }
}