# [_tp01-java](https://monge.univ-mlv.fr/ens/IR/IR1/2023-2024/Java/td01.php)

# Exercice 1 - Hello Groland

On rappelle qu'en Java chaque classe publique doit être définie dans un fichier qui lui est propre. Le nom du fichier doit être le nom de la classe qu'il contient, auquel on ajoute le suffixe **.java**. Les noms des classes doivent être constitués de mots accolés dont la première lettre est une majuscule.

Dans un premier temps nous allons écrire des petits programmes permettant de se familiariser avec le compilateur, la machine virtuelle et les méthodes.

## 1.1 - Écrire le programme suivant :

```java
public class HelloGroland {
  public static void main(String[] args) {
    System.out.println("Hello Groland");
  }
}
```

dans votre éditeur de texte préféré et sauvegarder celui-ci sous le nom `HelloGroland.java`

## 1.2 - Compiler le programme en utilisant le commande javac puis vérifier que le fichier `.class` correspondant existe bien.

```console
javac HelloGroland.java
```

## 1.3 - Exécuter le programme avec la commande `java`

```
java HelloGroland
```

On ne met pas ".class" parce que la machine virtuelle le rajoute toute seule.

Note : la commande java est aussi capable de compiler en mémoire si on lui indique un seul fichier simple, comme par exemple `java HelloGrand.java`. Dans ce cas, le fichier `.class` ne sera pas visible sur le disque car la compilation à lieu uniquement en mémoire.

# Exercice 2 - Afficher les arguments de la ligne de commande

Écrire une classe `PrintArgs` qui affiche les arguments de la ligne de commande.

```console
$ java PrintArgs Voici des arguments
Voici
des
arguments
```

Les arguments de la ligne de commande sont stockés dans le tableau de chaînes de caractères passé en argument à la méthode : `public static void main(String[] args)`.

## 2.1 - Dans un premier temps, afficher le premier argument de la ligne de commande (dans notre exemple `Voici`).
```java
System.out.println(args[0]);
```
### Que se passe-t-il si l'on ne passe pas d'argument lors de l'exécution du programme ?

Le programme se lance, il ne se passe rien.

## 2.2 - Écrire une boucle affichant le contenu du tableau, sachant qu'en Java, les tableaux possèdent un champ (un attribut) `length` qui correspond à la taille du tableau.

```java
for(int i = 0; i < args.length; i++) {
	System.out.println(args[i]);
}
```

## 2.3 - Changer votre programme pour utiliser la syntaxe dite du 'for deux points', c'est à dire `for(Type value: array)`

```java
for(var element : args) {
	System.out.println(element);
}
```

# Exercice 3 - Calculette simple

Écrire un programme prenant un nombre sur l'entrée standard et affichant celui-ci.

Pour cela, on utilisera un objet `Scanner` et particulièrement sa méthode `nextInt()`.

```java    
import java.util.Scanner; 

public class Calc { 
  public static void main(String[] args) {
    Scanner scanner;
    scanner = new Scanner(System.in);
    int value;
    value = scanner.nextInt();
    // completer ici
  }
}
```

Pour comprendre le programme, il est utile de regarder la documentation [disponible](https://docs.oracle.com/en/java/javase/21/docs/api/index.html). Il est fortement conseillé de mettre ce lien en *bookmark* (signet, favoris, etc.)

## 3.1 - Recopier le programme précédent et le compléter pour qu'il affiche le nombre saisi par l'utilisateur.

## 3.2 - Indiquer dans le programme où sont les variables et quel est leur type associé.

```java
Scanner scanner; // variable scanner de type Object Scanner
int value; // variable value de type primitif entier
```

### Modifier le programme pour déclarer et initialiser les variables en une seule ligne.

```java
Scanner scanner = new Scanner(System.in);
int value = scanner.nextInt();
```


## 3.3 - Pourquoi `nextInt()` n'est pas une fonction ?

`nextInt()` n'est pas une fonction car elle s'appelle sur une classe.

## Qu'est `nextInt()` alors ?

`nextInt()` est une méthode.

## 3.4 - Expliquer la ligne : `import java.util.Scanner;`

C'est un raccourci pour importer `Scanner`, sans lui il aurait fallu écrire :

```java
java.util.Scanner scanner = new java.util.Scanner(System.in);
```

# Exercice 4 - Record et conversion de String en entier

## 4.1 - Quelle doit être la ligne de commande pour compiler le fichier Point.java ?

```java
javac Point.java
```
 
