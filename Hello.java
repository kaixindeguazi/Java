/**
��һ��java����
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
		//�������ͣ� byte��-128~+127�� short int long
		byte b1 = 12;
		//byte b1 = 128     ��
		short b2 = 128;
		int b3 = 128;
		//����long�ͱ���ʱ��ֵ��ĩβ��"L"��"l";
		long b4 = 21321232L;
		System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4);

		//�����ͣ���С�������ֵ��float  double
		double d1 = 12.3;
		//����float���͵ĸ��������ݣ�ĩβҪ��"F"��"f";
		float d2 = 12.3F;
		System.out.println(d1+"\n"+d2);

		//�ַ���: char
		char c1 = 'a';
		//char c2 = 'ab';     ��
		String c2 = "abc";
		char c3 =  '��';
		String str = "�й�";
		//���Ա�ʾת���ַ�
		char c4 = '\t';	
		System.out.println(c1+"\n"+c2+"\n"+c3+"\n"+str);
	}
}