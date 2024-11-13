public class Caesar {
    private String Kt;
    private int S;
    private String gt;
        public Caesar(){

        }
        public void verschluesseln(){
            for (int i=0 ;i < Kt.length()-1 ;i++) {
                int h = this.getASCII(Kt.charAt(i));
                gt = gt + this.getChar(h + S);
            }

        }
        public void entschluesseln(){

    }
        public int getASCII (char pWert){
            return (char)pWert;
    }
        public char getChar(int pWert){
            return (char)pWert;
        }
        public void setKt (String pWert){

        }
        public String getKt (){
          return (String) Kt;
        }
        public void getS (int pWert){

        }

    public void setS(int schluessel) {
    }
}
