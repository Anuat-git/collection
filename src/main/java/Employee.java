public class Employee {

    public int empId;
    public String empName;

    public Employee(int id, String name) {

        this.empId = id;
        this.empName = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (this == null)
            return false;
        Employee anotherEmp = (Employee) obj;
        if (anotherEmp.empId != this.empId) {

            return false;
        }
        if (this.getClass() != anotherEmp.getClass())
            return false;

         return true;
    }
        @Override
        public int hashCode() {

         return empId;

        }

}
