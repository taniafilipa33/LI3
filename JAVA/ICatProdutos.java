import java.lang.String;
import java.util.*;
public interface ICatProdutos
{
   Set<String> getCatP();
   CatProdutos clone();
   void validaProduto(List<String> linhas);
}
