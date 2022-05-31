# Uebung 6: DOCUMENTATION

## 1. Was ist notwendig um Maven Site Doumentation zu generieren?
### Ein maven-javadoc-plugin im pom.xml file war nowendig zum einbinden um die Maven Site Doucmentation zu generieren.

## 2. site.xml vs pom.xml
### site.xml ist ein Site Decriptor. Die beshcreibt die sogennanten Navigation Links.
### Die beinhaltet Indtroduction, Test und Good Style links, die das front page der Dokumentation bilden.

### pom.xml dient als Basis fuer erstellung der Site mittels mvn site Befehl. Die muss mindestens die model Version, package name,, artifact name, und version beinhalten.