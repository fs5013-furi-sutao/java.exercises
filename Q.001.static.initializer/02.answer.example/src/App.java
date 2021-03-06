import java.util.ArrayList;
import java.util.List;

/**
 * 学習する要素： 
 * staic 初期化ブロック, Strem API, メソッド参照
 * 
 * 問題：
 * ==========  
 * [要件.01]
 * main メソッドに用意した配列 names を用いて、Student クラスのインスタンスを作成できるようにしなさい
 * 
 * [要件.02]
 * Student クラスのインスタンスは、自動採番（オートインクリメント）をさせて id を設定しなさい
 * 
 * [要件.03]
 * 最後に students に詰め込まれた各インスタンスの id と name を、Stream API とメソッド参照を使ってすべて表示しなさい
 */
public class App {

    public static void main(String[] args) {

        String[] names = {"yamada", "yamamoto", "kawakami"};
        List<Student> students = new ArrayList<>();

        for (String name : names) {
            students.add(new Student(name));
        }

        students.stream()
            .map(s -> s.info())
            .forEach(System.out::println);
    }
}