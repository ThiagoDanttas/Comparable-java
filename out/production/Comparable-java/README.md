# Interface Comparable - Java

---

#### Essa interface impõe uma ordenação total nos objetos de cada classe que a implementa. O método compareTo da classe refere-se ao método de comparação natural, permitindo utilizar os métodos (Collections.sort ou Arrays.sort).

~~~~java
public interface Comparable<T> {
     int compareTo(T o);
}
~~~~

Neste repositório irei abordar um exercício explicando o funcionamento desta interface.

## Exercício - Ordered names
Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode". Maria Brown
- Alex Green
- Bob Grey
- Anna White
- Alex Black
- Eduardo Rose
- Willian Red
- Marta Blue
- Alex Brown

## Exercício - Ordered names with salary
Faça um programa para ler um arquivo contendo funcionários (nome e salário) no formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
- Maria Brown,4300.00 
- Alex Green,3100.00 
- Bob Grey,3100.00 
- Anna White,3500.00 
- Alex Black,2450.00 
- Eduardo Rose,4390.00 
- Willian Red,2900.00 
- Marta Blue,6100.00 
- Alex Brown,5000.00