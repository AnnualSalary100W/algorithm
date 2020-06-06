package exam;
import java.util.*;
/*
现给定任意正整数 n，请寻找并输出最小的正整数 m（m>9）
，使得 m 的各位（个位、十位、百位 ... ...）之乘积等于n，
若不存在则输出 -1。
 */
public class Vivo2 {
    public int solution (int n) {
            // write code here
            if(n<10)
                return 10+n;
            else{
                int m=0,base=1;
                while (n>9) {
                    int i;
                    for (i = 9; i > 1; i--) {
                        if (n % i == 0) {//能被整除
                            m=m+i*base;
                            base=base*10;
                            n=n/i;
                            break;
                        }
                    }
                    if(n>9&&i==1) //可能是一个不能被2-9整除的数 例如13
                        break;
                }
                if(n<=9){
                    m=m+n*base;  //加上位数最高的那位
                    return m;
                }else
                    return -1;
            }
        }
    }

