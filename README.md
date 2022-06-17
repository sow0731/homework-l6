# 第6回課題概要

## 課題内容

***1***. SpringBootを使って画面にHelloWorldを表示してみる\
***2***. 作成したソースコードをGitHubにpushする\
***3***. HelloWorldを表示したプロジェクトに自分で考えた変更を加えてみる\
***4***. 自分で考えた変更を新しいブランチでにコミットして、GitHubにpushするGitHub上でPullRequestを作ってみる

## 1.SpringBootを使って画面にHelloWorldを表示してみる

### 実行結果
![スクリーンショット 2022-06-15 17 37 20](https://user-images.githubusercontent.com/103630732/174248485-1a88f9b2-7d00-4151-8862-c414f903a945.png)

## 3.HelloWorldを表示したプロジェクトに自分で考えた変更を加えてみる

### 変更内容

・Spring BootのDependenciesにThymeleafを追加\
・DateTimeFormatクラスを作り日付と時間を日本語表示するメソッドを作成\
・HelloWorldControllerでModelを使い"HelloWorld!今日の日付と時間はこちら" と日本語表示の日付と時間をビューに渡す

### 実行結果

![UNADJUSTEDNONRAW_thumb_1971](https://user-images.githubusercontent.com/103630732/174080504-853f4fd5-bb59-4099-81f4-dda92c22a2ab.jpg)

## レビュー指摘の修正

### 修正内容

・DateTimeFormatクラスを削除し、HelloWorldControllerに日付と時間を日本語表示するメソッドを記述

### 修正後の実行結果
![スクリーンショット 2022-06-17 16 01 08](https://user-images.githubusercontent.com/103630732/174248354-a9940f21-76c1-465f-8d06-74af39f01c91.png)

