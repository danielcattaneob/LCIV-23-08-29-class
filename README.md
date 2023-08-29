# External APIs calls

The proposed exercise is to develop an API with the following spec.

## Endpoints

### Endpoint #1
```
curl --location 'localhost:8080/api/v1/cars/1'
```

this api call should return the following response:

```json
{
  "model": "Gol",
  "brand": "Volkswagen",
  "local_price": 10000
}
```

The data of the car should be fetched from the endpoint:
```https://my-json-server.typicode.com/danielcattaneob/fake-apis/cars/{car_id}```

The local_price field should be in ARS acording to the exchange rate published in the
endpoint:

```https://my-json-server.typicode.com/danielcattaneob/fake-apis/exchange_rates```

-----

### Endpoint #2


```curl
curl --location 'localhost:8080/api/v1/cars/historic/1?date=2023-08-01'
```

this api call should return the following response:

```json
{
  "model": "Gol",
  "brand": "Volkswagen",
  "local_price": 10000
}
```

The historic exchange rate should be fetched from the endpoint:
```https://my-json-server.typicode.com/danielcattaneob/fake-apis/historical_exchange_rates?date={date}```

where the field ```date``` is in the format ```yyyy-mm-dd```
