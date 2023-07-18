package ru.Piskovski.HW6;

public class Cat {

    private String nickname;
    private String color;
    private int age;
    private final Gender gender;

    public Cat(String nickname, String color, int age, Gender gender) {
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
        if (age > 0 && age <=25) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст указан не верно!");
        }
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", sex=" + gender +
                '}' + "\n";
    }
}

