import CalculoTroco.CifraCesar;
import CalculoTroco.Troco;

public class App {
    public static void main(String[] args) throws Exception {
     CifraCesar cc = new CifraCesar();

     System.out.println(cc.encrypt("ABACATE", 2));
     System.out.println(cc.encrypt("CDCECVG", 2));
}
}



