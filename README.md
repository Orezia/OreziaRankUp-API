# Orezia Rank-Up API

![Java version](https://img.shields.io/badge/java-^17-yellow)
![MC version](https://img.shields.io/badge/MC-v1.18.1-green)
[![GitHub release](https://img.shields.io/badge/release-vX-blue)](https://github.com/dederobert/OreziaRankUp-API/releases/tag/X)

[![Maven build](https://github.com/Orezia/OreziaRankUp-API/actions/workflows/maven_build.yml/badge.svg)](https://github.com/Orezia/OreziaRankUp-API/actions/workflows/maven_build.yml)

Public API for the `OreziaRankUp` plugin.

[Version française](./LISEZMOI.md)

## Table of contents :

- [Integrating](#integrating-)
  - [Soft-dependency](#soft-dependency-)
  - [Hard-dependency](#hard-dependency-)
- [Version](#version-)

## Integrating :

In order to integrate your plugin with `OreziaRankUp`, you have to add `OreziaRankUp-API` as dependency of your project.

Maven :

```xml
<repositories>
  <repository>
    <id>github-orezia-rankup-api</id>
    <url>https://maven.pkg.github.com/Orezia/OreziaRankUp-API</url>
  </repository>
</repositories>
```
```xml
<dependencies>
  <dependency>
    <groupId>fr.orezia.mc</groupId>
    <artifactId>oreziarankup-api</artifactId>
    <version>VERSION</version>
  </dependency>
</dependencies>
```

Gradle :

```groovy
repositories {
    maven {
        name = "GithubOreziaRankUpApi"
        url = uri("https://maven.pkg.github.com/Orezia/OreziaRankUp-API")
    }
}
```
```groovy
dependencies {
    implementation group: 'fr.orezia.mc', name: 'OreziaRankUp-API', version: VERSION
}
```

### Soft-dependency :

In order to add `OreziaRankUp` as soft-dependency, you have to shade the dependency `OreziaRankUp-API` in your plugin (i.e. include the dependency in your plugin JAR).

### Hard-dependency :

If your plugin is hard-dependent on `OreziaRankUp`, you can consider the dependency `OreziaRankUp-API` as provided.

## Version :

- __1.0__
    - TODO
