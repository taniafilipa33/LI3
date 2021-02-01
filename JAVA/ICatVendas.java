import java.lang.String;
import java.util.*;

public interface ICatVendas 
{
    Set<Venda> getCatVendas() ;
    CatVendas clone();
    int validaVendas(List<String> linhas,Set<String> catP,Set<String>catC);
}
