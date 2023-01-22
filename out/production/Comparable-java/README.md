# Interface Comparable - Java

---

#### Essa interface imp�e uma ordena��o total nos objetos de cada classe que a implementa. O m�todo compareTo da classe refere-se ao m�todo de compara��o natural, permitindo utilizar os m�todos (Collections.sort ou Arrays.sort).

~~~~java
public interface Comparable<T> {
     int compareTo(T o);
}
~~~~

Neste reposit�rio irei abordar um exerc�cio explicando o funcionamento desta interface.

## Exerc�cio - Ordered names
Fa�a um programa para ler um arquivo contendo nomes de pessoas (um nome por
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

## Exerc�cio - Ordered names with salary
Fa�a um programa para ler um arquivo contendo funcion�rios (nome e sal�rio) no formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
- Maria Brown,4300.00 
- Alex Green,3100.00 
- Bob Grey,3100.00 
- Anna White,3500.00 
- Alex Black,2450.00 
- Eduardo Rose,4390.00 
- Willian Red,2900.00 
- Marta Blue,6100.00 
- Alex Brown,5000.00