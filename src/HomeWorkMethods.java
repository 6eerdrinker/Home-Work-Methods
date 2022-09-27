public class HomeWorkMethods {
    public static void main(String[] args) {
        checkLeapYear(2020);
        getDeviceLink(1,2016);
        int deliveryDays = calculateDeliveryDays(50);
        System.out.println("Потребуется дней - " + deliveryDays);}

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " это високосный год.");
        } else {
            System.out.println(year + " это не високосный год");
        }}

    public static void getDeviceLink(int osType, int deviceYear) {
        String osString = osType == 0 ? "iOS" : "Android";
        String versionString = deviceYear > 2015 ? "полную" : "облегченную";
        System.out.println("Установите " + versionString + " версию для " + osString + " по ссылке");

    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {return (int) Math.round((double) deliveryDistance / 40) + 1;}

    }

}
