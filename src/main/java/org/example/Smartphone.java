package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {

    String model;
    String brand;
    List<Contact> contactList = new ArrayList<>();



    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }


    @Override
    public String getPosition() {
        String position = "Koeln";
        return position;
    }

    public void addContact(Contact nContact){

        contactList.add(nContact);

    }

    public Contact getContactByName(String name){

        for(int i=0;i>=contactList.size();i++){

            String listContactName = contactList.get(i).getName();

            if(name.equals(listContactName)){
                return contactList.get(i);
            }
        }

        return null;
    }

    public void removeContactByName(String name){

        for(int i=0;i>=contactList.size();i++) {

            String listContactName = contactList.get(i).getName();

            if (name.equals(listContactName)) {
                contactList.remove(i);
            }
        }

    }

    public Contact getContact(int index){

        return contactList.get(index);

    }


    public Smartphone(String model, String brand, List<Contact> contactList) {
        this.model = model;
        this.brand = brand;
        this.contactList = contactList;
    }

    public Smartphone(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}
