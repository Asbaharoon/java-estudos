# POO - Programação Orientada a Objetos

<u>**Definição**</u>

A orientação a objetos é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas objetos.

*Análise* é entender bem do problema, entender bem da necessidade da automação.

*Projeto* é modelar e diminuir o gap semântico entre o mundo real e o mundo computacional.

*Programação* é pegar tudo isso e transformar em linguagem de programaçaõ (C#, Java, etc.).

<u>**Fundamentos**</u>

- <u>Abstração</u>: Processo pelo qual se isola característica de um objeto, considerando os que tenham em comum certos grupos de objetos. Por exemplo, uma cadeira tem assento, pernas e encosto. Abstraindo essa ideia, posso ter uma cadeira de praia, cadeira de escola, cadeira de jantar, etc. Eu removo as características acidentais (o braço da cadeira, por exemplo), se preocupar com o essencial e que pode ser reusado.
- <u>Reuso</u>: Capacidade de criar novas unidades de código a partir de outras já existentes.
- <u>Encapsulamento</u>: Capacidade de esconder complexidades e proteger dados. Criar uma camada de proteção, escondo comportamentos e protege os dados, evitando acessos indevidos.

<u>**Estruturas Básicas**</u>

- <u>Classe</u>: Estrutura que abstrai o conjunto de objetos com características similares. Servir de molde para o conceito do mundo real, de maneira que ela possa criar vários objetos dessa entidade do mundo real. Dicas: classes geralmente são substantivos com nomes significativos, levando em consideração o contexto (pessoa é ok, mas dentro de uma universidade existe mais de uma pessoa, portanto o contexto deve ser considerado, aluno, professor, funcionário).
- <u>Atributo</u>: Elemento de uma classe responsável por definir sua estrutura de dados, características. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe. *Atributo vs Variável: atributo é próprio e peculiar de algo e variável sujeito a mudanças, pode variar, instável. Conceitualmente são diferentes, dentro do computador são a mesma coisa.* Dicas: substantivos e adjetivos, com nomes significativos, contexto considerado, abstração e tipos adequados.
- <u>Método</u>: É uma porção de código (sub-rotina) que é disponibilizada pela classe e executada quando é feita uma requisição a ele. Dicas: verbos, nomes significativos, contexto considerado. Dois métodos especiais: Construtor (mesmo nome da classe) e Destrutor (auxilia a destruição do objeto, void finalize()). Sobrecarga - por que usar? porque aplica o reuso a partir dos parâmetros e manter a abstração-alvo do método.
- <u>Objeto</u>: A representação de um conceito/entidade no mundo real, que pode ser física ou conceitual e possui um significado bem definido para um determinado software. A classe é um molde que está preparada para criar objetos a partir dela. "Carro carro = new Carro();"
- <u>Mensagem</u>: O processo de ativação de um método de um objeto, assim disparando o comportamento descrito pela classe. Ocorre quando uma requisição (chamada) a esse método é realizada. "Carro.método;"

Instância x Estático: atributos e métodos.

Estado de um objeto.

Identidadee de um objeto.

Representação númerica de um objeto.

Representação padrão de um objeto.

<u>**Relações**</u>

- <u>Herança</u>: Relacionamento entre classes em que uma classe chamada de subclasse (filha ou derivada) é uma extensão, um subtipo de outra classe chamada de superclasse (classe pai). Devido a isso essa classe reaproveita os atributos e métodos dela, podendo, ainda, definir seus próprios métodos.

class A extends B {...}

> <u>Herança Simples</u>: A classe filha só tem uma classe mãe.

> <u>Herança Múltipla</u>: A classe filha tem uma ou mais classes mães. *Não tem em JAVA*

> <u>Upcast</u>: subir na hierarquia. "A a = new B();"

> <u>Downcast</u>: descer na hierarquia. "B a = (B)new A(); *Não usar tanto, é perigoso*

> <u>Polimorfismo</u>: A mesma ação, se comportando diferente. É o mesmo método com diferentes comportamentos, a depender do subtipo.

> <u>Sobrescrita</u>: A mesma ação, podendo se comportar diferente. Algumas classes só executam o método, outras necessitam sobrescrever o método simples, com outro mais complexo.

*Polimorfismo vs Sobrescrita: Parecidos, mas na sobrescrita há um comportamento padrão que pode ser sobrescrito, no polimorfismo não, há sempre um comportamento diferente.*

- <u>Associação</u>: Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e objetos interagem entre si para atingir os seus objetivos.

> <u>Estrutural</u>: Na estrutura, nos seus atributos. De composição: o endereço só existe com o todo, com a pessoa, por exemplo, esta parte só existe por conta da pessoa (dependência e composição). De agregação: sem parte todo, temos disciplina e aluno, se a disciplina deixa de existir, o aluno continua existindo.

> <u>Comportamental</u>: Nos comportamentos, nos métodos. De dependência: O método usa o cupom, depende dele, pode usar ele.

- <u>Interface</u>: Define um contrato que deve ser seguido pela classe que a implementa, se comprometendo a realizar todos os comportamentos que a interface disponibilizada.