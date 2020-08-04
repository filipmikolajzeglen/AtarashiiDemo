package pl.atarashii.staticelements;

public class Character {
    // Basic information
    private String name;
    private String family;
    // Basic statistic
    private int strength;
    private int dexterity;
    private int stamina;
    private int intelligence;
    private int charisma;
    private int level;
    // Advance statistic
    private float critic;
    private float luck;
    private float riposte;
    private float dodge;
    private float attack;

    // Basic information
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    // Basic statistic
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Advance statistic
    public float getAttack() {
        return luck;
    }

    public void setAttack(float attack) {
        this.attack = (float) (strength * 2.1);
    }
    public float getCritic() {
        return critic;
    }

    public void setCritic(int strength, int dexterity) {
        this.critic = (float) (0.2 * attack * (1.2 * (0.2 * dexterity + 0.2 * strength)));
    }

    public float getLuck() {
        return luck;
    }

    public void setLuck(float luck) {
        this.luck = luck;
    }

    public float getRiposte() {
        return riposte;
    }

    public void setRiposte(float riposte) {
        this.riposte = riposte;
    }

    public float getDodge() {
        return dodge;
    }

    public void setDodge(float dodge) {
        this.dodge = dodge;
    }

    public Character(String name, String family, int strength, int dexterity, int stamina, int intelligence,
                     int charisma, int level, float critic, float luck, float riposte, float dodge) {
        this.name = name;
        this.family = family;
        this.strength = strength;
        this.dexterity = dexterity;
        this.stamina = stamina;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.level = level;
        this.critic = critic;
        this.luck = luck;
        this.riposte = riposte;
        this.dodge = dodge;
    }
}
