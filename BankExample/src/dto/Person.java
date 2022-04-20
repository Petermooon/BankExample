package dto;

public abstract class Person {

    private String firstname;
    private String lastname;

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname (String firstname){

        this.firstname=firstname;

    }

    public String getLastname() {
        return lastname;
    }

    public void getLastname (String lastname){

        this.lastname=lastname;

    }

}
