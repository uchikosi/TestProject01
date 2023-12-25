
public class Java_07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 5;
		if(a<10 && 3<a){
		System.out.println( "A" );
		}
//		＆条件　a と b が共にTRUEの場合、処理を実行する

		int b = 5;
		if(b>=5 || b<=0){
		System.out.println( "B" );
		}
//		OR条件 aかb の少なくとも1つがTRUEの場合、処理を実行する

		int c = 5;
		if (!(c == 6) || !(b == 6)) {
            System.out.println("a");
        } else {
            System.out.println("c");
        }
//		!NOT条件 TRUEの場合、処理は実行しない

		int age = 35;
		if(age < 20){
		System.out.println( "未成年" );
		}else if(age >= 20 && age <= 80){
		System.out.println( "成人" );
		}else{
		System.out.println( "高齢者" );
		}

		int a10 =5;
		if(a10 % 2 ==0){
		System.out.println( "偶数" );
		}else{
		System.out.println( "奇数" );
		}
//		余剰演算　剰余(％)』条件を指定することで偶数と奇数の表示が出来ます。
	}
}
