package Coffee_Machine;

public enum KahveTurleri {
    AMERICANO("Amerikano"), ESPRESSO("Espresso"), CAPPUCINO("Kapuçino"), LATTE("Latte"), MOCHA("Moka"),
    MACCHIATO("Sütlü Kayfe:D"), AFFOGATO("Afogato"), BUZLUKAHVE("Filtre Kahve"), FRAPPUCCINO("Frapo"), IRISH("İrlanda");


    private String name;

    KahveTurleri(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
