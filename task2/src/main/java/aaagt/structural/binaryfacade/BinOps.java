package aaagt.structural.binaryfacade;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

public class BinOps {
    public String sum(String a, String b) {
        int aInt = parseInt(a, 2);
        int bInt = parseInt(b, 2);
        int sum = aInt + bInt;
        return toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int aInt = parseInt(a, 2);
        int bInt = parseInt(b, 2);
        int sum = aInt * bInt;
        return toBinaryString(sum);
    }
}
