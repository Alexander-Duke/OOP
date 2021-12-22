package com.company.Encryptor;

public class Main {
    public static void main(String[] args) {
        Users user01 = new UsersAdmins("admin1","123456");
        Encryptor Encryptor01 = new Encryptor();
        String encryptionPassword = Encryptor01.encryptionPassword(user01);

        System.out.println(encryptionPassword);
    }
}
