package GBhomework.git;




   class Employee {
         String firstname, name, middlename, position, email;
        int salary, age;

        Employee(String firstname,
                 String name,
                 String middlename,
                 String position,
                 String email,
                 int salary,
                 int age) {
            this.firstname = firstname;
            this.name = name;
            this.middlename = middlename;
            this.position = position;
            this.email = email;
            this.salary = salary;
            this.age = age;
        }

        public void Info() {
            System.out.println("firstname: " + firstname + " | name: " + name
                    + " | middlename: " + middlename + " | position: " + position
                    + " | email: " + email + " | salary: " + salary + " | age: "
                    + age);
        }

        int getAge() {
            return age;
        }
    }

    public class HomeWork_5 {
        public static void main(String[] args) {
            Employee[] employees = new Employee[5];
            employees[0] = new Employee("Иванов", "Иван", "Иванович",
                    "Топ менеджер", "ivanovii@mail.me", 150000, 45);
            employees[1] = new Employee("Петров", "Петр", "Петрович", "Менеджер",
                    "petrovpp@mail.me", 50000, 30);
            employees[2] = new Employee("Павлова", "Анна", "Евгеньевна",
                    "Менеджер", "pavlovaae@mail.me", 35000, 25);
            employees[3] = new Employee("Пржевальский", "Конь", "Безотчества",
                    "Конь", "konpk@mail.me", 100000000, 41);
            employees[4] = new Employee("Просто", "Паша", "Павлович",
                    "Просто тут сидит", "prosto_pasha@mail.me", 0, 23);

            for (Employee e : employees) if (e.getAge() > 40) e.Info();
            System.out.println("А эти ещё маленькие");
            for (Employee e : employees) if (e.getAge() < 40) e.Info();
        }
    }


