package exerciciossala;
import java.util.Scanner;
public class d3005ex002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int soma = 0, alunos, media = 0;// declarando variaveis
        float mediaf = 0;
        int Q[]= new int [6];
        int n = Q.length;//atribuindo o comprimento do Q no N da matriz
        for(int C=0; C<n; C++){// estrutura de repetição para ler quando alunos tem em cada sala
            System.out.printf("Quantos alunos tem na sala %d? ", ++C);
            alunos = ler.nextInt();//lendo numero de alunos da sala
            
            Q[C] = alunos;//guardando dados no vetor
            media += Q[C];//samando sala para obter a media
            
        }
        mediaf = media/n;//encontrando a media final
        System.out.printf("A media por sala é %.2f\n", mediaf);//imprimindo media final
        for(int C=0; C<n; C++){//laço para imprimir todas as salas
        if(Q[C] > mediaf){//condição para separar salas acima ou abaixo da media
            System.out.printf("A sala %d esta acima da media!\n %d alunos\n", C, Q[C]);//caso a sala esteja acima da media
        }
        else if(Q[C] == mediaf){//caso a sala esteja exatamente na media
            System.out.printf("A sala %d esta na media!\n %d alunos\n", C, Q[C]);
        }
        else{//caso a sala esteja abaixo da media
            System.out.printf("A sala %d esta abaixo da media!\n %d alunos\n", C, Q[C]);
        }   
        } 
    }
}