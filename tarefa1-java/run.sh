#!/bin/sh

set -eu

OUT_DIR="out"
SRC_DIR="src/main/java"

mkdir -p "$OUT_DIR"
javac -d "$OUT_DIR" "$SRC_DIR"/*.java
java -cp "$OUT_DIR" Main "$@"
