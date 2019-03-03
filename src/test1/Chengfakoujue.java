package test1;

public class Chengfakoujue {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=9;i++) {
			for(j=1;j<=9;j++) {
				if(i>j) {
					System.out.print("        ");
				}else {
					System.out.printf("%dx%d=%2d  ",i,j,i*j);
				}

			}System.out.print("\n"); 
		}
	}

}
