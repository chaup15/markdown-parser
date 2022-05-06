MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
	java MarkdownParse test-file.md

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class 	
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

test: MarkdownParse.class MarkdownParseTest.class
	echo "All done!"



