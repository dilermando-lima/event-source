package event.event;


public enum Type{

    INSERT("I"),
    UPDATE("U"),
    DELETE("D"),
    ROLLBACK("R"),
    MERGE("M");

    private String key;

    private Type(String key) {
        this.key=key;
    }

    public static Type getByKey(String key){
        for (Type keyToFind : Type.values() )
        if(  keyToFind.getKey() ==  key) return keyToFind;
        return null;
    }

    public String getKey() {
        return this.key;
    }

}