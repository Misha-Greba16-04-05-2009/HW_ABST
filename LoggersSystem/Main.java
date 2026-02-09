package LoggersSystem;

public class Main {
    public static void main(String[] args) {
        Logger simple = new SimpleLogger();
        simple.log("Приложение запущено");
        simple.log("Загрузка данных...");

        System.out.println();

        Logger smart = new SmartLogger();
        smart.log("Начало работы");
        smart.log("Обнаружена ошибка: файл не найден");
        smart.log("Попытка восстановления");
        smart.log("Еще одна ошибка в системе");
        smart.log("Работа завершена");
    }
}