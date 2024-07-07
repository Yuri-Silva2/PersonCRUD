# CRUD
This repository contains a simple CRUD project built using Java Spring. The purpose of this repository is to practice CRUD methods using Java Spring.

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Database](#database)

## Installation

1. Clone the repository:

```bash
  git clone https://github.com/Yuri-Silva2/UserRegistrationCRUD.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## Database
The project uses PostgresSQL as the database.

To install PostgresSQL locally you can [click here](https://www.postgresql.org/download/).

## API Endpoints
The API provides the following endpoints:

```markdown
GET /person - Retrieve a list of all data.

POST /person - Register a new data.

PUT /person - Alter data.

DELETE /person/{id} - Inactivate data.
```
