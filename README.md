# jni_maven_example

## Build Project

```bash
mvn clean install
```

Add generated library path to `LD_LIBRARY_PATH`

```bash
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$(pwd)/src/main/native/build
```

## Run Sample Library with Java

```bash
java -cp target/jni-example-1.0-SNAPSHOT.jar Main
```