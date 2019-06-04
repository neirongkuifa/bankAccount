# Bank Account Apis

## Routes

1. POST -- "/addAccount"
2. GET -- "/getAccount"
3. POST -- "/deposit"
4. POST -- "/withdraw"

## Request Body Schema

1. POST -- "/addAccount"

```
{
	"Balance":105.00,
	"CustomerName":"Wen Jiang",
	"EmailAddress":"wenjiang@flexon.com",
	"PhoneNumber":"2137867777"
}
```

2. GET -- "/getAccount?id=\<Acc No.\>"
3. POST -- "/deposit"

```
{
	"id":"1559681921263",
	"amount":300
}
```

4. POST -- "/withdraw"

```
{
	"id":"1559681921263",
	"amount":300
}
```
