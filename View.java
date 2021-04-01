package main.java.com.minaev.crud.view;

import main.java.com.minaev.crud.controller.Controller;

import java.util.List;
import java.util.Scanner;

public class View {
    List<String> forPrint;

    public View(List<String> forPrint) {
        this.forPrint = forPrint;
    }

    public View() {
    }

    public List<String> getForPrint() {
        return forPrint;
    }

    private int consoleIntReader() {
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        return in;
    }


    private String consoleStringReader() {
        Scanner input = new Scanner(System.in);
        String category = input.next();
        return category;
    }

    public void printAll(View view) {
        view.getForPrint().stream().forEach(str -> System.out.println(str));
    }


    public void startMenu() {
        System.out.println("Выберите тип операции, введя соответсвующий номер");
        System.out.println("Для добавления записи нажмите 1");
        System.out.println("Для изменения категории в существующей записи нажмите 2");
        System.out.println("Для удаления существующей категории нажмите 3");
        System.out.println("Для получения списка категорий нажмите 4");
        System.out.println("Для выхода нажмите 5");
        choiceMenu();
    }


    private void choiceMenu() {
        int choice = 0;
        int id = 0;
        String category = null;
        Controller controller = new Controller(choice, id, category);
        choice = consoleIntReader();
        controller.setChoice(choice);
        switch (choice) {
            case 1:
                System.out.println("Введите категорию");
                controller.setCategory(consoleStringReader());
                break;
            case 2:
                System.out.println("Введите id категории");
                controller.setId(consoleIntReader());
                System.out.println("Введите новую категорию");
                controller.setCategory(consoleStringReader());
                break;
            case 3:
                System.out.println("Введите id категории, котрую вы хотите удалить");
                controller.setId(consoleIntReader());
                break;
            case 4:
                break;
            case 5:
                System.out.println("Вы успешно вышли");
                System.exit(0);
            default:
                System.out.println("Ваш выбор некорректен, повторите попытку");
                System.out.println();
                startMenu();
        }
        controller.operationFromView(controller);
        startMenu();
    }
}
