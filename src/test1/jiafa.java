package test1;

public class jiafa {

	public static void main(String[] args) {
		
		        int a=10;
		        int b=10;
		       
		        int x=10;
		        int y=21;
		        int z=10;
		       
		        System.out.println("���Լ� a=" + (a++));
		        System.out.println("a��ֵ a=" + a);
		        System.out.println("ǰ�Լ� b=" + (++b));
		       
		        System.out.println("---------------------");
		        System.out.println("˵ x>y,����" + (x>y));
		        System.out.println("��Ϊ x>y ���� x<y,����" + ( (x>y) && (x<y) ));
		        System.out.println("��Ϊ x>=y ���� x==y,����" + ( (x>=y) || (x==y) ));
		        System.out.println("��Ϊ x<y ���� x=z,����" + ( (x<y) || (x==z) ));
		        System.out.println("---------------------");
		        System.out.println("a&x �Ľ���ǣ�" + (a&x));
		        System.out.println("a|x �Ľ���ǣ�" + (a|x));
		        System.out.println("y^z �Ľ���ǣ�" + (y^z));
		       
		        System.out.println("---------------------");
		        System.out.println("a ����2λ�Ľ���ǣ�" + (a<<2));
		        System.out.println("y ����3λ�Ľ���ǣ�" + (y>>3));
		    }
		}
	

