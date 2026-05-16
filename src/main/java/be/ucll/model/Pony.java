package be.ucll.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
//@Table(name = "ponies")
@DiscriminatorValue("pony")
public class Pony extends Animal {

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @NotBlank(message = "Name may not be empty")
    private String name;

    @Positive(message = "Age must be positive")
    private int age;

    protected Pony (){

    }

    public Pony(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        if(age<0)
//            throw new RuntimeException("Age must be positive");
        this.age = age;
    }
}
