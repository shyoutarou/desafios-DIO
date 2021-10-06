//   Tamanho da Placa

/* Após uma famosa indústria produtora de equipamentos musicais inovar no mercado constantemente, eles chegaram ao ponto de iniciar a criação de pedais de efeitos para guitarra a partir do desenvolvimento de um protótipo 3D e interativo criado por um usuário, com direito às mais diversas ferramentas costumizadoras, inclusive com sons, simulando o pedal real. E após o cliente gerar seu modelo virtual, ele o enviava à indústria para ser fabricada.

Acontece que para ser fabricado, o circuito do pedal é impresso em uma PCI(placa de circuito impresso) de tamanho limitado e como a criatividade dos clientes é ilimitada, e um tanto extravagante, as placas estão tomando dimensões inimagináveis, impossibilitando a fabricação. E sobrou para você, exímio programador e talvez amante de música, a desenvolver um programa que informe ao cliente se o que ele está imaginando está ou não disponível na placa usada pela indústria.

Entrada
A primeira linha de cada caso de teste consiste de três inteiros X, Y, M (M≤105) representando respectivamente as dimensões da placa da empresa e a quantidade de pedidos. Para cada uma das próximas M linhas será fornecido dois inteiros Xi e Yi representando as dimensões da PCI do cliente.

As dimensões sempre serão valores inteiros maiores que 0 e menor ou igual a 64.

Saída
Para cada circuito determine se é possível utilizar a PCI da empresa ou não.

 
Exemplo de Entrada	
10 10 3

5 5

10 10

5 25

2 3 1

3 2

Exemplo de Saída
Sim

Sim

Nao

Sim
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String linha;
        String[] vetor;
        String[] dim;
        int n;
        boolean sim;
        
        while ((linha = br.readLine()) != null) {
            
            vetor = linha.split(" ");
            n = Integer.parseInt(vetor[2]);
            
            while(n > 0){
                
                sim = false;
                
                dim = br.readLine().split(" ");
                
                if(Integer.parseInt(dim[0]) <= Integer.parseInt(vetor[0]) && Integer.parseInt(dim[1]) <= Integer.parseInt(vetor[1])){
                    sim = true;
                }else if(Integer.parseInt(dim[1]) <= Integer.parseInt(vetor[0]) && Integer.parseInt(dim[0]) <= Integer.parseInt(vetor[1])){
                    sim = true;
                }
                
                System.out.println(sim?"Sim":"Nao");
                
                n--;
            }
        }
    }
}