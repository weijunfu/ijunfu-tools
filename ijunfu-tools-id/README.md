

# ID

> 支持 NanoId 和 雪花算法 生成唯一 ID

## NanoId

### 默认生成
```java
String id = NanoId.generate();
System.out.println("NanoId=" + id);
```

### 指定生成的ID长度
```java
String id = NanoId.generate(10);
System.out.println("NanoId=" + id);
```

### 指定生成的元素和长度
```java
String id = NanoId.generate("abcdefghijklmnopqrstuvwxyz".toCharArray(), 10);
System.out.println("NanoId=" + id);
```

## 雪花算法

生成雪花算法ID：
```java
SnowFlakeId snowFlakeId = new SnowFlakeId(1, 1);

long id = snowFlakeId.nextId();
System.out.println(id);
```

