package com.example.example.ContactAppDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class ContactApp {

    private ArrayList<Contact> lContactList = new ArrayList<>();
    private Scanner lScan = new Scanner(in);
    private String lChoice;
    private String lCity;
    private String lState;
    private String lCountry;
    private String lPostalCode;
    private String lCustomAddress;
    private String lFirstName;
    private String lLastName;
    int lCount = lContactList.size();
    public void displayOptions() {

        System.out.println("\n------------- CHOOSE ONE OPTION -----------\n");
        System.out.println("1. Create");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Search");
        System.out.println("5. Display");
        System.out.println("6. Exit");

        int optionVal = lScan.nextInt();

        switch (optionVal) {
            case 1:
                createContact();
                break;
            case 2:
                editContactPosition();
                break;
            case 3:
                deleteContactList();
                break;
            case 4:
                searchContactList();
                break;
            case 5:
                displayContactList();
                break;
            case 6:
                System.out.println("\nExit from Contact App ");
                break;
            default:
                System.out.println("\nEnter the values between 1 to 6");
                displayOptions();
                break;
        }


    }

    public void createContact() {
        Contact contact = new Contact();
        HashMap<String, String> lMobileMap = new HashMap<>();
        System.out.print("Enter First Name : ");
        lFirstName = lScan.next();

        System.out.println("Enter Last Name : ");
        lLastName = lScan.next();


        contact.setlFirstName(lFirstName);
        contact.setlLastName(lLastName);
        //Add Mobile
        contact.gMobileOption();
        contact.gEmailOption();
        contact.gAddressOption();
        lChoice = "Y";
        while (lChoice.equalsIgnoreCase("Y")) {

            System.out.println("\n--------------- Choose Phone Number You want to add ------------------\n");
            int index = 1;

            for (String s : contact.lMobileOptionList) {
                System.out.println((index++) + " " + s);
            }

            int mobIndex = lScan.nextInt();


            if (contact.lMobileOptionList.get(mobIndex - 1).equalsIgnoreCase("Other Number")) {
                System.out.println("Enter your Custom Label");
                String lCustomLabel = lScan.next();
                System.out.println("Enter your " + lCustomLabel + " Number");
                String lCustomNumber = lScan.next();
                lMobileMap.put(lCustomLabel, lCustomNumber);

            } else {
                System.out.println("\nEnter the " + contact.lMobileOptionList.get(mobIndex - 1));
                String mobValue = lScan.next();
                lMobileMap.put(contact.lMobileOptionList.get(mobIndex - 1), mobValue);
                contact.lMobileOptionList.remove(contact.lMobileOptionList.get(mobIndex - 1));
            }

            System.out.println("\n************* Do you want Add another Number (Y / N) ? *************\n");
            lChoice = lScan.next();

        }

        contact.setMobileList(lMobileMap);

        addEmailList(contact);


    }

    private void addEmailList(Contact contact) {
        // Add Email
        HashMap<String, String> lEmailMap = new HashMap<>();
        System.out.println("\n************** Do you want Add Email (Y / N) ? **************\n");
        lChoice = lScan.next();

        while (lChoice.equalsIgnoreCase("Y")) {

            System.out.println("\n------------  Choose Email You want to add ------------\n ");
            int index = 1;

            for (String s : contact.lEmailOptionList) {
                System.out.println((index++) + " " + s);
            }

            int mobIndex = lScan.nextInt();

            if (contact.lEmailOptionList.get(mobIndex - 1).equalsIgnoreCase("Other Email")) {
                System.out.println("Enter your Custom Label");
                String lCustomLabel = lScan.next();
                System.out.println("Enter your " + lCustomLabel + " Email ID");
                String lCustomEmail = lScan.next();
                lEmailMap.put(lCustomLabel, lCustomEmail);


            } else {
                System.out.println("\nEnter the " + contact.lEmailOptionList.get(mobIndex - 1));
                String emailValue = lScan.next();
                lEmailMap.put(contact.lEmailOptionList.get(mobIndex - 1), emailValue);
                contact.lEmailOptionList.remove(mobIndex - 1);
            }

            System.out.println("\n************** Do you want Add another Email ID (Y / N) ? **************\n");
            lChoice = lScan.next();

        }

        contact.setEmailList(lEmailMap);
        addAddressList(contact);
    }


    private void addAddressList(Contact contact) {
        //Add Address
        HashMap<String, Address> lAddressMap = new HashMap<>();
        Address lAddress = new Address();
        System.out.println("\n************** Do you want to Add Address (Y / N) ? **************\n");
        lChoice = lScan.next();

        while (lChoice.equalsIgnoreCase("Y")) {

            System.out.println("\n------------------ Choose Address You want to add --------------------\n");
            int lIndex = 1;

            for (String s : contact.lAddressOptionList) {
                System.out.println((lIndex++) + " " + s);
            }
            int mobIndex = lScan.nextInt();

            if (contact.lAddressOptionList.get(mobIndex - 1).equalsIgnoreCase("Other Address")) {
                System.out.println("\nEnter the Custom Address Label");
                lCustomAddress = lScan.next();
                System.out.print("\n Enter City : ");
                lCity = lScan.next();
                lAddress.setCity(lCity);
                System.out.print("\n Enter State : ");
                lState = lScan.next();
                lAddress.setState(lState);
                System.out.print("\n Enter Country : ");
                lCountry = lScan.next();
                lAddress.setCountry(lCountry);
                System.out.print("\n Enter PostalCode : ");
                lPostalCode = lScan.next();
                lAddress.setPostalCode(lPostalCode);
                lAddressMap.put(lCustomAddress, lAddress);

            } else {
                System.out.println("\nEnter the " + contact.lAddressOptionList.get(mobIndex - 1));
                System.out.print("\n Enter City : ");
                lCity = lScan.next();
                lAddress.setCity(lCity);
                System.out.print("\n Enter State : ");
                lState = lScan.next();
                lAddress.setState(lState);
                System.out.print("\n Enter Country : ");
                lCountry = lScan.next();
                lAddress.setCountry(lCountry);
                System.out.print("\n Enter PostalCode : ");
                lPostalCode = lScan.next();
                lAddress.setPostalCode(lPostalCode);
                lAddressMap.put(contact.lAddressOptionList.get(mobIndex - 1), lAddress);
                contact.lAddressOptionList.remove(mobIndex - 1);
            }


            if (contact.lAddressOptionList.size() != 0) {
                System.out.println("\n************** Do you want Add another Address (Y / N) ? **************\n");
                lChoice = lScan.next();
            } else {
                lChoice = "N";
            }

        }

        contact.setAddressList(lAddressMap);

        System.out.println("\n**************Do you want to Add Organization Name (Y / N) ? **************\n");
        lChoice = lScan.next();
        if (lChoice.equalsIgnoreCase("Y")) {
            System.out.println("\nEnter the Organization Name");
            String lOrganizationName = lScan.next();
            contact.setOrganizationName(lOrganizationName);
        }

        lContactList.add(contact);
        displayContactList();
    }

    private void editContactPosition() {
        lCount = lContactList.size();

        if (lCount == 0) {
            System.out.println("There is no Contact List to Edit");
            displayOptions();
        } else {
            displayContact();

            System.out.print(" Enter the Contact ID you want Update : ");
            int contactPosition = lScan.nextInt();
            editContactList(contactPosition - 1);
        }

    }

    void editContactList(int pContactPosition) {

        Contact lContact = lContactList.get(pContactPosition);

        System.out.println("\n------------------ Choose option you want to Edit -------------------");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Phone Number");
        System.out.println("4. Email");
        System.out.println("5. Address");
        System.out.println("6. Organization Name");
        System.out.println("7. Save");

        int lOptionVal = lScan.nextInt();

        switch (lOptionVal) {
            case 1:
                System.out.print("\n Enter First Name : ");
                lFirstName = lScan.next();
                lContact.setlFirstName(lFirstName);
                break;
            case 2:
                System.out.print("\n Enter Last Name : ");
                lLastName = lScan.next();
                lContact.setlLastName(lLastName);
                break;
            case 3:
                editMobileList(lContact, pContactPosition);
                break;
            case 4:
                editEmailList(lContact, pContactPosition);
                break;
            case 5:
                editAddressList(lContact, pContactPosition);
                break;

            case 6:
                System.out.print("\n Enter Organization Name : ");
                String orgName = lScan.next();
                lScan.nextLine();
                lContact.setOrganizationName(orgName);
                break;
            case 7:
                System.out.print("\n Successfully Saved \n");
                displayContactList();
                break;
            default:
                System.out.println("\nEnter the values between 1 to 7");
                editContactList(pContactPosition);
                break;
        }

        editContactList(pContactPosition);

    }

    void editMobileList(Contact pContact, int pContactPosition) {
        System.out.println("\n************** Do you want to 1. Edit or 2. Add Phone **************\n");
        int lEditMob = lScan.nextInt();

        if (lEditMob == 1) {

            lChoice = "Y";
            while (lChoice.equalsIgnoreCase("Y")) {
                List<String> lOptionList = new ArrayList<>(pContact.mobileList.keySet());

                if (lOptionList.size() != 0) {
                    System.out.println("\n----------------- Choose Phone Number You want to edit -------------------\n");
                    int index = 1;

                    for (String mobileKeyList : lOptionList) {
                        System.out.println((index++) + " " + mobileKeyList);
                    }

                    int mobIndex = lScan.nextInt();

                    System.out.print("\n Enter " + lOptionList.get(mobIndex - 1) + " ");
                    String lMobNumber = lScan.next();
                    pContact.mobileList.put(lOptionList.get(mobIndex - 1), lMobNumber);
                    lContactList.set(pContactPosition, pContact);
                    lOptionList.remove(lOptionList.get(mobIndex - 1));

                    System.out.println("\n************** Do you want Edit another Number (Y / N) ? **************\n");
                    lChoice = lScan.next();
                } else {
                    System.out.println("\nThere is no Phone Number to edit\n");
                    lChoice = "N";
                }


            }
        } else if (lEditMob == 2) {

            pContact.gMobileOption();

            ArrayList<String> lMobOption = new ArrayList<>(pContact.lMobileOptionList);
            lMobOption.removeAll(pContact.getMobileList().keySet());

            lChoice = "Y";
            while (lChoice.equalsIgnoreCase("Y")) {

                System.out.println("\n------------------ Choose Phone Number You want to add ---------------------\n");
                int index = 1;

                for (String s : lMobOption) {
                    System.out.println((index++) + " " + s);
                }

                int mobIndex = lScan.nextInt();

                if (lMobOption.get(mobIndex - 1).equalsIgnoreCase("Other Number")) {
                    System.out.println("Enter your Custom Label");
                    String lCustomLabel = lScan.next();
                    System.out.println("Enter your " + lCustomLabel + " Number");
                    String lCustomNumber = lScan.next();
                    pContact.mobileList.put(lCustomLabel, lCustomNumber);
                    lContactList.set(pContactPosition, pContact);


                } else {
                    System.out.println("\nEnter the " + lMobOption.get(mobIndex - 1));
                    String mobValue = lScan.next();
                    pContact.mobileList.put(lMobOption.get(mobIndex - 1), mobValue);
                    lContactList.set(pContactPosition, pContact);
                    lMobOption.remove(lMobOption.get(mobIndex - 1));
                }

                System.out.println("\n************** Do you want Add another Number (Y / N) ? **************\n");
                lChoice = lScan.next();

            }

        }

        editContactList(pContactPosition);

    }

    void editEmailList(Contact pContact, int pContactPosition) {

        System.out.println("************** Do you want to 1. Edit or 2. Add Email ID **************\n");
        int lEditEmail = lScan.nextInt();

        if (lEditEmail == 1) {

            lChoice = "Y";
            while (lChoice.equalsIgnoreCase("Y")) {

                List<String> lOptionList = new ArrayList<>(pContact.emailList.keySet());

                if (lOptionList.size() != 0) {
                    System.out.println("\n----------------- Choose Email ID You want to edit ------------------ \n ");
                    int index = 1;

                    for (String emailKeyList : lOptionList) {
                        System.out.println((index++) + " " + emailKeyList);
                    }

                    int emailIndex = lScan.nextInt();

                    System.out.print("\n Enter " + lOptionList.get(emailIndex - 1) + " ");
                    String lEmail = lScan.next();
                    pContact.emailList.put(lOptionList.get(emailIndex - 1), lEmail);
                    lContactList.set(pContactPosition, pContact);
                    lOptionList.remove(lOptionList.get(emailIndex - 1));

                    System.out.println("\n************** Do you want Edit another Email ID (Y / N) ? **************\n");
                    lChoice = lScan.next();
                } else {
                    System.out.println("\nThere is no Email ID to edit\n");
                    lChoice = "N";
                }


            }
        } else if (lEditEmail == 2) {
            pContact.gEmailOption();
            ArrayList<String> lEmailOption = new ArrayList<>(pContact.lEmailOptionList);
            lEmailOption.removeAll(lContactList.get(pContactPosition).emailList.keySet());

            lChoice = "Y";
            while (lChoice.equalsIgnoreCase("Y")) {

                System.out.println("\n---------------- Choose Email ID You want to add ----------------\n");
                int index = 1;

                for (String s : lEmailOption) {
                    System.out.println((index++) + " " + s);
                }

                int mobIndex = lScan.nextInt();

                if (lEmailOption.get(mobIndex - 1).equalsIgnoreCase("Other Email")) {
                    System.out.println("Enter your Custom Label");
                    String lCustomLabel = lScan.next();
                    System.out.println("Enter your " + lCustomLabel + " Email ID");
                    String lCustomNumber = lScan.next();
                    pContact.emailList.put(lCustomLabel, lCustomNumber);
                    lContactList.set(pContactPosition, pContact);

                } else {
                    System.out.println("\nEnter the " + lEmailOption.get(mobIndex - 1));
                    String mobValue = lScan.next();
                    pContact.emailList.put(lEmailOption.get(mobIndex - 1), mobValue);
                    lContactList.set(pContactPosition, pContact);
                    lEmailOption.remove(lEmailOption.get(mobIndex - 1));
                }

                System.out.println("\n************** Do you want Add another Email ID (Y / N) ? **************\n");
                lChoice = lScan.next();

            }

        }

        editContactList(pContactPosition);
    }

    void editAddressList(Contact pContact, int pContactPosition) {

        Address lAddressObj;

        System.out.println("\n************** Do you want to 1. Edit or 2. Add Address **************\n");
        int lEditAddress = lScan.nextInt();

        if (lEditAddress == 1) {

            lChoice = "Y";
            while (lChoice.equalsIgnoreCase("Y")) {

                List<String> lOptionList = new ArrayList<>(pContact.addressList.keySet());

                if (lOptionList.size() != 0) {
                    System.out.println("\n-------------- Choose Address You want to edit -----------------\n ");
                    int index = 1;

                    for (String addressKeyList : lOptionList) {
                        System.out.println((index++) + " " + addressKeyList);
                    }

                    int addressIndex = lScan.nextInt();

                    System.out.print("\n Enter City : ");
                    lCity = lScan.next();
                    System.out.print("\n Enter State : ");
                    lState = lScan.next();
                    System.out.print("\n Enter Country : ");
                    lCountry = lScan.next();
                    System.out.print("\n Enter PostalCode : ");
                    lPostalCode = lScan.next();
                    lAddressObj = new Address(lCity, lState, lCountry, lPostalCode);
                    pContact.addressList.put(lOptionList.get(addressIndex - 1), lAddressObj);
                    lContactList.set(pContactPosition, pContact);

                    System.out.println("\n************** Do you want Edit another Address(Y / N) ? **************\n");
                    lChoice = lScan.next();
                } else {
                    System.out.println("\nThere is no Address to edit\n");
                    lChoice = "N";
                }


            }
        } else if (lEditAddress == 2) {
            pContact.gAddressOption();
            ArrayList<String> lAddressOption = new ArrayList<>(pContact.lAddressOptionList);
            lAddressOption.removeAll(pContact.getAddressList().keySet());

            lChoice = "Y";
            while (lChoice.equalsIgnoreCase("Y")) {

                System.out.println("\n--------------- Choose Address You want to add -----------------\n");
                int index = 1;

                for (String s : lAddressOption) {
                    System.out.println((index++) + " " + s);
                }

                int mobIndex = lScan.nextInt();

                if (pContact.lAddressOptionList.get(mobIndex - 1).equalsIgnoreCase("Other Address")) {
                    System.out.println("\nEnter the Custom Address Label");
                    lCustomAddress = lScan.next();
                    System.out.print("\n Enter City : ");
                    lCity = lScan.next();
                    System.out.print("\n Enter State : ");
                    lState = lScan.next();
                    System.out.print("\n Enter Country : ");
                    lCountry = lScan.next();
                    System.out.print("\n Enter PostalCode : ");
                    lPostalCode = lScan.next();
                    lAddressObj = new Address(lCity, lState, lCountry, lPostalCode);
                    pContact.addressList.put(lCustomAddress, lAddressObj);
                    lContactList.set(pContactPosition, pContact);


                } else {
                    System.out.println("\nEnter the " + pContact.lAddressOptionList.get(mobIndex - 1));
                    System.out.print("\n Enter City : ");
                    lCity = lScan.next();
                    System.out.print("\n Enter State : ");
                    lState = lScan.next();
                    System.out.print("\n Enter Country : ");
                    lCountry = lScan.next();
                    System.out.print("\n Enter PostalCode : ");
                    lPostalCode = lScan.next();
                    lAddressObj = new Address(lCity, lState, lCountry, lPostalCode);
                    pContact.addressList.put(lAddressOption.get(mobIndex - 1), lAddressObj);
                    lContactList.set(pContactPosition, pContact);
                    pContact.lAddressOptionList.remove(mobIndex - 1);
                }

                System.out.println("\n************** Do you want Add another Address (Y / N) ? **************\n");
                lChoice = lScan.next();

            }

        }

        editContactList(pContactPosition);

    }

    public void deleteContactList() {
        lCount = lContactList.size();

        if (lCount == 0) {
            System.out.println("There is no Contact List to Delete");
            displayOptions();
        } else {
//            System.out.println("\nYou have " + lCount + " Contact Lists");
            displayContact();
            System.out.print("\nEnter the Contact Position you want Delete : ");
            int contactPosition = lScan.nextInt();
            lContactList.remove(contactPosition - 1);
            System.out.print("\n ************** Successfully Deleted ************** \n");
            displayOptions();

        }
    }

    void displayContactList() {
        lCount = lContactList.size();
        int lContactID = 1;
        if (lCount == 0) {
            System.out.println("There is no Contact List to Display");
            displayOptions();
        } else {

            Collections.sort(lContactList);
            for (Contact contact : lContactList) {
                System.out.println("\nContact ID : " + lContactID++);
                System.out.println("Name : " + contact.lFirstName + " " + contact.lLastName);

                for (Map.Entry mobileEntry : contact.mobileList.entrySet()) {
                    System.out.println(mobileEntry.getKey() + " : " + mobileEntry.getValue());
                }

                for (Map.Entry emailEntry : contact.emailList.entrySet()) {
                    System.out.println(emailEntry.getKey() + " : " + emailEntry.getValue());
                }

                for (Map.Entry addressEntry : contact.addressList.entrySet()) {
                    String key = (String) addressEntry.getKey();
                    Address value = (Address) addressEntry.getValue();
                    System.out.println(key + " : " + value.city + ", " + value.state + ", " + value.country + ", " + value.postalCode);
                }

                if (contact.organizationName != null) {
                    System.out.println("Organization Name : " + contact.organizationName);
                }
            }
            System.out.println("---------------------------------------------------------");
            displayOptions();
        }
    }

    private void displayContact() {
        lCount = lContactList.size();
        int lContactID = 1;
        if (lCount == 0) {
            System.out.println("There is no Contact List to Display");
            displayOptions();
        } else {

            Collections.sort(lContactList);
            for (Contact contact : lContactList) {
                System.out.println("\nContact ID : " + lContactID++);
                System.out.println("Name : " + contact.lFirstName + " " + contact.lLastName);

                for (Map.Entry mobileEntry : contact.mobileList.entrySet()) {
                    System.out.println(mobileEntry.getKey() + " : " + mobileEntry.getValue());
                }

                for (Map.Entry emailEntry : contact.emailList.entrySet()) {
                    System.out.println(emailEntry.getKey() + " : " + emailEntry.getValue());
                }

                for (Map.Entry addressEntry : contact.addressList.entrySet()) {
                    String key = (String) addressEntry.getKey();
                    Address value = (Address) addressEntry.getValue();
                    System.out.println(key + " : " + value.city + ", " + value.state + ", " + value.country + ", " + value.postalCode);
                }

                if (contact.organizationName != null) {
                    System.out.println("Organization Name : " + contact.organizationName);
                }
            }
        }
    }

    private void searchContactList() {

        lCount = lContactList.size();
        if (lCount == 0) {
            System.out.println("There is no Contact List for Search");
            displayOptions();
        } else {

            System.out.println("\n ---------- You have " + lCount + " Contact Lists -------------- \n");
            displayContact();
            System.out.println("Enter Name or Phone Number You want to Search");
            String search = lScan.next();
            String mobSearch;
            for (Contact lContact : lContactList) {
                mobSearch = String.valueOf(lContact.getMobileList().values());
                if (lContact.lFirstName.contains(search) || lContact.lLastName.contains(search) || mobSearch.contains(search)) {

                    System.out.println("Name :" + lContact.lFirstName + " " + lContact.lLastName);
                    for (Map.Entry mob : lContact.mobileList.entrySet()) {
                        System.out.println(mob.getKey() + " : " + mob.getValue());
                    }
                    for (Map.Entry email : lContact.emailList.entrySet()) {
                        System.out.println(email.getKey() + " : " + email.getValue());
                    }

                    for (Map.Entry addressEntry : lContact.addressList.entrySet()) {
                        String key = (String) addressEntry.getKey();
                        Address value = (Address) addressEntry.getValue();
                        System.out.println(key + " : " + value.city + ", " + value.state + ", " + value.country + ", " + value.postalCode);
                    }

                    if (lContact.organizationName != null) {
                        System.out.println("Organization Name : " + lContact.organizationName);
                    }

                }
                System.out.println();
            }

            displayOptions();

        }
    }

}
