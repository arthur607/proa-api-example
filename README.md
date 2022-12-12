usar postman ou front-end para reqs.

funcionalidades de cadastro e login como exemplo.

executar curls de exemplo:   

curl de cadastro:
curl --location --request POST 'http://localhost:8080/user/signup' \
--header 'Content-Type: application/json' \
--data-raw '{
"nome": "arthur",
"password": "12345",
"matchingPassword": "12345",
"email": "email@email.com"
}'


curl de login :

curl --location --request POST 'http://localhost:8080/user/login' \
--header 'Content-Type: application/json' \
--data-raw '{
"password": "12345",
"email": "email@email.com"
}'
