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

## 2.1 - Dans un premier temps, afficher le premier argument de la ligne de commande (dans notre exemple Voici).
## Que se passe-t-il si l'on ne passe pas d'argument lors de l'exécution du programme ?

Le programme se lance, il ne se passe rien.

## Exercice 3.3 - Pourquoi `nextInt()` n'est pas une fonction ?

`nextInt()` n'est pas une fonction car elle s'appelle sur une classe.

## Qu'est `nextInt()` alors ?

`nextInt()` est une méthode.

## Exercice 3.4 - Expliquer la ligne : `import java.util.Scanner;`

C'est un raccourci pour importer `Scanner`, sans lui il aurait fallu écrire :

```java
java.util.Scanner scanner = new java.util.Scanner(System.in);
```

## Exercice 4.1 - Quelle doit être la ligne de commande pour compiler le fichier Point.java ?

```java
javac Point.java
```
 
