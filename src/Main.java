public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else {
            System.out.println("Установите приложение для Android по ссылке");
        }
        System.out.println("Задание 2");
        int clientOS2 = 0;
        int clientDeviceYear = 2020;

        if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для IOS по ссылке");
            } else {
                System.out.println("Установите версию для IOS по ссылке");
            }
            }  else {
             if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию для android по ссылке");
                } else {
                    System.out.println("Установите версию для android по ссылке");
                }
            }
        System.out.println("Задание 3");
        int year = 2020;
        if (year % 4 == 0 && year != 0 || year % 400 == 0){
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;

        }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        System.out.println("Задача 5");

        int monthNumber = 4;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 3:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неправильный месяц");

        }


    }
    }