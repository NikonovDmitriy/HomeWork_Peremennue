public class Main {
    public static void main(String[] args) {

        //Задание 1
       int a = 1;
       byte b = 2;
       short c = 3;
       double d = 1.2;
       float e = 2.3f;
       boolean f = a<b;
       long g = 523L;
       char h = 38;

        //Задание 2
        double weight1 = 78.2;
        double weight2 = 82.7;
        System.out.println("Общий вес двух бойцов "+(weight1+weight2)+" кг");
        System.out.println("Разница между весами боцов "+(weight2-weight1)+" кг");

        //Задание 3
        double WeightBananos = 5*80;
        double WeightMilk = 2*105;
        double WeightIcecream = 2*100;
        double WeightEggs = 4*70;
        double WeightAllProducts = (WeightBananos+WeightMilk+WeightIcecream+WeightEggs)/1000;
        System.out.println("Вес спорт-завтрака спортсмена равен "+WeightAllProducts+" кг");

        //Задание 4
        int AlLWeight = 7*1000;
        int AllWeight1 = AlLWeight/250;
        int AlLWeight2 = 7*1000;
        int AllWeight3 = AlLWeight2/500;
        int SredneeArifm = (AllWeight1+AllWeight3)/2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдет "+AllWeight1+" дней");
        System.out.println("Если спортсмен будет терять каждый день по 2500 грамм, то уйдет "+AllWeight3+" дней");
        System.out.println("В среднем спортсмену потребуется "+SredneeArifm+" дней, чтобы добиться результата похудения");

        //Задание 5
        int Masha = 67760+(67760*10/100);
        int Denis = 83690+(83690*10/100);
        int Kristina = 76230+(76230*10/100);
        int MashaGod = Masha*12;
        int DenisGod = Denis*12;
        int KristinaGod = Kristina*12;
        System.out.println("Маша теперь получает "+Masha+" рублей. Годовой доход вырос на "+MashaGod+" рублей.");
        System.out.println("Денис теперь получает "+Denis+" рублей. Годовой доход вырос на "+DenisGod+" рублей.");
        System.out.println("Кристина теперь получает "+Kristina+" рублей. Годовой доход вырос на "+KristinaGod+" рублей.");







    }
}