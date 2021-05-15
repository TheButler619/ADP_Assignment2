package za.ac.cput.prisoner;

import java.util.Objects;

/*
* Author: Keenan Solomons 219264228
* Description: Assignment 2 for ADP372S
 */

public class Prisoner {
    private int prisonerId;
    private String prisonerName;
    private String cellNumber;

    public Prisoner(int prisonerId, String prisonerName, String cellNumber) {
        this.prisonerId = prisonerId;
        this.prisonerName = prisonerName;
        this.cellNumber = cellNumber;
    }

    public int getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(int prisonerId) {
        this.prisonerId = prisonerId;
    }

    public String getPrisonerName() {
        return prisonerName;
    }

    public void setPrisonerName(String prisonerName) {
        this.prisonerName = prisonerName;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    @Override
    public String toString() {
        return "Prisoner{" +
                "prisonerId=" + prisonerId +
                ", prisonerName='" + prisonerName + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prisoner prisoner = (Prisoner) o;
        return prisonerId == prisoner.prisonerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prisonerId);
    }

}
