public class Main {
    public static void main(String[] args)
    {
        //Begin HomeWork3
        //Задание 1:
        byte a = 1;
        short b = 20000;
        int c = 50000;
        long d = 1000000000L;
        float e = 1.12f;
        double f = 2.123456789;
            System.out.println("Значение переменной a с типом byte равно " + a);
            System.out.println("Значение переменной b с типом short равно " + b);
            System.out.println("Значение переменной c с типом int равно " + c);
            System.out.println("Значение переменной d с типом long равно " + d);
            System.out.println("Значение переменной e с типом float равно " + e);
            System.out.println("Значение переменной f с типом double равно " + f);

        //Задание 2:
        double a1 = 27.12;
        long b1 = 987_678_965_549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 = -159;
        int f1 = 27897;
        byte g1 = 67;
        System.out.println("Значение переменной a1 равно " + a1);
        System.out.println("Значение переменной b1 равно " + b1);
        System.out.println("Значение переменной c1 равно " + c1);
        System.out.println("Значение переменной d1 равно " + d1);
        System.out.println("Значение переменной e1 равно " + e1);
        System.out.println("Значение переменной f1 равно " + f1);
        System.out.println("Значение переменной g1 равно " + g1);

        //Задание 3:
        byte studentsL = 23;
        byte studentsA = 27;
        byte studentsE = 30;
        short sheetTotal = 480;
        short sheetPerStudent = (short) (sheetTotal / (studentsL + studentsA + studentsE));
        System.out.println("На каждого ученика рассчитано " + sheetPerStudent + " листов бумаги");

        //Задание 4:
        byte bottle = 16;
        byte time = 2;
        byte efficiencyPerMin = (byte) (bottle / time);
        short efficiencyPer20 = (short) (efficiencyPerMin * 20);
        short efficiencyPerDay = (short) (efficiencyPerMin * 24 * 60);
        int efficiencyPer3Day = efficiencyPerDay * 3;
        int efficiencyPer1Month = efficiencyPer3Day * 10;
        System.out.println("За 20 минут машина произвела " + efficiencyPer20 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + efficiencyPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiencyPer3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + efficiencyPer1Month + " штук бутылок");

        //Задание 5:
        byte totalBottles = 120;
        byte whiteBottlePerClass = 2;
        byte brownBottlePerClass = 4;
        int brownWhiteBottlesPerClass = whiteBottlePerClass + brownBottlePerClass;
        int classes = totalBottles / brownWhiteBottlesPerClass;
        int totalWhiteBottles = whiteBottlePerClass * classes;
        int totalBrownBottles = brownBottlePerClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhiteBottles + " банок белой краски и " + totalBrownBottles +" банок коричневой краски");

        //Задача 6:
        byte bananas = 5;
        byte weightOneBanana = 80;
        short milkMl = 200;
        byte weightMilkPer100Ml = 105;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        byte egg = 4;
        byte weightOneEgg = 70;
        int breakfastInGram = (bananas * weightOneBanana) + (milkMl / 100 * weightMilkPer100Ml) + (iceCream * weightOneIceCream) + (egg * weightOneEgg);
        short gramInKilogram = 1000;
        float breakfastInKilogram = (float) breakfastInGram / gramInKilogram;
        System.out.println("Вес спортзавтрака в граммах = " + breakfastInGram);
        System.out.println("Вес спортзавтрака в килограммах = " + breakfastInKilogram);

        //Задача 7:
        byte aimInKg = 7;
        short planLossGrA = 250;
        short planLossGrB = 500;
        int aimInGr = aimInKg * gramInKilogram;
        int daysPlanA = aimInGr / planLossGrA;
        int daysPlanB = aimInGr / planLossGrB;
        float avPlan = (planLossGrB + planLossGrA) / 2F;
        float avDays = (float) aimInGr / avPlan;
        System.out.println("Дней до достижения цели по плану A - " + daysPlanA);
        System.out.println("Дней до достижения цели по плану B - " + daysPlanB);
        System.out.println("Дней до достижения цели по Среднему - " + avDays);

        //Задача 8:
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        byte percent = 10;
        byte monthInYear = 12;
        int raisingSalaryM = salaryM / percent;
        int raisingSalaryD = salaryD / percent;
        int raisingSalaryK = salaryK / percent;
        int newSalaryM = salaryM + raisingSalaryM;
        int newSalaryD = salaryD + raisingSalaryD;
        int newSalaryK = salaryK + raisingSalaryK;
        int oldYearSalaryM = salaryM * monthInYear;
        int oldYearSalaryD = salaryD * monthInYear;
        int oldYearSalaryK = salaryK * monthInYear;
        int newYearSalaryM = newSalaryM * monthInYear;
        int newYearSalaryD = newSalaryD * monthInYear;
        int newYearSalaryK = newSalaryK * monthInYear;
        int diffYearSalaryM = newYearSalaryM - oldYearSalaryM;
        int diffYearSalaryD = newYearSalaryD - oldYearSalaryD;
        int diffYearSalaryK = newYearSalaryK - oldYearSalaryK;
        System.out.println("Маша теперь получает " + newSalaryM + " рублей. Годовой доход вырос на " + diffYearSalaryM + " рублей");
        System.out.println("Денис теперь получает " + newSalaryD + " рублей. Годовой доход вырос на " + diffYearSalaryD + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryK + " рублей. Годовой доход вырос на " + diffYearSalaryK + " рублей");
        //End HomeWork3
    }
}