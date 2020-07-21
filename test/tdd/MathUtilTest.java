/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static hieunt.util.MathUtils.computerFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WELCOME
 */
public class MathUtilTest {

    // mỗi @ Test là 1 hàm main riêng biệt  --> shift F6 chạy
    //bỏ --> phế hàm thành hmaf bt
    //do thư viện junit bày ra thêm xanh đỏ
    @Test
    public void testSuccessfulCases() {
        //test tình huống thành công tức đưa đầu vào tử tế cho hàm cF()
//        assertEquals(5, 5);
        assertEquals(1, computerFactorial(0));
        assertEquals(1, computerFactorial(1));
        assertEquals(2, computerFactorial(2));
        assertEquals(6, computerFactorial(3));
        assertEquals(24, computerFactorial(4));
        assertEquals(120, computerFactorial(5));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFailCases() {
        //test tình huống cà chớn tức đưa đầu vào VD cF(-5) cF(20) --> to quá
        //Ngoại lệ là 1 thứ không thể ss
        //exeption là tình huống không dự liệu đc, do đó không có value
        //do đó không thể so sánh đc
        //do đó không thể sài assertEqual do hàm này so sánh theo value đưa ra màu sắc
        //sài chiêu khác khi chơi với ngoại lệ
        //kì vọng khi (cF(-5)) ném ra ngoại lệ thông báo tham số cà chớn
        computerFactorial(-5);
        
    }

}

//dù code bạn sai logic nhaung vẫn ra đc file .jar khi Clean & Build --> nguy hiểm 
//ta chơi trò disable Clean & Build nếu code còn đỏ
//junit làm đc
//truyền thống sout, JOptionPane, log thì thua
//hãy nhớ: 8.2 --> 1005, 10 trở lên: 1204

