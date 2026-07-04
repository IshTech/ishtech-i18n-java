# ishtech-i18n-java
Java Util for
- i18n languages with enum for languages in ISO-639-1
- Country code in ISO-3166-2

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

## Deploy to Sonatype Central

```
./mvnw clean deploy -P gpg -P central-publishing
```

