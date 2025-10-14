# AppLogin - Sistema de Autenticação para Atacadão

Este projeto é uma aplicação Android simples para autenticação de usuários, desenvolvida com o intuito de gerenciar o login e o cadastro de usuários em um banco de dados SQLite local. O sistema permite que o usuário se registre e, em seguida, faça login para acessar funcionalidades do sistema.

## Funcionalidades

- **Tela Inicial:** Tela de boas-vindas com opções para acessar a tela de login ou cadastro.
- **Cadastro de Usuário:** Permite que um usuário se registre informando nome, login e senha. A senha é validada para garantir que ambas as entradas correspondam.
- **Login:** Permite que o usuário insira seu login e senha para autenticar e acessar o sistema.

## Estrutura do Projeto

### Classes Java

1. **MainActivity.java**: Tela inicial do aplicativo com dois botões, um para login e outro para cadastro.
2. **DBHelper.java**: Classe responsável pela criação do banco de dados SQLite, com as operações de inserção e validação de usuário.
3. **RegistrarActivity.java**: Tela de cadastro do usuário, onde o usuário pode criar uma conta.
4. **LoginActivity.java**: Tela de login, onde o usuário autentica-se com suas credenciais.

### Layouts

1. **activity_main.xml**: Layout para a tela inicial.
2. **activity_registrar.xml**: Layout para o cadastro de novos usuários.
3. **activity_login.xml**: Layout para a tela de login.

## Dependências

O projeto usa o banco de dados **SQLite** embutido no Android. Não há outras dependências externas.

## Como Usar

1. **Clone o repositório:**

```bash
git clone https://github.com/Bruno7Martinho/AppLogin.git
