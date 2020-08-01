# java.exercises
Java 問題集  
  
## VSCode で警告が出て実行できない場合は
VSCode で main メソッドを実行すると、以下の警告が出て Run/Debug ができない場合がある。

```console
The file App.java isn't on the classpath, the runtime may throw class not found error. 
Do you want to add the parent folder "path/to/src/folder" to Java source path?

Source: Debugger for Java(Extension)
```

これは、Language Support for Java(TM) by Red Hat の拡張により、Java Language Server でコンパイルする classpath に実行対象のクラスが含まれないことに起因する。

この場合、Ctr + Shift + P でコマンドパレットを開き、以下のコマンドを実行してキャッシュをクリアする。

```console
Clean the Java language server workspace
```

Are you sure you want to clean the Java language server workspace? と、本当にキャッシュを消去していいのかを尋ねてくるので、「Restart and delete」ボタンを押下する。

これで対象のクラスからの main メソッドの実行が可能となる。

また別の src フォルダの main メソッドを実行する場合は、再びキャッシュのクリアが必要となる。
