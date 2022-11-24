package gysspring.test;

import gysspring.guoyansi.springframework.util.GysAssert;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class GysMainTest {

    @Test
     void test2(){
        GysAssert.notNull(1,"不能为空");
    }
}