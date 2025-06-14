# Exercicios_Dio
# Desafios de Código - Bootcamp TONNIE - Java and AI in Europe

Este repositório contém as soluções para os desafios de código propostos durante o Bootcamp "TONNIE - Java and AI in Europe". Cada desafio aborda conceitos fundamentais da linguagem Java, com foco em estruturas condicionais e tratamento de entrada.

---

## 💻 Desafio 1: Validação de E-mail Corporativo

### Descrição
Sua empresa exige que todos os funcionários utilizem e-mails corporativos com o domínio `@company.com`. Este programa valida se o e-mail informado pelo usuário corresponde ao domínio correto. Caso não tenha o domínio correto, o sistema indica que o domínio não é válido.

### Entrada
Um e-mail no formato `nome@domínio`.

### Saída
Retorna "E-mail valido" se o domínio for `@company.com`, caso contrário, retorna "E-mail invalido".

### Exemplos
| Entrada                     | Saída           |
| :-------------------------- | :-------------- |
| `joao.silva@company.com`    | `E-mail valido` |
| `maria.silva@exemplo.com`   | `E-mail invalido` |
| `pedro.almeida@company.com` | `E-mail valido` |

## 🌡️ Desafio 2: Conversor de Temperatura (Celsius para Fahrenheit)

### Descrição
Você está criando um utilitário interno que ajuda a converter temperaturas de Celsius para Fahrenheit. Este programa realiza a conversão e trata entradas inválidas, como valores abaixo do zero absoluto (`-273.15 °C`) ou entradas não numéricas.

### Entrada
Um número decimal representando graus Celsius.

### Saída
A temperatura convertida para Fahrenheit com uma casa decimal.  
Em caso de erro, retorna `"Entrada invalida"`.

### Exemplos
| Entrada   | Saída             |
| :-------- | :---------------- |
| `25.0`    | `77.0`            |
| `-300.0`  | `Entrada invalida`|
| `abc`     | `Entrada invalida`|

## 📚 Estrutura do Projeto e Tópicos Estudados

Durante os estudos, abordamos os seguintes conceitos fundamentais da linguagem Java:

### 🔁 estruturasCondicionais
Nesta seção, exploramos as principais estruturas de controle de fluxo utilizadas em Java para tomada de decisão e repetição:

- **For**  
  Estrutura de repetição que permite executar um bloco de código um número determinado de vezes. Muito utilizada para percorrer arrays e coleções.

- **IfElse**  
  Estrutura condicional que avalia uma expressão booleana, executando diferentes blocos de código dependendo se a condição é verdadeira ou falsa.

- **SwitchCase**  
  Alternativa ao `if-else` quando se tem múltiplas condições baseadas em um mesmo valor. Torna o código mais limpo e organizado em certos casos.

### 🧪 Exercicios_Dio
Nesta pasta foram desenvolvidos exercícios práticos com base nos conteúdos estudados:

- **Exercicio01**  
  Validação de e-mails corporativos, verificando se um endereço informado possui o domínio `@company.com`.

- **Exercicio02**  
  Conversão de temperaturas de Celsius para Fahrenheit com tratamento de exceções e valores inválidos.

### 🔢 tiposPrimitivos
Conceitos fundamentais relacionados aos tipos de dados básicos da linguagem Java:

- **OperadoresLogicos**  
  Aplicação de operadores lógicos (`&&`, `||`, `!`) em expressões booleanas para tomada de decisão, geralmente combinando condições em estruturas `if` e `while`.
