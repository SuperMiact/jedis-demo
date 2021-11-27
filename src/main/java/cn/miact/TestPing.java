package cn.miact;

import redis.clients.jedis.Jedis;

public class TestPing {
    public static void main(String[] args) {
        // 1. new Jedis 对象
        Jedis jedis = new Jedis("192.168.3.50",6379);
        // jedis 中提供的方法就是redis中使用的指令！
        System.out.println(jedis.ping());
    }
}
