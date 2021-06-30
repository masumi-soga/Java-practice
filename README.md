## Javawebアプリケーションについて
- 使用する技術
    - Servlet:サーバー上でJavaを実行する技術
    - JSP:HTMLの中にJavaのコードを埋め込んで動的にwebページを生成する技術
    - Tomcat:ServletやJSPを実行するサーバ用アプリケーション

- servlet使用時のファイル構成
    - tomcat/webapps/mywork/WEB-INF/classes←ここにコンパイルしたclassファイルを入れる 
    - tomcat/webapps/mywork/WEB-INF/web.xml←servletの設定ファイル。ルーティング等記述。詳細は下記. 
    ```java:xml
    <?xml version="1.0" encoding="UTF-8"?>
    <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                http://xmlns.jcp.org/xml/ns/javaee/web-app_4.0.xsd"
    version="4.0" metadata-complete="true">
    
    <servlet>
        <servlet-name>Hello</servlet-name>
        <servlet-class>HelloWorld</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>Hello</servlet-name>
        コメント：<url-pattern>で指定したurlに飛ぶと<servlet-class>で指定したclassファイルを表示する仕組み
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
    
    </web-app>
    ```
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
**文字一致**
```java:string.equal
if(str1.equals(str2))
```
