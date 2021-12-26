package com.company.Encryptor;

public class Encryptor {

    public String encryptionPassword(Users users) {
        String passwordOriginal = users.getPassword();
        String[] arrayPasswordInAsciiEncrypted = encryptionToArray(passwordOriginal);
        return arrayToString(arrayPasswordInAsciiEncrypted);
    }

    private String[] encryptionToArray(String passwordOriginal) {
        int sizeArray = passwordOriginal.length();
        String[] arrayPasswordInAscii = new String[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            char character = passwordOriginal.charAt(i);
            int asciiNum = character;
            int encryptedAsciiNum = asciiNum + i;
            String asciiToString = "" + encryptedAsciiNum;
            if (asciiToString.length() == 1) {
                asciiToString = "00" + asciiToString;
            } else if (asciiToString.length() == 2) {
                asciiToString = "0" + asciiToString;
            }
            arrayPasswordInAscii[i] = asciiToString;
        }
        return arrayPasswordInAscii;
    }

    private String arrayToString(String[] arrayPasswordInAsciiEncrypted) {
        String pas = "";
        for (int i = 0; i < arrayPasswordInAsciiEncrypted.length; i++) {

            if (i == 0) {
                pas = arrayPasswordInAsciiEncrypted[i];
            } else pas = pas + arrayPasswordInAsciiEncrypted[i];
        }
        return pas;
    }


}


