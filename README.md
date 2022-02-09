# OreziaRankUp public API

![Java version](https://img.shields.io/badge/java-^17-green)
![MC version](https://img.shields.io/badge/MC-v1.18.1-blue)
[![GitHub release](https://img.shields.io/badge/release-v1.0-blue)](https://github.com/Orezia/OreziaRankUp-api/releases/tag/1.0)

[version française](./LISEZMOI.md)

## Table of contents :

- [Integrating](#integrating-)
- [Version](#version-)

## Integrating :

In order to integrate your plugin with OreziaRankUp, you have to `OreziaRankUp-api` as dependency of your
project.

Gradle :

```groovy
repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/Orezia/OreziaRankUp-api")
    }
}

dependencies {
    implementation group: 'fr.orezia.mc', name: 'OreziaRankUp-api', version: VERSION
}
```

### Soft-depend

In order to add OreziaRankUp as soft-depend, you have to shade the dependency `OreziaRankUp-api` in your
plugin (Include the dependency in your plugin JAR).

### Hard-depend

If your plugin hard-depend on OreziaRankUp, you can consider the dependency `OreziaRankUp-api` as
provided.

## Version :

- __1.0__: Initial version