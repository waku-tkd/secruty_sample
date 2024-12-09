# XXSサンプル
ローカル環境で実行できるようにしてあるだけ

1. なにも対策していないページ  
 localhost:8080//?id=&lt;script&gt;window.location.href=%27https://google.com%27;&lt;/script&gt;  
 上記でアクセスするとgoogleのページに飛ばされる

2. エスケープしたページ
localhost:8080//escape?id=&lt;script&gt;window.location.href=%27https://google.com%27;&lt;/script&gt;  
 上記でアクセスするとscriptタグがエスケープされるため実行されない

3. Thymeleafを使ったページ
localhost:8080//hwllo?id=&lt;script&gt;window.location.href=%27https://google.com%27;&lt;/script&gt;  
 上記でアクセスするとThymeleafがエスケープしてくれているので実行されない