public class Main {
    public static void main(String[] args) {

        // Задача 1
    int cat = 7;
    System.out.println ("Значение переменной cat с типом int равно " + cat);
    byte dog = 94;
    System.out.println("Значение переменной dog с типом byte равно " + dog);
    short ant = 1536;
    System.out.println("Значение переменной ant с типом short равно " + ant);
    long butterfly = 44897L;
    System.out.println("Значение переменной butterfly с типом long равно " + butterfly);
    float sugar = 45.5f;
    System.out.println("Значение переменной sugar с типом float равно " + sugar);
    double flour = 4.6;
    System.out.println("Значение переменной flour с типом double равно " + flour);

    // Задача 2
    float a = 27.12f;
    System.out.println (a);
    long b = 987_678_965_549L;
    System.out.println (b);
    double c = 2.786;
    System.out.println (c);
    int d = 569;
    System.out.println (d);
    short e = -159;
    System.out.println (e);
    int f = 27897;
    System.out.println (f);
    byte g = 67;
    System.out.println (g);

    // Задача 3
    short ludmilaPavlovna = 23;
    short annaSergeevna = 27;
    short ekaterinaAndreevna = 30;
    int paperLists = 480;
    float paperListsForOnePerson = (float) paperLists / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
    System.out.println ("На каждого ученика рассчитано " + paperListsForOnePerson + " листов бумаги");

    // Задача 4
    int bottle = 16;
    int time = 2;
    int performance = bottle / time * 20;
    System.out.println ("За 20 минут машина произвела " + performance + " штук бутылок");
    performance = bottle / time * 24 * 60;
    System.out.println ("За сутки машина произвела " + performance + " штук бутылок");
    performance = performance * 3;
    System.out.println ("За 3 дня машина произвела " + performance + " штук бутылок");
    performance = performance * 10;
    System.out.println ("За месяц машина произвела " + performance + " штук бутылок");

    // Задача 5
    int jar = 120;
    int whiteColor = 2;
    int brownColor = 4;
    int classes = jar / (whiteColor + brownColor);
    whiteColor = whiteColor * classes;
    brownColor = brownColor * classes;
    System.out.println("В школе, где " + classes + " классов, нужно " + whiteColor + " банок белой краски и " + brownColor + " банок коричневой краски");

    // Задача 6
    int banana = 5;
    int weightBanana = 80;
    int milk = 200;
    int weightMilk = 105;
    int iceCream = 2;
    int weightIceCream = 100;
    int eggs = 4;
    int weightEgg = 70;
    weightBanana = weightBanana * banana;
    weightMilk = weightMilk * milk / 100;
    weightIceCream = weightIceCream * iceCream;
    weightEgg = weightEgg * eggs;
    double breakfast = weightBanana + weightMilk + weightIceCream + weightEgg;
    System.out.println("Вес спортзавтрака составил " + breakfast + " грамм");
    breakfast = breakfast / 1000;
    System.out.println ("или " + breakfast + " кг");

    // Задача 7
    int minusWeight = 7;
    int minusDayWeight = 250;
    int days = minusWeight * 1000 / minusDayWeight;
    System.out.println("Если спортсмен будет худеть по 250 грамм в день, он похудеет за " + days + " дней");
    minusDayWeight = 500;
    days = minusWeight * 1000 / minusDayWeight;
    System.out.println("Если спортсмен будет худеть по 500 грамм в день, он похудеет за " + days + " дней");
    minusDayWeight = (250 + 500) / 2;
    days = minusWeight * 1000 / minusDayWeight;
    System.out.println("В среднем спортсмен похудеет за " + days + " дней");

    // Задача 8
    int mariaSalary = 67760;
    int denisSalary = 83690;
    int kristinaSalary = 76230;
    int mariaIncome1 = mariaSalary * 12;
    int denisIncome1 = denisSalary * 12;
    int kristinaIncome1 = kristinaSalary * 12;
    int mariaSalary2 = (int) (mariaSalary * 1.1f);
    int denisSalary2 = (int) (denisSalary * 1.1f);
    int kristinaSalary2 = (int) (kristinaSalary * 1.1f);
    int mariaIncome2 = mariaSalary2 * 12;
    int denisIncome2 = denisSalary2 * 12;
    int kristinaIncome2 = kristinaSalary2 * 12;
    int mariaDifference = mariaIncome2 - mariaIncome1;
    int denisDifference = denisIncome2 - denisIncome1;
    int kristinaDifference = kristinaIncome2 - kristinaIncome1;
    System.out.println("Маша теперь получает " + mariaSalary + " рублей. Годовой доход вырос на " + mariaDifference + " рублей");
    System.out.println("Денис теперь получает " + denisSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
    System.out.println("Кристина теперь получает " + kristinaSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");


    }
}