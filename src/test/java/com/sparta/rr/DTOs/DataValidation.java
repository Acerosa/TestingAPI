package com.sparta.rr.DTOs;

public class DataValidation {


    public boolean checkForString(String string){
        return !string.isEmpty() && string.matches("[a-zA-Z ]+");
    }


    public boolean checkUrl(String url){
        return !url.isEmpty() && url.matches("[\"\\\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]/]+");
    }

    public boolean checkID(int id){
        return true;
    }
}
