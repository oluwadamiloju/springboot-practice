package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Component
public class RandomFileFortuneService implements FortuneService{
    private static Scanner scanner;
    private static int lines = 0;
    private static List<String> fortuneList = new ArrayList<>();

    @PostConstruct
    public static void openFortuneFile() {
        Path path = Paths.get("fortunes.txt");

        try {
            lines = (int) Files.lines(path).count();
            scanner = new Scanner(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Initialization successful!");
    }

    public static void readFortunesIntoList() {
        try {
            while (scanner.hasNext()) {
                for (int i = 0; i < lines; i++) {
                    fortuneList.add(scanner.nextLine());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getDailyFortune() {
        openFortuneFile();
        readFortunesIntoList();

        Random rnd = new Random();
        int index = rnd.nextInt(fortuneList.size());
        return fortuneList.get(index);
    }
}
