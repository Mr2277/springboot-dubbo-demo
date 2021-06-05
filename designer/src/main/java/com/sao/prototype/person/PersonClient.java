package com.sao.prototype.person;


public class PersonClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        AbstractPerson person = new Person();
        AbstractPerson clonePerson = person.clone();
        System.out.println(clonePerson == person);
    }
}
