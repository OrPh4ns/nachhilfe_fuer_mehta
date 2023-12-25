package Test;

public class OhneKonst {

     final private String msg = "Hello World!";

     // final bedeutet man kann dieses Attribut nicht weiter bearbeiten. Hier ist Schluss!!

     /* public OhneKonst(String msg){
         this.msg = "ffff";
     }

      */

    public String getMsg() {
        return this.msg;
    }
}
