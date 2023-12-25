
public class java_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name ="高橋";
		System.out.println(name);

		String tel = "090-1234-5678";
//		数字だけでなくー（ハイフン）があるため文字列として扱われる
		System.out.println(tel);

		char char1 = 'A';
//		文字１つは文字列でなく文字扱いStringではなく、charで処理する。
//		また、charの場合は、代入する値を、必ずシングルクオテーションで囲まなければいけません。
		System.out.println(char1);

		int num1 = 12345;
		System.out.println(num1);
//		数字は、intで処理をする

		boolean boo= true;
		System.out.println(boo);
//		真偽値は、booleanで処理をする
		
		String abc = "山田";
		System.out.println(abc + "さん");


	}

}
