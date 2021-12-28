package com.fengyoujun.algorithm;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author FengYouJun
 * @since 2021/11/29
 */
public class TestDemo {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all...");
        System.out.println("before a...");
        System.out.println("before all...");
    }

    @Test
    @DisplayName("test demo1...")
    public void testDemo1() {
        System.out.println("test demo1...");
    }
}
