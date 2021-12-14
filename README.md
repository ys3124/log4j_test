# log4j_test

## 実行方法

```
# コンテナ起動
docker-compose up -d
# コンテナにログイン
docker-compose exec app bash
# Gradleをビルドする
sh gradlew build
# アプリケーションを実行する
java -jar build/libs/api-0.0.1-SNAPSHOT.jar

curl -X POST -H 'Content-Type: text/plain' -d '<<任意の文字列>>' http://localhost:8080

## 例）
curl -X POST -H 'Content-Type: text/plain' -d '${java:runtime}' http://localhost:8080
```

## log4jのバージョン確認方法
```
./gradlew dependencies | grep log4j
```

## 対策
- log4jのバージョンアップ
`build.gradle`に以下を追加
```
// log4jのバージョン指定
ext['log4j2.version'] = '2.15.0'
```

## 参考
- spring boot 環境を docker で構築する
https://ienokado-blog.com/2021/05/14/docker-spring-install/

- Spring Boot でロギングライブラリをLog4j2にする
https://qiita.com/kazokmr/items/7d8323cd2033b233c261

- Log4Jゼロデイ脆弱性の概要と手法・対策方法
https://qiita.com/cronree_91/items/0a18809c1dac2a6f9452