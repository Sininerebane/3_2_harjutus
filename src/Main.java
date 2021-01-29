public class Main {
    public static void main(String[] agrs) {
        int ammount1 = 100;
        int percent = 1;
        int ammount2 = 1100;
        int ammount;
        int bonus;
        int total;
        int limit = 1001;
        int all;
        if ( ammount2 > limit) {
            bonus = 1;
            ammount = ammount1 + ammount2;
        total = ((ammount)/100) * bonus -1;
        all = ammount + total;
        System.out.println("Если сумма перевода - 1100 рублей");
        System.out.println("Бонусы:" + total);
        System.out.println("Деньги на счету:" + all);         }
        if ( ammount1 < limit) {
            bonus = 0;
            ammount = ammount1 + 100;
            total = ((ammount)/100) * bonus;
            all = ammount + total;
            System.out.println("Если сумма перевода - 100 рублей");
            System.out.println("Бонусы:" + total);
            System.out.println("Деньги на счету:" + all);
        }
    }
    }

