# 1. 変数と型

## 1.1. Scalaの型階層

`Any` は全ての型のスーパータイプであり、トップ型とも呼ばれます。 
`Any`は `equals`、`hashCode`、そして `toString`のようないくつかの普遍的なメソッドを定義しています。 
そして`AnyVal`と`AnyRef` という2つの直系のサブクラスを持ちます。

![diagram](https://docs.scala-lang.org/resources/images/tour/unified-types-diagram.svg)

### AnyVal 

`AnyVal` は値型に相当します。 事前に定義された9つの値型が存在します。
それら`Double`、`Float`、`Long`、`Int`、`Short`、`Byte`、`Char`、`Unit`、
`Boolean`は **null非許容です**。

| 型名	     | 説明	                     | デフォルト値 | 	親クラス  |
|---------|-------------------------|--------|--------|
| Boolean | trueかfalse              | false  | AnyVal |
| Char    | 16ビット符号なしUnicode文字      | '\0'   | AnyVal |
| Byte    | 8ビット符号付き整数値             | 0      | AnyVal |
| Short   | 16ビット符号付き整数値            | 0      | AnyVal |
| Int     | 32ビット符号付き整数値            | 0      | AnyVal |
| Float   | 32ビット実数値                | 0.0    | AnyVal |
| Long    | 64ビット符号付き整数値            | 0      | AnyVal |
| Double  | 64ビット実数値                | 0.0    | AnyVal |
| String  | 文字列  同じ内容でも異なるインスタンスが存在 | null   | AnyRef |
| Symbol	 | 文字列, 同じ内容ならインスタンスも等しい   | null   | AnyRef |




`Unit`は**意味のある情報をもたない値型です**。

`Unit`型のインスタンスは**ただ1つだけ**あり、`()`というリテラルで宣言することができます。 
全ての関数は必ず何かを返さなければなりません。
そのため**Unitは戻り値の型として時々役立ちます**。

Unit型はJavaのvoidみたいな使い方をします。

~~~scala
def foo(x :Int ) : Unit = {
    /* */
}
~~~
### AnyRef

**AnyRefは参照型を意味します**。
全ての値型でない型は参照型として定義されます。
Scalaでは全てのユーザー定義型は`AnyRef`の**サブタイプ**になります。
もしScalaがJava実行環境上で利用されるなら、AnyRef は`java.lang.Object`に相当します。

## 1.2.宣言

JavaとScalaでは変数の宣言や初期化の方法が異なっています。
Javaの場合は変数を例えば `Int x = 0`のように初期化します。
Scalaの場合は`val x = 0`もしくは`val x : Int = 0 `と初期化します。

Scalaにおける宣言の仕方は以下のようになります。
~~~scala
val 変数名 : 型名 = 値
var 変数名 : 型名 = 値
~~~

変数の初期化でJavaと大きく異なる点は、Scalaが便利な**型推論**の機能を持ってることです。

これによって型名を明記せず初期化をすることが可能です。
例えば`val x = 100`と書くとxは `Int型`とされます。
またval `x = 100.0`と書くと、少数点から空気を読んでxは Double型とされます。

また、`val`と`var`の違いは`val`は一度定義すると変更不可能で、`var`は再定義できます。

以下にstring、integer、character、boolean、関数が他のオブジェクトと同様に全てオブジェクトであるという例を示します。
~~~scala
val list: List[Any] = List(
  "abc", //string
  100,  // integer
  'c',  // character
  true, // boolean 
)

list.foreach(element => println(element))
~~~
出力:
~~~text
abc
100
c
true
~~~

## 1.3.　キャスト

値型は以下の順序でキャストできます
矢印とは逆にキャストすると制度が落ちます

![casting](https://docs.scala-lang.org/resources/images/tour/type-casting-diagram.svg) 

サンプルです
~~~scala 
val x = 100 //Int型
val y = x.toLong //Long型にキャスト

val a = 3.1415
val b = a * 100 //Double型 b = 314.15....
val c = b.toInt //Int型にキャスト c = 314
~~~

## Nothing と Null

**Nothingは全ての型のサブタイプ**であり、**ボトム型**とも呼ばれます。
**Nothing型を持つ値は存在しません。**
一般的に例外のスロー、プログラム終了、無限ループなど終了していないことを示すのに使われます。
値として評価されない式や正常に返らないメソッドなどに使われます。

`Null`は全ての参照型のサブタイプ(すなわち、全ての`AnyRef`のサブタイプ)です。`null`というキーワードリテラルが指す値を1つだけもちます。
`Null` は、ほぼ他のJVM言語との相互運用性のためだけに提供されているので、
**Scalaのコード内ではほとんどの場合、使われるべきではありません**。

## String型


