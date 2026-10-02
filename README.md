# SINAN Web I - API de Notificações

Este repositório contém a implementação de uma **API REST** para o gerenciamento de casos notificados, baseada no formulário de **Ficha de Notificação/Conclusão** do **SINAN** (Ministério da Saúde).

O projeto foi desenvolvido como requisito de avaliação prática da disciplina de **Programação para a Web I**, no 4º período do curso de **Análise e Desenvolvimento de Sistemas** (IFPB - Campus Cajazeiras), ministrada pelo professor **Renê Douglas Nobre de Morais**.

> 🔗 **Requisitos Originais da Atividade:** [Clique aqui para ler no Gist do GitHub](https://gist.githubusercontent.com/ReneDouglas/2101d2e7346dbfe09468faa0d7a97874/raw/33481bf88c5496a444b3b441d280d6f62f3000a6/atividade-pratica.md)

## 👥 Desenvolvido por
- [Francisco Sãmily]

---

## 🚀 Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3** (Spring Web, Spring Data JPA)
- **PostgreSQL**
- **Docker e Docker Compose** (Containerização da API e do banco de dados)

---

## ⚙️ Como Configurar e Executar via Docker

O projeto já está 100% containerizado com Docker Compose! Não é necessário ter o Java ou o Maven instalados localmente, a própria imagem do Docker fará o build do código e provisionará a aplicação.

### 1. Configurando as Variáveis de Ambiente (`.env`)
Antes de iniciar, o projeto precisa de um arquivo `.env` na raiz para configurar o banco de dados. Exemplo de como deve ficar o `.env`:
```env
# Imagem e Banco
DB_NAME=sinan_db
DB_USER=postgres
DB_PASSWORD=postgres

# Conexão JDBC e Hibernate
URL_DB=jdbc:postgresql://postgres:5432/sinan_db
DDL_AUTO=update
```

### 2. Subindo a Aplicação
Com o Docker instalado na sua máquina e o arquivo `.env` criado, rode:
```bash
docker compose up -d --build
```
Isso vai compilar a API, iniciar o PostgreSQL e deixar a nossa API disponível na porta `8080`.
Você pode acessar a API no endereço: `http://localhost:8080/notificacao`

---

## 📌 Exemplos de Uso da API (CRUD)

Aqui estão alguns exemplos para te ajudar a testar os endpoints:

### 1. Cadastrar uma Nova Notificação (POST)
**Endpoint:** `POST /notificacao`

**Body (JSON):**
```json
{
  "type": "INDIVIDUAL",
  "agravo": "Dengue",
  "cid": "A90",
  "notificationDate": "2026-10-02",
  "federativeUnit": "PB",
  "municipe": "Cajazeiras",
  "ibgeCode": 2503704,
  "notificationSource": "Hospital X",
  "symptomStartDate": "2026-09-30",
  "fullName": "Maria da Silva",
  "birthDate": "1990-05-10",
  "ageUnit": "YEARS",
  "ageValue": 36,
  "gender": "F",
  "pregnancyStatus": "NON_PREGNANT",
  "raceOrColor": "PARDA",
  "schoolLevels": "HIGH_SCHOOL_COMPLETE",
  "susCardNumber": "123456789012345",
  "motherName": "Ana da Silva",
  "ufResidencia": "PB",
  "residenceMunicipe": "Cajazeiras",
  "residenceIbgeCode": 2503704,
  "district": "Centro",
  "neighborhood": "Centro",
  "street": "Rua A",
  "houseNumber": "123",
  "cep": "58900-000",
  "phoneNumber": "83999999999",
  "zone": "URBAN",
  "country": "Brasil"
}
```

### 2. Consultar Notificações (GET)
Você pode listar todas ou passar os filtros disponíveis como *Query Params*.

**Endpoints:**
- `GET /notificacao` *(Retorna todas)*
- `GET /notificacao?agravo=Dengue` *(Busca por doença)*
- `GET /notificacao?paciente=Maria` *(Busca pacientes por nome)*
- `GET /notificacao?duplicadas=true` *(Retorna apenas notificações duplicadas - RN01)*

Você pode inclusive combinar os filtros:
`GET /notificacao?duplicadas=true&agravo=Dengue`

### 3. Atualizar uma Notificação Existente (PUT)
**Endpoint:** `PUT /notificacao/{id}`

Substitua `{id}` pelo código gerado na criação e envie o payload JSON com os dados modificados no mesmo formato utilizado no `POST`.

### 4. Excluir uma Notificação (DELETE)
**Endpoint:** `DELETE /notificacao/{id}`

Deleta o registro e retorna HTTP `204 No Content`.

---

## 🔒 Regras de Negócio e Validações

Além do CRUD básico, a API valida e implementa lógicas mais avançadas exigidas:

- **RN01 - Filtro de Duplicidade:** (Listado no `GET /notificacao?duplicadas=true`) Confere se existe notificação com o mesmo agravo, paciente, mesma data de nascimento, mesma mãe e uma notificação em data com limite de até 3 dias de diferença.
- **RN02 - Validações Idade/Gestação:** Garante que a idade seja providenciada se a data de nascimento for ocultada e exige a gestação caso a paciente seja mulher.
- **RN03 - Obrigação de Residência:** A API exige o Município e a UF caso seja no Brasil, mas exige explicitamente o País caso more fora.
- **Erros Padronizados:** Caso as validações sejam descumpridas, a API utiliza o **Problem Details** ([RFC 9457](https://www.rfc-editor.org/rfc/rfc9457)) para devolver uma mensagem de erro semântica e autoexplicativa.
