package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Комментарий: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 1, "created");
        error1.printInfo();
        Error error2 = new Error(true, 2, "under investigation");
        error2.printInfo();
        Error error3 = new Error(false, 3, "solved");
        error3.printInfo();
    }
}
