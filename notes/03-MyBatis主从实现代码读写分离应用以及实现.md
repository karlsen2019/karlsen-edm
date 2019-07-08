# 03-MyBatis主从实现代码读写分离应用以及实现

* 有序uuid
  * id生成策略
* 打包
  * 动态包名
  * resource
* yml
  * 层次感
* spring bean注入
  * byName
  * byType
    * primary：优先选择(首选)
* 手写servlet
  * 注入springboot
* 日志
  * 鹰眼系统
* 微服务 -- 排查**难**
* 主从切换
  * 标识 -- 线程安全
  * sqlsessionFactory
  * ThreadLocal：线程局部变量
    * key：当前线程
    * value：DataBaseType
  * aspect
    * around
      * proceed：让方法执行完毕
  * 分布式事务
    * zookeeper
    * redis
    * rockermq
      * 两阶段提交

## 注解

## 本节任务

* 基础注解
  * SpringBootApplication：启动类
  * EnableWebMvc：启动mvc
  * Configuration：xml配置类
  * ComponentScan：扫描包下所有spring注解
  * ImportResource：加载额外spring**xml**配置文件
  * MapperScan：扫描mapper文件
  * EnableTransactionManagement：开启事务
  * Value：注入配置
  * Bean：代替spring中元素
    * name：注入名
  * ConfigurationProperties：注入以prefix为前缀的所有属性
    * prefix：前缀
  * AutoConfigureAfter({value})：在加载完value之后加载的配置类
* 实现读写分离代码
  * 自定义注解
* 配置druid数据源
  * DatasourceConfiguration
    * 加载主、从数据源
  * DataBaseContextHolder
    * 主从切换
* mybatis配置类
  * 配置类加载先后
    * 先有数据源，再有mybatis配置
  * mybatis动态路由
* 主从切换实现