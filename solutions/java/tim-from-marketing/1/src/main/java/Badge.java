class Badge {
    public String print(Integer id, String name, String department) {
        String empID = null;
        String badge = null;

        if (id == null && department == null) {
            badge = name + " - OWNER";
        } else if (id != null && department == null) {
            empID = "[" + Integer.valueOf(id) + "]";
            badge = empID + " - " + name + " - OWNER";
        } else if (id == null && department != null) {
            badge = name + " - " + department.toUpperCase();
        } else {
            badge = "[" + Integer.valueOf(id) + "] - " + name + " - " + department.toUpperCase();
        }

        return badge;
    }
}
