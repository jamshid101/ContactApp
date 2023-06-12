package org.example.frontend;

import java.util.Scanner;

public interface ScannerUtil {

    static String getInputAsString(String title) {

        System.out.println(title);
        return new Scanner(System.in).nextLine();

    }

}
