Atcoderの環境構築
- 言語：Java
- windows10
- wsl2

atcoder-cli、online-judge-toolsをjavaで環境構築する
```bash
# contents以下を、任意のコンテストに変更
acc new abc101

# テスト contests以下を、任意のコンテストと問題番号に変更＋/tests/
oj t -c "java Main.java" -d ./tests/  

# 提出
acc submit -s -- -l 5005


# 言語（java17）を指定して提出。「abc101_b」を修正する
oj s -l 5005 https://atcoder.jp/contests/abc101/tasks/abc101_a Main.java

# 提出時の注意（URLが違う場合がある）
oj s -l 5005 https://atcoder.jp/contests/abc101/tasks/arc099_a Main.java
```

以下、詳細
参考URL
http://tatamo.81.la/blog/2018/12/07/atcoder-cli-installation-guide/

### インストール開始
```bash
# Python3
sudo apt-get install python3

# Node.js
curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.33.11/install.sh | bash

# atcoder-cli, online-judge-toolsのインストール
sudo apt-get update
sudo apt-get install python3-pip
sudo apt-get install nodejs npm

# バージョン確認
pip3 -V
npm -v

# グローバルにパッケージをインストール
sudo npm install -g atcoder-cli
pip3 install online-judge-tools

acc -h
oj -h
```
### インストール完了


```bash
# 連携確認
acc check-oj

# login
acc login

# session確認
acc session

# online-judge-tools用ログイン
oj login https://beta.atcoder.jp/

# グローバル設定（テンプレート）
acc config default-template java
acc config default-task-choice all
acc config default-test-dirname-format tests

# acc new abc〇〇〇 --template java
#acc new abc101 --template java
acc new abc101

# configファイルの場所（config.json  session.json）
acc config-dir

# template確認
acc templates

# 提出
#acc submit

# 言語（java17）を指定して提出。「abc101_b」を修正する
oj s -l 5005 https://atcoder.jp/contests/abc101/tasks/abc101_b Main.java

# 提出時の注意（URLが違う場合がある）
oj s -l 5005 https://atcoder.jp/contests/abc101/tasks/arc099_a Main.java

# テスト
oj t -c "java Main.java" -d ./tests/  


# ディレクトリ削除
rm -rf ./abc101
```

```bash
# template作成

# configファイルの場所（config.json  session.json）
acc config-dir
```
- /atcoder-cli-nodejs/java
    ∟ Main.java
    ∟ template.json

```json
{
    {
        "task":{
            "program":["Main.java"],
            "submit":"Main.java"
        }
    }
}


```