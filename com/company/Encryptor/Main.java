package com.company.Encryptor;

public class Main {
    public static void main(String[] args) {
        Users user01 = new UsersAdmins("admin1","HelloWorld");
        Encryptor encryptor01 = new Encryptor();
        String encryptionPassword = encryptor01.encryptionPassword(user01);
        System.out.println("encryptionPassword " +encryptionPassword);
        Decrypt decrypt01 = new Decrypt();
        String s = decrypt01.decryptionPassword(encryptionPassword);
        System.out.println("decryptionPassword " + s);
    }
}
