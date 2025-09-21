# MOBILE-Caça-ao-tesouro

Claro! Aqui está um exemplo de README baseado no texto que você forneceu:

---

# Caça ao Tesouro - Aplicativo Android com Jetpack Compose

## Descrição

Este projeto consiste em um aplicativo simples onde o usuário navega por diferentes telas para encontrar um **tesouro escondido**. Em cada tela, uma pista é apresentada e o usuário deve descobrir a resposta correta para avançar para a próxima pista, até chegar ao tesouro.

---

## Funcionalidades

### Telas

* **Tela inicial / Home**

  * Apresenta um botão **"Iniciar caça ao tesouro"** para começar o jogo.

* **Telas de pista** (mínimo 3 telas)

  * Exibe uma pista para o usuário, como uma charada ou pergunta simples.
  * Contém dois botões:

    * **"Próxima Pista"**: leva para a próxima pista.
    * **"Voltar"**: retorna para a pista anterior.

* **Tela de Tesouro (TreasureScreen)**

  * Exibe a mensagem de sucesso: **"Parabéns! Você encontrou o tesouro!"**
  * Contém um botão para voltar à tela inicial e reiniciar a caça.

---

## Instruções Técnicas

* Utilização do **Android Jetpack Compose** para criação das interfaces das telas.
* Implementação da navegação entre telas utilizando o componente **NavHost** e **NavController** do Jetpack Compose Navigation.
* Teste do comportamento da pilha de telas para garantir navegação adequada.

---

## Funcionalidades Extras (opcionais)

* Animações de transição entre telas para melhorar a experiência do usuário.
* Função para rastrear o tempo total que o usuário leva para encontrar o tesouro, exibindo este tempo na tela final.
* Campo de texto na tela de pista para o usuário digitar a resposta. O botão "Próxima Pista" só é habilitado se a resposta estiver correta.

---

## Como executar

1. Abra o projeto em uma IDE compatível com Android (ex: Android Studio).
2. Compile e execute o aplicativo em um emulador ou dispositivo físico.
3. Navegue pelas pistas e tente encontrar o tesouro!

---

Se precisar de ajuda ou quiser contribuir, fique à vontade para abrir issues ou pull requests.

---

Quer que eu crie uma versão mais detalhada, com instruções de código?

