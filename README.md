# ishtech-i18n-java
Java Util for
- i18n languages with enum for languages in ISO-639-1
- Country code in ISO-3166-2

## Tech stack

- JDK 25 (default)
- Other supported JDK versions:
  - JDK 21
  - JDK 17

### Library version for each JDK version

- Releases for the default JDK version have plain version numbers, for example `x.y.z`. They are built from the branches `dev` and `main`.
- Releases for another supported JDK version have the same version number with the suffix `-jdkNN`, for example `x.y.z-jdk21` for JDK 21. They are built from the branch `dev-jdkNN`, for example `dev-jdk21`, from the same code, adapted where that JDK version needs it.
- Use the version that matches your JDK version. Dependency update tools may suggest the version without a suffix as newer; that version needs the default JDK version.

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

