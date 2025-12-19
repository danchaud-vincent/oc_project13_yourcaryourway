# Proof of Concept - Chat en ligne via WebSocket

## Contexte du projet

Ce repository contient un PoC visant à démontrer la faisabilité d'une fonctionnalité de chat en ligne entre un utilisateur et le service client.

L'objectif principal est de valider techniquement le principe d'échange en temps réel, et non de livrer une application complète ou prête pour la production.

## Objectifs du PoC et choix de l'implémentation

### Objectifs

- Valider la faisabilité d'un chat en temps réel.
- Respecter les spécifications techniques.
- Se concentrer uniquement sur la fonctionnalité de chat.

### Choix de l'implémentation

L'implémentation repose sur un code issu du tutoriel suivant :

👉 https://www.youtube.com/watch?v=sBLZcqtqiQo&t=3708s 

Ce choix est volontaire et assumé, pour les raisons suivantes:
- Le but du PoC est de démontrer la faisabilité technique.
- Le tutoriel propose une implémentation simple, claire et fonctionnelle d'un chat en temps réel.
- Cela permet de se concentrer sur la validation de l'architecture et des spécifications techniques de l'application dans les documents **Business Requirements**, **Architecture Definition Document** et **Compliance Assessment**.

### Technologies utilisée

#### WebSocket

WebSocket est un protocole de communication permettant d’établir une connexion persistante et bidirectionnelle entre un client (navigateur web) et un serveur.

Contrairement au modèle HTTP classique :
- HTTP fonctionne par requêtes ponctuelles (request / response)
- WebSocket maintient une connexion ouverte permettant des échanges en temps réel

WebSocket permet une communication instantanée, des échanges bidirectionnels (client <-> serveur).

Dans ce PoC, WebSocket permet :
- À un utilisateur d’envoyer un message
- Au serveur de le transmettre instantanément aux autres participants connectés

## Set up

### Frontend

#### a. Before running the frontend

To use the app, make sure that the backend server is started before starting the frontend.

#### b. Go inside the front folder (from the project root)

```bash
cd frontend
```

#### c. Install dependencies

```bash
npm install
```

#### d. To start a local development server, run:

```bash
npm run start
```

or

```bash
ng serve --open
```

### Back-end

#### a. Go inside the back folder (from the project root)

```bash
cd chatapp
```

#### b. Install dependencies:

```bash
mvn clean install
```

#### c. Launch Back-end:

```bash
mvn spring-boot:run
```







