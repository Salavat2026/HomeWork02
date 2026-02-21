public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача №1");
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);
        System.out.println("Задача №2");
        System.out.println("Увеличим значение каждой переменной на 4");
        dog=dog+4;
        System.out.println("dog="+dog);
        cat=cat+4;
        System.out.println("cat="+cat);
        paper=paper+4;
        System.out.println("paper="+paper);
        System.out.println("Задача №3");
        System.out.println("Уменьшить значение каждой переменной");
        System.out.println ("dog уменьшить на 3,5" );
        dog=dog-3.5;
        System.out.println ("dog="+dog);
        System.out.println ("cat уменьшить на 1.6");
        cat=cat-1.6;
        System.out.println ("cat="+cat);
        System.out.println ("paper уменьшить на 7639");
        paper=paper-7639;
        System.out.println ("paper="+paper);
        System.out.println ("Зaдача №4");//Выводим надпись в консоль
        var friend=19;//Инициализируем переменную значением 19
        System.out.println("friend="+friend);//Выводим значение 1 переменной в консоль
        System.out.println("Увеличиваем значение переменной на 2");//Выводим надпись в консоль
        friend=friend+2;//Увеличиваем значение переменной на 2
        System.out.println("friend="+friend);//Выводим значение 2 переменной в консоль
        System.out.println("Делим на 7 ");//Выводим надпись в консоль
        friend=friend/7;//Делим на 7
        System.out.println("friend="+friend);//Выводим значение 3 переменной в консоль
        System.out.println("Зaдача №5");//Выводим надпись в консоль
        var frog=3.5;//Инициализируем переменную значением 3,5
        System.out.println("frog="+frog);//Выводим значение 1 переменной в консоль
        System.out.println("Увеличиваем переменную в 10 раз и получаем");//Выводим надпись в консоль
        frog=frog*10;//Увеличиваем переменную в 10 раз
        System.out.println("frog="+frog);//Выводим значение 2 переменной в консоль
        System.out.println("Делим на 3,5");//Выводим надпись в консоль
        frog=frog/3.5; //Делим на 3,5
        System.out.println("frog="+frog);//Выводим значение 3 переменной в консоль
        System.out.println("Добавляем к последнему значению переменной 4");
        frog=frog+4; //Добавляем 4;
        System.out.println("frog="+frog);// Выводим значение 3 переменной в консоль
        System.out.println("Задача №6");
        var weightFirstBoxer=78.2;
        var weightSecondBoxer=82.7;
        var totalMass=weightFirstBoxer+weightSecondBoxer;
        var differenceMass=weightSecondBoxer - weightFirstBoxer;
        System.out.println("Общий вес двух бойцов ="+totalMass+"кг");
        System.out.println("Разница между массами бойцов = "+ differenceMass);
        System.out.println("Задача №7");
        var remainder = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Остаток от деления = "+ remainder);
        System.out.println("Задача №8");
        var  totalHours1=640;
        var workingHours=8;
        var worker = totalHours1/workingHours;
        System.out.println("Всего работников в компании - "+worker+ " человек.");
        var worker2 = worker+94;
        var totalHours2 = worker2*workingHours;
        System.out.println("Если в компании работает " + worker2 + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");





    }
}