package main.java.com.minaev.crud;

import main.java.com.minaev.crud.model.Label;
import main.java.com.minaev.crud.repository.LabelRepository;
import main.java.com.minaev.crud.view.View;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;

public class AppRunner {


    public static void main(String[] args) {
        View view = new View();
        view.startMenu();
    }
}

