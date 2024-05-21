# Minimalistic Java Quickstarter

A quickstart maven archetype for creating greenfield Java 21 projects 

# Get started

## Run from mvn central repo

```bash
mvn archetype:generate \
    -DarchetypeGroupId=nl.ivonet \
    -DarchetypeArtifactId=quickstart-archetype \
    -DarchetypeVersion=1.0 -U
```

## Install in local repo

```bash
mvn dependency:get \
   -DgroupId=nl.ivonet \
   -DartifactId=quickstart-archetype \
   -Dversion=1.0
   
mvn archetype:crawl
   
```

## Run if offline available

```bash
mvn archetype:generate -Dfilter=nl.ivonet:
```

this will filter the archetype list on my groupId


# Contact

X: @ivonet

# License

I've published this archetype under two licenses, so you can choose which one you like best.

- [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
- [Eclipse Public License - v 2.0](http://www.eclipse.org/legal/epl-v20.html)
