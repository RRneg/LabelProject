package main.java.com.minaev.crud.controller;

import main.java.com.minaev.crud.model.Label;
import main.java.com.minaev.crud.repository.LabelRepository;
import main.java.com.minaev.crud.view.View;

import java.util.List;

public class Controller {
    int choice;
    int id;
    String category;

    public Controller(int choice, int id, String category) {
        this.choice = choice;
        this.id = id;
        this.category = category;
    }

    public Controller(int choice, String category) {
        this.choice = choice;
        this.category = category;
    }

    public Controller(int choice, int id) {
        this.choice = choice;
        this.id = id;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void operationFromView(Controller controller) {
        switch (controller.getChoice()) {
            case 1:
                newLabel(controller.getCategory());
                break;
            case 2:
                updateLabel(controller.getId(), controller.getCategory());
                break;
            case 3:
                deleteLabel(controller.getId());
                break;
            case 4:
                getAll();
                break;


        }
    }

    private void newLabel(String category) {
        LabelRepository labelRepository = new LabelRepository();
        labelRepository.saveLabel(new Label(labelRepository.getNewId(), category));
    }


    private void updateLabel(int id, String label) {
        LabelRepository labelRepository = new LabelRepository();
        labelRepository.update(new Label(id, label));
    }


    private void deleteLabel(int id) {
        LabelRepository labelRepository = new LabelRepository();
        labelRepository.deleteById(id);
    }


    private void getAll() {
        LabelRepository labelRepository = new LabelRepository();
        View view = new View(labelRepository.getAll());
        view.printAll(view);
    }

}
