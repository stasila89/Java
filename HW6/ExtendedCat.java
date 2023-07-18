package ru.Piskovski.HW6;

import java.util.Objects;

public class ExtendedCat {
    private String nickname;
    private String color;
    private int age;
    private final Gender gender;

    public ExtendedCat(String nickname, String color, int age, Gender gender) {

        this.nickname = nickname;
        this.color = color;
        setAge(age);
        this.gender = gender;
}
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <=23) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст указан неверно!");
        }
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) {
            result = true;
        } else if (o == null || getClass() != o.getClass()) {
            result = false;
        } else {
            ExtendedCat that = (ExtendedCat) o;
            result = age == that.age && Objects.equals(nickname, that.nickname) && color.equals(that.color) && gender == that.gender;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, color, age, gender);
    }

    @Override
    public String toString() {
        return "CatAdvanced:\n{" +
                "nickname='" + nickname + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", sex=" + gender +
                '}' + "\n";
    }
}
