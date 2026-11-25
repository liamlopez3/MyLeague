# MyLeague ⚽

Android app to explore football leagues: standings, teams and your favourite clubs.

Final project for **Plataformas Software Móviles (PSM)**, Ingeniería Informática, Universidad de Valladolid (Segovia).

## Features

- [x] Navigation between three screens with a top app bar and back button
- [ ] Competitions list (LaLiga, Premier League, Champions League...)
- [ ] League standings with search
- [ ] Team details with squad
- [ ] Favourite teams with a personal note (Room database)

## Tech stack

- Kotlin + Jetpack Compose (Material 3)
- MVVM architecture with a Repository
- Navigation Compose
- Retrofit + Gson for the REST API
- Coil for loading team crests
- Room for local storage (planned)

## API

Data comes from [football-data.org](https://www.football-data.org/) (free plan).

Football data provided by the Football-Data.org API.

## Setup

The API token is **not** included in this repository. To run the app:

1. Create a free account at [football-data.org](https://www.football-data.org/client/register) and get your API token by email.
2. Open the project in Android Studio.
3. Add this line to the `local.properties` file in the project root (this file is not uploaded to GitHub):

   ```
   FOOTBALL_API_KEY=your_token_here
   ```

4. Sync Gradle and run the app.

## Liam López

[liamlopez3](https://github.com/liamlopez3)