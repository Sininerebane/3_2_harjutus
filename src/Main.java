public class Main {
    public static void main(String[] agrs) {
        int ammount = 1100;
        int initial = 100;
        int limit = 1001;
        int  allAmmout;
        int bonus;
        int total;
        int all;
        if ( ammount < limit) {
            bonus = 0;
            allAmmout = ammount + initial;
            total = (( allAmmout)/100) * bonus;
            all =  allAmmout + total;
            System.out.println("Если сумма перевода - 100 рублей");
            System.out.println("Бонусы:" + total);
            System.out.println("Деньги на счету:" + all);
        } else {
            bonus =1;
            allAmmout = ammount + initial;
            total = ((allAmmout)/100) * bonus -1;
            all = allAmmout + total;
            System.out.println("Если сумма перевода - 1100 рублей");
            System.out.println("Бонусы:" + total);
            System.out.println("Деньги на счету:" + all);
        }
    }
}


