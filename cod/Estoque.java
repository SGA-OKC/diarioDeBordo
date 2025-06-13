import java.util.List;
import java.util.ArrayList;
import com.appfrutaria.view.Atendente;

import com.appfrutaria.model.Frutas;


public class Estoque {
    
    private List<Frutas> listaFruta;
    
    public Estoque() {
    
    listaFruta = new ArrayList<>();
    
    }

    public void gerenciarEstoque(int opcao, Atendente atendente) {
        switch (opcao) {
        case 1 -> {
            atendente.CadastrarFruta();
            atendente.PrecoFruta();
            atendente.Quantidade();
            }
        }
            
    }
    
    public List<Frutas> getListaFruta() {
        return listaFruta;
    }

    public void setListaFruta(List<Frutas> listaFruta) {
        this.listaFruta = listaFruta;
    }
    
}