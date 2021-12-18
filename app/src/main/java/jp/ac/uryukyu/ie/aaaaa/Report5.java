package jp.ac.uryukyu.ie.aaaaa;

public class Report5 {
    public static void main(String[] args) {
        try {
            String str = "百二十三";
            int value = Integer.parseInt(str);

        } catch (NumberFormatException e) {
            System.out.println("例外状況のエラーメッセージ出力");
            System.out.println(e.getMessage());
        }
    }
}
