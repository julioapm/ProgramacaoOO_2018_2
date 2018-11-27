import java.util.List;

public class TesteQuestao2 {
    public static void main(String[] args) {
        List<Aluno> alunos = null;
        try {
            alunos = LeitorAluno.lerArquivo("alunos.txt");
            for(Aluno aluno : alunos) {
                if (aluno.getMediaNotas() >= 7.0) {
                    System.out.println(aluno.getNome());
                }
            }
        } catch (Exception e) {
            System.out.println("Falha na leitura do arquivo");
            e.printStackTrace();
        }
    }
}
