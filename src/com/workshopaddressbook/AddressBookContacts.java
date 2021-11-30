package com.workshopaddressbook;
import java.util.*;

public class AddressBookContacts {


    Scanner sc = new Scanner(System.in);

    public void callAddressBookBluePrint() {

        //Enter the Book name before detailed Entries
        System.out.println("Enter Address Book Name");
        String BookName = sc.next();

        //Enter the detailed Entries
        System.out.println("Enter you first name");
        String FirstName = sc.next();
        System.out.println("Enter you last name");
        String LastName = sc.next();
        sc.nextLine();
        System.out.println("Enter you Address name");
        String Address = sc.nextLine();
        System.out.println("Enter you zip ");
        int Zip = sc.nextInt();
        System.out.println("Enter you city name");
        String City = sc.next();
        System.out.println("Enter you state name");
        String State = sc.next();
        sc.nextLine();
        System.out.println("Enter you phone number");
        long PhoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter you email name");
        String Email = sc.nextLine();

        //Checking name of the person to avoid duplicate Entries
       
            System.out.println("AddressBookList{" + "firstName='" + FirstName + '\'' + ", lastName='" + LastName + '\'' + ", address='" + Address + '\'' + ", city='" + City + '\'' + ", state='" + State + '\'' + ", eMail='" + Email + '\'' + ", zip=" + Zip + ", mobileNum=" + PhoneNumber + '}');
       

    }


    }

