import java.util.Scanner;

public class Main {
    private static int minIncome = 200000; //Минимальный  доход
    private static int maxIncome = 900000; //Максимальный доход

    private static int officeRentCharge = 140000; //Стоимость аренды
    private static int telephonyCharge = 12000; //Плата за телефон
    private static int internetAccessCharge = 7200; //Плата за интернет

    private static int assistantSalary = 45000; //Зарплата менеджера
    private static int financeManagerSalary = 90000; //Зарплата другого менеджера

    private static double mainTaxPercent = 0.24; //Основной налог
    private static double managerPercent = 0.15; //Частный налог

    private static double minInvestmentsAmount = 100000; //Минимальная инфест. сумма

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): "); //Запрос на ввод
            int income = (new Scanner(System.in)).nextInt(); //Значение из командной строки

            if (!checkIncomeRange(income)) { //Продолжаем расчет, если сумма входит в диапозон
                continue;
            }

            double managerSalary = income * managerPercent; //Расчет зарплаты менеджера
            double pureIncome = income - managerSalary -
                calculateFixedCharges(); //Расчет чистого дохода
            double taxAmount = mainTaxPercent * pureIncome; //Расчет суммы налога
            double pureIncomeAfterTax = pureIncome - taxAmount; //Расчет прибыли

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount; //True, если прибыль >= мин.инвест сумме

            System.out.println("Зарплата менеджера: " + managerSalary); //Вывод зарплаты менеджера
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0)); //Вывод суммы налогов, если есть чистый доход
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет")); //Вывод возможности инвестирования
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!"); //Вывод, если чистая прибыль меньше 0
            }
        }
    }

    private static boolean checkIncomeRange(int income) { //Проверка суммы доходов компании за месяц
        if (income < minIncome) { //Проверка мин.значения
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if (income > maxIncome) { //Проверка макс.знач.
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges() { //Расчет расходов
        return officeRentCharge +
            telephonyCharge +
            internetAccessCharge +
            assistantSalary +
            financeManagerSalary;
    }
}
