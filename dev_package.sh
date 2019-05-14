#!/bin/sh
echo update source code...

git pull

mvn -U -T 1C -Pdev clean package -pl demo-zuul -am -DskipTests