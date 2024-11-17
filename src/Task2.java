import java.time.LocalDate;

public class Task2 {


    public static void checkVersionAPP(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < LocalDate.now().getYear()) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }

    }

    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2016;
        checkVersionAPP(clientOS, clientDeviceYear);

    }
}
