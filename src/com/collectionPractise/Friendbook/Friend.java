package com.collectionPractise.Friendbook;

import java.util.Objects;

public class Friend {

    String name;
    int phone;
    String email;

    public Friend(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend friend)) return false;
        return getPhone() == friend.getPhone() && Objects.equals(getName(), friend.getName()) && Objects.equals(getEmail(), friend.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhone(), getEmail());
    }
}
