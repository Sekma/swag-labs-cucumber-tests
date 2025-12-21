@AboutLogout
Feature: je souhaite tester les boutons about et logout dans l application swag labs
ETQ utilisateur je souhaite tester les boutons about et logout dans l application swag labs

Background:
Given je me connecte sur l application swag labs
When je clique sur le menu burger

@testAbout
Scenario: je souhaite tester le bouton about

When je clique sur le bouton about
Then je me redirige vers la page about

@testLogout
Scenario: je souhaite tester le bouton logout

When je clique sur le bouton logout
Then je me redirige vers la page de connexion