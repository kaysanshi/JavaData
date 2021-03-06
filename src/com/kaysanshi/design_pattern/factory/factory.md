### 工厂模式：
优点： 
    1、一个调用者想创建一个对象，只要知道其名称就可以了。 
    2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
    3、屏蔽产品的具体实现，调用者只关心产品的接口。
缺点：
    每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，
    同时也增加了系统具体类的依赖。这并不是什么好事。

使用场景： 
    1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。 
    2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
    3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
    
#### 简单工厂模式：
   工厂类对象负责决定创建哪一种产品的类的实例，简单工厂模式适用于工厂类复负责创建对象比较少的情况，且客户端只需传入工厂类的参数，对于对象的创建不需要
   关心。
   缺点：工厂类的职责相对过重，不易于扩展过于复杂的产品结构
#### 工厂方法模式：
   指的是定义一个创建对象的接口,但让这个接口的类来决定实例化哪个类，工厂方法模式让类的实例话推迟到子类中进行。
   在工厂方法中用户只需关注所需产品对应的工厂，无需关心创建细节，而且符合科开闭原则
   适用场景：
   (1): 创建对象需要大量的重复的代码
   (2): 客户端不依赖产品实例如何被创建，如何被实现
   (3): 一个类通过其子类指定创建哪个对象
   缺点:复杂度，理解难度变高
   本例代码的工厂方法模式结构:
   [![6xDZUH.png](https://z3.ax1x.com/2021/03/27/6xDZUH.png)](https://imgtu.com/i/6xDZUH)
   
#### 抽象工厂模式：
   指提供一个创建一系列相关或相互依赖对象的接口，无须指定他们的具体类，客户端布不依赖产品实例如何被创建，如何被实现等细节，
   强调的是一系列的产品对象使用重复大量的代码
   
#### 总结 
  上面其实都有共性，何为工厂，那不是可以产出产品的地方，也就是我定义一个接口，类似于我定义准则，标准，不同的实现类可以对我的接口用不同的实现，这不就是
  重写吗，重写不就是这样，只是现在是多个实现类重写，而重写的必定要返回一个对象，这个对象与产品之间的是有关系的。实现类所产生返回的对象，应该是不同的，
  但是如果我们都返回了指定的对象，那就不能构成这个概念了，所以我们在接口的定义需要返回一个相同的对象。那是不是需要对这个相同的对象做一个统一，那就是制定接口
  让其返回相同的接口，通过接口的实现类来完成工厂类返回不同的产品的功能
  