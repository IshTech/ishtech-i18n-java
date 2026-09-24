# ishtech-i18n-java
Java Util for
- i18n languages with enum for languages in ISO-639-1
- Country code in ISO-3166-2

## Tech stack

- JDK 25 (default)
- Other supported JDK versions:
  - JDK 21
  - JDK 17

Which library version to use for your JDK version: [JDK-VERSIONS.md](JDK-VERSIONS.md).

## Usage

- Note: in pom.xml / build.gradle put required version number

### Maven

```
<dependency>
	<groupId>fi.ishtech.common</groupId>
	<artifactId>ishtech-i18n</artifactId>
	<version>${ishtech-i18n.version}</version>
</dependency>

```

### Gradle

```
implementation("fi.ishtech.common:ishtech-i18n:${ishtechI18nVersion}")
```

## Build

This is a library; it **does not run** as a standalone application.

### Maven

#### Local Maven Build

- Build without tests

```
./mvnw clean install -DskipTests
```

- Build with Junit tests

```
./mvnw clean install
```

## Publish to Maven Central

- Deploy to Sonatype Central

  ```
  ./mvnw clean deploy -P gpg -P central-publishing
  ```

## Known Issues

See [KNOWN-ISSUES.md](KNOWN-ISSUES.md).
