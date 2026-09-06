# Igor Nogueira Pessoa | Bruno aparecido Vivencio Rodrigues - 2º ADS AMS

# Implementando os padrões singleton e prototype
O sistema representa a emissão de certificados de um sistema acadêmico.
<br><br>
**Singleton:** é um padrão de projeto utilizado para garantir que uma classe tenha apenas uma única instância em toda a execução de um programa. No contexto do projeto desenvolvido, foi utilizado para garantir que só existisse uma única fila de impressão. Assim, todas as vezes que uma nova impressão tivesse que ser feita, ela não iria gerar uma nova fila e travar todo o andamento.
<br><br>
**Prototype:**: é um padrão criacional assim como o singleton, e é usado para garantir que um objeto receba várias cópias/clones direto da memória, que se diferenciam entre si pelas suas características únicas necessárias, mas que compartilham o mesmo "modelo". Isso evita que instancias pesadas sejam criadas todas as vezes que um objeto precisa surgir, diminuindo custo e lentidão de processamento. No projeto, foi utilizado para evitar que um certificado tivesse que ser feito o zero em cada emissão, utilizando um único modelo base que foi clonado e inserido somente as particularidades de cada certificado.
<br><br>
**Classe FilaDeImpressão**: O método public static **FilaDeImpressao getInstance()** é o ponto de acesso para criar instancias em todas as execuções do sistema, garantindo que só haja uma única fila. Caso contrário seria necessário usar o new todas as vezes. 
<br><br>
**Classe Certificado**: Através da função **public Certificado clonar()** é possível criar cópias dessa classe, sendo necessário fazer a instanciação apenas 1 vez para gerar o certificado "original" apenas com o nome do curso e a partir disso gerar os clones com os nomes dos alunos distintos. 
