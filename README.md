# Gestor de Salas

## Pedido

Desenvolva um sistema de gestor de salas, com a seguinte descrição:

``` text
Um programa gestor de salas deve poder cadastrar disciplinas e reservar salas para cada disciplina. Disciplinas são cadastradas com nome, código, dia da semana e sala. Salas são cadastradas com número e uma agenda. As salas podem ser salas de aula ou laboratórios. Laboratórios também devem cadastrar os equipamentos disponíveis.

Ao cadastrar uma disciplina, o gestor deve verificar a disponibilidade da sala para aquele dia da semana. Caso a sala não esteja disponível, o gestor não pode criar a disciplina.

O gestor deve implementar uma interface do sistema geral da empresa, para exportar as informações de disciplinas e salas para arquivos .txt. Disciplinas e salas devem ser salvas em arquivos separados. Os arquivos devem ser salvos na raiz do projeto.

As disciplinas devem ser armazenadas no seguinte formato:

<codigo>;<nome>;<dia-semana>;<sala>

As salas devem ser armazenadas no seguinte formato:

<número>;<disc-segunda>;<disc-terça>;<disc-quarta>;<disc-quinta>;<disc-sexta>;<equipamentos>

Caso não haja uma disciplina reservada naquele dia, o campo deve ser deixado em branco. Os equipamentos devem ser separados por vírgula.

O programa deve possuir uma interface de texto para operar o sistema.
```

A interface do sistema geral da empresa possui o seguinte código (que deve ser incluído no sistema a ser desenvolvido):

``` java
public interface IExportadorDados {
    void exportaDados(ArrayList<Disciplina> disciplinas, ArrayList<Sala> salas) throws IOException;
}
```

De posse dos requisitos apresentados acima, desenvolva uma aplicação em Java que atenda a todos os requisitos apresentados. Elabore também um diagrama de classes que represente o projeto desenvolvido.

O trabalho deve ser entregue em um projeto privado no GitHub, adicionando o professor como colaborador do projeto. Não é necessário abrir um pull request, basta colocar o código no repositório.

## Dicas

- Para a agenda da sala, use um array de `Disciplina` com 5 elementos. A posicao do array indica o dia da semana em que a disciplina está reservada. Um valor `null` em um determinado elemento do array indica que a sala está disponível naquele dia.
- Utilize o modelo do trabalho disponível neste repositório para implementar seu código.
