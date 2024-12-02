**Menu de Configuração com Padrão Singleton**

Este projeto implementa um Menu de Configuração para um jogo utilizando o padrão de projeto Singleton, garantindo que apenas uma instância das configurações seja criada e acessada em todo o ciclo de vida do programa. O menu permite que o usuário altere as configurações do jogo de maneira simples e intuitiva.

**Funcionalidades do Menu**

**O menu de configuração oferece as seguintes opções:**

- Alterar Dificuldade: O usuário pode escolher entre três níveis de dificuldade: Fácil, Médio e Difícil.
- Alterar Efeitos Sonoros: O som do jogo pode ser ativado ou desativado, permitindo uma experiência personalizada para o jogador.
- Alterar Modo de Jogo: O jogador pode alternar entre os modos Dia e Noite, alterando a ambientação do jogo.
- Sair: O menu permite que o usuário saia e salve as configurações.

**Como Funciona o Padrão Singleton**

O padrão Singleton é usado para garantir que todas as configurações do jogo (como dificuldade, efeitos sonoros e modo de jogo) sejam armazenadas em uma única instância, que pode ser acessada de qualquer parte do programa sem criar múltiplas instâncias.

**Detalhes da Implementação:**

1- **Classe Configuracao:**

- A classe Configuracao possui atributos privados para dificuldade, efeitos sonoros ativados e modo de jogo.
- A classe é projetada para garantir que somente uma instância de configurações seja criada durante a execução do programa.
- O construtor é privado para evitar que o objeto seja instanciado diretamente fora da classe.
- O método getInstancia() retorna a única instância da classe, criando-a apenas quando necessário (Lazy Initialization).

2 - **Classe MenuConfiguracao:**

- O MenuConfiguracao exibe um menu interativo para o usuário, permitindo alterar as configurações.
- A instância de Configuracao é obtida através do método getInstancia(), garantindo que todas as alterações sejam feitas na mesma instância, refletindo em todas as partes do programa que acessam a configuração.

3 - **Classe Jogo:**

- A classe Jogo utiliza o menu de configuração e mostra as configurações finais do jogo após a interação do usuário com o menu.
- As configurações definidas pelo usuário são acessadas e utilizadas para ajustar a experiência do jogo.

**Exemplos de Uso**

1. **Alterando a Dificuldade:** O usuário pode selecionar a dificuldade desejada no menu, e a mudança será refletida em todas as partes do programa que acessam as configurações.

2. **Alterando Efeitos Sonoros:** O menu permite alternar entre efeitos sonoros ativados ou desativados, com a alteração sendo aplicada globalmente.

3. **Alterando o Modo de Jogo**: O jogador pode alterar entre o modo Dia ou Noite, e a mudança será refletida em todo o jogo, alterando a ambientação visual e de gameplay.

**Benefícios do Padrão Singleton**

- **Garantia de Instância Única:** O padrão Singleton assegura que as configurações sejam armazenadas em uma única instância compartilhada, evitando inconsistências.
- **Facilidade de Acesso:** As configurações podem ser acessadas de qualquer parte do programa sem a necessidade de criar novos objetos.
- **Controle de Recursos:** Ao usar uma única instância, o uso de memória e recursos é otimizado.


![1](https://github.com/user-attachments/assets/bb31465e-644a-4d79-9d66-fe6211dbffea)
![3](https://github.com/user-attachments/assets/0ee1f138-f778-425b-8f7f-02d3dcd25611)
![4](https://github.com/user-attachments/assets/8f3c5fff-b03e-4613-b1d5-d308fa377fb7)

