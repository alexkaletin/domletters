JC = javac
JFLAGS = -g

.PHONY: all clean

all: DomLetter.class
	@java DomLetter

DomLetter.class: DomLetter.java
	$(JC) $(JFLAGS) DomLetter.java

clean:
	$(RM) *.class
