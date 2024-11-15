package lessons.les_07.enumerator;

public class Enumerator1 {
    private String email;
    private Enumerator status;
    private boolean isActive;

    public Enumerator1(String email) {
        this.email = email;
        this.status = Enumerator.PENDING;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enumerator getStatus() {
        return status;
    }

    public void setStatus(Enumerator status) {
        this.status = status;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "EnumeratorRun{" +
                "email='" + email + '\'' +
                ", status=" + status +
                ", isActive=" + isActive +
                '}';
    }
}
