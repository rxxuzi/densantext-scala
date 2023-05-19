# 4. Class

Scalaにおけるクラスはオブジェクトを作るための設計図です。 
クラスはメソッド、値、変数、型、オブジェクト、トレイト、クラスを持ち、それらはまとめて メンバー と呼ばれます。

## 2.1.定義

最小のクラス定義は単純にキーワード`class`と識別子だけというものです。
クラス名は大文字から始める決まりがあります。

またインスタンス化するときは次のようにします。
~~~scala
val オブジェクト名 = new クラス名
~~~

以下はJavaとScalaでのインスタンス化の違いです

~~~java
class Example{
}
Example example = new Example();
~~~
~~~scala
class Example{
}
val example = new Example
~~~

上の例では`Example class`はコンストラクターが定義されていないので、 Scalaの場合引数なしのデフォルトコンストラクターを持ちます。

~~~scala
class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = s"($x, $y)"
}
~~~

## 2.2.コンストラクタ

## 2.3.プライベートメンバーとゲッター/セッター構文