public class Caesar {
    private String Kt;
    private int S;
    //horn
    private String gt;
        public Caesar(){
            gt ="";
            Kt ="";
        }
        public void verschluesseln(){

            for (int i=0 ;i < Kt.length();i++) {
                int h = this.getASCII(Kt.charAt(i));
                gt = gt + this.getChar(h + S);
            }

        }
        public void entschluesseln(){
            for (int i=0 ;i < gt.length();i++) {
                 int h = this.getASCII(gt.charAt(i));
                Kt = Kt + this.getChar(h - S);
            }

        }




        private int getASCII (char pWert){
            return  pWert;
        }
        private char getChar(int pWert){
            return (char) pWert;
        }

public String getKt(){
            return Kt;
}

    public void setKt(String kt) {
        Kt = kt;
    }

    public void setS(int s) {
        S = s;
    }

    public int getS(){
            return S;
    }

    public void setGt(String pgt){
      gt=pgt;

    }

    public String getGt(){
            return gt;
    }
    }
