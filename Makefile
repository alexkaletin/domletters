JC = javac
JFLAGS = -g

.PHONY: all clean

all: DomLetter.class

DomLetter.class: DomLetter.java
	@$(JC) $(JFLAGS) DomLetter.java

clean:
	$(RM) *.class
