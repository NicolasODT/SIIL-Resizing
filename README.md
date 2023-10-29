# ImageResizer

ImageResizer est un utilitaire Java conçu dans le cadre du projet "Système d'Identification Intelligent de Légumes (SIIL)". Il utilise la bibliothèque OpenCV pour redimensionner des images à une taille uniforme de 512x512 pixels, ce qui est optimal pour le modèle de machine learning développé pour la détection des concombres. Si une image n'est pas carrée, elle sera d'abord mise en forme avec une bordure pour la rendre carrée avant d'être redimensionnée.

## Contexte

Ce programme a été créé spécifiquement pour le projet SIIL afin de préparer les images de concombres pour un prototype de détection. Le redimensionnement à 512x512 pixels permet d'obtenir une taille optimale pour le modèle de machine learning utilisé.

## Prérequis

- Java
- OpenCV (Java bindings)

## Utilisation

1. Mettez à jour les variables `inputDir` et `outputDir` dans le code avec les chemins appropriés.
2. Compilez et exécutez le programme.

## Fonctionnalités

- **Chargement d'Images** : Charge les images depuis un dossier spécifié.
- **Traitement d'Image** : Si l'image n'est pas carrée, elle est mise en forme avec une bordure pour la rendre carrée.
- **Redimensionnement** : Redimensionne l'image pour avoir une taille de 512x512 pixels.
- **Sauvegarde** : Sauvegarde l'image redimensionnée dans un dossier spécifié.
