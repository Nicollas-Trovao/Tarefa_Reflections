package Anotacoes;

@Tabela(Funcionarios = "Funcionarios")
public class Principal  {

        public static void main(String[] args) {
            if (Principal.class.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = Principal.class.getAnnotation(Tabela.class);
                System.out.println("Nome da tabela: " + tabela.Funcionarios());
            } else {
                System.out.println("A anotação @Tabela não está presente na classe Principal.");
            }
        }
}