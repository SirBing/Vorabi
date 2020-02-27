package Automaten;

class Grammatik {
    String eingabe;
    int i;
    Grammatik(String pEingabe){
        eingabe = pEingabe;
        System.out.println(this.parse());
    }

    public boolean parse(){
        i = 0;
        if(eingabe.length() > 0 && pruefeA(eingabe.charAt(i))) return true;
        else return false;
    }

    public boolean pruefeA(char c){
        i++;
        if (c == '0' && this.pruefeA(eingabe.charAt(i))) return true;
        else if (c == '1' && this.pruefeA(eingabe.charAt(i))) return true;
        else if (c == '2' && this.pruefeB(eingabe.charAt(i))) return true;
        else return false;
    }

    public boolean pruefeB(char c){
        i++;
        if (c == '0' && this.pruefeF()) return true;
        else if (c == '1' && this.pruefeC(eingabe.charAt(i))) return true;
        else if (c == '2' && this.pruefeD(eingabe.charAt(i))) return true;
        else return false;
    }

    public boolean pruefeC(char c){
        i++;
        if (c == '0' && this.pruefeF()) return true;
        else if (c == '1' && this.pruefeF()) return true;
        else if (c == '2' && this.pruefeC(eingabe.charAt(i))) return true;
        else return false;
    }

    public boolean pruefeD(char c){
        if(i == eingabe.length()) return true;
        else {
            i++;
            if (c == '0' && this.pruefeD(eingabe.charAt(i))) return true;
            else if (c == '1' && this.pruefeC(eingabe.charAt(i))) return true;
            else if (c == '2' && this.pruefeD(eingabe.charAt(i))) return true;
            else return false;
        }
    }

    public boolean pruefeF(){
        if (i == eingabe.length()) return true;
        else return false;
    }

    public static void main(String[] args) {
        new Grammatik("21").parse();
    }



}