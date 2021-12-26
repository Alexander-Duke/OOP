package com.company.Encryptor;

public class Decrypt {

    public String decryptionPassword(String encryptionPassword) {
        int[] arrayPasswordInAscii = encryptionPasswordToArray(encryptionPassword);
        return processingDecrypt(arrayPasswordInAscii);
    }

    private String processingDecrypt(int[] array) {
        String depas = "";
        char[] array2 = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = (char) (array[i] - i);
        }
        for (int i = 0; i < array2.length; i++) {
            if (i == 0) {
                depas = "" + array2[i];
            } else depas = depas + array2[i];
        }
        return depas;
    }

    private int[] encryptionPasswordToArray(String encryptionPassword) {
        String[] arrayPassword = stringPasswordToArray(encryptionPassword);
        int[] intArrayPassword = new int[arrayPassword.length];
        for (int i = 0; i < arrayPassword.length; i++) {
            intArrayPassword[i] = Integer.parseInt(arrayPassword[i]);
        }
        return intArrayPassword;
    }

    private String[] stringPasswordToArray(String encryptionPassword) {
        int beginIndex = 0;
        int endIndex = 4;
        int arraySize = encryptionPassword.length() / 3;
        String[] arrayPassword = new String[arraySize];

        for (int i = 0; i < arrayPassword.length; i++) {
            beginIndex = i * 3;
            endIndex = 3 + i * 3;
            arrayPassword[i] = encryptionPassword.substring(beginIndex, endIndex);
        }
        return arrayPassword;
    }
}
