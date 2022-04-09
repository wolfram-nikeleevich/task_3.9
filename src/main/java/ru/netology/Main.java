package ru.netology;

public class Main {
    public static void main(String[] args) {
        Birthday birthday = new Birthday(13, 6, 1999);
        Post post = new Post(birthday, "Иван", "4444 № 444444", "Иванович",
                "+7 (999)-999-99-99", "Иванов", true);
    }
}
