
all: 
	make docs
	make compil
	make testComp
	make testExe
	make GameMain
	make GooseGame

	make clean
compil :
	javac -sourcepath src src/goosegame/*.java -d classes


testComp:
	rm -rf test/goosegame/*.class
	javac -classpath test-1.7.jar test/*.java


testExe:
	java -jar test-1.7.jar CellTest
	java -jar test-1.7.jar GooseCellTest
	java -jar test-1.7.jar BoardTest
	java -jar test-1.7.jar PlayerTest
	java -jar test-1.7.jar StartCellTest
	java -jar test-1.7.jar TeleportCellTest
	java -jar test-1.7.jar TrapCellTest
	
	java -jar test-1.7.jar InitCellsCellTest
	java -jar test-1.7.jar GameTest



GameMain:
		java -classpath classes goosegame.GameMain

gooseGame:
	java -jar goosegame.jar 

docs:

	mkdir docs
	javadoc -d docs -cp src/ -subpackages goosegame

clean:
	rm -rf classes/goosegame/*.class
	rm -rf docs
	rm -rf test/*.class

