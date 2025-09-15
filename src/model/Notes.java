package model;

public class Notes {

    private int serialNo;
    private String note;
    private int numberOfNotes;

    public Notes(int serialNo, String note, int numberOfNotes) {
        this.serialNo = serialNo;
        this.note = note;
        this.numberOfNotes = numberOfNotes;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getNumberOfNotes() {
        return numberOfNotes;
    }

    public void setNumberOfNotes(int numberOfNotes) {
        this.numberOfNotes = numberOfNotes;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "serialNo=" + serialNo +
                ", note='" + note + '\'' +
                ", numberOfNotes=" + numberOfNotes +
                '}';
    }
}
