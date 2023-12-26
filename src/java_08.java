
public class java_08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 25;
		
		if(number <= 100){
			if(number < 20){
				System.out.println("未成年");
			}else if(number == 77){
				System.out.println("喜寿");
			}else if(number == 88){
				System.out.println("米寿");
			}else{
				System.out.println("成人");
			}
		}
	}
//	もし、”ある数”(number)が100以下のとき、
//	”ある数”(number)が20以下の場合は、未成年と表示。
//	そうでない場合で、77の場合は喜寿、88の場合は米寿と表示し、
//	それ以外は成人と表示する。

}
