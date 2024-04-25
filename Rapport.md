# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme :

## Exercices 1

On utilise le patron Composite, cela nous permet de traiter l'objet Véhicule et ses objets composants de la même manière.
Pour calculer la masse d'un véhicule, on calcule la somme des masses de ses composants.
Il n'y a pas besoin de réécrire les méthodes car on se sert des composants pour faire les calculs. Cela fonctionne pareil pour un `TagAlongBike`, on calcule la masse du véhicule en additionnant la masse du vélo et celle du petit.

## Exercices 2

On utilise le patron Iterator, cela nous permet de parcourir les éléments de `MobileObject` sans connaitre l'implémentation de la classe.
On peut ainsi parcourir les éléments de `MobileObject` et calculer la masse totale de tous les objets.
Il n'y a donc pas besoin de réécrire `GetVelocity` car Iterator permet de parcourir la collection de la même façon quel que soit le type d'objet.

## Exercices 3

Pour mettre en place un Singleton, on définit un attribut statique de la classe qui sera l'instance unique de la classe.
On définit un constructeur privé pour empêcher la création d'instances de la classe.
On définit une méthode `getInstance` statique qui permet de récupérer l'instance unique de la classe.

## Exercices 4

La classe `Wheel` et `Bike`n'appartiennent au même package. Il y a ainsi une dépendance cyclique entre les deux classes. Cela ne respecte pas les principes de bonne conception.
`Wheel` utilise `getPush()` de `Bike`. Il y a une abstraction dans `Vehicle` de la méthode `getPush()` présente dans le package `transport`.

## Exercices 5

J'ai ajouté la classe log() dans la classe `NamedLogger` qui regroupe les anciennes méthodes de ses sous-classes et j'appelle la méthode abtraite `write()`. 
Cette méthode est implémentée dans les sous-classes et permet de définir l'endroit où les logs seront écrits.

## Exercices 6

Le Singleton permet de partager une seule instance alors que Factory permet de créer plusieurs instances.
J'ai créé une classe `LoggerFactory` qui permet de créer des instances de `Logger` en fonction du type de log que l'on veut créer.

## Exercices 7

J'ai créé la classe `TimestampedLoggerDecorator` qui permet de décorer un `Logger` en ajoutant un timestamp à chaque log.
Ensuite, dans ma factory, j'ajoute le décorateur dès que je crée une instance de `Logger` comme ça, tous les logs auront un timestamp.

## Exercices 8

Le design pattern utilisé est Façade. Il permet de simplifier l'interface d'un ensemble de classes.
Oui, il est possible d'avoir plusieurs lignes et chaque ligne correspond à une classe à instancier.

## Exercices 9

C'est le design pattern Iterator qui permet de parcourir tous les objets d'un type donné disponibles dans le contexte applicatif.

Dans injectAll(), on renvoie un itérateur. Cela me permet, dans le run, d'utiliser cet Itérateur pour injecter les objets.


