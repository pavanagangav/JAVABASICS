package inheritance;
class AA{int a=23;}
class BB extends AA{int b=90;}
class CC extends BB{int c=89;}
public class multilevelinher {
	public static void main(String[] args) {
		CC nn=new CC();
		System.out.println(nn.a);
		System.out.println(nn.b);
		System.out.println(nn.c);
		BB mm=new BB();
		System.out.println(mm.a);
		System.out.println(mm.b);
		AA oo=new AA();
		System.out.println(oo.a);
	}

}