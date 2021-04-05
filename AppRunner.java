package main.java.com.minaev.crud;

import main.java.com.minaev.crud.model.Label;
import main.java.com.minaev.crud.repository.LabelRepository;
import main.java.com.minaev.crud.view.LabelView;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AppRunner {


    public static void main(String[] args) {
       LabelView labelView = new LabelView();
       labelView.choiceMenu();



    }
}

