#!/bin/bash

mvn package -f source-code/pom.xml

cd target
java -jar *.jar