public class Locker {

    private boolean isOpen;
    private String code;

    public Locker() {
        isOpen = true;
        code = "";
    }

    public void unlock(String code) {
        if(code.equals(this.code)) isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void lock() {
        if(isOpen) isOpen = false;
    }

    public void newComb(String newCode) {
        if(isOpen) code = newCode;
    }

}