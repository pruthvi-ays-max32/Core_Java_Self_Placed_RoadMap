/*
  Problem Statement : Use the concept of polymorphism for creating new contact which may include email, name and phnumber as parameters.
*/

import java.util.*;

// for phoneNumber type because email and phonenumber both have String datatype so it giving compile error while using compile time polymorphism.
class PhoneNumber {
    private int countryCode;
    private String phNum;
    
    PhoneNumber(int countryCode, String phNum){
        this.countryCode = countryCode;
        this.phNum = phNum;
    }
    
    PhoneNumber(String phNum) {
        if (phNum.length() > 10) {
            this.countryCode = Integer.parseInt(phNum.substring(0,phNum.length()-10));
            this.phNum = phNum.substring(phNum.length()-10);
        } else {
            this.countryCode = 1;
            this.phNum = phNum;
        }
    }
    
    public String toString(){
        return countryCode + phNum;
    }
}

class Contact {
    private String name;
    private PhoneNumber phNum ;
    private String email;
    
    Contact(String name, PhoneNumber phNum){
        this.name = name;
        this.phNum = phNum;
        System.out.println("Phone Number is added with name.");
    }
    
     Contact(String name, String email){
        this.email = email;
        this.name = name;
        System.out.println("Email is added with name.");
    }
    
    Contact(String name, PhoneNumber phNum, String email){
        this.name = name;
        this.phNum = phNum;
        this.email = email;
        System.out.println("Phone Number is added with name and email.");
    }
    
    public String toString(){
        return "Name : " + name + " | Phone Number : " + phNum + " | Email : " + email ;
    }
}

class Main {
    public static void main(String[] args) {
        Contact ph1 = new Contact("Kunal" , new PhoneNumber("7219062252"));
        System.out.println(ph1);
        
        Contact ph2 = new Contact("Arbaj" , new PhoneNumber("118788956843"), "arbaj@12gmail.com");
        System.out.println(ph2);
        
        Contact ph3 = new Contact("Arbaj", "arbaj@12gmail.com");
        System.out.println(ph3);

    }
}
