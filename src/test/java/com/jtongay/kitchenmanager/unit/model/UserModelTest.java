package com.jtongay.kitchenmanager.unit.model;

import com.jtongay.kitchenmanager.model.UserModel;
import com.jtongay.kitchenmanager.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
public class UserModelTest {
    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByName_Test() {
        testEntityManager.persist(new UserModel("howdy"));

        List<UserModel> users = userRepository.findByUsername("howdy");
        Assert.assertEquals(1, users.size());

//        Assert.assertThat(users).extracting(UserModel::getUsername).containsOnly("howdy");
    }
}
