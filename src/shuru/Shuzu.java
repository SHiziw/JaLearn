package shuru;
import java.util.*;
public class Shuzu {
    public static void main(String[] args){
        int intArray[] = new int[5];
        long total = 0;
        int len = intArray.length;
       
        // ������Ԫ�ظ�ֵ
        System.out.print("������" + len + "���������Կո�Ϊ�ָ���");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<len; i++){
            intArray[i] = sc.nextInt();
        }
       
        // ��������Ԫ�صĺ�
        for(int i=0; i<len; i++){
            total += intArray[i];
        }
       
        System.out.println("��������Ԫ�صĺ�Ϊ��" + total);
    }
}