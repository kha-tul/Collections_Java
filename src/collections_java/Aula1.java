package collections_java;

import java.sql.SQLOutput;
import java.util.*;

public class Aula1 {
    public static void main(String[] args) {


        System.out.println("Crie uma lista e adicione sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5); // como se trata de uma viriável tipo double, é necessáio add ou 7.0 ou 7d
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        // ou System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione a litsa da nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println("notas");


        System.out.println("Substitua a nota 5.0 pela 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // informa a posição pelo indexOf(5d), e o nº substituto.
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.printf("Exiba todas as notas na ordem que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // método get passa a posição e recebe o elemento
        // sendo a 3ª nota adicionada, está na posição 2, pois começa com zero.
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        // uso do metódo collection para informar a menor
        // se não há metodo para detectar o menor, é através da classe Double, que contém a interface 'comparable', que
        // são ordenados os elementos.
        // int, string, e outros, também contém a interface 'comparable'.

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();  // variavável do padrão iterator e kit Double.
        Double soma = 0d;
        while(iterator.hasNext()){ // é adicionada uma 'ação' ao cursor, que passa checar os elementos da variável a partir do zero.
            Double next = iterator.next(); // o laço é executado até o final dos elementos da variável.
            soma += next; // armazena o valor na variável soma.
        }
        System.out.println("Exiba a soma dos valore: " + soma);
        //uso do método 'iterator', para pegar os elementos da lista e ir somando.
        // pressione crtl + alt + v para criar variáveis.


        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        // 'size' pega a soma dos elemntos da lista 'notas'

        System.out.println("Remova a nota 0: " );
        notas.remove(0d);
        // se não colocar o 'd' ao final de 0, ele remove a posição da lista. o 0 é um objeto

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next(); // anda com o cursor pela lista
            if(next < 7) iterator1.remove(); // remove os elementos menor que 7.
        }
        System.out.println(notas);


        /* System.out.println("Apague toda a lista: ");
        notas.clear(); //apaga tudo
        System.out.println(notas);  */

        System.out.println("Apague toda a lista: " + notas.isEmpty());
        // confira se a lista está varia.
        
    }
}
