package com.company.PrintAndCats;

public class Main {
    public static void main(String[] args) {
        Cats redCats = new Cats();
        redCats.nameCats = "cat 1";

        Cats blackCats = new Cats();
        blackCats.nameCats = "cat 2";

        Print firstPrint = new Print();
        firstPrint.text = redCats.nameCats;
        firstPrint.printText();

        firstPrint.text = blackCats.nameCats;
        firstPrint.printText();
    }
}
