package test1;

public class jiafa {

	public static void main(String[] args) {
		
		        int a=10;
		        int b=10;
		       
		        int x=10;
		        int y=21;
		        int z=10;
		       
		        System.out.println("后自加 a=" + (a++));
		        System.out.println("a的值 a=" + a);
		        System.out.println("前自加 b=" + (++b));
		       
		        System.out.println("---------------------");
		        System.out.println("说 x>y,对吗？" + (x>y));
		        System.out.println("认为 x>y 并且 x<y,对吗？" + ( (x>y) && (x<y) ));
		        System.out.println("认为 x>=y 或者 x==y,对吗？" + ( (x>=y) || (x==y) ));
		        System.out.println("认为 x<y 或者 x=z,对吗？" + ( (x<y) || (x==z) ));
		        System.out.println("---------------------");
		        System.out.println("a&x 的结果是：" + (a&x));
		        System.out.println("a|x 的结果是：" + (a|x));
		        System.out.println("y^z 的结果是：" + (y^z));
		       
		        System.out.println("---------------------");
		        System.out.println("a 左移2位的结果是：" + (a<<2));
		        System.out.println("y 右移3位的结果是：" + (y>>3));
		    }
		}
	

