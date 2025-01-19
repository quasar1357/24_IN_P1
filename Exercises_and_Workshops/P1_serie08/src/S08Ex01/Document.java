package S08Ex01;

public class Document {

    private String name;

    public Document(String nameIn) throws InvalidDocumentCodeException {
        this.setName(nameIn);
    }

    public void setName(String nameIn) throws InvalidDocumentCodeException {
        if ((nameIn.charAt(0) != 'U') &
           (nameIn.charAt(0) != 'C') &
           (nameIn.charAt(0) != 'P')) {
            throw new InvalidDocumentCodeException(nameIn);
           }
        else
           this.name = nameIn;
    }

    // public void setName(String nameIn) {
    //     try{
    //         this.checkName(nameIn);
    //     }
    //     catch(InvalidDocumentCodeException e) {
    //         System.out.println(e.getMessage());
    //     }
    //     this.name = nameIn;
    // }

    // private void checkName(String nameIn) throws InvalidDocumentCodeException {
    //     if (nameIn.charAt(0) != 'U' &
    //     nameIn.charAt(0) != 'C' &
    //     nameIn.charAt(0) != 'P') {
    //         throw new InvalidDocumentCodeException(nameIn);
    //     }
    // }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

}
