/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hieunt.util;

/**
 *
 * @author WELCOME
 */
//class nay la tien ich ho tro cac phep tinh toan
//day la tien ich y dung chung cho moij noi do do se la ham static
public class MathUtils {

    public static long computerFactorial(int n) {
        //khong chap nhan giai thua am va n>15 vi qua lon
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("n must be >=0 and <= 15");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
