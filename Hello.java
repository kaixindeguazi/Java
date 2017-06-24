/**
第一个java程序
@author Lee
@version v1.0
*/
public class Hello{
	public static void main(String[] args){
		System.out.println("Hello Lee!");
	}
}

class Person{
	public static void main(String[] args){
		//定义整型： byte（-128~+127） short int long
		byte b1 = 12;
		//byte b1 = 128     ×
		short b2 = 128;
		int b3 = 128;
		//定义long型变量时，值的末尾加"L"或"l";
		long b4 = 21321232L;
		System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4);

		//浮点型（带小数点的数值）float  double
		double d1 = 12.3;
		//声明float类型的浮点型数据，末尾要加"F"或"f";
		float d2 = 12.3F;
		System.out.println(d1+"\n"+d2);

		//字符型: char
		char c1 = 'a';
		//char c2 = 'ab';     ×
		String c2 = "abc";
		char c3 =  '中';
		String str = "中国";
		//可以表示转义字符
		char c4 = '\t';	
		System.out.println(c1+"\n"+c2+"\n"+c3+"\n"+str);
	}
}