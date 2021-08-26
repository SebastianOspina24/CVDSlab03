package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("John Jairo",12,24,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void DeadRegistryResult() {
        Person person = new Person("Juan Baez",123456,20,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void InvalideAgeRegistryResult() {

        Person person = new Person("Jose Maria Torres",38297,15,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


    @Test
    public void UnderRageRegistryResult() {
        Person person = new Person("Elisabeth Riano",988765,-32,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void DuplicatedRegistryResult() {

        Person person = new Person("El pipe",12,24,Gender.MALE,true);
        registry.registerVoter(person);
        Person person1 = new Person("etsehck",12,24,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
}