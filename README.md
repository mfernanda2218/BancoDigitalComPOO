### 📘 **Sistema Bancário em Java - simulação mais avançada**

Este projeto tem por objetivo simular a criação, acesso e manipulação em contas bancárias (via terminal).

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
* A **busca de contas por número** (pra realização de transferências)
* A **listagem de contas ativas**

#### 📌 Requisitos obrigatórios:

1. **Criar uma classe abstrata `Conta`**, que contenha os atributos e comportamentos comuns a todos os tipos de conta.
2. **Implementar duas subclasses**: `ContaCorrente` e `ContaPoupanca`, herdando da classe `Conta`.
3. Criar a classe `Banco`, responsável por manter uma lista de contas e permitir operações de cadastro e busca.
4. **Implementar as operações** de depósito, saque e transferência.
5. **Registrar um histórico de transações** (como: "Depósito de R\$ 500", "Transferência para conta 102 - R\$ 150").
6. Utilizar **exceções personalizadas** para saques e transferências com saldo insuficiente.
7. Adicionar um **gerador automático de número de conta** e um **gerador de número de agência**.

#### ✨ Requisitos adicionais que foram implementados:

* Interface `InterfaceConta`, contendo a definição dos métodos `depositar`, `sacar`, `transferir`, e `imprimirExtrato`.
* Menu de texto no console para interagir com o sistema.
* Permitir que o usuário consulte o **extrato** (histórico) da conta.

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

###### Projeto criado apenas utilizando a linguagem Java e conceitos básicos de POO e tratamento de exceções