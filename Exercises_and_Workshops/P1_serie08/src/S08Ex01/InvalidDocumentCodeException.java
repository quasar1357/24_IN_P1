package S08Ex01;

public class InvalidDocumentCodeException extends Exception {

    public InvalidDocumentCodeException(String name){
    
        super("Fehler: Ungültige Dokumentbezeichnung: " + name + "." +
              " Bezeichnungen müssen mit 'U', 'C' oder 'P' beginnen.");

    }

}
