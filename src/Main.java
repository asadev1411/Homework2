public class Main {
    public static void main(String[] args) {

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightFirstBoxer = 78.2;
        var weightSecondtBoxer = 82.7;
        var totalWeightBoxers = weightFirstBoxer + weightSecondtBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeightBoxers + " кг");
        var differenceWeightBoxers = weightFirstBoxer - weightSecondtBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeightBoxers + " кг");

        var differenceWeightSportsmans = weightSecondtBoxer - weightFirstBoxer;
        System.out.println("Разница весов спортсменов " + differenceWeightSportsmans + " кг");
        var differenceWeightAthletes = weightSecondtBoxer % weightFirstBoxer;
        System.out.println("Первый спортсмен тяжелее второго на " + differenceWeightAthletes + " кг!");

        var hoursWork = 640;
        var hoursWorker = 8;
        var amountWorkers = hoursWork / hoursWorker;
        System.out.println("Всего работников в компании –  " + amountWorkers + " человек.");

        amountWorkers = amountWorkers +94;
        var hoursWorkers = amountWorkers * hoursWorker;
        System.out.println("Если в компании работает " + amountWorkers + " человек, то всего " + hoursWorkers + " часов работы может быть поделено между сотрудниками.");

    }
}