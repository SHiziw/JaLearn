
package test1;
public class zifu {
    public static void main(String[] args){
        // �ַ���
        char webName1 = '΢';
        char webName2 = 'ѧ';
        char webName3 = 'Է';
        System.out.println("��վ�������ǣ�" + webName1 + webName2 + webName3);
       
        // ����
        short x=22;  // ʮ����
        int y=022;  // �˽���
        long z=0x22L;  // ʮ������
        System.out.println("ת����ʮ���ƣ�x = " + x + ", y = " + y + ", z = " + z);
       
        // ������
        float m = 22.45f;
        double n = 10;
        System.out.println("����˻���" + m + " * " + n + "=" + m*n);
    }
}