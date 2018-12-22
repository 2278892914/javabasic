package jdbc;

public class Test {

	public static void main(String[] args) {
		Round r = new Round(20.2);
		double dd = r.area();
		System.out.println(dd);
		Zround z = new Zround(3.2);
		double aa = z.area(2.2);   //由于继承，必须有参数
		System.out.println(aa);
	}
}
