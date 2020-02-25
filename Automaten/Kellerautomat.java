package Automaten;

class Kellerautomat {
    String eingabe;
    int keller;
    Kellerautomat(String pEingabe){
        eingabe = pEingabe;
        System.out.println(this.ueberpruefe(eingabe));
    }

    public boolean ueberpruefe(String wort){
        char z = 'A';
        keller = 0;
        for(int i = 0; i < wort.length(); i++){
            switch (z){
                case 'A':
                    if(wort.charAt(i) == 'a'){
                        z = 'A';
                        keller++;
                    } 
                    else if (wort.charAt(i) == 'b'){
                        z = 'B';
                        keller--;
                    }
                    else return false;
                    break;
                case 'B':
                    if(wort.charAt(i) == 'a') return false;
                    else if(wort.charAt(i) == 'b'){
                        z = 'B';
                        keller--;
                    } 
                    else return false;
                    break;
                default:
                    return false;
            }
        }
        if(keller == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        new Kellerautomat("aaabbb");
    }

}