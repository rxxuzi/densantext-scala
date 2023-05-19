# 2. 制御構文

## 2.1. ブロック式
Scalaでは`{}`で複数の式の並びを囲むと、それ全体が式になります。
便宜上それをブロック式と呼ぶことにします。

ブロック式の一般形は

~~~scala
{(式1);(式2);(式n)}
~~~

です。式が改行で区切られていれば、セミコロン`;`が要らなくなります。

サンプル:
~~~scala
{print("Hello ");println("Scala")}

{
  print("Hello ")
  println("Scala")
}
~~~

## 2.2.if式

Scalaではif文ではなく、if式をつかいます。

~~~scala
val x = 10
val y = if(x < 15) "Less than 15" else "More than 15"
println(y) // Less than 15
~~~

