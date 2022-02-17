# Orezia Rank-Up API

![Java version](https://img.shields.io/badge/java-^17-yellow)
![MC version](https://img.shields.io/badge/MC-v1.18.1-green)
[![GitHub release](https://img.shields.io/badge/release-vX-blue)](https://github.com/dederobert/OreziaRankUp-API/releases/tag/X)

[![Maven build](https://github.com/Orezia/OreziaRankUp-API/actions/workflows/maven_build.yml/badge.svg)](https://github.com/Orezia/OreziaRankUp/actions/workflows/maven_build.yml)

API publique pour le plugin `OreziaRankUp`.

[English version](./README.md)

## Table des matières :

- [Intégration](#intergration-)
  - [Soft-dépendance](#soft-dependance-)
  - [Hard-dépendance](#hard-dependance-)
- [Version](#version-)

## Intégration :

Pour intégrer votre plugin avec `OreziaRankUp`, vous devez ajouter `OreziaRankUp-API` parmi les dépendances de votre projet.

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

### Soft-dépendance

Pour être soft-dépendant d'`OreziaRankUp`, vous devez embarquer la dépendance `OreziaRankUp-API` dans votre plugin (c'est-à-dire inclure la dépendance dans le JAR de votre plugin).

### Hard-dépendance :

Si votre plugin est hard-dépendant d'`OreziaRankUp`, vous pouvez considérer la dépendance `OreziaRankUp-API` comme "provided".

## Version :

- __1.0__
  - \+ Fonctions pour récupérer chaque service
  - \+ Définition du service des modèles des rank-ups villes
  - \+ Définition du service des rank-ups villes
  - \+ Définition du service des modèles des rank-ups joueurs
  - \+ Définition du service des rank-ups joueurs
  - \+ Définition de toutes les entités
