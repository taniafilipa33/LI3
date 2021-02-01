import java.util.*;

public interface ICatClientes
{
    Set<String>  getCatalogoC() ;
    CatClientes clone();
    void validaCliente(List<String> linhas);
}
