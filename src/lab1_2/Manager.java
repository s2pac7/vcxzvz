//Задания.
//        А) Создать объект класса согласно заданию. Инициализацию значений
//полей осуществить с помощью конструктора. В классе предусмотреть 2-3
//метода, осуществляющие вывод на экран монитора соответствующую
//информацию о классе.
//        Б) Задание А модифицировать: предусмотреть перегруженные
//конструкторы. Создать второй класс WriterInfo, выводящий на экран
//монитора соответствующую информацию о классе (используя уже
//созданные методы класса).
//11. Состав класса Manager (управляющий): фамилия, возраст,
//справляется ли с обязанностями.

package lab1_2;

public class Manager {
    private String surname;
    private int age;
    private boolean duty; //Справляется ли с обязанностями

    public Manager() {
        this.surname = "Неизвестно";
        this.age = 18;
        this.duty = false;
    }

    public Manager(String surname,
                   int age,
                   boolean duty) {
        this.surname = surname;
        this.age = age;
        this.duty = duty;
    }

    //Перегруженный с 1 параметром
    public Manager(String surname) {
        this.surname = surname;
        this.age = 18;
        this.duty = false;
    }

    //Перегруженный с 2 параметрами
    public Manager(String surname,
                   int age) {
        this.surname = surname;
        this.age = age;
        this.duty = false;
    }

    public void printSurname() {
        System.out.println("Фамилия: " + surname);
    }

    public void printAge() {
        System.out.println("Возраст: " + age);
    }

    public void printDuty() {
        String str = duty ? "Да" : "Нет";
        System.out.println("Спрвляется ли с обязанностями: " + str);
    }

    public static void main(String[] args) {
        WriterInfo wr = new WriterInfo();

        System.out.println();

        Manager ivan = new Manager("Ступень", 20, true);
        System.out.println("Иван:");
        wr.printManagerInfo(ivan);

        System.out.println();

        Manager alex = new Manager("Козич");
        System.out.println("Алекс:");
        wr.printManagerInfo(alex);

    }

}
