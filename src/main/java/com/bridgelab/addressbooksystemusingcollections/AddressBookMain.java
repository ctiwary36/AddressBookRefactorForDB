package com.bridgelab.addressbooksystemusingcollections;

import java.util.Scanner;

public class AddressBookMain
{
    Scanner scanner;

    public AddressBookMain()
    {
        scanner = new Scanner(System.in);
    }

    public void chooseOption()
    {
        AddressBookService addressBookService = new AddressBookService();
        boolean isExit = false;
        while (!isExit)
        {
            System.out.print("""
                    Enter Number As Per Your Choice:
                    1.Add-New Contacts:
                    2.Display-All Records:
                    3.Edit Contact:
                    4.Delete Contact:
                    5.Search Person In city Or State:
                    6.Get Number Of Contacts In City Or State:
                    7.Sort And Display Contact:
                    8.Sort By Zip-Code:
                    9.Read Data From File:
                    10.Write To CSVFile:
                    11.Read From CSVFile:
                    12.Write TO JSONFile:
                    13.Read From JSONFile:
                    14.Exit:
                    """);
            int userInput = scanner.nextInt();
            switch (userInput)
            {
                case 1:
                    //add new contact.
                    addressBookService.addNewContact();
                    //write data to file.
                    addressBookService.writeToFile();
                    break;
                case 2:
                    //display all contact.
                    addressBookService.displayContacts();
                    break;
                case 3:
                    //edit existing contact.
                    addressBookService.editFullContact();
                    break;
                case 4:
                    //delete existing contact.
                    addressBookService.deleteContact();
                    break;
                case 5:
                    //search person by city or state.
                    addressBookService.searchPersonInACityOrState();
                    break;
                case 6:
                    //get number contact in a city or state.
                    addressBookService.getNumberOfContacts();
                    break;
                case 7:
                    //sorting contact using first name.
                    addressBookService.sortContactByFirstName();
                    break;
                case 8:
                    //sorting contact using zipcode.
                    addressBookService.sortByZipCode();
                    break;
                case 9:
                    //read data from file.
                    addressBookService.readDataFromFile();
                    break;
                case 10:
                    //write to csv file.
                    addressBookService.writeToCsv();
                    break;
                case 11:
                    //read from csv file.
                    addressBookService.readFromCsvFile();
                    break;
                case 12:
                    //write to gson.
                    addressBookService.writeToJson();
                    break;
                case 13:
                    //read from gson.
                    addressBookService.readFromJson();
                    break;
                case 14:
                    //Exit from program.
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }

    public static void main(String[] args)
    {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.chooseOption();
    }
}
