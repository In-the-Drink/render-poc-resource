```
mvn clean package
mkdir target/dependency
(cd target/dependency; jar -xf ../*.jar)
docker build -t foo/bar .
docker run -p 8081:8081 foo/bar
```