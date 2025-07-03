### 📘 **Enunciado Aprimorado do Desafio – Sistema Bancário Orientado a Objetos em Java**

Você foi contratada como desenvolvedora para implementar um **sistema bancário simplificado**, que simule o funcionamento básico de um banco digital. O objetivo é aplicar conceitos de **Programação Orientada a Objetos (POO)**, como **herança, encapsulamento, polimorfismo, abstração e boas práticas de projeto**.

#### 🏦 Cenário:

Um banco digital oferece aos seus clientes dois tipos principais de contas:

* **Conta Corrente**
* **Conta Poupança**

Cada conta possui:

* Número da conta
* Nome do titular
* Saldo
* Histórico de transações realizadas

As operações disponíveis para ambas as contas são:

* **Depósito**
* **Saque**
* **Transferência** entre contas da mesma instituição

Além disso, o sistema bancário deve gerenciar:

* Um **cadastro de contas**
* A **busca de contas por número**
* A **listagem de contas ativas**

#### 📌 Requisitos obrigatórios:

1. **Criar uma classe abstrata `Conta`**, que contenha os atributos e comportamentos comuns a todos os tipos de conta.
2. **Implementar duas subclasses**: `ContaCorrente` e `ContaPoupanca`, herdando da classe `Conta`.
3. Criar a classe `Banco`, responsável por manter uma lista de contas e permitir operações de cadastro e busca.
4. **Implementar as operações** de depósito, saque e transferência.
5. **Registrar um histórico de transações** (como: "Depósito de R\$ 500", "Transferência para conta 102 - R\$ 150").
6. Utilizar **exceções personalizadas** para saques e transferências com saldo insuficiente.
7. (Opcional) Adicionar um **gerador automático de número de conta**.

#### ✨ Requisitos adicionais (para quem desejar ir além):

* Criar uma interface `OperacoesBancarias`, contendo a definição dos métodos `depositar`, `sacar`, e `transferir`.
* Substituir o tipo `double` por `BigDecimal` para representar valores monetários.
* Implementar um menu de texto no console para interagir com o sistema.
* Permitir que o usuário consulte o **extrato** (histórico) da conta.
* Aplicar princípios do **SOLID** sempre que possível.

#### 🧪 Exemplo de cenário de uso:

```text
1. O banco é criado com o nome "Banco Java".
2. Um cliente chamado João abre uma conta corrente.
3. João deposita R$ 1000 em sua conta.
4. Maria abre uma conta poupança.
5. João transfere R$ 200 para Maria.
6. Maria realiza um saque de R$ 100.
7. Ambos os clientes visualizam o extrato com o histórico de suas transações.
```

---

### 📋 Entrega esperada

* Código-fonte organizado em classes.
* Comentários explicativos sobre as decisões de projeto.
* Demonstração do uso em uma classe `Main`.

---

Se quiser, posso montar uma estrutura inicial com os arquivos e nomes de classes/métodos sugeridos para te ajudar a começar. Deseja isso?
