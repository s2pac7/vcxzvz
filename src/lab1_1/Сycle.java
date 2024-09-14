//Реализовать цикл с двадцатью итерациями. С помощью
//операторов ветвления распечатать в столбик четные числа, начиная со
//второго десятка.

package lab1_1;

public class Сycle {
    public static void main(String[] args) {

        int count = 0;

        for(int i = 0; i < 10; i++) {
            count++;

            if(i % 2 == 0 && i > 10){
                System.out.println(i);
            }
        }
        System.out.println("Количество итераций: " + count);
    }
}