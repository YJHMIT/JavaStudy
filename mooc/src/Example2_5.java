/*public class Example2_5{
  public static void main(String args[]){
       int [] a={1,2,3};
       int [] b={10,11};
       System.out.println("数组a的引用是:"+a);
       System.out.println("数组b的引用是:"+b);
       System.out.printf("b[0]=%-3db[1]=%-3d\n",b[0],b[1]);
       b=a;
       System.out.println("数组a的引用是:"+a);
       System.out.println("数组b的引用是:"+b);
       b[1]=888;
       b[2]=999;  
       System.out.printf("a[0]=%-5da[1]=%-5da[2]=%-5d\n",a[0],a[1],a[2]);
       System.out.printf("b[0]=%-5db[1]=%-5db[2]=%-5d\n",b[0],b[1],b[2]);
    }
}   */
/*public class Example2_5{
     public static void main (String args[ ]){
          char c='α';
          System.out.println("字母"+c+"在unicode表中的顺序位置:"+(int)c);
          System.out.println("字母表：");
          for(int i=(int)c;i<c+25;i++){
               System.out.print(" "+(char)i);
          }
     }
}*/
/*public class Example2_5{
     public static void main (String args[ ]){
          byte a=120;
          short b=130;
          int c=2200;
          long d=8000;
          float f;
          double g=0.1234567812345678;
          a=(byte)b;    //导致精度的损失
          c=(int)d;     //未导致精度的损失
          f=(float)g;   //导致精度的损失
          System.out.println("a="+a);
          System.out.println("c="+c);
          System.out.println("f="+f);
          System.out.println("g="+g);
     }
}*/
/*public class Example2_5{
     public static void main (String args[ ]){
          char c='A';
          float f=123.456789f;
          double d=123456.12345678;
          long x=5678;
          System.out.printf("%c%n%10.3f%n%f,%12d%n%d",c,f,d,x,x=x+2);
     }
}*/
import java.util.*;
public class Example2_5{
     public static void main (String args[ ]){
          Scanner reader=new Scanner(System.in);
          double sum=0;
          int m=0;
          while(reader.hasNextDouble()){
               double x=reader.nextDouble();
               m=m+1;
               sum=sum+x;
          }
          System.out.printf("%d个数的和为%f\n",m,sum);
          System.out.printf("%d个数的平均值是%f\n",m,sum/m);
     }
}





