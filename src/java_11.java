
public class java_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] country =
			{
			{"日本”, ”タイ"},
			{"アメリカ”, ”ブラジル"},
			{"フランス”, ”ロシア"}
			};
			System.out.println(country[1][0]);
//			多次元配列　配列の各箱（要素）の中に
//			さらに小さな箱（要素）を入れて管理する方法
			
			String[][] country1 = new String[3][2];
			country1[0][0] = "日本";
			country1[0][1] = "タイ";
			country1[1][0] = "アメリカ";
			country1[1][1] = "ブラジル";
			country1[2][0] = "フランス";
			country1[2][1] = "ロシア";
			System.out.println(country1[1][1]);
			
	}

}
