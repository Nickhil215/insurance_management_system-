
# Insurance Management System

Spring Boot,Java,Rest-API, MySQL, Maven, Hibernate, Oops, Jdbc 

• This is Spring boot backend Application Application where we can Add clients, Add policies, Generate claim's, update details and has 12 Other APIs’s

• Used Spring boot framework,Jpa hibernate ,MySQL DB, Maven, Postman/Swagger

• In this project I learn about Spring boot, Hibernate, different layers of APIs, MySQL connection ,DB designing

## Features

- ADD CLIENTS 
- GENERATE POLICIES' 
- CREATE CLAIMS 
- UPDATE CLIENTS
- UPDATE POLICIES
- UPDATE CLAIMS
- GET-INFO OF CLIENTS
- GET-INFO OF CLAIMS
- GET-INFO OF POLICIES
- DELETE CLIENTS
- DELETE CLAIMS
- DELETE POLICIES
- MORE



## API Reference


#### ADD CLIENTS 
```http
http://localhost:9790/Client/create
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Client DTO`      | `String`    | successfully added |



#### ADD NEW POLICIES' 
```http
http://localhost:9790/policie/createPolicie
```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `policieDTO`      | `String`    | We can add new POLICIES |


#### GENERATE NEW CLAIMS' 
```http
http://localhost:9790/claim/create
```

| Request Parameter | OutPut     | Description            |
| :-------- | :------- | :-------------------------------- |
| `claimDTO`      | `String`    | We can add new CLAIMS |


#### Get CLIENTS

```http
  http://localhost:9790/Client/get?Id=1
```

| Request Parameter | OutPut     | Description                |
| :-------- | :------- | :------------------------- |
| `int ID` | `CLIENTS RESULT DTO` | here we can get Client details |


#### Get CLAIMS

```http
http://localhost:9790/claim/getinfo?Id=9
```

| Request Parameter | OutPut     | Description                |
| :-------- | :------- | :------------------------- |
| `int ID` | `CLAIMS RESULT DTO` | here we can get claim details |

#### Get POLICIES

```http
http://localhost:9790/policie/getPolicie?Id=9
```

| Request Parameter | OutPut     | Description                |
| :-------- | :------- | :------------------------- |
| `int ID` | `POLICIES RESULT DTO` | here we can get policie details |



#### Get All Clients

```http
 http://localhost:9790/Client/getAll
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `api key`      | `List<CLIENTSDTO> list`    | Here we get all the details of CLIENTS |


#### Get All claims

```http
 http://localhost:9790/Client/getAll
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `api key`      | `List<CLAIMSDTO> list`    | Here we get all the details of CLAIMS |

#### Get All policies

```http
http://localhost:9790/policie/getAllPolicies
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `api key`      | `List<POLICIESDTO> list`    | Here we get all the details of POLICIES |



#### Update Client details

```http
 http://localhost:9790/Client/Update
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `ClientUpdateDTO`      | `String`    | Here we can Update details of Clients |



#### Update claim details

```http
 http://localhost:9790/Claim/Update
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `ClaimUpdateDTO`      | `String`    | Here we can Update details of claims |


#### Update policie details

```http
 http://localhost:9790/Policie/Update
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `PolicieUpdateDTO`      | `String`    | Here we can Update details of Clients |



#### Delete Client details

```http
http://localhost:9790/Client/delete?Id=099
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `int id`      | `String`    | Here we can Delete details of Clients |

#### Delete claim details

```http
http://localhost:9790/claim/delect?Id=77
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `int id`      | `String`    | Here we can Delete details of claims |


#### Delete policie details

```http
http://localhost:9790/policie/delect?Id=77
```

| Request Parameter | OutPut     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `int id`      | `String`    | Here we can Delete details of policies |




