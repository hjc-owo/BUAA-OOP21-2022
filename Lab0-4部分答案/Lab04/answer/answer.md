# Lab 04 Assignment

## Question1

你在 `A.java` 中应该添加的语句：

```java
package com.oo.aa;
```

你在 `B.java` 中应该添加的语句：

```java
package com.oo.bb;
import com.oo.aa.A;
```

你在 `C.java` 中应该添加的语句：

```java
package com.oo.cc;
import com.oo.cc.B;
```

你在 `Main.java` 中应该添加的语句：

```java 
package com.oo;
import com.oo.C;
```

你在 `BTest.java` 中应该添加的语句：

```java
package test;
import com.oo.bb.B;
```
## Question2

- LAB03 中的单例模式，或者说所有构造方法都是 private 时，可能有子类吗？

不可能

- final 类可以视为所有构造方法都是 private 的类吗？

不能， 虽然二者都不能有子类继承， 但是可以给 final 类创建对象。

（注释的那几行相信 idea 的报错已经告诉你们了）

## Question03

b. 如果将子类的 `protected void foo()`改为默认访问权限，程序还能通过编译吗？

不能

c. 如果将子类的 `protected void bar()`改为默认访问权限，程序还能通过编译吗？

不能

e. 属性、静态方法、非静态方法，哪些可以覆盖（重写、override），哪些可以隐藏？

重写：数学，静态方法，非静态方法。

隐藏：非静态方法。

## Question04

题外话： 父类提供对应的 Getter 方法，子类通过 Getter 获取属性并计算面积

