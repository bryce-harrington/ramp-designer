package Entities;

public class Project {
    private int PID;
    private String project_name, start_date, notes;
    private User project_manager;
    private Customer customer;
    private projectStatus status;
    public enum projectStatus {
        IN_PLANNING("IN PLANNING"),
        IN_PROGRESS("IN PROGRESS"),
        WAITING_APPROVAL("WAITING APPROVAL"),
        APPROVED("APPROVED"),
        ON_HOLD("ON HOLD"),
        REQUIRES_FOLLOW_UP("REQUIRES FOLLOW-UP"),
        CANCELED("CANCELED"),
        COMPLETED("COMPLETED");
        private String status;

        projectStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }
    }

    public Project() {  }

    public Project(String project_name, Customer customer, User project_manager, String start_date, String notes, projectStatus status) {
        this.project_name = project_name;
        this.customer = customer;
        this.project_manager = project_manager;
        this.start_date = start_date;
        this.notes = notes;
        this.status = status;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        notes = notes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User getProject_manager() {
        return project_manager;
    }

    public void setProject_manager(User project_manager) {
        this.project_manager = project_manager;
    }

    public projectStatus getStatus() {
        return status;
    }

    public void setStatus(projectStatus status) {
        this.status = status;
    }
}