# Library

Link do aplikacji wdrożonej na heroku. https://library-app2.herokuapp.com/

Uwagi:
Pierwsze uruchomienie od kilkunastu minut może trwać 30 sek. Logowanie działa dopiero za drugim wprowadzeniem poprawnych danych



Wykorzystano:
- Spring Boot
- Maven
- Thymeleaf
- Spring Security

Spring Security dzieli serwis na część dostępna dla użytkowników niezalogowanych i zalogowanych.

Dla niezalogowanych dostępny jest login oraz rejestracja (wraz z walidacją danych).


![login](https://iili.io/HPk5iX.png)
![login-error](https://iili.io/HPkAxI.png)
![rejestracja](https://iili.io/HPkals.png)
![rejestracja-error](https://iili.io/HPkYfn.png)

Dla zalogowanych dostępne są opcje 
- wyświetlenia listy produktów
- dodania książki
- edycja książki z listy
- usunięcie książki z listy

![lista](https://iili.io/HPkTDN.png)
![dodaj](https://iili.io/HPkCla.png)
![dodaj-error](https://iili.io/HPkxHv.png)
![edycja](https://iili.io/HPkzRR.png)
