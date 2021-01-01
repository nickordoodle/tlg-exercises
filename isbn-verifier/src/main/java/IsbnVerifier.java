package main.java;

public class IsbnVerifier {

    public boolean isValid(String stringToVerify) {
//        (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9 * 2 + x10 * 1) mod 11 == 0
        String stringToVerifyNoDashes = stringToVerify.replace("-", "" );
        if(stringToVerifyNoDashes.length() != 10)
            return false;
        
        for(int i = 0; i < 9; i ++){
            if(!Character.isDigit(stringToVerifyNoDashes.charAt(i)))
                return false;
        }
        char lastDigit;
        if(stringToVerifyNoDashes.charAt(9) == 'X')
            lastDigit = 10;
        else if(!Character.isDigit(stringToVerifyNoDashes.charAt(9)))
            return false;
        else
            lastDigit = stringToVerifyNoDashes.charAt(9);

        int result = ((stringToVerifyNoDashes.charAt(0) * 10) +
                (stringToVerifyNoDashes.charAt(1) * 9) +
                (stringToVerifyNoDashes.charAt(2) * 8) +
                (stringToVerifyNoDashes.charAt(3) * 7) +
                (stringToVerifyNoDashes.charAt(4) * 6) +
                (stringToVerifyNoDashes.charAt(5) * 5) +
                (stringToVerifyNoDashes.charAt(6) * 4) +
                (stringToVerifyNoDashes.charAt(7) * 3) +
                (stringToVerifyNoDashes.charAt(8) * 2) +
                (lastDigit * 1));

        return result % 11 == 0;
    }

}
