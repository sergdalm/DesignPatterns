package main.java.com.sergdalm.patterns.creational_pattern.prototype;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Robot {
    private String name;
    private int id;
    private static int idCount;
    private LocalDateTime creationTime;

    public Robot(String name) {
        this.name = name;
        id = idCount++;
        creationTime = LocalDateTime.now();
    }

    private Robot(String name, int id, LocalDateTime creationTime) {
        this.name = name;
        this.id = id;
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return "Robot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", creation time=" + creationTime.format(formatter) +
                '}';
    }

    public Robot clone() {
        return new Robot(this.name, this.id, this.creationTime);
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}
