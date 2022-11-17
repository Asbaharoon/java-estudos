## Sintaxe

- ?visibilidade? ?tipo? ?modificador? retorno nome (?parametros?) ?excecoes? corpo

? é opcional

O resto é obrigatório

---

**Visibilidade***: `public`, `protected` e `private`;

Tipo: `concreto` ou `abstrato`;

Modificador: `static` ou `final`;

**Retorno**: `dado` ou `void`;

**Nome**: nome dado ao método;

**Parâmetros**: nome dos parâmetros que pode receber;

Exceções: `exceptions` que pode lançar

**Corpo**: código que possui ou vazio

*Em negrito os mais comuns*.

---

Exemplos:
- `public String getNome() {...}`
- `public double calcularNota() {...}`
- `public int distancia(int coordenada1, int coordenada2) {...}`
- `public abstract void executar();`
- `public void alterarFabricante(Fabricante fabricante) {...}`

O mais comum: **public static R N(P) {...}**

---

Para utilizar um método (chamar):

- nomeClasse.nomeMétodo();
- nomeObjeto.nomeMétodo(); 

Exemplos:
- Math.random();
- usuario.getEmail(4);

---

Assinatura de um método: nome + parametros.

**Método**: `public double calcular(double preco1, double preco2) {...}`
**Assinatura**: `calcular(double preco1, double preco2`

---

**Construtor e Destrutor**: métodos especiais usados na OO.
**Mensagem**: é o ato de solicitar ao método oque o mesmo execute. Direiconada a um objeto ou a uma classe.

---

**Passagem de Parâmetros**: Por valor (cópia) ou por referência (endereço).

---

