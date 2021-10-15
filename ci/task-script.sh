#!/bin/bash

mvn package -f source-code/pom.xml
cd output-folder
ls
find .