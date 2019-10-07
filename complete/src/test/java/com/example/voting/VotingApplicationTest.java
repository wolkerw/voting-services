package com.example.voting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
@SpringBootTest(classes = VotingApplication.class)
public class VotingApplicationTest {

    @Test
    public void contextLoads() throws Exception {
    }

}