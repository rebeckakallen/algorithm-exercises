
#SHELL := /bin/bash
#.ONESHELL =
#.SHELLFLAGS := -ec


# Variables
#SRC=src
SRC := $(shell find src -name "*.java")
OUT=out
MAIN_CLASS=main.Main

# Default target
all: run

# Compile Java files
compile:
#	javac -d $(OUT) $(SRC)/**/**/*.java
	javac -d $(OUT) $(SRC)
	

# Run the program
run:
	java -cp $(OUT) $(MAIN_CLASS)

# Clean compiled files
clean:
	rm -rf $(OUT)/*
