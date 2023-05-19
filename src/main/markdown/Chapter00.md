# 0.　はじめに

このテキストではある程度プログラミング経験を持ち、
Scala で何ができるかについて概要を知りたい方向けです。 
オブジェクト指向プログラミング、とりわけ Java についての基本的な知識を前提とします。

[電算テキストJava](https://github.com/rxxuzi/densantext-java)

## 0.1. Scalaの特徴

Scalaは、オブジェクト指向言語と関数型言語の特徴を統合したマルチパラダイムのプログラミング言語で、
名前の「Scala」は英語の「scalable language」に由来するものです。

主にJavaプラットフォーム（Java仮想マシン）上で動作し、
既存のJavaのプログラムと容易に連携させることができます。

Scalaは、Javaとの互換性が高く、Javaの豊富なライブラリが使えます。
また、開発生産性を高める簡潔な表記が可能であり、静的型付けを行う関数型言語でもあります。

### 0.1.1. 開発環境

コンパイルはscalacでもできますが、
IDEは[intelliJ IDE](https://www.jetbrains.com/ja-jp/idea/)を使う事をおすすめします

## 0.2. Hello World!

最初の例として以下のプログラムをつくります。
IDEで`Main.scala`というファイルを作成し、以下のコードを書いて実行してみてください
~~~scala
object Main{
  def main(args: Array[String]): Unit = {
    println("Hello World!!")
  }
}
~~~

``Hello World!``と出力されたら成功です。
