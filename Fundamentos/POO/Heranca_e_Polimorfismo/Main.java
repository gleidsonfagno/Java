package POO.Heranca_e_Polimorfismo;

public class Main {
    public static void main(String[] args) {
        // Herança ele faz isso estende de outra classe e usa as propriedades para não ficar a repetir código
//        Employee employee = new Employee();
//        Employee manager = new Manager();
//        employee.setName("João");
//        System.out.println(employee.getName());


        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {

        System.out.printf("=======%s======\n", employee.getClass().getCanonicalName());
//        if (employee instanceof  Manager manager)
        switch (employee){
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("Fagno");
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("joao123");
                manager.setCommission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
                System.out.println(manager.getFullSalary());
            }
            case Salesman salesman -> {
                salesman.setCode("456");
                salesman.setName("Fagno");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println("getCode : " + salesman.getCode());
                System.out.println("getSalary : " + salesman.getSalary());
                System.out.println("getName : " + salesman.getName());
                System.out.println("getPercentPerSold : " + salesman.getPercentPerSold());
                System.out.println("getSoldAmount : " + salesman.getSoldAmount());
                System.out.println("getFullSalary : " + salesman.getFullSalary());
            }
        }
        System.out.println();
        System.out.println("=============");

//
    }
}
