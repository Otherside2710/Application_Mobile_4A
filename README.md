# Projet d'application Mobile 4A

En 4ème année d'école d'ingénieur, à l'ESIEA, il nous a été demandé de réaliser un projet de programmation mobile. Celui-ci devait contenir les éléments suivants : 
  * Une **activité principale**, qui contient une liste faite en utilisant **RecyclerView**. 
  * Cette liste devait être remplie automatiquement à l'aide d'un **Appel API REST**.
  * Une **seconde activité**, que l'on peut ouvrir en cliquant sur un des éléments de la liste.  
  * Des **fragments**, c'est à dire d'autres pages de l'application auxquels on peut accéder soit avec un système d'onglet, soit avec un système de **nav-bar** ( barre de navigation qui est sur le côté gauche en général)
  * Une interface utilisateur avec du **material design** (une interface **épurée** et simple, qui donne à l'application un design proche des applications android conçues par **Google**)
  
  # Ce qui a été réalisé 
  
À ce jour, de nombreuses choses on été réalisée sur l'application :
  * implémentation des **fragments**.
  * implémentation de la **nav-bar** (pour accéder aux **fragments**).
  * Pattern **MVC** pour l'agencement des différents fichiers qui composent l'application
  * Material design respecté
  * Création d'une **API REST**
  
<img src="https://user-images.githubusercontent.com/46956233/70865030-fbc81b80-1f58-11ea-960f-466c1aae7785.png" width="300" height="600">

###### Page d'accueil, avec la liste ( qui ici ne s'affiche pas suite à un bug d'API)



<img src="https://user-images.githubusercontent.com/46956233/70865566-582e3980-1f5f-11ea-8814-34bf206fa94f.png" width="300" height="600">

###### Image d'illustration de la nav-bar, qui permet de passer d'un fragment à l'autre

<img src="https://user-images.githubusercontent.com/46956233/70865586-8a3f9b80-1f5f-11ea-948e-23c3fcc6085d.png" width="300" height="600">

###### Image d'illustration du fragment Share

# Problèmes rencontrés : 
Durant la durée de ce projet, j'ai rencontré énormément de problème.
 * D'abord, mon projet de l'an dernier ne fonctionnait pas. Cela est dû au fait que j'ai changé d'ordinateur portable entre cette année et l'an dernier, et que lors de la réinstallation d'android studio, le SDK utilisé par android studio n'était plus le même que celui de mon projet de l'an dernier. Cela a créer des incompatibilités ( à moins que ce ne soit un bug ?) et il était impossible pour moi de repartir de ce projet là. J'ai donc du repartir de zéro, comme si je commençais un nouveau projet. J'ai également perdu beaucoup de temps à comprendre pourquoi certaines choses qui fonctionnaient avant ne fonctionnaient pas, parce que je voulais reprendre des choses de mon ancien projet autant que faire se peut, sans succès.
 
 * J'ai également eu beaucoup de problèmes d'ordre graphique ( éléments qui se superposent les uns sur les autres, sans raisons, la liste qui ne se met sur la toolbar par exemple, et qui pour une raison que j'ignore rends les fragments complétement inutilisables ) 
 
 * Ensuite, j'ai eu des problèmes avec ma liste Recycler view qui contient les appel API. Les appels API sont correct, seul l'affichage ne se fait pas correctement. Pendant un moment j'ai eu une erreur d'incrémentation de ma liste, et aujourd'hui, malgré qu'Android studio ne me renvoie **aucun** messages d'erreur, la liste affiché est toujours vide, sans que je sache pourquoi. J'ai passé un temps énorme à essayer de résoudre cette erreur, sans réussi à le solutionner pour le moment ( à l'heure ou j'écris le readme, je suis toujours en train de chercher comment je peux résoudre le problème).

* Enfin, j'ai également eu des problèmes d'application qui ne voulait pas se lancer sur mon téléphone ( l'application ne voulait pas s'installer) et je n'avais aucune idée d'ou cela venait, étant donné que je n'ai pas changé de téléphone depuis l'an dernier et que j'avais bien le mode développeur activé. 

# Pistes d'amélioration du programme : 
* Corriger les problèmes de liste qui ne s'incrémente pas et faire en sorte que la liste s'affiche correctement
* afficher les détails d'un objet de la liste quand on clique dessus

