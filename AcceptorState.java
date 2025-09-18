public class AcceptorState {
    

    private int highestPromiseId = -1;


    private int acceptedId = -1;


    private String acceptedValue = null;


    public void setHighestPromise(int proposalId) {
        this.highestPromiseId = proposalId;
    }
    
    public int getHighestPromise() {
        return this.highestPromiseId;
    }

    public void setAcceptedId(int id) {
        this.acceptedId = id;
    }

    public int getAcceptedId() {
        return this.acceptedId;
    }
    
    public void setAcceptedValue(String value) {
        this.acceptedValue = value;
    }

    public String getAcceptedValue() {
        return this.acceptedValue;
    }
}