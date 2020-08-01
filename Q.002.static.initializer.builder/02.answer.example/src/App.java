import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学習する要素： 
 * staic 初期化ブロック, Strem API, メソッド参照  
 *   
 * 問題： ==========  
 * [要件.01]  
 * 名前をキー、犬種をバリューとしたマップから、ビルダーで犬情報を作成し、自動採番で管理する  
 * 
 * [要件.02] 
 * Dog クラスには、内部クラスとして Builder クラスを作成しなさい  
 * 
 * [要件.03]  
 * Dog クラスのインスタンスは、自動採番（オートインクリメント）をさせて id を設定しなさい  
 *   
 * [要件.04]   
 * 最後に dogs に詰め込まれた各インスタンスの id, name, type を、Stream API とメソッド参照を使ってすべて表示しなさい 
 */
public class App {

    public static void main(String[] args) {
        Map<String, DogType> dogMap = new HashMap<>();
        dogMap.put("Smith", DogType.CHIWAWA);
        dogMap.put("Mary", DogType.AKITA);
        dogMap.put("Lisa", DogType.POMERANIAN);
        dogMap.put("Wendy", DogType.CHIWAWA);
        dogMap.put("Mike", DogType.CHOWCHOW);
        dogMap.put("Jane", DogType.BULLDOG);

        List<Dog> dogs = new ArrayList<>();

        dogMap.forEach((name, type) -> {
            dogs.add(new Dog.Builder().name(name).type(type).build());
        });

        for (Dog dog : dogs) {
            System.out.printf(dog.info());
        }
    }
}
