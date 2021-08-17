# OreziaRankUp API publique

![Java version](https://img.shields.io/badge/java-^16-green)
![MC version](https://img.shields.io/badge/MC-v1.17-blue)
[![GitHub release](https://img.shields.io/badge/release-v1.0-blue)](https://github.com/Orezia/OreziaRankUp-api/releases/tag/1.0)

[English version](./README.md)

## Table des matières :

- [Intégration](#intgration-)
    - [Soft-depend](#soft-depend-)
    - [Hard-depend](#hard-depend-)
- [Version](#version-)

## Intégration :

Afin d'intégrer votre plugin avec OreziaRankUp, vous devez ajouter `OreziaRankUp-api` comme dépendance de
votre projet.

Gradle :

```groovy
repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/Orezia/OreziaRankUp")
    }
}

dependencies {
    implementation group: 'fr.orezia.mc', name: 'OreziaRankUp-api', version: VERSION
}
```

### Soft-depend :

Afin d'ajouter OreziaRankUp comme soft-depend, vous devez embarquer la dépendance `OreziaRankUp-api` avec
votre plugin (Inclure la dépendance dans le JAR de votre plugin).

### Hard-depend :

Si votre plugin dépend (hard-depend) d'OreziaRankUp, vous pouvez considérer la
dépendance `OreziaRankUp-api` comme fournit ("provided").

## Version :

- __1.0__: Version initiale