## Screenshots
![DATA TRANSFER OBJECTS ](https://user-images.githubusercontent.com/105160327/230398798-2392ae0f-51dd-4625-b6d4-c46570f6da62.png)

These DTOs (Data Transfer Objects) are necessary for transferring data from input to the Repository (Database).

![policie](https://user-images.githubusercontent.com/105160327/230399242-551f90de-23f7-45a1-b70f-7f109b2d320b.png)

Here, policies can be controlled and all CRUD operations can be performed on them.

![claims](https://user-images.githubusercontent.com/105160327/230399784-368c78ae-13b5-4655-a2b0-20cca3a1a226.png)

Here, claims can be controlled and all CRUD operations can be performed on them.

![clients](https://user-images.githubusercontent.com/105160327/230400039-94dedb84-2eb8-42b0-be05-6cb97a08440e.png)

Here, clients can be controlled and all CRUD operations can be performed on them.

![create police](https://user-images.githubusercontent.com/105160327/230400454-fe69c2f9-3684-4c74-b366-4bb12be24c4b.png)

With this API, it is possible to create a new policy by providing all the necessary details.

![generate new claim](https://user-images.githubusercontent.com/105160327/230401323-fc4f3158-17ac-47a6-b7de-826d4671eeee.png)

With this API, it is possible to create a new claim by providing all the necessary details.

![create client](https://user-images.githubusercontent.com/105160327/230401933-040b4ed9-044c-4e9d-a2fe-9928d952f58e.png)

With this API, it is possible to create a new clients by providing all the necessary details.

![get policie](https://user-images.githubusercontent.com/105160327/230402242-d736a28e-3a40-40a9-89ac-2256ff7fe2d7.png)

By utilizing this API, we can obtain complete policies information by sending a request to it.

![get claim](https://user-images.githubusercontent.com/105160327/230402631-6a6cc393-6671-4f46-86f9-c85ed1ae4132.png)

By utilizing this API, we can obtain complete claims information by sending a request to it.

![get client](https://user-images.githubusercontent.com/105160327/230402872-f8a44c4a-f480-4858-8ff7-5acef5da42e9.png)

By utilizing this API, we can obtain complete client information by sending a request to it.

![get all policies](https://user-images.githubusercontent.com/105160327/230403203-7b8b22c5-63b0-4248-801e-82db88c46a2e.png)

By utilizing this API, we can obtain complete All clients information by sending a request to it.


![get all claims](https://user-images.githubusercontent.com/105160327/230404650-ca3eddb9-a3a9-4474-b7a9-aa7a13242b0f.png)

By utilizing this API, we can obtain complete All claims information by sending a request to it.


![get all clients ](https://user-images.githubusercontent.com/105160327/230404918-d259aff9-be38-482d-8bf6-4803f836722d.png)

By utilizing this API, we can obtain complete All clients information by sending a request to it.

![update policie](https://user-images.githubusercontent.com/105160327/230405249-903408ef-4714-404f-9337-732517788b0d.png)
 

The update policies information API allows users to modify the details of an existing policy. This API requires the user to provide the policy ID of the policy they wish to update, along with the updated information they want to include. The API can be used to update various aspects of the policy such as its name, description, coverage limits, deductibles, and more.

![update claim](https://user-images.githubusercontent.com/105160327/230405894-da3650fb-df72-4572-9161-5da82d547938.png)

The update claim information API is a web service that allows authorized users to modify or update information related to a claim. This API enables insurance companies or any organization that handles insurance claims to keep their claim records accurate and up-to-date.

Using this API, users can update various aspects of a claim, such as claimant information, accident or incident details, claim amount, and status. The API provides a secure way to make changes to the claim information by requiring authentication and authorization before allowing any updates.


![update client](https://user-images.githubusercontent.com/105160327/230406847-b24c5a39-04c6-4936-88ef-550e2b21dae2.png)

The "update client information" API is a service that allows updating client details. This API can be used by businesses or organizations that store client information in their database and need to keep it up-to-date. By using this API, clients can easily update their information without having to go through the cumbersome process of contacting the business directly. Additionally, the API can be integrated into existing client management systems, making it easy to automate the process of updating client information. Overall, the "update client information" API provides a simple and efficient way to manage client information, improving the customer experience and streamlining business operations.


![cmd](https://user-images.githubusercontent.com/105160327/230408508-f2a44a51-5be0-4b74-9d85-c6a5d1808303.png)

