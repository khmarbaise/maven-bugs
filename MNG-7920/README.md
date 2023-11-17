# Example Project as Reproducer for MNG-7920

Execution requirements:
 * Maven 4.0.0-alpha-8 (minimum)
 * JDK11

```shell
mvn clean install -Dmaven.repo.local=$(pwd)/.repo  -ntp
```

This will build the whole project and installs the artifacts in the local repo `.repo`.
