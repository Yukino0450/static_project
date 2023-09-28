import java.util.Random;

public class PracticeSwitch {
	public static void main(String[] args) {
		// 1. 配列の長さ（要素数）を設定
		int arrayLength = 10;

		// 2. 1から5までのランダムな数値を持つ配列を生成
		int[] jobArray = new int[arrayLength];
		Random random = new Random();
		for (int i = 0; i < arrayLength; i++) {
			jobArray[i] = random.nextInt(5) + 1; // 1から5までの乱数を生成して配列に格納
		}

		// 3. 配列の中身を出力
		for (int i = 0; i < arrayLength; i++) {
			int jobCode = jobArray[i]; // 配列からジョブコードを取得
			String jobName = getJobName(jobCode); // ジョブコードからジョブ名を取得
			System.out.println(jobName);
		}
	}

	// ジョブコードからジョブ名を取得するメソッド
	public static String getJobName(int jobCode) {
		String jobName;
		// ジョブコードに応じてジョブ名を決定
		switch (jobCode) {
		case 1:
			jobName = "勇者";
			break;
		case 2:
			jobName = "バトルマスター";
			break;
		case 3:
			jobName = "パラディン";
			break;
		case 4:
			jobName = "海賊";
			break;
		case 5:
			jobName = "魔法剣士";
			break;
		default:
			jobName = "不明";
			break;
		}
		return jobName; // 決定したジョブ名を返す
	}
}
