public class Task3 {

    public static int countDayDelivery(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 100) {
            if (deliveryDistance <= 20) {
                deliveryTime = deliveryTime + 1;
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryTime = deliveryTime + 2;
            } else if (deliveryDistance > 60) {
                deliveryTime = deliveryTime + 3;
            }
        }
        return deliveryTime;
    }

    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryTime = countDayDelivery(deliveryDistance);

        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }

    }
}

