# webAss1

Простое Spring Boot приложение, упакованное в Docker.

## Запуск через Docker

Собрать образ:

```bash
docker build -t webass1 .
```

Запустить контейнер:

```bash
docker run -p 8080:8080 webass1
```

Приложение будет доступно на `http://localhost:8080`.

## Эндпойнты

### `GET /`

Открыть в браузере [http://localhost:8080](http://localhost:8080) или через curl:

```bash
curl http://localhost:8080/
```

### `GET /random`

Возвращает случайную строку заданной длины. Длина передаётся в заголовке `length`:

```bash
curl http://localhost:8080/random -H "length: 10"
```
