# 第6回課題概要

## 課題内容

***1***. SpringBootを使って画面にHelloWorldを表示してみる\
***2***. 作成したソースコードをGitHubにpushする\
***3***. HelloWorldを表示したプロジェクトに自分で考えた変更を加えてみる\
***4***. 自分で考えた変更を新しいブランチでにコミットして、GitHubにpushするGitHub上でPullRequestを作ってみる

## 1.SpringBootを使って画面にHelloWorldを表示してみる

### 実行結果

![](../../../Desktop/スクリーンショット 2022-06-15 17.37.20.png)

## 3."HelloWorldを表示したプロジェクトに自分で考えた変更を加えてみる"

### 変更内容

・Spring BootのDependenciesにThymeleafを追加\
・DateTimeFormatクラスを作り日付と時間を日本語表示するメソッドを作成\
・HelloWorldControllerでModelを使い"HelloWorld!今日の日付と時間はこちら" と日本語表示の日付と時間をビューに渡す

### 実行結果

![](../../../Desktop/スクリーンショット 2022-06-16 20.56.12.png)

## 修正内容

・DateTimeFormatクラスを削除し、HelloWorldControllerに日付と時間を日本語表示するメソッドを記述

### 修正後の実行結果

![](../../../Desktop/スクリーンショット 2022-06-17 16.01.08.png)