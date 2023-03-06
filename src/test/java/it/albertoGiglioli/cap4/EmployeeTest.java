package it.albertoGiglioli.cap4;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    public static final int RAISE_SALARY_VALUE = 5;

    @Test
    void test1() {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Carl Cracker", 1500,
                ZonedDateTime.of(2023, 3, 3, 22, 30, 0, 0, ZoneId.of("Z")));
        employees[1] = new Employee("Harry Hacker", 2500,
                ZonedDateTime.of(2023, 3, 6, 22, 30, 0, 0, ZoneId.of("Z")));
        employees[2] = new Employee("Tony Tester", 3000,
                ZonedDateTime.of(2023, 3, 4, 22, 30, 0, 0, ZoneId.of("Z")));
        ZonedDateTime maccioHireDay = ZonedDateTime.now();
        var maccio = new Employee("Maccio Capatonda", 5000, maccioHireDay);
        employees[3] = maccio;
        List<Double> expected = new ArrayList<>();

        for (Employee e : employees) {
            expected.add(e.raiseSalary(RAISE_SALARY_VALUE));
        }

        assertThat(expected).isEqualTo(
                List.of(
                        employees[0].getSalary(),
                        employees[1].getSalary(),
                        employees[2].getSalary(),
                        employees[3].getSalary()

                )
        );

    }

}