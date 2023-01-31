package org.example;

public class Friend extends Contact{

    String phoneNumber;

    public Friend(String phoneNumber) {
        this.name = getName();
        this.phoneNumber = phoneNumber;
    }

    public Friend(){}

    @Override
    public String toString() {
        return "Friend{" +
                ", name='" + name + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
