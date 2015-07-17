package basic;
import java.util.Scanner; 

public class ScannerTest {

	public static void main(String[] args) {
/*		Scanner cin = new Scanner(System.in);
		int a, b;
		a = cin.nextInt();
		b = cin.nextInt();
		System.out.println(a + b);*/
		
        Scanner cin = new  Scanner(System.in);  
        short a = 4;  
         a += 2;  
       //a = a + 2;      
        System.out.println(a);  
        byte b = 127;
//        b = b + 1;
//        b += 1;
//        System.out.println(b);
          b = (byte)(b+1);
          System.out.println(b);
        cin.close();  
        
/*        line10：（正确）要知道为什么line10正确，就要知道short  a = 4为什么对，因为在赋值时，计算机会判断当前赋值给a的值是否满足short，所以+=相当于一步运算，只是赋的不是=右边的值，是a本身和=右边值的和，会在底层判断其和是否满足short
        line11，（错误），如果初始时a是short的极大值，那么在+4会超short范围。
        		解决方法：a = （short）（a+4）；即可
        		同理 byte也是一样
        		+=,是扩展的赋值运算符，它其实隐含了一个强制类型转换
        		谨记一点：
        		a += 4;
        		不等于a = a + 4;
        		而是等价于 a = (a的数据类型)(a + 4);*/
        
/*        就以byte为例，byte的最大值是127
        byte b = 127；//编译时，底层判断，满足byte的范围，通过
        b += 1；// “+=” 对编译器而言等同于”=“，是底层判断，即使是超过范围，底层默认强转
        b = b+1;//两步运算，无论是否超过byte范围，编译器都认为存在越界的可能
*/
	}

}
