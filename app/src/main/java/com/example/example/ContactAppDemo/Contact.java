package com.example.example.ContactAppDemo;

import androidx.annotation.NonNull;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contact implements Comparable<Contact>{
    String lLastName;
    String lFirstName;
    HashMap<String,String> mobileList = new HashMap<>();
    HashMap<String,String> emailList =  new HashMap<>();
    HashMap<String,Address> addressList = new HashMap<>();
    String organizationName;

    List<String> lMobileOptionList = new ArrayList<>();
    List<String> lEmailOptionList = new ArrayList<>();
    List<String> lAddressOptionList = new ArrayList<>();


    public String getlLastName() {
        return lLastName;
    }

    public void setlLastName(String lLastName) {
        this.lLastName = lLastName;
    }

    public String getlFirstName() {
        return lFirstName;
    }

    public void setlFirstName(String lFirstName) {
        this.lFirstName = lFirstName;
    }

    public HashMap<String, String> getMobileList() {
        return mobileList;
    }

    public void setMobileList(HashMap<String, String> mobileList) {
        this.mobileList = mobileList;
    }

    public HashMap<String, String> getEmailList() {
        return emailList;
    }

    public void setEmailList(HashMap<String, String> emailList) {
        this.emailList = emailList;
    }

    public HashMap<String, Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(HashMap<String, Address> addressList) {
        this.addressList = addressList;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public int compareTo(Contact o) {
        return this.getlFirstName().compareTo(o.getlFirstName());
    }

    @NonNull
    @Override
    public String toString() {
        return " Name "+ lFirstName;
    }



    public void gMobileOption(){
        lMobileOptionList.clear();
        lMobileOptionList.add("Personal Number");
        lMobileOptionList.add("Home Number");
        lMobileOptionList.add("Office Number");
        lMobileOptionList.add("Other Number");
    }

    public void gEmailOption(){
        lEmailOptionList.clear();
        lEmailOptionList.add("Personal Email");
        lEmailOptionList.add("Office Email");
        lEmailOptionList.add("Other Email");
    }

    public void gAddressOption(){
        lAddressOptionList.clear();
        lAddressOptionList.add("Present Address");
        lAddressOptionList.add("Permanent Address");
        lAddressOptionList.add("Other Address");
    }
}
