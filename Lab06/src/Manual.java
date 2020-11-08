class Manual extends  Rechizita{

    public Manual(String denumireManual)
    {
        eticheta = denumireManual;
    }

    @Override
    public String getNume() {
        return eticheta + " - manual";
    }
}
