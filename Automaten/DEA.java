package Automaten;

class DEA {
    String eingabe;
    DEA(String pEingabe){
        eingabe = pEingabe;
        System.out.println(this.ueberpruefe(eingabe));
    }

    public boolean ueberpruefe(String wort){
        int z = 0;
        for(int i = 0; i < wort.length(); i++){
            switch (z){
                case 0:
                    if(wort.charAt(i) == 'a') z = 0;
                    else if (wort.charAt(i) == 'b') z = 1;
                    else return false;
                    break;
                case 1:
                    if(wort.charAt(i) == 'a') z = 0;
                    else if (wort.charAt(i) == 'b') z = 2;
                    else return false;
                    break;
                case 2:
                    if(wort.charAt(i) == 'a') z = 0;
                    else if (wort.charAt(i) == 'b') z = 2;
                    else return false;
                    break;
                default:
                    return false;
            }
        }
        if(z == 2) return true;
        else return false;
    }

    public static void main(String[] args) {
        new DEA("aababbabb");
    }

}