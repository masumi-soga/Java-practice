## よく使う構文
**変換系**  

- stringからint
```
int num = Integer.parseInt(hoge);
```
- intからstring
```
int i = Integer.valueOf(num);
```

## paiza
**入力受け取り**
```java:scanner
Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
```

**最小値を取得**
```java:min
int min;
int[] array = {n1,n2,n3,n4,n5};
min = array[ 0 ];
for ( int i = 1; i < array.length; ++ i ) {
  min = Math.min( min, array[ i ]);
}
```
