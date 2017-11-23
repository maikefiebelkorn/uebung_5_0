
public class uebung_5_0 {

	public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;
	int f = 0;
	int random;
	
	for ( int i = 1; i <= 50; i++)
	{  random = Zufall.getZufallInt(1, 6);
	if (random == 1){
		a = a+1;
	}
	if (random == 2){
		b = b+1;
	}
	if (random ==3){
		c = c+1;}
	if (random ==4){ 
		d= d+1; 
	}
	if (random ==5){ 
		e = e+1;}
	if (random==6){
		f = f+1;
	
	}}
	System.out.println("a =" + a);
	System.out.println("b =" + b);
	System.out.println("c =" + c);
	System.out.println("d =" + d);
	System.out.println("e =" + e);
	System.out.println("f =" + f);
	
	}

}
