/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static hieunt.util.MathUtils.computerFactorial;
//chi method static moi import staic

/**
 *
 * @author WELCOME
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computerFactorial(5));
        
        //expected: 120 khi dua 5 vao
        System.out.println("5! = " + computerFactorial(5));
        
        //expected: 720 khi dua 6 vao
        System.out.println("6! = " + computerFactorial(6));
        
        //expected: 1 khi dua 1 vao
        System.out.println("1! = " + computerFactorial(1));
        
        //expected: 0 khi dua 1 vao
        System.out.println("0! = " + computerFactorial(0));
        
        //expected: NGOAI LE khi dua -5 vao
        System.out.println("-5! = " + computerFactorial(-5));
        
        //test phan mem:
        //chuan bi data VD 5,6,7,1,2,0
        //tinhs toan F(6) 720 Expected value
        //goi lenh, goi app goi ham chay thu voi data da chuan bi
        //coi ham tra ve bao nhieu 
        //VD khi chay F(6) ta 120 la Actuavalue
        //so sanh Expected va Actual
        // neu bang dung
        //khong bang sai
        //TEST chay thu app, so sanh ket qua
        
        //cách tét này đơn giản nhưng chưa hay vì phải nhìn kq bằng mắt và tự ss gt trả về của hàm và ky fvongj
        //không cấm disable nút claen and build
        //code sai logic vẫn ra file .jar
        //vần 1 cách để đảm bảo
        //cần dùng thêm thư viện kiểm soát chất lượng hàm
        //kỹ thuật TĐ KÈM UNIT TESTING 
        //xài thư viện JUnit, TestNG, xUnit, MSUnit, PHPUnit, CPPUnit,...
        //những thư viện này không bắt ss mắt
        //tự so sánh
        //XANH: code ổn
        //Đỏ: không ổn, sai logic
    }
    
}
