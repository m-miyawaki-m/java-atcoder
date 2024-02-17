

###


```
awk '{N = $1; for (i = 0; i < N; i++){printf "10"} printf "1\n"}' ./tests/sample-1.in
```


```:awk
for file in ./tests/*.in; do awk '{N = $1; for (i = 0; i < N; i++) {printf "10"} printf "1\n"}' "$file"; done
```