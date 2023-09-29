package campeonato;
import java.util.Comparator;
import campeonato.Clube;
import campeonato.Campeonato;
import campeonato.jogar;

public class comparatorPontos implements Comparator<Clube>{

	@Override
	public int compare(Clube clube1, Clube clube2) {
		if(clube1.getQtdPontos() > clube2.getQtdPontos()) {
			return -1;
			
		}else if(clube1.getQtdPontos() == clube2.getQtdPontos()) {
			if(clube1.getQtdGols() > clube2.getQtdGols()) {
				return -1;
			}
		}
		
		return 1;
	}
	

}
