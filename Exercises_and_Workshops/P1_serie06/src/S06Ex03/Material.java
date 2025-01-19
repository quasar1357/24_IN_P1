public enum Material {

    Eiche(25), Buche(18), Esche(14.5);
    public double materialCost;  // NOTE: We would usually not define public instance variables, but UML says so

    private Material(double matCostIn){
        this.materialCost = matCostIn;
    }

    public double getMaterialCost(){
        return this.materialCost;
    }
}
