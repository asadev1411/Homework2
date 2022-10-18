public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача №2
        System.out.println("Задача №2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задача №3
        System.out.println("Задача №3");
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задача №4
        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача №5
        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача №6
        System.out.println("Задача №6");
        var weightFirstBoxer = 78.2;
        var weightSecondtBoxer = 82.7;
        var totalWeightBoxers = weightFirstBoxer + weightSecondtBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeightBoxers + " кг");
        var differenceWeightBoxers = weightFirstBoxer - weightSecondtBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeightBoxers + " кг");

        //Задача №7
        System.out.println("Задача №7");
        var differenceWeightSportsmans = weightSecondtBoxer - weightFirstBoxer;
        System.out.println("Разница весов спортсменов " + differenceWeightSportsmans + " кг");
        var differenceWeightAthletes = weightSecondtBoxer % weightFirstBoxer;
        System.out.println("Первый спортсмен тяжелее второго на " + differenceWeightAthletes + " кг!");

        //Задача №8
        System.out.println("Задача №8");
        var hoursWork = 640;
        var hoursWorker = 8;
        var amountWorkers = hoursWork / hoursWorker;
        System.out.println("Всего работников в компании –  " + amountWorkers + " человек.");

        amountWorkers = amountWorkers +94;
        var hoursWorkers = amountWorkers * hoursWorker;
        System.out.println("Если в компании работает " + amountWorkers + " человек, то всего " + hoursWorkers + " часов работы может быть поделено между сотрудниками.");

    }
}