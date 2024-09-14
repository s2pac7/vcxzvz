package lab1_2;

public class WriterInfo {
    public void printManagerInfo(Manager manager) {
        System.out.println("Информация о менеджере:");
        manager.printSurname();
        manager.printAge();
        manager.printDuty();
    }
}
