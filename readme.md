
## auteur: 
* FILALI Youva







## Fichiers rendus

Makefile

Readme.md

test-1.7.jar

goosegame.jar

/test/PlayerTest.java

/test/TrapcellTest.java

/test/TeleportcellTest.java

/test/StartcellTest.java

/test/GoosecellTest.java

/test/cellTest.java

/test/WaitingcellTest.java

/test/BoardTest.java

/src/goosegame/Game.java

/src/goosegame/Player.java

/src/goosegame/Cell.java

/src/goosegame/trapecell.java

/src/cell.java

/src/goosegame/Board.java

/src/goosegame/InitCells.java

/src/goosegame/Goosecell.java

/src/goosegame/Startcell.java

/src/goosegame/Teleportcell.java

/src/goosegame/Waitingcell.java

/src/goosegame/GameMain.java
##    AVEC MAKEFILE 

## Exécution total avec Makefile
Afin d'exécuter toutes les commandes en une fois;

<pre><code>
  make all
</code></pre>


## Documentations
Afin d'obtenir la documentation, exécuter la commande:

<pre><code>
  make docs
</code></pre>

## Compilation
Pour compiler exécuter la commande:

<pre><code>
  make compil
</code></pre>

## Compiler les tests et éxecution
Pour compiler les tests, exécuter la commande:

<pre><code>
  make testComp
</code></pre>

Pour les exécuter
<pre><code>
 make test
</code></pre>

## exécuter les différents programmes

Pour GameMain:
<pre><code>
  make GameMain 
</code></pre>

POUR goosegame.jar:
<pre><code>
 make gooseGame 
</code></pre>

## Executable 
pour produire des fichiers exécutables on exécute la commande suivante :
placez vous dans le dossier classes et tapez : 
<pre><code>
  jar cvfm ../goosegame.jar manifest-ex classes goosegame 
</code></pre>


pour exécuter les fichiers .jar on éxécute la commande suivante :
placez vous dans la racine du dossier et tapez:
<pre><code>
 java -jar goosegame.jar 
</code></pre>
