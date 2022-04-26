package com.company;
import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;
public class Pet {
    String breed;
    String name;
    LocalDate dateOfBirth;
    boolean needsRestraint;
    typeOfAnimal animalType;

    public enum typeOfAnimal{
        DOG,
        CAT,
        CHICKEN,
        GECKO,
        HORSE
    }

    public Pet(String breed, String name, LocalDate dateOfBirth) {
        this.breed = breed;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Pet(typeOfAnimal animalType){
        this.animalType=animalType;
    }

    public void setAnimalType(typeOfAnimal animalType) {
        this.animalType = animalType;
    }

    public typeOfAnimal getAnimalType() {
        return animalType;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public boolean isNeedsRestraint() {
        return needsRestraint;
    }

    public int getAge(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        int year = localDate.getYear();
        //System.out.println(month+" "+ day + " " + year);

        //subtract to find age
        int birthYear = dateOfBirth.getYear();
        int birthMonth = dateOfBirth.getDayOfMonth();
        int birthDay = dateOfBirth.getDayOfMonth();
        int yearDif = year-birthYear;

        if((month-birthMonth)>0){
            return yearDif;
        }

        else if((month-birthMonth)<0){
            return yearDif-1;
        }

        else{
            if(day>=birthDay){
                return yearDif;
            }
            else{
                return yearDif-1;
            }
        }

    }

    public boolean NeedsRestraint(){
        if(getAge()>=13){
            needsRestraint=false;
            return needsRestraint;
        }
        needsRestraint = needsRestraint;
        return needsRestraint;
        }
    }

