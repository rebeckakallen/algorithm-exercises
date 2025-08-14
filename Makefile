
# Variables
SRC=src
OUT=out
MAIN_CLASS =main.Main

# Default target
all: run

# Compile Java files
compile:
	javac -d $(OUT) $(SRC)/**/**/*.java

# Run the program
run:
	java -cp $(OUT) $(MAIN_CLASS)

# Clean compiled files
clean:
	rm -rf $(OUT)/*
