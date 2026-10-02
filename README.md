# SINAN Web I - API de Notificações

**Atividade Prática com Spring Boot**

**Ministério da Educação**  
**Instituto Federal de Educação, Ciência e Tecnologia da Paraíba — Campus Cajazeiras**  

| | |
|---|---|
| **Curso** | Análise e Desenvolvimento de Sistemas |
| **Disciplina** | Programação para a Web I |
| **Período** | 4º |
| **Professor** | Renê Douglas Nobre de Morais |

## 👥 Integrantes da Equipe
- [Seu Nome / Nome da Dupla]
- [Nome do Colega (se houver)]

## 🚀 Como Executar o Projeto

Certifique-se de ter o Docker e o Java (JDK 21) instalados.

1. Clone o repositório:
   ```bash
   git clone https://github.com/sami-403/sinan-web-i.git
   cd sinan-web-i
   ```

2. O projeto utiliza Docker Compose para subir o banco de dados PostgreSQL automaticamente. Para executar a aplicação Spring Boot, utilize o wrapper do Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

3. A API estará disponível na porta padrão: `http://localhost:8080`.

---

## 1. Objetivo

Com base no formulário de [Ficha de Notificação/Conclusão](http://portalsinan.saude.gov.br/images/documentos/Agravos/NINDIV/Ficha_conclusao_v5.pdf) do [SINAN](https://portalsinan.saude.gov.br/notificacoes) / Ministério da Saúde, desenvolvemos uma **API REST** com todas as operações **CRUD** necessárias para o gerenciamento de casos notificados.

A API foi projetada para ser consumida por um front-end em **HTML/CSS/JS puro**, sem frameworks e bibliotecas front-end.

## 2. Especificações da API

### 2.1 Boas práticas REST
A API obedece às seguintes práticas:
- Uso coerente dos **verbos HTTP** (GET, POST, PUT, DELETE);
- Uso de **status HTTP** apropriados (200, 201, 204, 400, etc).

### 2.2 Padrão de resposta de erros
- A API REST utiliza o padrão **Problem Detail** ([RFC 9457](https://www.rfc-editor.org/rfc/rfc9457)) nas respostas de erro, através do tratamento centralizado de exceções (`GlobalExceptionHandler`).

## 3. Consultas e Filtros

A consulta principal suporta os seguintes parâmetros via Query Params:
```http
GET /notificacao?[campos de filtros]
```

### 3.1 Filtros disponíveis
- `agravo`: Filtra pelo nome da doença/agravo.
- `paciente`: Filtra pelo nome do paciente.
- `duplicadas`: Filtra notificações que sejam potenciais casos duplicados (veja as regras de negócio).

## 4. Regras de Negócio Implementadas

### 4.1 RN01: Verificação de duplicidade de notificações
O sistema é capaz de **listar notificações possivelmente duplicadas**. Duas notificações são consideradas duplicadas quando atendem, **ao mesmo tempo**, aos critérios abaixo:
1. **Agravo/doença**: Mesmo valor
2. **Nome do paciente**: Mesmo valor
3. **Data de nascimento**: Mesma data
4. **Nome da mãe**: Mesmo valor
5. **Data da notificação**: Diferença de **até 3 dias** (inclusive) entre as duas notificações

A funcionalidade é acionada através da requisição com a flag:
```http
GET /notificacao?duplicadas=true
```

### 4.2 RN02: Obrigatoriedade condicional de idade e gestante
A validação impede o cadastro caso:
- A idade não seja informada quando a data de nascimento estiver ausente.
- O status gestacional não seja informado para pacientes do sexo feminino.

### 4.3 RN03: Residência
Validação condicional para os dados de residência:
- **UF de residência:** obrigatória quando o paciente reside no Brasil.
- **Município de residência:** obrigatório quando a UF é informada.
- **País de residência:** obrigatório quando o paciente reside em outro país.
