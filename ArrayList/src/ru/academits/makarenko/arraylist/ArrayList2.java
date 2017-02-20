package ru.academits.makarenko.arraylist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by Игорь on 19.02.2017.
 */
public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream("C:\\Users\\Игорь\\IdeaProjects\\AcademItSchool\\ArrayList\\in.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("файла не существует");
        }
        List<String> list = new ArrayList<String>();

        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        for(String s: list){
            System.out.println(s);
        }


    }
}
