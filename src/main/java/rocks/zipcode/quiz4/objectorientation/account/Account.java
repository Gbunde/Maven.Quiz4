package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Account extends BankAccount {
    Long id;

    public Account(){
       this.getId();

    }
    public Account(Long id){
        this.id = id;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
