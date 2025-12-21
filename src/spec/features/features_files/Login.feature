@login
Feature: je souhaite tester la page de connexion a l application swag labs
ETQ utilisateur je souhaite tester la page de connexion a l application swag labs

@loginCasPasssant
Scenario: je souhaite tester la page connexion avec un cas passant
Given je me connecte sur l application swag labs
Then je me redirige vers la page products "Products"

@loginCasNonPasssant
Scenario: je souhaite tester la page connexion avec un cas no passant
Given je me connecte sur l application swag labs avec coordonnées incorrects
Then un message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"