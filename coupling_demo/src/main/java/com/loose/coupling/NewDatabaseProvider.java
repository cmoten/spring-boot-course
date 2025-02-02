package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "Details from the new database";
    }

}
