/*public class Example2_5{
  public static void main(String args[]){
       int [] a={1,2,3};
       int [] b={10,11};
       System.out.println("����a��������:"+a);
       System.out.println("����b��������:"+b);
       System.out.printf("b[0]=%-3db[1]=%-3d\n",b[0],b[1]);
       b=a;
       System.out.println("����a��������:"+a);
       System.out.println("����b��������:"+b);
       b[1]=888;
       b[2]=999;  
       System.out.printf("a[0]=%-5da[1]=%-5da[2]=%-5d\n",a[0],a[1],a[2]);
       System.out.printf("b[0]=%-5db[1]=%-5db[2]=%-5d\n",b[0],b[1],b[2]);
    }
}   */
/*public class Example2_5{
     public static void main (String args[ ]){
          char c='��';
          System.out.println("��ĸ"+c+"��unicode���е�˳��λ��:"+(int)c);
          System.out.println("��ĸ��");
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
          a=(byte)b;    //���¾��ȵ���ʧ
          c=(int)d;     //δ���¾��ȵ���ʧ
          f=(float)g;   //���¾��ȵ���ʧ
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
          System.out.printf("%d�����ĺ�Ϊ%f\n",m,sum);
          System.out.printf("%d������ƽ��ֵ��%f\n",m,sum/m);
     }
}





