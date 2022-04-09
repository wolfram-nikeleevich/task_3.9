package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Post {
    private Birthday birthday = new Birthday();
    private String name;
    private String passport;
    private String patronymic;
    private String phone;
    private String surname;
    private boolean subscription = true;
}
