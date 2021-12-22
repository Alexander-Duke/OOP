package com.company.Encryptor;

public class UsersAdmins extends Users{
    boolean permissions = true;

    public UsersAdmins(String userName, String password) {
        super(userName, password);
    }
}
