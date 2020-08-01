# 回答例  
名前をキー、犬種をバリューとしたマップから、ビルダーで犬情報を作成し、自動採番で管理する  
   
## 学習する要素  
staic 初期化ブロック, Builder パターン, Strem API, メソッド参照  
 
## 問題文  
     
### 要件.01  
main メソッドに用意した名前と犬種を組み合わせとしたマップ  を用いて、Dog クラスのインスタンスを作成できるようにしなさい  
 
### 要件.02  
Dog クラスには、内部クラスとして Builder クラスを作成しなさい

### 要件.02  
Dog クラスのインスタンスは、自動採番（オートインクリメント）をさせて id を設定しなさい  
   
### 要件.03  
最後に dogs に詰め込まれた各インスタンスの id, name, type を、Stream API とメソッド参照を使ってすべて表示しなさい 
   
 ## 準備済クラス  
 - [/src/App.java](../01.question/src/App.java)  
 - [/src/Dog.java](../01.question/src/Dog.java)  

### 回答例
 - [/src/App.java](./src/App.java)  
 - [/src/Dog.java](./src/Dog.java)  
   