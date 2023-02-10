package com.fscut.jpa;

import com.fscut.jpa.entity.UserBase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.Objects;

@SpringBootTest
class JpaApplicationTests {

    @Resource
    private EntityManager em;


    @Test
    void contextLoads() {
        UserBase user1 = em.find(UserBase.class, 1);
        em.detach(user1);
        System.out.println(System.identityHashCode(user1));
        UserBase user2 = em.find(UserBase.class, 1);
        System.out.println(System.identityHashCode(user2));
        System.out.println(user1.equals(user2));
        System.out.println(user1 == user2);
        em.merge(user1);
        System.out.println(user1.equals(user2));
        System.out.println(user1 == user2);
    }


}
