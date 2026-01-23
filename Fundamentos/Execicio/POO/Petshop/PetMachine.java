package Execicio.POO.Petshop;

public class PetMachine {
    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "está limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade máxima de água e de 30 litros");
            return;
        }

        water+=2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade máxima de shampoo e de 30 litros");
            return;
        }
        shampoo+=2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja o pet é necessário limpa-la");
            return;
        }
        if (this.pet != null){
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }
        this.pet = pet;
    }

    public void removePath() {
        this.clean = this.pet.isClean();
        System.out.println("O pet" + this.pet.getName() + "está limpo");
        this.pet =  null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}
// 21.59