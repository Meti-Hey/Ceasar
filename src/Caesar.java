package src;

public class Caesar extends Kryptomat  {

public class Caesar {
    private String Kt;
    private int S;
    private String Gt;
    public Caesar(){
        Gt ="";
        Kt ="";
    }
    public void verschluesseln(){
        Gt = "";
        for (int i = 0 ; i < Kt.length() ; i++) {
            int h = this.getASCII(Kt.charAt(i));
            Gt = Gt + this.getChar(h + S);
        }

    }
    public void entschluesseln(){
        Kt = "";
        for (int i = 0; i < Gt.length() ; i++) {
            int k = this.getASCII(Gt.charAt(i));
            Kt = Kt + this.getChar(k - S);
        }


    }
    private int getASCII (char pWert) {
        return  pWert;
    }
    private char getChar(int pWert) {
        return (char) pWert;
    }

    public void setKt(String kt) {
        Kt = kt;
    }

    public void setS(int s) {
        S = s;
    }

    public void setGt(String gt) {
        Gt = gt;
    }

    public int getS() {
        return S;
    }

    public String getGt() {
        return Gt;
    }

    public String getKt() {
        return Kt;
    }
}
