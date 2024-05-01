# Desafio de Estágio - RPE
Esta é a minha solução para o desafio do processo seletivo para a vaga de estagiário na RPE.

# Descrição
Foi desenvolvida uma API utilizando Java Spring Boot com banco de dados H2 e documentação Swagger. O objetivo do projeto foi implementar funcionalidades CRUD para cadastro de Veículos de Carga e Veículos de Passeio, cada um com seus respectivos atributos.

# Execução
Após executar a classe ApiApplication.java, você poderá acessar a API através da URL:

http://localhost:8080/api/veiculos

A documentação gerada pelo Swagger pode ser encontrada em:

http://localhost:8080/swagger-ui/index.html
# Testes
A ferramenta Postman (https://www.postman.com/) foi usada para testar as funcionalidades CRUD da API. Aqui está um exemplo de como adicionar um veículo de passeio usando o Postman ou outra ferramenta:

Endpoint: 'POST http://localhost:8080/api/veiculos/passeio'

Corpo da Solicitação (JSON):
```
{
    "placa": "ABC-1234",
    "nome": "Veículo X",
    "marca": "Marca X",
    "numeroPassageiros": 5
}
```
