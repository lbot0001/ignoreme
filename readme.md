# ignoreME

Java, spring boot API to register and share .gitignore from any technology

## Installation

Clone the git repo and import in your favorite IDE

```bash
git clone https://github.com/lbot0001/ignoreme.git
```

## Usage
Add technology .gitignore data
```java
curl --location 'localhost:8080/document/add' \
--header 'Content-Type: application/json' \
--data '{
    "text":"/src\n*.java",
    "technology":"java"
}'
```

Retrieve .gitignore data
```java
curl --location 'http://localhost:8080/ignore/me/java'
```

## Technology Stack

- Java 17
- SpringBoot
- Mapstruct
- H2 db
- Spring Data JPA
- Ports and Adapters/Hexagonal Arch

## TODOs

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)